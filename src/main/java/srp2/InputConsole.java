package srp2;

import java.util.Scanner;

public class InputConsole {

    private Scanner scanner = new Scanner(System.in);
    public Order inputFromConsole(){
        String clientName = prompt("Client name: ");
        String product = prompt("Product: ");
        int qnt = Integer.parseInt(prompt("Quantity: "));
        Double price = Double.parseDouble(this.prompt("Price: "));
        Order order = new Order(clientName, product, qnt, price);
        return order;
    }

    private String prompt(String message) {
        System.out.print(message);
        return scanner.nextLine();
    }
}
