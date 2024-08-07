package io.quarkus.it.panache.defaultpu;

import jakarta.enterprise.context.ApplicationScoped;

import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

// custom id type
@ApplicationScoped
public class DogDao implements PanacheRepositoryBase<Dog, Integer> {

}
