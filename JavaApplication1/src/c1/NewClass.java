package c1;
import java.util.Scanner;

public class NewClass {
 public static void main(String[] args) {
 Scanner teclado = new Scanner(System.in);
 int base, altura, area;

 System.out.print("Ingrese un valor para la base : ");
 base = Integer.parseInt(teclado.nextLine());
 System.out.print("Ingrese un valor para la altura : ");
 altura = Integer.parseInt(teclado.nextLine());

 area = base * altura;

 System.out.println("---- Reporte ----");
 System.out.println("-----------------");
 System.out.println("Base : " + base);
 System.out.println("Altura : " + altura);
 System.out.println("El Area es : " + area);
 System.out.println("-----------------");
 }
}