package srp2;

public class Program {
    /**
     * TODO: Переработать структуру приложения Order, приложение должно соответствовать
     *  принципу SRP.
     * @param args
     */
    public static void main(String[] args) {
        SaveToJson2 saveJson = new SaveToJson2();
        InputConsole inputConsole = new InputConsole();

        Order order = inputConsole.inputFromConsole();
        saveJson.saveJson(order);
    }
}
