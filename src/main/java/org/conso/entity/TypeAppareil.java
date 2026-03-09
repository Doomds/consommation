package org.conso.entity;


public class TypeAppareil {

  private long id;
  private String nom;
  private String commentaire;
  private double facteurDeMarche;
  private double puissance;
  private double consommation;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getNom() {
    return nom;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }


  public String getCommentaire() {
    return commentaire;
  }

  public void setCommentaire(String commentaire) {
    this.commentaire = commentaire;
  }


  public double getFacteurDeMarche() {
    return facteurDeMarche;
  }

  public void setFacteurDeMarche(double facteurDeMarche) {
    this.facteurDeMarche = facteurDeMarche;
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
