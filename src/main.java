import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class main {
    public static void main(String[] args) throws IOException {
        //Inicjalizacja strumienia odczytywania danych
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String searchTerm;
        // Inicjalizacja listy aktualnie dostępnych reliktów
        Available available = new Available();
        // Inicjalizacja listy komponentów
        Warehouse warehouse = new Warehouse();
        System.out.println("Co chcesz wydropić?");
        searchTerm = br.readLine();
        // Inicjalizacja klasy szukającej
        Search search = new Search();
        search.search(searchTerm,warehouse,available);
    }
}
