import java.util.*;

public class Warehouse {
    List<Component> componentList = new ArrayList<>();

        Component c1 = new Component("Aksomati Prime Schemat","Powszechny" ,new ArrayList<>(Arrays.asList("Lith B8","Neo N13","Meso R2","Neo R4","Axi B4")));
        Component c2 = new Component("Aksomati Prime Lufa","Nieprzeciętny",new ArrayList<>(Arrays.asList("Meso D6","Lith B7","Neo Z5")));
        Component c3 = new Component("Aksomati Prime Połączenie","Rzadki", new ArrayList<>(Arrays.asList("Axi A13","Axi A8","Aksi A10")));
        Component c4 = new Component("Aksomati Prime Korpus","Powszechny",new ArrayList<>(Arrays.asList("Neo B7","Neo P2","Lith N6","Axi D2","Axi G4","Axi W1")));

        Component c5 = new Component("Burston Prime Kolba","Powszechny",new ArrayList<>(Arrays.asList("Lith B8","Lith D3","Lith K1","Lith M5","Lith S9","Lith V1","Meso C3","Meso N3","Meso S5","Neo B4","Neo H2","Neo M2","Neo S2","Neo V6","Neo Z4","Neo Z5","Axi O3")));
        Component c6 = new Component("Burston Prime Schemat","Powszechny",new ArrayList<>(Arrays.asList("Meso C6","Meso P4","Lith B3","Lith O1","Lith P2","Lith S10","Lith T1","Meso C5","Meso V1","Neo R3","Neo S6","Neo T1","Axi L5","Axi S6","Axi T3")));
        Component c7 = new Component("Burston Prime Lufa","Nieprzeciętny",new ArrayList<>(Arrays.asList("Lith I1","Lith F2","Lith P3","Meso G2","Meso S8","Neo B1","Neo V5","Axi G3","Axi G4","Axi H3","Axi P3","Axi T1","Axi Axi T2")));
        Component c8 = new Component("Burston Prime Korpus","Powszechny",new ArrayList<>(Arrays.asList("Axi A11","Axi A13","Lith C4","Lith D1","Lith N3","Lith S5","Meso L1","Meso T1","Meso Z1","Neo E2","Neo G3","Neo H1","Neo I2","Neo S3","Axi G2")));

        Component c9 = new Component("Dethcube Prime Schemat","Rzadki",new ArrayList<>(Arrays.asList("Lith D4","Lith D1","Lith D3")));
        Component c10 = new Component("Dethcube Prime Mózg","Rzadki",new ArrayList<>(Arrays.asList("Meso D6","Lith D2","Meso D4","Neo D2")));
        Component c11 = new Component("Dethcube Prime Karapaks","Nieprzeciętny",new ArrayList<>(Arrays.asList("Lith T4","Neo B7","Neo T2","Lith M6","Meso L1","Meso R3")));
        Component c12 = new Component("Dethcube Prime Systemy","Powszechny",new ArrayList<>(Arrays.asList("Lith B8","Lith S10","Neo E2","Neo G2","Neo I2","Axi P2")));

        Component c13 = new Component("Atlas Prime Schemat","Powszechny",new ArrayList<>(Arrays.asList("Lith P5","Neo Z7","Lith D1","Lith M5","Lith P3")));
        Component c14 = new Component("Atlas Prime Neurooptyka","Rzadki",new ArrayList<>(Arrays.asList("Axi A11","Axi A6","Axi A9")));
        Component c15 = new Component("Atlas Prime Powłoka","Nieprzeciętny",new ArrayList<>(Arrays.asList("Lith B8","Meso E3","Neo E2","Neo M3","Neo T3","Axi B3")));
        Component c16 = new Component("Atlas Prime Systemy","Nieprzeciętny",new ArrayList<>(Arrays.asList("Meso I1","Neo N15","Lith N4","Meso C4","Meso G2","Neo A3")));

        Component c17 = new Component("Ivara Prime Schemat","Nieprzeciętny",new ArrayList<>(Arrays.asList("Lith B8","Lith N4","Lith N5","Meso N9","Axi B4")));
        Component c18 = new Component("Ivara Prime Neurooptyka","Powszechny",new ArrayList<>(Arrays.asList("Meso D6","Lith D3","Meso C4","Meso N10","Neo M3")));
        Component c19 = new Component("Ivara Prime Powłoka","Rzadki",new ArrayList<>(Arrays.asList("Lith I1","Neo I1","Neo I2")));
        Component c20 = new Component("Ivara Prime Systemy","Nieprzeciętny",new ArrayList<>(Arrays.asList("Meso P2","Axi C6","Axi A9")));

        Component c21 = new Component("Baza Prime Schemat","Rzadki",new ArrayList<>(Arrays.asList("Lith B8","Lith B7","Meso B4","Axi B4")));
        Component c22 = new Component("Baza Prime Lufa","Nieprzeciętny",new ArrayList<>(Arrays.asList("Neo N15","Axi Z1","Lith S10","Lith W2")));
        Component c23 = new Component("Baza Prime Korpus","Powszechny",new ArrayList<>(Arrays.asList("Meso C6","Meso P2","Axi W2","Meso E4","Neo R3")));
        Component c24 = new Component("Baza Prime Kolba","Rzadki",new ArrayList<>(Arrays.asList("Neo B7","Axi B3")));
    public Warehouse () {

        componentList.add(c1);
        componentList.add(c2);
        componentList.add(c3);
        componentList.add(c4);
        componentList.add(c5);
        componentList.add(c6);
        componentList.add(c7);
        componentList.add(c8);
        componentList.add(c9);
        componentList.add(c10);
        componentList.add(c11);
        componentList.add(c12);
        componentList.add(c13);
        componentList.add(c14);
        componentList.add(c15);
        componentList.add(c16);
        componentList.add(c17);
        componentList.add(c18);
        componentList.add(c19);
        componentList.add(c20);
        componentList.add(c21);
        componentList.add(c22);
        componentList.add(c23);
        componentList.add(c24);
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
