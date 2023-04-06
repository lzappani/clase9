public class Main {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        System.out.println("Suma 4 + 3: " + calc.sumar(4, 3));
        System.out.println("Resta 4 - 3: " + calc.restar(4, 3));
        System.out.println("Suma 4 x 3: " + calc.multiplicar(4, 3));
        try {
            System.out.println("Suma 4 / 0: " + calc.dividir(4, 0));
        }
        catch (ArithmeticException ae) {
            System.out.println(ae.getMessage());
        }

    }
}
