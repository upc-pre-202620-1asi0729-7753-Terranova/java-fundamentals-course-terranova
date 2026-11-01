import java.util.Scanner;

public class Leccion_05_Bucles {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        int opcion = 0;

        // Lección 5: Repetición controlada por bucle while
        while (opcion != 5) {
            System.out.println("\n=== MENÚ DE OPCIONES ===");
            System.out.println("1. Ingresar dinero");
            System.out.println("2. Registrar un gasto");
            System.out.println("3. Ver meta");
            System.out.println("4. Ver historial");
            System.out.println("5. Salir");
            System.out.print("Elige una opción (1-5): ");

            opcion = lectura.nextInt();
        }

        System.out.println("¡Gracias por usar la alcancía!");
        lectura.close();
    }
}