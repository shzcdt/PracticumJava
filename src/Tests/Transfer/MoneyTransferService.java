package Tests.Transfer;

public class MoneyTransferService {

    public void transfer(int amount, Account accountOne, Account accountTwo) {
        if (accountOne.id.equals(accountTwo.id)) {
            throw new IllegalArgumentException("Нельзя перевести деньги на тот же аккаунт. Id: " + accountOne.id);
        }

        if (accountOne.balance < 0) {
            throw new IllegalArgumentException("Баланс счета, с которого осуществляется перевод, не может быть меньше 0. Id: " + accountOne.id);
        }

        if (accountOne.balance < amount){
            throw new IllegalArgumentException("Сумма перевода не должна превышать баланс пользователя Id: " + accountOne.id);
        }

        if (amount <= 0){
            throw new IllegalArgumentException("Сумма перевода должна быть больше 0");
        }

        accountOne.balance -= amount;
        accountTwo.balance += amount;
    }
}

class Account {
    public String id;
    public int balance;

    public Account(String id, int balance){
        this.id = id;
        this.balance = balance;
    }
}