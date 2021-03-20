import java.util.*;

public class Warehouse {
    List<Component> componentList = new ArrayList<>();

        Component c1 = new Component("Aksomati Prime Schemat", new ArrayList<>(Arrays.asList("Lith B8","Neo N13","Meso R2","Neo R4","Axi B4")));
        Component c2 = new Component("Burston Prime Kolba",new ArrayList<>(Arrays.asList("Lith B8","Lith D3","Lith K1","Lith M5","Lith S9","Lith V1","Meso C3","Meso N3","Meso S5","Neo B4","Neo H2","Neo M2","Neo S2","Neo V6","Neo Z4","Neo Z5","Axi O3")));

    public Warehouse () {
        this.componentList = componentList;
        componentList.add(c1);
        componentList.add(c2);
    }

    public List<Component> getComponentList() {
        return componentList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Warehouse warehouse = (Warehouse) o;
        return componentList.equals(warehouse.componentList) && c1.equals(warehouse.c1) && c2.equals(warehouse.c2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(componentList, c1, c2);
    }
}
