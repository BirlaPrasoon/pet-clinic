package com.prasoon.petclinic.data.services.map;

import com.prasoon.petclinic.data.model.BaseEntity;
import com.prasoon.petclinic.data.services.CrudService;
import lombok.NonNull;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public abstract class CrudServiceMapImpl<T extends BaseEntity, ID extends Long> implements CrudService<T, ID> {

    protected Map<Long, T> map = new HashMap<>();

    @Override
    public Collection<T> findAll() {
        return this.map.values();
    }

    @Override
    public T findById(ID id) {
        return map.get(id);
    }

    @Override
    public T save(@NonNull T object) {
        if(object != null){
            if(object.getId() == null){
                object.setId(getNextId());
            }
            map.put(object.getId(),object);
        } else{
            throw new RuntimeException("Object can not be null");
        }
        return object;
    }

    @Override
    public void deleteById(ID id) {
        map.remove(id);
    }

    protected Long getNextId() {
        return Collections.max(map.keySet()) + 1;
    }

}
