/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logicaNegocio;

/**
 *
 * @author USUARIO
 */
public class Zoologico {
    public static void main(String[] args) {
        
        Delfin delfin = new Delfin();
        Perro perro = new Perro();
        Leon leon= new Leon();

        mostrarInformacion(leon);
        mostrarInformacion(delfin);
        mostrarInformacion(perro);

    
        System.out.println("Interacción del Perro con un humano: " + perro.interactuarConHumano());
    }

    public static void mostrarInformacion(Animal animal) {
        System.out.println("Animal: " + animal.getClass().getSimpleName());
        System.out.println("Sonido: " + animal.emitirSonido());
        System.out.println("Dieta: " + animal.obtenerDieta());
        System.out.println("Hábitat: " + animal.getHabitat());
        System.out.println();
    }
    
}



