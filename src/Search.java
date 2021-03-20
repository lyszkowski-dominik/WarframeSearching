import java.util.*;

public class Search {

    public void search(String searchTerm, Warehouse warehouse, Available available) {
        List<String> filter = new ArrayList<>();
        List<String> nowAvailable = available.getAvailableList();

        /* Metoda pobiera komponent z magazynu i porównuje nazwę pozycji
        do szukanej frazy, jeśli znajdzie podobieństwo, pobiera z pozycji magazynowej
        listę reliktów z których przedmiot wypada i zapisuje ją do nowej listy
         */
        for (int i = 0; i < warehouse.componentList.size(); i++) {
            String s = warehouse.componentList.get(i).getName();
            if (s.equals(searchTerm))
                filter = (warehouse.componentList.get(i).getDropFrom());
        }

        // Przerobienie List na obiekty Kolekcji
        Collection<String> listOne = filter;
        Collection<String> listTwo = nowAvailable;

        // Metoda zostawia w listTwo tylko obiekty które występują w listOne
        listTwo.retainAll(listOne);
        if(listTwo.size() != 0) {
            System.out.println("Szukany komponent wypada z: " + filter + "\nObecnie dostępne relikty: " + listTwo);
        }else
            System.out.println("Komponent obecnie nie do zdobycia lub brak go w bazie danych");
    }
}




