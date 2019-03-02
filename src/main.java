
import java.util.Arrays;
import java.util.List;


public class main {


    public static void main (String[] args) {
        List<Person> persons = Arrays.asList
                (new Person(12),new Person(71),new Person(17) );
        myContainer<Person,Integer> myCont = new myContainer<>(persons);
        System.out.println(myCont.aggregateAll());
       
        List<Car> cars = Arrays.asList
                (new Car(9),new Car(80),new Car(32) );
        myContainer<Car,Integer> myCars = new myContainer<>(cars);
        System.out.println(myCars.aggregateAll());

    }

}
