import java.util.Scanner;

// Clase para representar cada Gasto registrado
class Gasto {
    private String concepto;
    private double monto;

    public Gasto(String concepto, double monto) {
        this.concepto = concepto;
        this.monto = monto;
    }

    public String getConcepto() { return concepto; }
    public double getMonto() { return monto; }
}

// Clase de la Alcancía Virtual
class AlcanciaVirtual {
    private String usuario;
    private double saldoActual;
    private double metaAhorro;
    private Gasto[] listaGastos; 
    private int contadorGastos;

    public AlcanciaVirtual(String usuario, double saldoInicial, double metaAhorro) {
        this.usuario = usuario;
        this.saldoActual = saldoInicial;
        this.metaAhorro = metaAhorro;
        this.listaGastos = new Gasto[10];
        this.contadorGastos = 0;
    }

    public void ingresarDinero(double cantidad) {
        if (cantidad > 0) {
            this.saldoActual += cantidad;
            System.out.println("✅ Ingresaste S/ " + cantidad);
        } else {
            System.out.println("❌ La cantidad debe ser mayor a 0.");
        }
    }

    public void registrarGasto(String concepto, double monto) {
        if (monto > 0 && monto <= this.saldoActual) {
            this.saldoActual -= monto;
            if (contadorGastos < listaGastos.length) {
                listaGastos[contadorGastos] = new Gasto(concepto, monto);
                contadorGastos++;
                System.out.println("💸 Gasto registrado: " + concepto);
            } else {
                System.out.println("⚠️ Límite de gastos alcanzado.");
            }
        } else {
            System.out.println("⚠️ Saldo insuficiente o monto inválido.");
        }
    }

    public void verificarMeta() {
        System.out.println("\n--- ESTADO DE TU META ---");
        System.out.println("Meta: S/ " + this.metaAhorro + " | Saldo: S/ " + this.saldoActual);
        if (this.metaAhorro > 0) {
            System.out.printf("📊 Porcentaje: %.1f%%\n", (this.saldoActual / this.metaAhorro) * 100);
        }
        if (this.saldoActual >= this.metaAhorro) {
            System.out.println("🎉 ¡Meta alcanzada!");
        } else {
            System.out.printf("💡 Faltan S/ %.2f\n", (this.metaAhorro - this.saldoActual));
        }
    }

    public void mostrarHistorial() {
        System.out.println("\n📜 HISTORIAL DE GASTOS");
        if (contadorGastos == 0) {
            System.out.println("No hay gastos registrados.");
        } else {
            for (int i = 0; i < contadorGastos; i++) {
                System.out.println((i + 1) + ". " + listaGastos[i].getConcepto() + " -> S/ " + listaGastos[i].getMonto());
            }
        }
    }
}

// Clase Principal (Asegúrate de que el archivo se llame Leccion_08_ProyectoFinal.java)
public class Leccion_08_ProyectoFinal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);

        System.out.println("========================================");
        System.out.println("  💰 MI ALCANCÍA & PRESUPUESTO PERSONAL 💰 ");
        System.out.println("========================================");

        System.out.print("Nombre: ");
        String nombre = lectura.nextLine();

        System.out.print("Saldo inicial (S/): ");
        double saldoInicial = lectura.nextDouble();

        System.out.print("Meta (S/): ");
        double meta = lectura.nextDouble();

        AlcanciaVirtual miAlcancia = new AlcanciaVirtual(nombre, saldoInicial, meta);

        int opcion = 0;
        while (opcion != 5) {
            System.out.println("\n=== MENÚ DE OPCIONES ===");
            System.out.println("1. Ingresar dinero");
            System.out.println("2. Registrar gasto");
            System.out.println("3. Ver progreso hacia mi meta");
            System.out.println("4. Ver historial de gastos");
            System.out.println("5. Salir");
            System.out.print("Opción (1-5): ");

            opcion = lectura.nextInt();
            lectura.nextLine(); // Limpiar buffer

            if (opcion == 1) {
                System.out.print("Monto a ingresar (S/): ");
                miAlcancia.ingresarDinero(lectura.nextDouble());
            } else if (opcion == 2) {
                System.out.print("Concepto del gasto: ");
                String concepto = lectura.nextLine();
                System.out.print("Monto (S/): ");
                miAlcancia.registrarGasto(concepto, lectura.nextDouble());
            } else if (opcion == 3) {
                miAlcancia.verificarMeta();
            } else if (opcion == 4) {
                miAlcancia.mostrarHistorial();
            } else if (opcion == 5) {
                System.out.println("¡Gracias por usar la alcancía!");
            } else {
                System.out.println("Opción inválida.");
            }
        }

        lectura.close();
    } // Cierre correcto del método main
} // Cierre correcto de la clase Leccion_08_ProyectoFinal