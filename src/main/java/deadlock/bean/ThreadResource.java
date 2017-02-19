package deadlock.bean;

public class ThreadResource {
    private String name;

    public ThreadResource(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
