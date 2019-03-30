package es.estech.acantero;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        ArrayList<String> nombres = new ArrayList<>();
        ArrayList<String> apellidos = new ArrayList<>();
        ArrayList<String> nombresCompletos = new ArrayList<>();

        System.out.println("Introduce los nombres, y pulsa cualquier número para acabar");
        while (entrada.hasNext()){
            if (entrada.hasNextInt()){
                break;
            }
            nombres.add(entrada.next());
        }

        int clear = entrada.nextInt();

        System.out.println("Introduce los apellidos, y pulsa cualquier número para acabar");
        while (entrada.hasNext()){
            if (entrada.hasNextInt()){
                break;
            }
            apellidos.add(entrada.next());
        }

        int size = nombres.size()>apellidos.size() ? apellidos.size() : nombres.size();
        for(int i = 0; i < size; i++){
            nombresCompletos.add(nombres.get(i)+" "+apellidos.get(i));
        }
        System.out.println(nombres);
        System.out.println(apellidos);
        System.out.println(nombresCompletos);

    }
}
