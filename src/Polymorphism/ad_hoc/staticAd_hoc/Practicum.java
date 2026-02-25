package Polymorphism.ad_hoc.staticAd_hoc;

public class Practicum{
    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.print(5);
        printer.print("[eq");
        printer.print(100L); // это объект, так как у нас нет перегрузки на long, а все слассы являются нследниками object
    }
}