package Tests;

import java.util.List;
import java.util.Random;

public class OvercomplicatedCoolieFactory {
    private int cookiesCreated = 0;
    private final List<String> positiveText;
    private final List<String> negativeText;
    private boolean isPositive;

    private final Random rnd = new Random();

    public OvercomplicatedCoolieFactory(
            List<String> positiveText,
            List<String> negativeText,
            boolean isPositive
    ) {
        this.positiveText = positiveText;
        this.negativeText = negativeText;
        this.isPositive = isPositive;
    }

    private void incrementNumberOfCookiesCreated(){
        cookiesCreated++;
    }

    public String bakeFortuneCookie() {
        StringBuilder cookieBuilder = new StringBuilder();

        this.incrementNumberOfCookiesCreated();

        if (rnd.nextInt(3) == 2){
            isPositive = true;
            return positiveText.get(rnd.nextInt(positiveText.size()));
        } else {
            isPositive = false;
            return negativeText.get(rnd.nextInt(negativeText.size()));
        }
    }
}
