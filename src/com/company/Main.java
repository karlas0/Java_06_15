package com.company;

import java.util.Scanner;

public class Main {
   static boolean arSkaicius = false;
  static  int kiekis = 0;
  static int raidziukiekis = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String zodis = sc.nextLine();
        metodas(zodis);
        try {
            Float.parseFloat(zodis);
            arSkaicius = true;

        } catch (Exception klaida) {
            System.out.println("programa baigisi");
            zodis = sc.nextLine();
        }
        if (arSkaicius == false) {
            System.out.println("ka dirbi");
        }
        for (int i= 0; i <zodis.length(); ++i){
            char raide = zodis.charAt(i);
            if (raide ==0) {
                kiekis++;
            }
        }
        System.out.println(kiekis);
    }
    private static void metodas (String string){
        for (int i = 0; i <string.length(); i++) {
            char a = 'a';
            char pavadinimas = string.charAt(i);
            if (a ==pavadinimas){
                raidziukiekis++;
            }

        }
        System.out.println("a raidziu kiekis: " +raidziukiekis);
    }
}
