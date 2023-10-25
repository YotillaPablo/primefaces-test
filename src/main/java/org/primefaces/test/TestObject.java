package org.primefaces.test;

import java.io.Serializable;
import java.util.UUID;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode
public class TestObject implements Serializable {

    private String id;
    private String name;

    public TestObject(String name) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
    }

    public void toUpperCase(){
        this.name = this.name.toUpperCase();
        System.out.println("updating " + name);
    }

}
