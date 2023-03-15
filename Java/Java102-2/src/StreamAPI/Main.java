package StreamAPI;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer>  list = new ArrayList<>();
        list.add(32);
        list.add(43);
        list.add(432);
        list.add(12);
        list.add(43);
        list.add(56);
        list.add(77);
        list.add(88);

/*
        for (int i = 0; i < list.size(); i++){
            System.out.print(list.get(i));
        }
        System.out.println();


 */
        //-----------------------------------------------------


       // list.stream().forEach(i -> System.out.print(i));


        //list.stream().filter(num -> num > 60).forEach(num -> System.out.println(num));

        //list.stream().distinct().forEach(num -> System.out.println(num));

        //list.stream().distinct().sorted().forEach(num -> System.out.println(num));

        //System.out.println(list.stream().anyMatch(i -> i == 77));

        //list.stream().map(i -> i * 2).forEach(i -> System.out.println(i));

    }
}
