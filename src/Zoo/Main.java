package Zoo;
import java.util.ArrayList;
import java.util.List;

import Ave.Aguila;
import Ave.Colibri;
import Ave.Loro;
import Reptil.Lagarto;
import Reptil.Serpiente;

public class Main {

    public static void main(String[] args) {
        List<Animal> listaDeAnimales = new ArrayList<>();

        // Añadir animales a la lista
        listaDeAnimales.add(new Serpiente()); //Instancia de serpiente de la clase Reptil
        listaDeAnimales.add(new Aguila());
        listaDeAnimales.add(new Loro());
        listaDeAnimales.add(new Colibri());
        listaDeAnimales.add(new Rana()); // Añade una instancia de Rana
        listaDeAnimales.add(new Salamandra()); // Añade una instancia de Anfibio genérico
        listaDeAnimales.add(new Escarabajo());
        listaDeAnimales.add(new Mariposa());
        listaDeAnimales.add(new Lagarto());


        // Observar a los animales en la lista
        for (Animal animal : listaDeAnimales) {
            System.out.println("Observando las acciones de " + animal.getClass().getSimpleName() + ":");
            animal.verAnimal();
            esperar(500); // Espera medio segundo antes de pasar al siguiente animal
        }
    }

    private static void esperar(int milisegundos) {
        try {
            Thread.sleep(milisegundos);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // Restablece el estado de interrupción
            System.out.println("Interrupción durante la espera.");
        }
    }
}