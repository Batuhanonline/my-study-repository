public class Main {
    public static void main(String[] args) {
//        MyList<Integer> liste = new MyList<>();
//        System.out.println("Dizideki Eleman Sayısı : " + liste.size());
//        System.out.println("Dizinin Kapasitesi : " + liste.getCapacity());
//        liste.add(10);
//        liste.add(20);
//        liste.add(30);
//        liste.add(40);
//        System.out.println("Dizideki Eleman Sayısı : " + liste.size());
//        System.out.println("Dizinin Kapasitesi : " + liste.getCapacity());
//        liste.add(50);
//        liste.add(60);
//        liste.add(70);
//        liste.add(80);
//        liste.add(90);
//        liste.add(100);
//        liste.add(110);
//        System.out.println("Dizideki Eleman Sayısı : " + liste.size());
//        System.out.println("Dizinin Kapasitesi : " + liste.getCapacity());



//        MyList<Integer> liste = new MyList<>();
//        liste.add(10);
//        liste.add(20);
//        liste.add(30);
//        System.out.println("2. indisteki değer : " + liste.get(2));
//        liste.remove(2);
//        liste.add(40);
//        liste.set(0, 100);
//        System.out.println("2. indisteki değer : " + liste.get(2));
//        System.out.println(liste.toPrint());


        MyList<Integer> liste = new MyList<>();
        System.out.println("Liste Durumu : " + (liste.isEmpty() ? "Boş" : "Dolu"));
        liste.add(10);
        liste.add(20);
        liste.add(30);
        liste.add(40);
        liste.add(20);
        liste.add(50);
        liste.add(60);
        liste.add(70);

        System.out.println("Liste Durumu : " + (liste.isEmpty() ? "Boş" : "Dolu"));

        // Bulduğu ilk indeksi verir
        System.out.println("Indeks : " + liste.indexOf(20));

        // Bulamazsa -1 döndürür
        System.out.println("Indeks :" + liste.indexOf(100));

        // Bulduğu son indeksi verir
        System.out.println("Indeks : " + liste.lastIndexOf(20));

        // Listeyi Object[] dizisi olarak geri verir.
        Object[] dizi = liste.toArray();
        System.out.println("Object dizisinin ilk elemanı :" + dizi[0]);

        // Liste veri türünde alt bir liste oluşturdu
        MyList<Integer> altListem = liste.subList(0, 3);
        System.out.println(altListem.toPrint());

        // Değerim listedeki olup olmadığını sorguladı
        System.out.println("Listemde 20 değeri : " + liste.contains(20));
        System.out.println("Listemde 120 değeri : " + liste.contains(120));

        // Listeyi tamamen boşaltır ve varsayılan boyutuna çevirir
        liste.clear();
        System.out.println(liste.toPrint());

    }
}