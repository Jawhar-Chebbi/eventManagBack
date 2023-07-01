package tn.esprit.spring.ServicesImplementation;

import org.springframework.util.CollectionUtils;
import tn.esprit.spring.Entities.LogisticDetails; // Importez la classe LogisticDetails


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tn.esprit.spring.Entities.Logistics;
import tn.esprit.spring.Repositories.LogisticDetailsRepo;
import tn.esprit.spring.Repositories.LogisticsRepo;
import tn.esprit.spring.Services.IServiceLogistics;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class ServiceLogistics extends CrudService<Logistics> implements IServiceLogistics {


    private final LogisticsRepo logisticsRepo;

    private final LogisticDetailsRepo logisticDetailsRepo;

    public ServiceLogistics(LogisticsRepo logisticsRepo, LogisticDetailsRepo logisticDetailsRepo) {
        super(logisticsRepo);
        this.logisticsRepo = logisticsRepo;
        this.logisticDetailsRepo = logisticDetailsRepo;
    }

    public void calculateTotalCost(Logistics logistics) {
        double sum = 0.0;
        if (logistics.getLogisticDetails() != null && !logistics.getLogisticDetails().isEmpty()) {
            for (LogisticDetails detail : logistics.getLogisticDetails()) {
                sum += detail.getCost();
            }
        }
        logistics.setTotalCost(sum);
    }

    @Override
    public void affecterLogisticdetailsLogistique(Logistics logistics, List<LogisticDetails> logisticDetailsList) {
        List<LogisticDetails> logisticDetailsList1 = new ArrayList<>();
        if (logistics != null && logisticDetailsList != null) {
            for (LogisticDetails logisticDetail : logisticDetailsList) {
               var logistic =  this.logisticDetailsRepo.findOneById(logisticDetail.getId());
               if(logistic.isPresent()){
                   logistic.get().setLogistics(logistics);
                   logisticDetailsList1.add(logistic.get());
               }
            }
            if(!CollectionUtils.isEmpty(logisticDetailsList1)){
                logistics.setLogisticDetails(logisticDetailsList1);
                logisticsRepo.save(logistics);
            }


            // Sauvegarde de la logistique mise à jour
        }
    }



}
