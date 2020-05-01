package lab5;

import java.util.*;

public class Zad2 {


    //tworzy zbiór o zadanym rozmiarze
    public static HashSet<Integer> zbior(int rozmiar) {
        HashSet<Integer> hashSet = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < rozmiar; i++) {
            int n;
            do {
                n = scanner.nextInt();
            } while (n < 0);
            hashSet.add(n);
        }
        return hashSet;
    }

    //operacja sumy na zbiorach
    public static HashSet<Integer> union(HashSet<Integer> hashSet1, HashSet<Integer> hashSet2) {
        hashSet1.addAll(hashSet2);
        return hashSet1;
    }

    //operacja różnicy na zbiorach
    public static HashSet<Integer> differnece(HashSet<Integer> hashSet1, HashSet<Integer> hashSet2) {
        hashSet1.removeAll(hashSet2);
        return hashSet1;
    }

    //operacja przecięcia (wyznaczenie części wspólnej) na zbiorach
    public static HashSet<Integer> intersection(HashSet<Integer> hashSet1, HashSet<Integer> hashSet2) {
        hashSet1.retainAll(hashSet2);
        return hashSet1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rozmiar1;
        int rozmiar2;
        while (true) {
            do {

                System.out.println("Podaj liczbę elementów zbioru pierwszego");
                rozmiar1 = scanner.nextInt();
                System.out.println("Podaj liczbę elementów zbioru drugiego");
                rozmiar2 = scanner.nextInt();
            } while (rozmiar1 < 0 && rozmiar2 < 0);
            System.out.println("Podaj elementy zbioru 1");
            HashSet<Integer> hashSet1 = zbior(rozmiar1);
            System.out.println("Podaj elementy zbioru 2");
            HashSet<Integer> hashSet2 = zbior(rozmiar2);
            System.out.println(hashSet1 + " < * / +/ - > " + hashSet2);
            System.out.println("Wybierz operacje wpisując symbol :");
            String symbol = scanner.next();
            switch (symbol) {
                case "*":
                    System.out.println(intersection(hashSet1, hashSet2));
                    break;
                case "+":
                    System.out.println(union(hashSet1, hashSet2));
                    break;
                case "-":
                    System.out.println(differnece(hashSet1, hashSet2));
                    break;
                default:
                    System.out.println("Nie ma takiej opcji");
            }
            break;

        }
    }

}



