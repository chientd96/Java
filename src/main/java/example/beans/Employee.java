package example.beans;

import java.io.Serializable;

/**
 * Created by ChienTD2 on 10/09/2019.
 */
public class Employee implements Serializable{
    private int id;

    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
