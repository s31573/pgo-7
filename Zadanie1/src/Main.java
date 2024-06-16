import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        ArrayList<Car> cars= new ArrayList<Car>();

        cars.add(new Car("Golf", 1998));
        cars.add(new Car("I20", 2020));
        cars.add(new Car("I30", 2018));

        for(Car car : cars){
            System.out.println(car.model + " " + car.year);
        }
        System.out.println("-------");
        Collections.sort(cars);

        for(Car car : cars){
            System.out.println(car.model + " " + car.year);
        }

    }

}