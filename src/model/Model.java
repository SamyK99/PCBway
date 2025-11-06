package model;


public class Model {

  private String Material ;
  private Number layersNumber;
  private String Modelpath ;
  private Double ModelTotal;


  public Model (String material, Number layersNumber, String modelpath, Double modelTotal) {
      this.Material = material;
      this.layersNumber = layersNumber;
      this.Modelpath = modelpath;
      this.ModelTotal = modelTotal;
  }

  public String getMaterial() {
      return Material;
  }
  public void setMaterial(String material) {
      this.Material = material;
  }

  public Number getLayersNumber() {
      return layersNumber;
  }

  public void setLayersNumber(Number layersNumber) {
      this.layersNumber = layersNumber;
  }

  public String getModelpath() {
      return Modelpath;
  }

  public void setModelpath(String modelpath) {
      this.Modelpath = modelpath;
  }

  public Double getModelTotal() {
      return ModelTotal;
  }

  public void setModelTotal(Double modelTotal) {
      this.ModelTotal = modelTotal;
  }

}
