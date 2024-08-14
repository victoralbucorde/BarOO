import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Sexo:");
        char sexo = scanner.next().charAt(0);
        while (sexo != 'M' && sexo != 'F') {
            System.out.print("Sexo: ");
            sexo = scanner.next().charAt(0);
        }

        System.out.println("Quantidade de cervejas:");
        int cervejas = scanner.nextInt();

        System.out.println("Quantidade de refrigerantes:");
        int refrigerantes = scanner.nextInt();

        System.out.println("Quantidade de espetinhos:");
        int espetinhos = scanner.nextInt();

        Bill bill = new Bill(sexo, cervejas, refrigerantes, espetinhos);
        System.out.println("Relatório:");
        System.out.printf("Consumo = R$ %.2f\n", bill.feeding());
        if (bill.cover() == 0.0){
            System.out.println("Isento de Couvert");
        }else{
            System.out.printf("Couvert = R$ %.2f\n", bill.cover());
        }
        System.out.printf("Ingresso R$ %.2f\n", bill.ticket());
        System.out.printf("Valor a pagar = R$ %.2f", bill.total());
        scanner.close();
    }
}