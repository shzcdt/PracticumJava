package Polymorphism.ad_hoc.staticAd_hoc;

public class Printer {
    public void print(int i) {
        System.out.println(i + " это число");
    }

    public void print(String s) {
        System.out.println(s + "зе ис строка");
    }

    public void print(Object o) {
        System.out.println(o.toString() + " а этоооо объект");
    }

    @Override
    public String toString() {
        return "Я - объект принтера!";
    }
}