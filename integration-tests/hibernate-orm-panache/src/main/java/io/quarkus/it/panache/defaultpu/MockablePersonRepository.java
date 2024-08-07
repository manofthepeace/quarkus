package io.quarkus.it.panache.defaultpu;

import java.util.List;

import jakarta.enterprise.context.ApplicationScoped;

import io.quarkus.hibernate.orm.panache.PanacheRepository;

@ApplicationScoped
public class MockablePersonRepository implements PanacheRepository<Person> {
    public List<Person> findOrdered() {
        return find("ORDER BY name").list();
    }
}
