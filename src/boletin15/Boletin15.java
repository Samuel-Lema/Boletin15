package boletin15;

import java.util.Scanner;

public class Boletin15 {

    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in);
        float escrita, practica, boletin;
        String pregunta;
        
        do {
            System.out.print("Escribe a nota teorica ");
            escrita = reader.nextFloat();
            
            System.out.print("Escribe a nota practica ");
            practica = reader.nextFloat();
            
            System.out.print("Escribe o porcentaje de boletins ");
            boletin = reader.nextFloat();
            
            Notas nota = new Notas(escrita, practica, boletin);
            nota.calcularNota();
            
            System.out.print("¿Queres calcular outra nota? (si / non) ");
            pregunta = reader.next();
            
        } while (!"non".equals(pregunta));
        
    }
    
}
