// Lección 7: Clase para representar los gastos
class Gasto {
    String concepto;
    double monto;

    public Gasto(String concepto, double monto) {
        this.concepto = concepto;
        this.monto = monto;
    }
}

// Lección 7: Clase para representar la Alcancía
class AlcanciaVirtual {
    String usuario;
    double saldoActual;
    double metaAhorro;

    public AlcanciaVirtual(String usuario, double saldoInicial, double metaAhorro) {
        this.usuario = usuario;
        this.saldoActual = saldoInicial;
        this.metaAhorro = metaAhorro;
    }
}

public class Leccion_07_POO_Clases {
    public static void main(String[] args) {
        // Instanciación de objetos usando el operador 'new'
        Gasto primerGasto = new Gasto("Snack", 5.50);
        AlcanciaVirtual miAlcancia = new AlcanciaVirtual("Mateo", 50.0, 150.0);

        System.out.println("Gasto creado: " + primerGasto.concepto + " (S/ " + primerGasto.monto + ")");
        System.out.println("Alcancía creada para: " + miAlcancia.usuario);
    }
}