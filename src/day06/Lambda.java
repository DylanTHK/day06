package day06;

public class Lambda {
    public static void main(String[] args) {
        // (name) => { }
        Greetings hi = (name) -> {
            System.out.println("Hello "+ name);
        };

        hi("fred");
    }
}
