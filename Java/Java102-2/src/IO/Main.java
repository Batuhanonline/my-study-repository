package IO;

import java.io.*;
import java.nio.charset.Charset;

public class Main {
    public static void main(String[] args) {
        //Dosya oluşturma

        /*File dosya = new File("src/patika.txt");
        try {
            if (dosya.createNewFile()) {
                System.out.println(dosya.getName() + " dosyası oluşturuldu.");
            } else {
                System.out.println(dosya.getName() + " dosyası zaten mevcut!");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }*/


        //Dosya silme
//        System.out.println(dosya.delete());

        //Dosya dizinleri arasında gezinme
        /*File dizin = new File("test");
        dizin.mkdir();

        File dosya = new File("test/patika.txt");
        try {
            System.out.println(dosya.createNewFile());
        } catch (IOException e) {
            e.printStackTrace();
        }*/

         //-------------------------FileInputStream-------------------------

        /*try {
//            File dosya = new File("patika.txt"); // Dosyayı baştan oluşturmak istersek
            FileInputStream input = new FileInputStream("patika.txt");

            int i = input.read();
            while (i != -1) {
                System.out.print((char) i);
                i = input.read();
            }

            input.close(); // Stream sınıfları ile işimiz bittiğinde kapatmamız gereksiz bellek kullanımın önüne geçmektedir.
        } catch (Exception e) {
            throw new RuntimeException(e);
        }*/


        /*
        try {
//            File dosya = new File("patika.txt"); // Dosyayı baştan oluşturmak istersek
            FileInputStream input = new FileInputStream("patika.txt");

            System.out.println("Kullanılabilir byte sayısı: " + input.available());
            input.read();
            input.read();
            input.read();
            input.read();
            System.out.println("Kullanılabilir byte sayısı: " + input.available());

            input.close(); // Stream sınıfları ile işimiz bittiğinde kapatmamız gereksiz bellek kullanımın önüne geçmektedir.
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

         */


        //-------------------------FileOutputStream-------------------------
/*
        String yazi = "\nOutputStream Öğreniyorum.\nBatuhan.";

        try {
            File dosya = new File("patika.txt");
            FileOutputStream output = new FileOutputStream(dosya, true);
            byte[] yaziByte = yazi.getBytes();
            output.write(yaziByte);
            output.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
 */


        //-------------------------Byte Array Input Stream-------------------------
/*
        byte[] dizi = {1, 2, 3, 54, 66};
        ByteArrayInputStream input = new ByteArrayInputStream(dizi);

        System.out.println(input.read());
        System.out.println(input.read());
        System.out.println(input.read());

        try {
            input.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

 */

        //-------------------------Byte Array Output Stream-------------------------
        /*
        String data = "Java 102 dersleri.";
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        byte[] dataByteArray = data.getBytes();

        try {
            output.write(dataByteArray);
            String newData = output.toString();
            System.out.println("Çıkış akışı: " + newData);

            output.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

         */

        //------------------------ObjectStream------------------------
/*
        Car c1 = new Car("Audi", "A3");


        try {
            FileOutputStream fileOutputStream = new FileOutputStream("araba.txt");
            ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);
            outputStream.writeObject(c1);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        try {
            FileInputStream inputStreamFile = new FileInputStream("araba.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(inputStreamFile);
            Car newCar = (Car) objectInputStream.readObject();

            System.out.println(newCar.getBrand());
            System.out.println(newCar.getModel());

            inputStreamFile.close();
            objectInputStream.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

 */

        //------------------------Buffered Stream------------------------
        /*
        try {
            FileInputStream fileInputStream = new FileInputStream("patika.txt");
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);

            int i = bufferedInputStream.read();
            while (i != -1){
                System.out.print((char) i);
                i = bufferedInputStream.read();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

         */


        /*
        String data = "Java 102";
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("patika.txt");
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);

            byte[] byteArray = data.getBytes();

            bufferedOutputStream.write(byteArray);
            bufferedOutputStream.close();
            fileOutputStream.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

         */


        //------------------------PrintStream------------------------

        /*
        try {
            PrintStream output = new PrintStream("print.txt");
            output.println(213123);
            output.println("12" + 323);
            output.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

         */

        //------------------------InputStreamReader------------------------

        /*
        try {
            FileInputStream fileInput = new FileInputStream("patika.txt");

            InputStreamReader inputStreamReader = new InputStreamReader(fileInput, Charset.forName("UTF8"));
            System.out.println(inputStreamReader.getEncoding());

            int i = inputStreamReader.read();
            while (i != -1) {
                System.out.print((char) i);
                i = inputStreamReader.read();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

         */


        //------------------------OutputStreamWriter------------------------

        /*
        String data = "ĞÜŞİ";
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("output.txt");

            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);

            outputStreamWriter.write(data);

            outputStreamWriter.close();
            fileOutputStream.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

         */

        //------------------------FileReader ve FileWriter------------------------

        /*
        try {
            FileReader fileReader = new FileReader("patika.txt");
            int i = fileReader.read();
            while (i != -1){
                System.out.print((char) i);
                i = fileReader.read();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        String data = "Java Öğreniyorum.";
        try {
            FileWriter fileWriter = new FileWriter("patika.txt");
            fileWriter.write(data);
            fileWriter.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

         */

        //------------------------BufferedReader ve BufferedWriter------------------------

        /*
        try {
            FileReader fileReader = new FileReader("patika.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
                line = bufferedReader.readLine();
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

         */

        /*
        String data = "Java Öğreniyorum.";

        try {
            FileWriter fileWriter = new FileWriter("output.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            fileWriter.write(data);

            fileWriter.close();
            bufferedWriter.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

         */

        //------------------------PrintWriter------------------------

        /*
        String data = "Java 102";
        try {
            PrintWriter writer = new PrintWriter("output.txt");
            writer.print(data);
            writer.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

         */

    }
}
