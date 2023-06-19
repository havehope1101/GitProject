package Manage;

import Model.Cadres;

import java.util.Scanner;

public class Manage {

    public Cadres[] cadreses;
    public static int size = 0;
    private Scanner input = new Scanner(System.in);

    public Manage() {
        cadreses = new Cadres[1000];
    }

    public void addCadres(Cadres cadres) {
        cadreses[size] = cadres;
        size++;
    }

    public void showCadres() {
        for (int i=0; i< size; i++) {
            System.out.println(cadreses[i].toString());
        }
    }

    public void addCadres() {
        System.out.println("-----Adding Cadres-----");
        System.out.println("Enter name: ");
//        input.nextLine();
        String name = input.nextLine();
        System.out.println("Enter age: ");
        int age = input.nextInt();
//        input.nextLine();
        System.out.println("Enter gender: ");
        input.nextLine();
        String gender = input.nextLine();
        System.out.println("Enter address: ");
//        input.nextLine();
        String address = input.nextLine();
        Cadres cadres = new Cadres(name, age, gender, address);

    }
}
