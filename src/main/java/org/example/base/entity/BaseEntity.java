package org.example.base.entity;

import java.io.Serializable;

public class BaseEntity<ID> implements Serializable {

      ID id;

    public ID getId() {
        return id;
    }

    public void setId(ID id) {
        this.id = id;
    }
}
