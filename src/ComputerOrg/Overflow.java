package ComputerOrg;

public class Overflow {

    public static void main(String[] args) {
        byte x = 122;
        for  (int i =0; i < 10; i++) {
            x++;
            System.out.println(x);
        }
    }
}
