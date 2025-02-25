package org.example;

import java.lang.Math;

public class Main {
    public static void main(String[] args) {
//variables
        int max = 6;
        int min = 1;
        int range = max - min + 1;
        int sumaa = 0;
        int sumab = 0;

        //generador
        for (int i = 0; i < 10; i++) {
            int rand1 = (int) (Math.random() * range) + min;
            sumaa += rand1;

            System.out.println("dado1:" + rand1);
        }

        for (int z = 0; z < 10; z++) {
            int rand2 = (int) (Math.random() * range) + min;
            sumab += rand2;
            System.out.println("dado2:" + rand2);


        }
        System.out.println("total" + sumaa + "total" + sumab);

    }
}








