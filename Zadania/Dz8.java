package Zadania;

public class Dz8 {
    public static void main(String[] args) {
    public static boolean eighth(int year){
        return year % 100 != 0 && year % 4 == 0 || year % 400 ==0;
    }
}
}
