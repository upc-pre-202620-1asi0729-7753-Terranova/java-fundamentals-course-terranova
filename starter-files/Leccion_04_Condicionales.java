public class Leccion_04_Condicionales {
    public static void main(String[] args) {
        double saldoActual = 67.50;
        double metaAhorro = 100.0;
        double precioGasto = 80.0;

        // Lección 4: Decisión con if-else
        if (precioGasto <= 0) {
            System.out.println("❌ El gasto debe ser mayor a S/ 0.");
        } else if (precioGasto <= saldoActual) {
            saldoActual -= precioGasto;
            System.out.println("✅ Gasto realizado. Nuevo saldo: S/ " + saldoActual);
        } else {
            System.out.println("⚠️ Saldo insuficiente para realizar esta compra.");
        }

        // Evaluación de meta
        if (saldoActual >= metaAhorro) {
            System.out.println("🎉 ¡Felicidades! Alcanzaste tu meta de ahorro.");
        } else {
            System.out.printf("💡 Te faltan S/ %.2f para tu meta.\n", (metaAhorro - saldoActual));
        }
    }
}