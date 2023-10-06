package exercises;

import com.sasvi.datatypes.Car;
import com.sasvi.datatypes.Person;
import com.sasvi.mockdata.MockData;
import org.junit.Test;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MoreExercises {

    @Test
    public void getPeopleWhoseNameStartsWithA() throws Exception {
        List<Person> people = MockData.getPeople();

        List<String> peopleFirstnameWithA = people.stream()
                .filter( person ->person.getFirstName().startsWith("A") && person.getGender().equals("Male"))
                .map(person2 -> person2.getFirstName())
                .collect(Collectors.toList());
        System.out.println(peopleFirstnameWithA);
    }

    @Test
    public void getOldAgePeople() throws Exception {
        List<Person> people = MockData.getPeople();

        List<Person> oldPeople = people.stream()
                .filter( person ->person.getAge()>=60)
                .sorted(Comparator.comparing(Person::getAge))
                .collect(Collectors.toList());
        System.out.println(oldPeople);
    }

    @Test
    public void findAPersonByFirstName() throws Exception {
        List<Person> people = MockData.getPeople();

               people.stream()
                .filter( person ->person.getFirstName().equalsIgnoreCase("Dallas"))
                       .forEach(System.out::println);
    }

    @Test
    public void getToyotaYellowCars() throws Exception {
        List<Car> cars = MockData.getCars();

        List<Car> toyotayellow = cars.stream()
                .filter( car ->car.getMake().equals("Toyota")&&car.getColor().equals("Yellow"))
                .collect(Collectors.toList());
        System.out.println(toyotayellow);
    }

    @Test
    public void getFordRedCars() throws Exception {
        List<Car> cars = MockData.getCars();

                cars.stream()
                .filter( car ->car.getMake().equals("Ford")&&car.getColor().equals("Red"))
                .map(car2 -> car2.getColor())
                        .forEach(System.out::println);
    }

    @Test
    public void getPriceOfAllToyota() throws Exception {
        List<Car> cars = MockData.getCars();
              Double price =  cars.stream()
                    .filter(p ->  p.getMake().equals("Toyota") )
                     .mapToDouble(car -> car.getPrice())
                         .sum();
        System.out.println("Sum of Toyota cars  :" + price);
    }

    @Test
    public void getPeopleWithAge50() throws Exception {
       List<Person> people = MockData.getPeople();

          people.stream()
                  .filter(person->person.getAge().equals(50))
                  .skip(4)
                  .forEach(System.out::println);
        System.out.println("******************");
        people.stream()
                .filter(person->person.getAge().equals(50))
                .forEach(System.out::println);

    }


    @Test
    public void getCarsWithColourRed() throws Exception {
        List<Car> cars = MockData.getCars();

        long redCars =  cars.stream()
                .filter(car-> car.getColor().equals("Red"))
                .map(car -> car.getMake())
                  .count();
        System.out.println(redCars);

    }


    //reduce
    //
}
