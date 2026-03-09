package org.conso.entity;


public class Utilisation {

  private long id;
  private long refAppareil;
  private long quantite;
  private double pourcentage;
  private java.sql.Timestamp debutPeriode;
  private java.sql.Timestamp finPeriode;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getRefAppareil() {
    return refAppareil;
  }

  public void setRefAppareil(long refAppareil) {
    this.refAppareil = refAppareil;
  }


  public long getQuantite() {
    return quantite;
  }

  public void setQuantite(long quantite) {
    this.quantite = quantite;
  }


  public double getPourcentage() {
    return pourcentage;
  }

  public void setPourcentage(double pourcentage) {
    this.pourcentage = pourcentage;
  }


  public java.sql.Timestamp getDebutPeriode() {
    return debutPeriode;
  }

  public void setDebutPeriode(java.sql.Timestamp debutPeriode) {
    this.debutPeriode = debutPeriode;
  }


  public java.sql.Timestamp getFinPeriode() {
    return finPeriode;
  }

  public void setFinPeriode(java.sql.Timestamp finPeriode) {
    this.finPeriode = finPeriode;
  }

}
