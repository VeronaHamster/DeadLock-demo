package bean;

import java.sql.ResultSet;

public class Resource {
    private String name;

    public Resource(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
