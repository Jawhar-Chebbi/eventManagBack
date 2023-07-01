package tn.esprit.spring.Services;


import org.springframework.web.multipart.MultipartFile;
import tn.esprit.spring.Entities.Enum.Category;
import tn.esprit.spring.Entities.Enum.Status;
import tn.esprit.spring.Entities.Event;

import java.io.IOException;
import java.util.List;

public interface IServiceEvent extends IServiceCrud<Event> {
 List<Event> getEventsByStatus(List<Status> status);
 List<Event> getEventByCategory(Category category);
  Event affectLogisticsToEvent(Long eventId, Long logisticsId);
  String  uploadImage(String image, MultipartFile file) throws IOException;
 }
