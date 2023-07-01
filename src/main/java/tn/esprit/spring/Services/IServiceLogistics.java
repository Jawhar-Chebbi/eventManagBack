package tn.esprit.spring.Services;

import tn.esprit.spring.Entities.LogisticDetails;
import tn.esprit.spring.Entities.Logistics;

import java.util.List;

public interface IServiceLogistics extends IServiceCrud<Logistics>{
 void calculateTotalCost(Logistics logistics);

 void affecterLogisticdetailsLogistique(Logistics logistics, List<LogisticDetails> logisticDetailsList);


}
