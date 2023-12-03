public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro valor binário: ");
        String valor1 = scanner.nextLine();
        System.out.print("Digite a operação (+, -, *, /): ");
        String operacao = scanner.nextLine();
        System.out.print("Digite o segundo valor binário: ");
        String valor2 = scanner.nextLine();

        int resultado = 0;

        if (operacao.equals("+")) {
        resultado = Integer.parseInt(valor1, 2) + Integer.parseInt(valor2, 2);
        } else if (operacao.equals("-")) {
        resultado = Integer.parseInt(valor1, 2) - Integer.parseInt(valor2, 2);
        } else if (operacao.equals("*")) {
        resultado = Integer.parseInt(valor1, 2) * Integer.parseInt(valor2, 2);
        } else if (operacao.equals("/")) {
        resultado = Integer.parseInt(valor1, 2) / Integer.parseInt(valor2, 2);
        } else {
        System.out.println("Operação inválida.");
        return;
        }

        System.out.println("Resultado binário: " + Integer.toBinaryString(resultado));
        }// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 5; i++) {

            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
            System.out.println("i = " + i);
        }
    }
}