package Module_4;

public abstract class BankSystem{
    public abstract void withdrawOfUser(User user, int amount);

    public abstract void fundUser(User user, int amount);

    public abstract void transferMoney(User fromUser, User toUser, int amount);

    public abstract void paySalary(User user);

    public interface bankSystem {
    void withdrawOfUser(User user, int amount);
    void fundUser(User user, int amount);
    void transferMoney(User fromUser, User toUser, int amount);
    void paySalary(User user);
}
}
