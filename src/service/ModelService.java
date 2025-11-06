package service ;

import model.Model;

public class ModelService {
  private Model currentmodel;
  

  public void CreateModel (String material, Number layersNumber, String modelpath, Double modelTotal){
    currentmodel = new Model(material, layersNumber, modelpath, modelTotal);
  }
    

  public void clearModel() {
    currentmodel = null;
  }
   
  public void calculateModelCost(String material, Number layers) {
    // still doesnt have nothing 
  currentmodel.setModelTotal(null);
    
}





}