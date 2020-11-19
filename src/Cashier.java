// Invoker
public class Cashier {
    Command command;

    public void takeOrder(Command c){
        command = c;
        command.orderUp();
    }
}
