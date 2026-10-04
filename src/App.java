import java.util.Scanner;

import br.com.poliveira.Conversor;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Conversor conversor = new Conversor();

        // Aciona o conversor de int para Integer
        conversor.lerEConverter(scanner);

        // Exibe o resultado
        System.out.println(conversor);
        scanner.close();
    }
}
