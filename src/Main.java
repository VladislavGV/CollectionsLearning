import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Cat[] cats = new Cat[4];
        cats[0] = new Cat("Tomas");
        cats[1] = new Cat("Begemot");
        cats[2] = new Cat("Fillip Maximovich");
        cats[3] = new Cat("Kotya");

       // cats[1] = null;


        System.out.println(Arrays.toString(cats));
    }


}