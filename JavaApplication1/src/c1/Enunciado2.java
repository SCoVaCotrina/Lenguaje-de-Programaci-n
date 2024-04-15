package c1;
import java.util.Scanner;

public class Enunciado2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double peso, altura, imc;

        System.out.println("Calculadora de indice de Masa Corporal (IMC)");
        System.out.print("Ingrese su peso en kilogramos: ");
        peso = Double.parseDouble(teclado.nextLine());
        System.out.print("Ingrese su altura en metros: ");
        altura = Double.parseDouble(teclado.nextLine());

        // Calcular IMC
        imc = peso / (altura * altura);

        // Mostrar resultado
        System.out.println("---- Reporte ----");
        System.out.println("-----------------");
        System.out.println("Peso : " + peso + " kg");
        System.out.println("Altura : " + altura + " m");
        System.out.println("Su IMC es : " + imc);
        System.out.println("-----------------");

        teclado.close();
    }
}