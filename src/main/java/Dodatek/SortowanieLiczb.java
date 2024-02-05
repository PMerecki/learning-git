package Dodatek;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortowanieLiczb {

    public static void main(String[] args) {
        List<Integer> liczby = new ArrayList<>();
        liczby.add(3);
        liczby.add(1);
        liczby.add(1);
        liczby.add(5);
        liczby.add(6);
        liczby.add(4);

        // Wywołanie funkcji do sortowania
        sortujLiczbyRosnaco(liczby);

        // Wypisanie posortowanej kolekcji
        System.out.println("Posortowane liczby: " + liczby);
    }

    // Funkcja do sortowania liczb w kolejności rosnącej
    public static void sortujLiczbyRosnaco(List<Integer> liczby) {
        Collections.sort(liczby);
    }
}
