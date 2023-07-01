package tn.esprit.spring.ServicesImplementation;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import tn.esprit.spring.Entities.Enum.Category;
import tn.esprit.spring.Entities.Enum.Status;
import tn.esprit.spring.Entities.Event;
import tn.esprit.spring.Entities.Logistics;
import tn.esprit.spring.Repositories.EventRepo;
import tn.esprit.spring.Repositories.LogisticsRepo;
import tn.esprit.spring.Services.IServiceEvent;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

@Service
@Slf4j
public class ServiceEvent extends CrudService<Event>  implements IServiceEvent {

    private final EventRepo eventRepo;
    private final LogisticsRepo logisticsRepo;
    public ServiceEvent(EventRepo eventRepo, EventRepo eventRepo1, LogisticsRepo logisticsRepo) {
        super(eventRepo);
        this.eventRepo = eventRepo1;
        this.logisticsRepo = logisticsRepo;
    }

    @Override
    public List<Event> getEventsByStatus(List<Status> status) {

        return eventRepo.findByStatusIn(status);
    }

    @Override
    public List<Event> getEventByCategory(Category category) {
        return eventRepo.findByCategory(category);
    }

    @Override
    public Event affectLogisticsToEvent(Long eventId, Long logisticsId) {
        Event eventEntity = eventRepo.findById(eventId).get();
        Logistics logistics = logisticsRepo.findById(logisticsId).get();
        eventEntity.setLogistics(logistics);
        return eventRepo.saveAndFlush(eventEntity);
 }

    @Override
    public String uploadImage(String image, MultipartFile file) throws IOException {
    String name = file.getOriginalFilename();
    String filePath =image+ File.separator+name;
    File f=new File(image);
    if (!f.exists()){
        f.mkdir();
    }
        Files.copy(file.getInputStream(), Paths.get(filePath));

        return name;
    }
}
