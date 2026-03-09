package org.conso.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import org.conso.entity.Appareil;

@ApplicationScoped
public class AppareilRepository implements PanacheRepository<Appareil> {

}
