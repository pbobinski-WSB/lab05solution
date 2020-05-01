package lab5;

import java.util.*;

public class Zad3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę max jako górną granie przedziału, musi być liczbą nieujemną");
        int max;
        do {
            max = scanner.nextInt();
        } while (max < 0);
        Random random = new Random();
        LinkedList<Integer> listaRandom = new LinkedList<>();
        int generator;
        do {
            generator = random.nextInt(max);
            listaRandom.add(generator);
        } while (generator != 0);
        System.out.println(listaRandom);
        System.out.println("5 pierwszych elementów");
        for (int i = 0; i < 5; i++) {
            System.out.print(listaRandom.get(i) + " , ");
        }
        System.out.println("\n 5 ostatnich liczb");
        for (int i = listaRandom.size() - 5; i < listaRandom.size(); i++) {
            System.out.print(listaRandom.get(i) + " , ");
        }
        TreeSet<Integer> treeSet = new TreeSet<>(listaRandom);
        System.out.println("\n Zbiór posortowany: " + treeSet);
    }
}

