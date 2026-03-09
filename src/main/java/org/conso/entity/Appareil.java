package org.conso.entity;


public class Appareil {

  private long id;
  private String denomination;
  private long refType;
  private long refZone;
  private long quantite;
  private double puissance;
  private double consommation;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getDenomination() {
    return denomination;
  }

  public void setDenomination(String denomination) {
    this.denomination = denomination;
  }


  public long getRefType() {
    return refType;
  }

  public void setRefType(long refType) {
    this.refType = refType;
  }


  public long getRefZone() {
    return refZone;
  }

  public void setRefZone(long refZone) {
    this.refZone = refZone;
  }


  public long getQuantite() {
    return quantite;
  }

  public void setQuantite(long quantite) {
    this.quantite = quantite;
  }


  public double getPuissance() {
    return puissance;
  }

  public void setPuissance(double puissance) {
    this.puissance = puissance;
  }


  public double getConsommation() {
    return consommation;
  }

  public void setConsommation(double consommation) {
    this.consommation = consommation;
  }

}
