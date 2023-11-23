import java.util.Scanner;

public class App {
    public static void main(String[] args){
        int option = -1;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o limite do seu cartão: ");
        Credit creditCard = new Credit(scanner.nextFloat());
        
        while (option != 0) {
            System.out.println("Digite a descrição do produto: ");
            String description = scanner.next();
            System.out.println("Digite o valor da compra: ");
            float price = scanner.nextFloat();

            Product product = new Product(description, price);
            boolean bought = creditCard.buyProduct(product);
            product.compareTo(product);

            if (bought) {
                System.out.println("Compra realizada!");
                System.out.println("Saldo atual: " + creditCard.getBalance());

                System.out.println("Digite 0 para sair e 1 para continuar"); 
                option = scanner.nextInt();
                switch (option) {
                    case 0:
                        option = 0;
                        break;
                    case 1:
                        break;
                    default:
                        System.out.println("Opção inválida.");
                        option = 0;
                        break;
                }

            } else {
                option = 0;
                System.out.println("Saldo insuficiente.");
            }
        }

        creditCard.menu();
        scanner.close();
    }
}
