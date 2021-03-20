import java.util.List;

public class Component {
    String name;
    List<String> dropFrom;

    public Component(String name, List<String> dropFrom) {
        this.name = name;
        this.dropFrom = dropFrom;
    }

    public String getName() {
        return name;
    }

    public List<String> getDropFrom() {
        return dropFrom;
    }
}
