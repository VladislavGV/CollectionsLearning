import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Main {

    public static void main(String[] args) {

        Cat[] cats = new Cat[4];
        cats[0] = new Cat("Tomas");
        cats[1] = new Cat("Begemot");
        cats[2] = new Cat("Fillip Maximovich");
        cats[3] = new Cat("Kotya");

       // cats[1] = null;


        System.out.println(Arrays.toString(cats));

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


    }


}