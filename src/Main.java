import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        //Arrays
        Cat[] cats = new Cat[4];
        cats[0] = new Cat("Tomas");
        cats[1] = new Cat("Begemot");
        cats[2] = new Cat("Fillip Maximovich");
        cats[3] = new Cat("Kotya");

       // cats[1] = null;


        System.out.println(Arrays.toString(cats));

        //ArrayList

        ArrayList<Cat> catsList = new ArrayList<>();
        for(Cat cat : cats){
            catsList.add(cat);
        }

        catsList.add(new Cat("Begemot2"));

        catsList.remove(1);

        Cat cat = catsList.get(0);

        System.out.println(cat);
        System.out.println(catsList.indexOf(cat));

        catsList.add(2, cat);
        catsList.set(2, new Cat("Меня сюда вставили"));

        catsList.removeAll(Arrays.asList(cat, catsList.get(3)));

        System.out.println(catsList.toString());

        System.out.println(catsList.size());


        //LinkedList
        String str1 = new String("Hello World");
        String str2 = new String("My name is Vlad");
        String str3 = new String("I love Java");

        LinkedList<String> artemBio = new LinkedList<>();
        artemBio.add(str1);
        artemBio.add(str2);
        artemBio.add(str3);

        System.out.println(artemBio);

        artemBio.remove(0);
        System.out.println(artemBio);


        // Linked List on practice
        LinkedList<Car> cars = new LinkedList<>();
        Car ferrari = new Car("Ferrari Spider");
        Car bugatti = new Car("Veyron");
        Car mercedes = new Car("Mercedes Benz");

        cars.addAll(Arrays.asList(ferrari, bugatti, mercedes));
        System.out.println(cars);

        cars.addFirst(new Car("Ford gt300"));
        cars.addLast(new Car("Fiat"));
        System.out.println(cars);

        System.out.println(cars.pollFirst());
        System.out.println(cars);


    }


}