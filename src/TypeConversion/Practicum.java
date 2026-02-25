package TypeConversion;

import java.util.ArrayList;
import java.util.List;

public class Practicum {
    public static void main(String[] args) {
//        Document document = new RussianPassport("5467", "9805");
//        Document document1 = new Snils("111111111");
//        System.out.println(document.getDocumentNumber());
//        System.out.println(document1.getDocumentNumber());
//
//
//        RussianPassport passport = (RussianPassport) document;
//        RussianPassport passport1 = (RussianPassport) document1;
//
//        System.out.println(passport1.getSeries());
//        System.out.println(passport.getNumber());
//        System.out.println(passport.getSeries());

        Document passport = new RussianPassport("1111", "22222");
        Document snils = new Snils("1231231231");

        List<Document> documents = new ArrayList<>();
        documents.add(passport);
        documents.add(snils);

        for (Document document : documents) {
            boolean isPassport = document instanceof RussianPassport;
            if (isPassport) {
                RussianPassport passportDocument = (RussianPassport) document;
                System.out.println("Номер паспорта: " + passportDocument.getNumber());
                System.out.println("Серия паспорта: " + passportDocument.getSeries());
            } else if (document instanceof Snils) {
                Snils snilsDocument = (Snils) document;
                System.out.println("Номер снилса: " + snilsDocument.getDocumentNumber());
            } else {
                System.out.println("Неизвестный тип документа");
            }

        }
    }
}
