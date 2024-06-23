import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static ArrayList<Integer> numbers = new ArrayList<>();

    public static void main(String[] args) {

        fillArray();

    }

    public static int readNumber() throws NegativeNumberException {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(number < 0) throw new NegativeNumberException("Negative numbers are not allowed");
        return number;
    }

    public static void fillArray(){
        try{
            numbers.add(readNumber());
        }catch (Exception e){
            numbers.add(0);
            e.printStackTrace();
        }
    }
}
