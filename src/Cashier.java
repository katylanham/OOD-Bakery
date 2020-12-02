// Invoker
public class Cashier {
    Command command;

    public void takeOrder(Command comm){
        command = comm;
        command.order();
    }
}
