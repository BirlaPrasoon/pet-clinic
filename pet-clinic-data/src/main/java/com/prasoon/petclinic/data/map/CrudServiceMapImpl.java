package com.prasoon.petclinic.data.map;

import com.prasoon.petclinic.data.services.CrudService;
import lombok.NonNull;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public abstract class CrudServiceMapImpl<T, ID> implements CrudService<T, ID> {

    protected Map<ID, T> map = new HashMap<>();

    @Override
    public Set<T> findAll() {
        return (Set<T>) this.map.values();
    }

    @Override
    public T findById(ID id) {
        return map.get(id);
    }

    @Override
    public T save(@NonNull ID id, @NonNull T object) {
        return map.put(id, object);
    }

    @Override
    public void deleteById(ID id) {
        map.remove(id);
    }

}
