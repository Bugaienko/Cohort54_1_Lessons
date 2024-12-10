package homework_24.system1;

/**
 * @author Sergey Bugaenko
 * {@code @date} 05.12.2024
 */

public interface PaySystem {

    void withdrawMoney(double amount);
    void depositTransfer(double amount);
    double checkBalance();
}
