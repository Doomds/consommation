package org.conso.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "appareil")
public class Appareil {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String denomination;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "ref_type")
  private TypeAppareil typeAppareil;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "ref_zone")
  private Zone zone;

  private Long quantite;
  private Double puissance;
  private Double consommation;

  public Appareil() {
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getDenomination() {
    return denomination;
  }

  public void setDenomination(String denomination) {
    this.denomination = denomination;
  }

  public TypeAppareil getTypeAppareil() {
    return typeAppareil;
  }

  public void setTypeAppareil(TypeAppareil typeAppareil) {
    this.typeAppareil = typeAppareil;
  }

  public Zone getZone() {
    return zone;
  }

  public void setZone(Zone zone) {
    this.zone = zone;
  }

  public Long getQuantite() {
    return quantite;
  }

  public void setQuantite(Long quantite) {
    this.quantite = quantite;
  }

  public Double getPuissance() {
    return puissance;
  }

  public void setPuissance(Double puissance) {
    this.puissance = puissance;
  }

  public Double getConsommation() {
    return consommation;
  }

  public void setConsommation(Double consommation) {
    this.consommation = consommation;
  }

}
