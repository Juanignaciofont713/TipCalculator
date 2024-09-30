package Calculator;

// Clase principal para la calculadora de propinas
class TipCalculator {
    // Atributos
    private double billAmount;
    private double tipPercentage;

    // Constructor
    public TipCalculator(double billAmount, double tipPercentage) {
        this.billAmount = billAmount;
        this.tipPercentage = tipPercentage;
    }

    // Método para calcular la propina
    public double calculateTip() {
        return (billAmount * tipPercentage) / 100;
    }

    // Método para validar si la propina es menor al 10%
    public void validateTip() throws Exception {
        if (tipPercentage < 10) {
            throw new Exception("Error: La propina es menor al 10% del total. "
                    + "Se recomienda al menos un 10%.");
        }
    }

    // Método para calcular el monto total (consumo + propina)
    public double calculateTotalAmount() {
        return billAmount + calculateTip();
    }

    // Método para sugerir la propina mínima
    public void suggestTip() {
        if (tipPercentage < 10) {
            System.out.println("Propina recomendada: " + (billAmount * 10 / 100) + " (10%)");
        }
    }
}