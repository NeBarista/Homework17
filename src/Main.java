public class Main {
    public static void main(String[] args) {
        age(5);
        age(19);
    }
    public static void age(int number1) {
        if(number1>18) {
            System.out.println("Access to content");
        }
        else {
            System.out.println("You're too small for that");
        }
    }
}