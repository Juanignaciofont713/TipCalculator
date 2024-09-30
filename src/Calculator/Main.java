package Calculator;

// Clase de prueba para la calculadora de propinas
public class Main {
    public static void main(String[] args) {
        // Ejemplo: Consumo de 100 dolares
        
        double billAmount = 100.0;
        double tipPercentage = 8.0;

        // Crear un objeto de TipCalculator
        TipCalculator calculator = new TipCalculator(billAmount, tipPercentage);

        try {
            // Validar la propina
            calculator.validateTip();
            System.out.println("Propina calculada: " + calculator.calculateTip());
            System.out.println("Monto total: " + calculator.calculateTotalAmount());
        } catch (Exception e) {
            // Mostrar error y sugerir la propina mínima
            System.out.println(e.getMessage());
            calculator.suggestTip();
        }
    }
}