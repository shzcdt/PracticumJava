package String;

public class CardNumberMasker {
    public String maskCardNumber(String cardNumber) {
        return cardNumber.substring(0, 4) + "********" + cardNumber.substring(cardNumber.length()
                - 5, cardNumber.length() - 1);
    }
}
