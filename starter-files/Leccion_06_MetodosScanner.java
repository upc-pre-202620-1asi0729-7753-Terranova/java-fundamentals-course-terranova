import java.util.Scanner;

public class Leccion_06_MetodosScanner {

    // Lección 6: Definición de un método estático reutilizable
    public static void verificarMeta(String usuario, double saldo, double meta) {
        System.out.println("\n--- ESTADO DE TU META (" + usuario.toUpperCase() + ") ---");
        System.out.println("Meta: S/ " + meta + " | Saldo: S/ " + saldo);
        if (saldo >= meta) {
            System.out.println("🎉 ¡Meta alcanzada!");
        } else {
            System.out.printf("💡 Te faltan S/ %.2f\n", (meta - saldo));
        }
    }

    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);

        // Captura interactiva del usuario
        System.out.print("Ingresa tu nombre: ");
        String nombre = lectura.nextLine();

        System.out.print("Ingresa tu meta (S/): ");
        double meta = lectura.nextDouble();

        double saldo = 50.0;

        // Invocando el método
        verificarMeta(nombre, saldo, meta);

        lectura.close();
    }
}