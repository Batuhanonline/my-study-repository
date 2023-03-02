package Collections;

import java.util.*;

public class Main {
    public static void main(String[] args) {


        // HashSet
        /*HashSet<Integer> hSet = new HashSet<>();
        hSet.add(10);
        hSet.add(20);
        hSet.add(10);
        hSet.add(30);

        for (Integer number: hSet) {
            System.out.println(number);
        }

        //Iterator kullanımı
        System.out.println("Iterator -------------");

        Iterator<Integer> itr = hSet.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }*/

        //LinkedHashSet
        /*LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(30);
        linkedHashSet.add(10);
        linkedHashSet.add(20);
        linkedHashSet.add(10);

        Iterator<Integer> iterator = linkedHashSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }*/

        //TreeSet
//        TreeSet<Student> students = new TreeSet<>(new OrderNoteComparator().reversed());
//        TreeSet<Student> students = new TreeSet<>(new OrderNameComparator());
        //Farklı bir kullanım türü
        /*TreeSet<Student> students = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getNote() - o2.getNote();
            }
        });


        students.add(new Student("Mustafa", 20));
        students.add(new Student("Ahmet", 100));
        students.add(new Student("Behlül", 45));
        students.add(new Student("Damla", 60));
        students.add(new Student("Damla", 60));
        students.add(new Student("Cemre", 60));

        for (Student student: students) {
            System.out.println(student.getName());
        }*/


        //ArrayList
       /* List<Integer> liste = new ArrayList<>();

        liste.add(10);
        liste.add(1);
        liste.add(4);
        liste.add(null);

//        Iterator<Integer> iterator = liste.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }
//
//        for(Integer element: liste) {
//            System.out.println(element);
//        }
//
//        System.out.println(liste);*/


        //LinkedList
        /*List<String> liste = new LinkedList<>();
        liste.add("Batuhan");
        liste.add("Batuhan");
        liste.add("Güven");
        liste.add("Java");
        liste.add("102");

        Iterator<String> iterator = liste.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }*/

            //Vektor
        /*Vector<String> vector = new Vector<>();
        vector.add("Ankara");
        vector.add("Ankara");
        vector.add("İstanbul");
        vector.add("İzmir");

        vector.add(2, "Bolu");
        System.out.println(vector.contains("Ankara"));*/


        //Polimorfizm, polimorphism, çok biçimlilik
        /*Queue<String> queue = new LinkedList<>();
        queue.add("Batuhan");
        queue.add("Güven");

        Iterator<String> iterator = queue.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }*/


        //PriorityQueue

       /* PriorityQueue<String> queue = new PriorityQueue<>(new Comparator<String>() { //Anonim override
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        queue.add("Mustafa");
        queue.add("Batuhan");
        queue.add("Ahmet");
        queue.add("Damla");

        for (String element: queue) {
            System.out.println(element);
        }*/


        //Map ve HashMap

        /*Map<String, String> country = new HashMap<>();

        country.put("TR", "Türkiye");
        country.put("GR", "Almanya");
        country.put("EN", "İngiltere");

//        System.out.println(country.get("TR"));

        for (String countryKey: country.keySet()) {
            System.out.println(countryKey);
        }*/



    }
}
