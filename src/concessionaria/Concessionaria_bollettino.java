package concessionaria;

import java.util.Scanner;
public class Concessionaria_bollettino {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String marca = null;
        String modello = null;
        double prezzo = 0.0;

        Auto car1 = new Auto(marca,modello,prezzo);
        System.out.println("AUTO 1:");
        System.out.println("Marca: "); car1.setMarca(in.nextLine());
        System.out.println("Modello: "); car1.setModello(in.nextLine());
        System.out.println("Prezzo: "); car1.setPrezzo(in.nextDouble());

        Auto car2 = new Auto(marca,modello,prezzo);
        System.out.println("AUTO 2:");
        System.out.println("Marca: "); car2.setMarca(in.nextLine());
        System.out.println("Modello: "); car2.setModello(in.nextLine());
        System.out.println("Prezzo: "); car2.setPrezzo(in.nextDouble());

        Auto car3 = new Auto(marca,modello,prezzo);
        System.out.println("AUTO 3:");
        System.out.println("Marca: "); car3.setMarca(in.nextLine());
        System.out.println("Modello: "); car3.setModello(in.nextLine());
        System.out.println("Prezzo: "); car3.setPrezzo(in.nextDouble());

        Auto car4 = new Auto(marca,modello,prezzo);
        System.out.println("AUTO 4:");
        System.out.println("Marca: "); car4.setMarca(in.nextLine());
        System.out.println("Modello: "); car4.setModello(in.nextLine());
        System.out.println("Prezzo: "); car4.setPrezzo(in.nextDouble());

        System.out.println("Auto 1: " + car1.getMarca() + " ; " + car1.getModello() + " ; " + car1.getPrezzo());
        System.out.println("Auto 2: " + car2.getMarca() + " ; " + car2.getModello() + " ; " + car2.getPrezzo());
        System.out.println("Auto 3: " + car3.getMarca() + " ; " + car3.getModello() + " ; " + car3.getPrezzo());
        System.out.println("Auto 4: " + car4.getMarca() + " ; " + car4.getModello() + " ; " + car4.getPrezzo());

    }
}