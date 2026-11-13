public class Leccion_03_Operadores {
    public static void main(String[] args) {
        double saldoActual = 50.0;
        double metaAhorro = 200.0;
        double ingresoPropina = 30.0;
        double gastoSnack = 12.50;

        // Lección 3: Suma y resta de saldo
        saldoActual += ingresoPropina;
        System.out.println("Saldo tras recibir propina: S/ " + saldoActual);

        saldoActual -= gastoSnack;
        System.out.println("Saldo tras comprar snack: S/ " + saldoActual);

        // Operador aritmético para calcular el porcentaje
        double porcentajeMeta = (saldoActual / metaAhorro) * 100;
        System.out.printf("Porcentaje de meta alcanzado: %.1f%%\n", porcentajeMeta);
    }
}