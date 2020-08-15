package com.prasoon.petclinic.data.services;

import lombok.NonNull;

import java.util.Collection;

public interface CrudService<T, ID> {

    Collection<T> findAll();

    T findById(ID id);

    T save(@NonNull ID id, @NonNull T object);

    void deleteById(ID id);

}
