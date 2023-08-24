package ru.transportation;

public abstract class Transportation {
  public String model;
  public String series;
  public int yearOfIssue;
  public String manufacturerCountry;

  public Transportation(String model, String series, int yearOfIssue, String manufacturerCountry){
    this.model = model;
    this.series = series;
    this.yearOfIssue = yearOfIssue;
    this.manufacturerCountry = manufacturerCountry;
  }

  // Setter and Getter

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public String getSeries() {
    return series;
  }

  public void setSeries(String series) {
    this.series = series;
  }

  public int getYearOfIssue() {
    return yearOfIssue;
  }

  public void setYearOfIssue(int yearOfIssue) {
    this.yearOfIssue = yearOfIssue;
  }

  public String getManufacturerCountry() {
    return manufacturerCountry;
  }

  public void setManufacturerCountry(String manufacturerCountry) {
    this.manufacturerCountry = manufacturerCountry;
  }

  // methods

  public void description(){
    System.out.printf("Model: %s, series: %s, yearOfIssue: %d, manufacturerCountry: %s", model, series,
        yearOfIssue, manufacturerCountry);
  }

  public abstract double CalculateTheTimeOfThePath();
}
