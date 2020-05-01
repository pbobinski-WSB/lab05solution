package lab5;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class Zad1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userName;
        String password;
        LinkedHashMap<String, String> map = new LinkedHashMap<>();
        while (true) {
            System.out.println("Podaj nazwę użytkownika");
            userName = scanner.next();
            if (userName.equals("q")) {
                break;
            }
            System.out.println("Podaj hasło");
            password = scanner.next();
            map.put(userName, password);
        }
        System.out.println(map);
        System.out.println("Podaj nawzwę uzytkownika którego hasło mam wypisać");
        userName = scanner.next();
        System.out.println(map.getOrDefault(userName, "Nie ma takiego użytkownika"));

    }
}
