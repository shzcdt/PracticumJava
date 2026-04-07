package Tests.Transfer;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MoneyTransferTest {
    private final MoneyTransferService moneyTransferService = new MoneyTransferService();

    @Test
    public void shouldMakeTransfer() {
        Account accountOne = new Account("1", 10);
        Account accountTwo = new Account("2", 10);

        moneyTransferService.transfer(7, accountOne, accountTwo);
        assertEquals(3, accountOne.balance);
        assertEquals(17, accountTwo.balance);
    }

    @Test
    public void shouldNotTransferMoneyOnSameAccount() {
        Account accountOne = new Account("1", 10);
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, new Executable() {
            @Override
            public void execute() {
                moneyTransferService.transfer(5, accountOne, accountOne);
            }
        });

        assertEquals("Нельзя перевести деньги на тот же аккаунт. Id: 1", ex.getMessage());
    }

    @Test
    public void shouldTransferBeGreaterThanZero() {
        Account accountOne = new Account("1", 5);
        Account accountTwo = new Account("2", 10);
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, new Executable() {
            @Override
            public void execute(){
                moneyTransferService.transfer(0, accountOne, accountTwo);
            }
        });

        assertEquals("Сумма перевода должна быть больше 0", ex.getMessage());
    }

    @Test
    public void shouldNotTransferMoreMoneyThanOnBalance(){
        Account accountOne = new Account("1", 0);
        Account accountTwo = new Account("2", 2);
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, new Executable() {
            @Override
            public void execute() {
                moneyTransferService.transfer(5, accountOne, accountTwo);
            }
        });

        assertEquals("Сумма перевода не должна превышать баланс пользователя Id: 1", ex.getMessage());
    }

    @Test
    public void shouldNotMakeBalanceLessThanZero() {
        Account accountOne = new Account("1", -5);
        Account accountTwo = new Account("2", 2);
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, new Executable() {
            @Override
            public void execute(){
                moneyTransferService.transfer(5, accountOne, accountTwo);
            }
        });

        assertEquals("Баланс счета, с которого осуществляется перевод, не может быть меньше 0. Id: 1", ex.getMessage());
    }

    @Test
   public void shouldNotMakeOverflowOnTransfer(){
        Account accountOne = new Account("1", 2);
        Account accountTwo = new Account("2", 2);

        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, new Executable() {
            @Override
            public void execute(){
                moneyTransferService.transfer(-2, accountOne, accountTwo);
            }
        });

        assertEquals("Сумма перевода должна быть больше 0", ex.getMessage());
    }
}
