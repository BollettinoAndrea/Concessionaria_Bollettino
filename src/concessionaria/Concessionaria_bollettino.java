package concessionaria;

import java.util.Scanner;
public class Concessionaria_bollettino {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String marca = "";
        String modello = "";
        double prezzo = 0.0;

        Auto car1 = new Auto(marca,modello,prezzo);
        System.out.println("Marca: " + car1.getMarca());
        System.out.println("Modello: " + car1.getModello());
        System.out.println("Prezzo: " + car1.getPrezzo());

    }
}