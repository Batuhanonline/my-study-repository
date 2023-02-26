# Java 101

## Yazım Kuralları

Harf Duyarlılığı vardır.

Sınıf adları → UpperCamelCase

Metot adları → lowerCamelCase

Değişkenler → lowerCamelCase

Sabitler → SNAKE_CASE

## Diğer İsimlendirme Kuralları

### Sneak Case

Upper snake case → Snake_Case

Lower snake case → snake_Case

### Screaming Snake Case

Genellikle sabit isimlendirmelerde kullanılmaktadır.

SNAKE_CASE

### Kebap Case

Tümü küçük harflerden oluşur ve kelimelerin aralarında tire işareti konulur.

kebap-case

## Genel Sözdizimi

![Untitled](Java%20101%203a91ed2ad49a450196f252590fe2061a/Untitled.png)

 

## **Escape Karakterler**

Java'da Escape (Kaçış) karakterleri ile bazı özel durumlar durumlar gerçekleştirilir. Kaçış karakterleri ( / ) ters eğik çizgi ile ifade edilip sonrasında yazılan karakter ile özel işleve sahip olurlar.

![Untitled](Java%20101%203a91ed2ad49a450196f252590fe2061a/Untitled%201.png)

## Javadoc

![Untitled](Java%20101%203a91ed2ad49a450196f252590fe2061a/Untitled%202.png)

## **Değişkenler ve Veri Tipleri**

Değişkenler programlamada geçici bilgileri sakladığımız ve programcı tarafından belirlenen yapılardır.Değişkenlerin 4 özelliği bulunur ; **Veri Tipi, İsim, Değer ve Adres.**

### **Java'daki İlkel Veri Tipleri**

- Tam Sayılar
    - Byte
    - Short
    - Integer
    - Long
- Ondalıklı Sayılar
    - Float
    - Double
- Karakterler
    - Char
- Mantıksal Değerler
    - Boolean

# **Temel Operatörler**

Java'da operatörler aşağıdaki gibi listelenebilir:

- Atama Operatörleri
- Aritmetiksel Operatörler
- İlişkisel ve Eşitlik Operatörler
- Koşul Operatörler
- Mantıksal Operatörler

### **Atama Operatörü**

![Untitled](Java%20101%203a91ed2ad49a450196f252590fe2061a/Untitled%203.png)

## Aritmetik Operatörler

Java'da Aritmetik Operatörler adından da anlaşılacağı üzere matematiksel işlemleri programlama dilinde uygulamamızı sağlarlar.

- Toplama : a + b
- Çıkarma : a – b
- Çarpma : a * b
- Bölme : a / b
- Mod alma : a % b
- 1 arttırma : a++
- 1 eksiltme : b--

## Karşılaştırma Operatörleri

Java'da Karşılaştırma Operatörleri iki nesnenin birbirleriyle olan durumlarını belirler.

- Eşitlik : a == b
- Eşit Değil : a != b
- Büyüktür : a > b
- Küçüktür : a < b
- Büyük Eşittir : a >= b
- Küçük Eşittir : a <= b

## Mantıksal Operatörler

Java'da Mantıksal Operatörler , nesnelerin veya ifadelerin mantıksal değerlerini yansıtır.

- Ve : a && b
- Veya : a || b
- Değil : !(a&&b)

## Koşul Operatörü

Java'da Koşul Operatörleri ifadelerin sonucunda oluşacak olayları belirler.

- a = 5 ;
- b = (a == 1) ? 1 : 0
- Çıktısı : 0

## **Kullanıcıdan Veri Alma**

Java’da **kullanıcıdan veri almak** için **Scanner** sınıfı kullanılır. Ama bu sınıfı kullanmadan önce kodumuza **Scanner** sınıfını dahil etmemiz gerekir. Bunun için **import** deyimi kullanılır ;

```java
import java.util.Scanner;

public class JavaScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b;

        System.out.println("A sayısını giriniz : ");
        a = input.nextInt();

        System.out.println("B sayısını giriniz : ");
        b = input.nextInt();

        System.out.println("A Sayısı : " + a);
        System.out.println("B Sayısı : " + b);
    }
}
```

### **Veri Tiplerine Göre Scanner Metotları**

![Untitled](Java%20101%203a91ed2ad49a450196f252590fe2061a/Untitled%204.png)

# If ve Else Blokları

Java'da mantıksal ve koşullu ifadeler için **if** blokları kullanılır. Java 'da **if** blokları Türkçede "**eğer**" cümlesinin verdiği anlamla aynı şeyi ifade etmektedir. Programlamada koşul oluşturmak için **if ve else** bloklarını kullanırız. **Else** deyimi **"değil ise"** anlamı katmaktadır ve **if** deyiminden sonra kullanılır. Programlama da **if ve else deyimleri** çok önemlidir ve kodlamanın temel yapı taşlarını oluştururlar. If ve Else blokları ile programımız içerisinde ki algoritmalarımızı oluştururuz.

Koşula göre program içinde farklı işlemleri yerine getirmek gerekebilir. If-else muhtemelen yazılım programlarında en yaygın kullanılan karar mekanizmasıdır. Bu tarz durumları Java'da kodlayabilmek için if-else karar mekanizmasının yanında switch-case gibi yapılarda kullanılmaktadır. İf-else karar mekanizması istenilen koşul gerçekleştiği takdirde çalışır. Kısacası belirlenen koşul doğruysa yazılan kod çalışır.

## Java'da Karar Mekanizmaları

Java'da koşullu ifade ve şart oluşturmak için i**f ve else** kullanılırız. Ayrıca **else if, switch** gibi koşullu ifadelere sahiptir.

- Programımızda belirtilen bir koşul doğruysa yürütülecek bir kod bloğu belirtmek için **if** kullanılır.
- Aynı koşul yanlışsa yürütülecek bir kod bloğu belirtmek için **else** deyimi kullanılır.
- İlk koşul yanlışsa, test edilecek yeni bir koşul belirtmek için eğer **if else** deyimi kullanılır.
- Yürütülecek birçok alternatif kod bloğu belirtmek için **switch** deyimi kullanılır.

Örneğin: "yaşı 50'den küçük olanların personel kayıtlarını getir" gibi bir ifadede yaşı 50'den küçük olanları tespit etmek için karar mekanizmaları kullanılır. Eğer koşul sağlanmıyorsa başka bir kod bloğu işletilir. İfadenin yazılımsal olarak Java'da karşılığı aşağıdaki gibidir.

```java
if(age < 50) {
	// personel kayıtlarını getir
}
```

Koşulun gerçekleşip gerçekleşmediği "if" cümlesi içindeki ifadeye bağlıdır. Eğer mantıksal ifade true ise "if" kod bloğu çalıştırılır. Tabi ifadenin false döndüğü durumda da programın bir şeyler yapmasını isteyebiliriz. Bu durumda ise "else" ifadesi kullanılır. Aşağıdaki gibi bir örnekle açıklayabiliriz.

Eğer, faiz oranı %70'den büyükse "Kurumsal Müşteri" tipinde kredi ver, değilse "Standart Müşteri" tipinde kredi ver şeklinde bir karar mekanizması aşağıdaki gibi tasarlanabilir.

```java
if(creditRatio > 0.7) {
	System.out.println("Kurumsal müşteri tipinde kredi");
}
else {
	System.out.println("Standart müşteri tipinde kredi");
}
```

## else if

**if - else - if**

if-else-if kalıbında, bir if satırı, istediğiniz sayıda else-if satırı ve isteğe bağlı olarak tanımlanan bir else satırı bulunur. Yani, else satırının tanımlanması şart değildir. Program, en başta yer alan if satırı ile if-else-if kalıbını değerlendirmeye başlar. İlk doğru ifadenin bulunduğu if veya else-if satırı ile karşılaştığında ilgili işlem satırını çalıştırır. Kalıbın geri kalan tüm satırlarını değerlendirmeye almadan geçer. Eğer if ve else if satırlarında yer alan ifadelerden hiç biri doğru bir sonuç vermezse, else satırında yer alan işlem satırını çalıştırır. else satırı da mevcut değilse, program if-else-if kalıbının hiç bir satırını çalıştırmadan bir sonraki satırdan çalışmasına devam eder. if-else-if kalıbında sadece tek bir satır işlem görür.

Konumuzu açıklamak amacıyla aşağıdaki kodu inceleyebiliriz.

```java
if(i==10){
  System.out.println("i nin degeri 10'dur.");
}
else if(i<10){
  System.out.println("i nin degeri 10'dan kücüktür.");   
}
else{
  System.out.println("i nin degeri 10'dan farklıdır ve 10'dan kücük degildir.");   
}
```

# Switch-Case Yapısı

Java'da birden çok kod bloğunu koşullara bağlamak için "switch" deyimi kullanılır. Switch Case; tanımlanmış olan yalnızca bir değişkenin, alacağı değerlere bağlı olarak, farklı sonuçlar döndürmesini sağlayan bir yapıdır. Switch kısmında kullanılacak olan değişkenler byte, short, int, char veya String veri tipine sahip olmalıdır.

## Sözdizimi (Syntax)

```java
switch(değer) {
    case x:
        // değer x'e eşitse bu kod bloğu çalışacak
        break;
    case y:
        // değer y'ye eşitse bu kod bloğu çalışacak
        break;
    default:
        // değer hiç bir şeye eşit değilse bu kod bloğu çalışacak
}
```

# Döngüler

Döngüler, belirli bir koşul sağlandığı sürece tekrarlanması gereken işler için kullanılan programlama kodlarıdır. Döngü deyimleri, bahsedilen komut parçalarının belirtilen şartlar gerçekleştikçe tekrar tekrar işlenmesini sağlar. Java’da **for, while ve do-while** olmak üzere 3 adet döngü deyimi bulunmaktadır.

Kısacası : Döngü yapıları kodumuzun belirli kısımlarının döngüye girmesini ve birden fazla kez çalışmasını sağlar. Döngüler bir koşula bağlanır ve bu koşul var olduğu sürece aynı kod bloğu çalışmaya devam eder. Koşul artık sağlanmıyorsa döngü sona erer.

![Untitled](Java%20101%203a91ed2ad49a450196f252590fe2061a/Untitled%205.png)

# While Döngüsü

**While** döngüsü Java'nın temel yapı taşlarından bir tanesidir. **While** terimini yazdıktan sonra yanına bir parantez açılıp kapatılır ve bu parantezler arasına **boolean** bir değer girilir. Sonrasında bir süslü parantez açılıp kapatılır ve bunun içine kod bloğu yazılır. Bu parantezler içindeki değer **doğru**(true) olduğu sürece döngü dönmeye devam eder ve kod bloğu çalışır.

```java
while(kosul){
   //kod bloğu
}
```

Burada belirtilen *koşul*, **boolean** bir ifadedir. Bu koşul **true** olduğu sürece döngü devam eder. Koşul **false** olursa döngü sonlanır. Koşul ifadesi parantez içine yazılır. Eğer döngüye girecek kod tek satırdan oluşuyorsa blok açmaya gerek yoktur; fakat birden fazla satırdan oluşuyorsa mutlaka blok açılmalıdır.

```java
int i = 1;
while (i <= 5) {
   System.out.print(i + ',');
   i++;
}
```

Döngülerin içeriği olmak zorunda değildir. Bazı durumlarda döngüye girecek kod olmasa bile döngüye girebiliriz. Aşağıdaki örneği inceleyelim:

```java
int left = 100, right = 200;
while (++left < --right);
System.out.println("100 ile 200'ün ortası: " + left);
```

Yani while döngüsü genellikle işlemin kaç kez tekrar edeceği bilinmediği durumda kullanılır. Örneğin: müşterinin hesabına giriş şifresini kaç kez yanlış gireceğini bilemeyiz. Bu nedenle bu tarz durumlarda "while" döngüsü tercih edilir hemen aşağıdaki örnekte olduğu gibi.

```java
Scanner scanner = new Scanner(System.in);
String customerPassword = "12345";
boolean passwordSuccessfull = false;

while(!passwordSuccessfull) {
	
	System.out.println("Hesap şifrenizi giriniz:");
	String typedPassword = scanner.next();
	
    if(customerPassword.contentEquals(typedPassword)) {
		passwordSuccessfull = true;
		System.out.println("Sisteme başarılı giriş yaptınız!");
	}
}
```

# Do-While Döngüsü

**Do-while** döngüsünün çalışma mantığı **while** döngüsü ile aynıdır , fakat **while** döngüsünde parantez içerisindeki koşul sağlandığı sürece kod bloğu çalışacaktır. Ama **Do-while** döngüsünde durum false olsa bile döngü en az bir kere çalışacaktır. Bu tür durumlar için **Do-while** kullanılır.

Java **Do-While** döngüsü söz dizimi şu şekildedir ;

```java
do {
kodlar//
} while (kosul);
```

## Java **While** ve **Do-While** Arasındaki Farklar ?

Java'da **Do-While** ve **While** döngüleri arasındaki tek fark , **Do-while** döngüsünde, döngü bloğu içindeki kod kesimi **en az bir kez mutlaka** işletilecektir. Çünkü önce döngü bloğu işletilip sonra koşul denetlenmektedir. **While** döngüsünde ise **önce koşula bakılıp** sonra döngü bloğu işletildiği için, döngüye hiç girilmemesi olasıdır.

# For Döngüsü

Java'da döngüler konusunda öğrendiğimiz gibi For döngüsü ile bir koşul belirterek döngülerimizi oluşturabiliriz.

```java
for (durum 1; durum 2; durum 3) {
  // çalışacak kod bloğu
}
```

For döngüsü şu şekilde işler: İlk olarak döngüde sayaç işlevi görecek bir değişken oluşturulur. Bu değişkenin ilk değeri *[durum 1]* ile belirtilen kısımda verilir. Bu değişken *[durum 3]* kısmında isteğe göre artırılır veya azaltılır. Döngünün hangi koşulda çalışacağı ise [durum 2] kısmında boolean bir ifadeyle belirtilir.

```java
for (int i = 0; i < 10; i++) {
  System.out.println(i);
}
```

Bu For Döngüsü örneğinde 1'den 10'a kadar olan sayıları ekrana yazdırdık.

**İlk durumda**, i adında türü int olan ve varsayılan değeri 0 olan bir değişken tanımladık. Bu değişken bizim kodumuzda sayaç görevi görecektir.

**İkinci durumda**, döngünün çalışması için gerekli koşulu tanımlar (i, 10'ten küçük olmalıdır). Koşul doğruysa döngü yeniden başlayacak, yanlışsa döngü sona erecektir.

**Üçüncü durumda**, döngüdeki kod bloğu her çalıştığında değeri 1 arttıran kodumuzu yazdık.

# Continue ve Break Komutları

## Continue Deyimi

Java'da "**continue**" deyimi , döngü içinde bir koşul oluştuğunda o döngüyü tamamlamadan bir sonraki kademeye geçmeye yarar.

```java
int i = 0;
while (i < 10) {
  i++;
  if (i == 5) {
    continue;
  }
  System.out.println(i);
}
```

Örnekte görüldüğü gibi eğer i değişkeni 5 sayısına eşit olduysa, o kod bloğundan sonraki kodlar çalışmayıp döngü bir sonraki adıma geçiş yapacaktır.

## Break Deyimi

Buraya kadar gördüğümüz bütün döngüler belirlediğimiz bir koşula göre kontrol ediliyor ve bu koşul sağlandığı sürece çalışıyordu. Bazı durumlarda, döngü koşulu sağlansa bile başka bir nedenden ötürü döngüyü sonlandırmak isteyebiliriz. Bu tarz durumlarda **break** deyimini kullanırız. Bu deyim, içinde kullanıldığı döngüyü anında sonlandırır.

```java
for (int i = 0; i < 10; i++) {
  if (i == 5) {
    break;
  }
  System.out.println(i);
}
```

Örnekte görüldüğü üzere döngü içinde ki koşul tamamlanmadan i değişkeni 5 değerine ulaştığında "break" komutu ile döngümüzü bitirebiliriz.

# Metotlar (Fonksiyonlar)

Java'da **Metotlar** sadece çağrıldığında kullanılan kod bloklarıdır. Metotlara bir diğer adlandırma olarak **Fonksiyonlar'**da denilmektedir. Bunun sebebi bu kod yapısının matematikte ki fonksiyon mantığına çok benzemesidir. Java'da metotlarımızın içerisine veri aktarmak için ise parametre girebilmekteyiz.

## Neden Metot Kullanırız ?

Programlamada metot kullanmamızın sebebi, bir çok yerde kullanacağımız kodu tek seferde yazıp lazım olduğunda çağırmaktır. Örnek vermek gerekirse, programımız içerisinde bir çok yerde matematikteki "üs alma" işlemini gerçekleştirmiş olalım. Her defasında üs alma işlemi için aynı kodları yazmak yerine bu kodları metot olarak yazıp lazım olduğunda çağırmak işlerimizi kolaylaştıracaktır. Ayrıca metotlar "Nesne Yönelimli Programlamanın" yapı taşlarındandır. Programlamada karmaşık bir problemi daha küçük parçalara bölmek, programınızın anlaşılmasını kolaylaştırır ve yeniden kullanılabilir hale getirir.

## Metot Tanımlama

Java'da metotların sözdizimi şu şekildedir :

```java
veriTipi metotAdi(parametre1, parametre2, ....) {
  // kod bloğu
}
```

## Metot Çağırma

Java'da önceden yazdığımız metotları erişimi olduğu yerlerde çağırabiliriz. Java'da bir metodu çağırmak için metodun adını ve ardından iki parantez () ve bir noktalı virgül yazılmalıdır. Aşağıda ki örnekte toplama(); adlı metodun nasıl çağrıldığı hakkında bir örnektir.

```java
public class JavaPatika {static int toplama(int a, int b) {
        return a + b;
    }
    public static void main(String[] args) {
        int sonuc = toplama(5, 2);
        System.out.println(sonuc);
    }
}

// Çıktısı "7"
```

# Return ve Void Kullanımı

Java'da iki tür metot mevcuttur bunlar : Return (geri dönüşü olan) , Void (geri dönüşü olmayan) metotlar. Return metotlar çağrıldığında geriye bir değer döndürürken, Void metotlar geriye bir değer döndürmemektedir.

## Return Metotlar

Java'da oluşturduğumuz bir metodun bir değer üretmesini istendiğinde, "return" deyimi kullanılır. Metot içerisinde yazılan kod parçacıkları çalışacaktır, buna ek olarak metot içinde oluşturduğumuz bir veriyi dışarıya aktarma ihtiyacı duyabiliriz, bu durumlarda "return" deyimi kullanılır. Geri dönecek değerin veri tipi, metot tanımlarken verdiğimiz veri tipi ile aynı olmalıdır. Aksi halde derleyici tarafından hata alınır.

```java
public class Main {
  static int toplam(int x, int y) {
    return x + y;
  }
  public static void main(String[] args) {
    int t = toplam(5,2);
    System.out.println(t);
  }
}
// Çıktısı "7"
```

## Void Metotlar

Java'da yazılan bir metodun geriye bir değer döndürmesini istemiyor, sadece metot içindeki kod bloğunun çalışmasını istersek "void" deyimi kullanmalıdır. Metot tanımlanırken veri tipi kısmına "void" deyimi yazılması yeterlidir. Void metotlar içerisinde "return" deyimi kullanılamamaktadır.

```java
public class Main {
  static void toplam(int x, int y) {
      System.out.println(x+y);
  }
  public static void main(String[] args) {
    toplam(5,2);
  }
}
// Çıktısı "7"
```

# Metotlarda Overloading (Aşırı Yüklenme)

Java'da, iki veya daha fazla metot, parametreler açısından farklılık gösteriyorsa (farklı sayıda parametre, farklı türde parametre veya her ikisi) aynı isime sahip olabilir. Bu duruma metotlarda "Overloading" yani aşırı yüklenme işlemi denir.

Buradaki amaç aynı işlemi farklı parametrelerle yapacak olan metot ismini tek seferde kullanmaktır. Overloading işlemi "Nesne Yönelimli Programlamada" da çok kullanılmaktadır.

```java
void func() { ... }
void func(int a) { ... }
float func(double a) { ... }
float func(int a, float b) { ... }
```

Burada func() metodu (overloading) aşırı yüklenmiştir. Bu metotlar aynı isime sahiptir ancak farklı parametreler kabul eder.

Not: Yukarıdaki metotların dönüş türleri aynı değildir. Bunun nedeni, metot aşırı yüklemesinin dönüş türleriyle ilişkili olmamasıdır. Aşırı yüklenmiş metotlar aynı veya farklı dönüş türlerine sahip olabilir, ancak parametreler açısından farklılık göstermeleri gerekir.

```java
public class JavaPatika {static void ekranaYaz(int a) {
        System.out.println("Parametreler : " + a);
    }

    static void ekranaYaz(int a, int b) {
        System.out.println("Parametreler : " + a + " ve " + b);
    }

    public static void main(String[] args) {
        ekranaYaz(5);
        ekranaYaz(10, 2);
    }
}
// Çıktısı :
// Parametreler : 5
// Parametreler : 10 ve 2
```

# Lokal Değişken Kavramı

Java'da lokal değişkenler, kod blokları içerisinde tanımlanan değişkenlerdir ve sadece tanımlandıkları kod blokları içerisinde kullanılabilirler. Diğer metot ve sınıflar üzerinden erişimleri yoktur. Lokal değişkenler tanımladıkları ({...}) kod blokları arasında kullanılırlar.

```java
public class JavaPatika {
	static void ekranaBas(){
        // Hatalı kullanım 
       System.out.println(a);
    }    
    
    public static void main(String[] args) {
        int a = 10;
        if (a < 10) {
            int b = 20;
            System.out.println(a);
        }
         // Hatalı kullanım 
        System.out.println(b);
    }
}
```

Bu örnekte if blokları arasında tanımlanmış olan integer türünde ki "b" değişkeni, if bloğunun dışında ekrana bastırılmak istenildiğinde hata ile karşılaşılacaktır. Çünkü "b" değişkeni if blokları arasında tanımlanmıştır ve tanımlandığı kod blokları arasında kullanılabilir.

Dikkat edilmesi gereken diğer bir nokta, main metodun içerisinde tanımlanmış olan "a" değişkeni if bloğu içerisinde kullanılabilir, çünkü if bloğu main metodun bir parçasıdır. Ama "a" değişkeni ekranaBas(); metodu içerisinde kullanılamaz, bunun sebebi ise ekranaBas() ve main metodu farklı iki kod bloklarıdır.

# Recursive (Özyineli) Metotlar

Java'da **Recursive Metotlar**, bir metodun kendisini çağırma tekniğidir. Bu teknik karmaşık problemleri ,çözmesi daha kolay problemlere ayırmayı sağlar. İki sayıyı birbirine eklemek kolaydır, ancak bir dizi sayıyı birbirine eklemek daha karmaşıktır. Recursive metotlar sürekli kendilerini çağırdıkları için dikkat edilmesi gereken durum en son aşama için koşul koyulmasıdır .Aşağıdaki örnekte recursive ile bir dizi sayıyı , iki sayı ekleme basit görevine bölerek toplamak için kullanılır:

```java
public class Main {
  public static void main(String[] args) {
    int sonuc = toplam(10);
    System.out.println(sonuc );
  }
  public static int toplam(int k) {
    if (k > 0) {
      return k + toplam(k - 1);
    } else {
      return 0;
    }
  }
}
```

toplam() metodu çağrıldığında, k'dan küçük tüm sayıların toplamına k parametresini ekler ve sonucu döndürür. K değişkeni 0 olduğunda, metot sadece 0 döndürür. Metot çalışırken, program şu adımları izler:

f(1) = 1;

f(2) = f(1) + 2;

f(3) = f(2) + 3;

f(4) = f(3) + 4;

..........

f(n) = f(n-1) + n;

# Sınıf ve Nesne Kavramları

## Nesne (Object) Nedir ?

Nesne tanımının TDK'da ki tanımına bir bakalım :

**1.** *isim* Belli bir ağırlığı ve hacmi, rengi olan her türlü cansız varlık, şey, obje.

**2.** *isim, dil bilgisi* Geçişli fiili bütünleyen yalın veya belirtme durumunda bulunan tümleç: *`Ali bir kitap almış` cümlesinde `kitap` nesnedir.*

**3**. isim, felsefe Öznenin dışında kalan her konu, obje: "*Her nesne ve olaya alaycı bir gözle bakmak ilkesinden yola çıkar bu görüş.*" - **Salâh Birsel**

### **Nesnelere Örnekler**

- Araba, telefon, elma, ördek, kalem gibi günlük hayatta kullandığımız eşyalar.

Bildiğimiz gibi her nesnenin kendine ait **nitelikleri** ve **davranışları** vardır. Nesneler birbirlerinden farklıdır ve kendi **varoluşlarına** göre davranırlar ve kendi kimliklerine sahiptirler.

**Nitelik** : Nitelik kavramı, bir nesnenin özellikleridir ve nesnenin mevcut durumunu tanımlar. Mesela bir ördeğin rengi ve ağırlığı o ördeğin nitelikleridir. Bir ördeğimiz rengi siyah, diğer ördeğimizin rengi beyazdır. Bu durumda her iki nesne (yani ördek) nitelikleri sebebi ile birbirilerinden bağımsızdırlar.

**Davranış** : Bir nesnenin kendine özel yaptığı eylemlerdir. Yine ördek örneğine bakarsak, bir ördek uçabiliyorken diğer bir ördek fiziksel durumu gereği uçamayabilir.

Nesneler hakkında bilmemiz gereken bir diğer husus ise, nesneler bir isimdir. Nesnelerin kendilerine ait nitelik ve davranışları vardır.

## Sınıf (Class) Nedir ?

NYP sınıflar ve nesneler üzerine kurulmuştur, "**Sınıflar**" bir problemi soyutlamak ve genelleştirmek için kullanılan yapılardır veya kılavuzlardır. Sınıflar, bir nesneye ait tüm özellikleri temsil eder. Bu özellikler nesnenin ne tür **nitelikleri ve davranışları** olacağını belirler.

Mesela "**Araba**" bir sınıftır. Arabalara ait nitelikler **renk, hız, vites sayısı, yakıt türü vb.** bir sürü nitelik olabilir. Ayrıca bazı arabalara özel davranışlar olabilir, park sensörü, oto pilot, hız sabitleme gibi arabaların kendilerine özel davranışları da olabilir. Bir araba üretilirken, bir yapım kılavuzuna ihtiyaç vardır. Programlama da bu kılavuzlara "**Sınıf (Class)**" denir.

![Untitled](Java%20101%203a91ed2ad49a450196f252590fe2061a/Untitled%206.png)

 

# Nesne Yönelimli Programlama Nedir ?

Nesne Yönelimli Programlama (Object Oriented Programming), sınıflar ve nesneler kavramına dayanan bir programlama yaklaşımıdır. Bu yaklaşımın amacı, ihtiyaç duyulan programı daha küçük parçalara bölerek, yönetilebilir ve yeniden kullanılabilir hale getirmektir. Her küçük parçanın kendine ait özelliği, verileri ve diğer küçük parçalarla nasıl iletişim kuracağı bilgileri bulunur.

NYP’de programlar, nesnelerin birbirileriyle etkileşime geçmeleri sağlanmasıyla tasarlanır. Bizler gerçek hayattaki karmaşıklığı bir şekilde modelleyerek bunu bilgisayarın anlamasını sağlamaktayız. Modelleme, insanın problem çözmek üzere eskiden beri kullandığı bir yöntemdir. Büyükçe bir problemin tamamını zihinde canlandırıp çözmeye çalışmak yerine, oluşturulacak model ya da modeller üzerinde hedef sistemin görünüşü, davranışı ya da bazı durumlarda verdiği tepkiler gözlemlenebilir.

Nesne Yönelimli Programlama ile bizler yapacağımız her şeyi bilgisayarın anlayacağı şekilde modelleyip, “**nesne**” halinde aktarıyoruz. Böylelikle gerçek hayatta bizim için geçerli olan nesneleri artık bilgisayarların anlayacağı hale getirmiş oluyoruz. Tabi ki kullanılan programlama dilinin bizlere verdiği imkanlar dahilinde. Böylelikle kodlayan kişi ile bilgisayar arasında dilden bağımsız bir anlaşma, bir felsefe ortaya çıkmış oluyor. Artık bizim için “araba” nesnesi ne anlama geliyorsa, bilgisayar için de aynı anlama geliyor.

## Neden Nesne Yönelimli Programlama ?

- NYP, hızlı ve uygulaması kolay bir yaklaşımdır.
- NYP, programlar için net bir yapı sağlar.
- NYP, "**Don't Repeat Yourself**" yani "**Kendini Tekrar Etme**" ilkesini uygular ve kodun bakımını, düzenlenmesini ve hata ayıklamasını kolaylaştırır.
- NYP, daha az kod ve daha kısa geliştirme süresiyle, yeniden kullanılabilir uygulamalar oluşturmayı mümkün kılar.
- NYP, yapıya daha sonradan yeni özellikler ekleyerek genişletilebilirlik sağlar.
- NYP, problemleri gerçek hayattaki işlemlere göre modeller.

## Modelleme ve Soyut Düşünme

Gerçek hayattaki problemleri bilgisayarın sanal ortamında çözebilmek için, ilk önce problemin uygun şekilde bilgisayar ortamına aktarılması gerekmektedir. Bu işlem “soyutlama (abstraction)” ya da “modelleme (modeling)” olarak anılır.

Modelleme, insanın problem çözmek üzere eskiden beri kullandığı bir yöntemdir. Büyükçe bir problemin tamamını zihinde canlandırıp çözmeye çalışmak yerine, oluşturulacak model ya da modeller üzerinde hedef sistemin görünüşü, davranışı ya da bazı durumlarda verdiği tepkiler gözlemlenebilir.

Model, var olan ya da gerçekleştirilmesi planlanan bir sistemi anlamak ya da anlatmak üzere oluşturulabilir ve birçok farklı alanda etkili bir şekilde kullanılmaktadır. Örneğin, bir toplu konut inşaatını müşterilerine tanıtmak isteyen bir inşaat firması, binaların yerleşimlerini, renk ve göreli büyüklüklerini görsel olarak ifade eden maket ya da maketler hazırlar. Bu maketi inceleyen bir kimse, almak istediği konutun nerede olduğunu, okul binasına yakınlığını ya da anayola ulaşımın nasıl olduğunu görerek değerlendirebilir. Burada model makettir ve “hedef sistemi anlatmak” amacını yerine getirmektedir.

Bir sistemle ilgili birden çok model oluşturulabilir. Tek bir model ile sistemin tamamını görmeye çalışmak yerine, üzerinde çalışılan sistemin farklı yönlerini öne çıkaran modeller hazırlanabilir. Örneğin inşaat firması toplu konutu müşterilere anlatmak üzere estetik tasarımı ön plana çıkan bir maket hazırlarken, bu toplu konut projesindeki binaların elektrik tesisatı için farklı, su tesisatı için farklı, genel daire görünümü için farklı projeler hazırlar. Böylece aynı sistemin farklı yönleriyle ilgilenen kimseler, yalnızca kendilerini ilgilendiren yönü öne çıkaran model üzerinde çalışma olanağı bulurlar.

Modelin mutlaka elle tutulur olması da gerekmez. Bilgisayar benzetimi ile de çeşitli modeller oluşturulabilir. Örneğin bir uçağın havadaki hareketini incelemek üzere geliştirilmiş bir bilgisayar benzetimi ile uçak modellenebilir. Kanat uzunluğu ya da gövde eğimi gibi parametrelerle oynanarak uçağın farklı hava koşullarında nasıl davranacağı anlaşılmaya çalışılabilir. Burada, sistemin davranışını anlamak amacıyla, sanal ortamda oluşturulmuş bir model söz konusudur.

![Untitled](Java%20101%203a91ed2ad49a450196f252590fe2061a/Untitled%207.png)

# Sınıflar (Classes)

Java Nesne Yönelimli bir programlama dilidir. Java'daki her şey, değişkenleri ve metotları ile birlikte sınıflar ve nesnelerle ilişkilidir. Örneğin: gerçek hayatta araba bir nesnedir. Otomobilin ağırlık ve renk gibi değişkenleri ve sürüş ve fren gibi metotları vardır. Nesne yönelimli programlamanın amacı yazdığımız kodlara soyut bir kavrama dönüştürmektir.

Sınıflara ait nitelikler ve davranışlar vardır. Programlamada nitelikler için değişkenler (variable) ,davranışlar için ise metotlar (method) tanımlanır.

## Sözdizimi (Syntax)

```java
class <class_name> {
	<variable>;
	<methods>;
}
```

Java'da "**sınıf**" tanımlanırken "**class**" deyimi kullanılır ve sonrasında sınıf ismi yazılır. Java'da sınıf isimleri her zaman büyük harf ile başlaması gerekmektedir ve oluşturulan Java dosyası ile aynı isimde olmalıdır.

Sınıf ismini de verdikten sonra "{" işareti ile sınıfa ait kapsamı yani kod bloğunu oluştururuz. "}" parantezi ile de sınıfa ait kapsamı kapatırız. Böylece, sınıfımız için yazacağımız kodlar "{}" arasında kalan alanda yazılacaktır. Bu da sınıfın kapsamını ifade eder.

Sınıf kod bloğunu açtıktan sonra bu kod bloğu için değişkenleri ve metotları yazarız. Unutmayınız ki metotlar da kendilerine ait kod blokları, yani kapsamları vardır. Onları da "{}" ile belirtiriz.

```java
class Car {
    // nitelikler
    String type;
    String model;
    String color;
    int speed;

    // davranışlar
    int increaseSpeed(int increment) {
        speed += increment;
        return speed;
    }

    int decreaseSpeed(int decrease) {
        if (speed > 0) {
            speed -= decrease;
        }
        return speed;
    }
    
    void printSpeed() {
        System.out.println("Speed : " + speed);
    }
    // ...
}
```

Yukarıda sınıf ve fonksiyon tanımlamalarına detaylıca yer verilmiştir.

Sınıflar nesneler oluşturabilmek için yazılım dünyasında oluşturulmuş şablonladır. Bu şablon nesne ile ilgili modellenecek tüm özellikleri ve davranışları bir taslak halinde kodlanmasını sağlar. Böylece, tanımlanmış bir sınıftan binlerce nesne oluşturabiliriz.

# Nesne Oluşturma

Sınıflar nesneleri tarif eden şablonlardı. Nesneler ise bu şablonlardan üretilen fiziksel yapılardır. Her üretilen nesne Hesap Hafıza Bölgesi'nde tutulur. Böylece sınıftan fiziksel karşılığı olan bir yapı elde etmiş oluruz. Sınıftan onlarca, yüzlerce nesne yaratabiliriz. Hepsi de hafıza başka adresleri gösterirler.

```java
public class Car {
    // nitelikler
    String type;
    String model;
    String color;
    int speed;

    // davranışlar
    int increaseSpeed(int increment) {
        speed += increment;
        return speed;
    }

    int decreaseSpeed(int decrease) {
        if (speed > 0) {
            speed -= decrease;
        }
        return speed;
    }
    
    void printSpeed() {
        System.out.println("Speed : " + speed);
    }
    // ...
}
```

Java'da nesne üretmek için kullanılan sözdizimi :

```java
ClassName object = new ClassName();
```

- **ClassName** : Nesne oluşturmak istediğimiz sınıfı belirtiyoruz. Bu sınıf daha öncesinde projemizde tanımlanmış olması gerekmektedir.
- **object** : Nesnemize verdiğimiz isimdir ve aynı isimde birden fazla nesne oluşturulamaz.
- **new** : Java'da nesne üretmek için "**new**" anahtar kelimesini kullanırız.
- **ClassName();** : Sınıfa ait Kurucu (Constructor) Metodu temsil eder. Varsayılan olarak parametresiz tanımlanır.

Car sınıfına ait örnek nesne oluşturma :

```java
Car audi = new Car();
Car bmw = new Car();
Car mercedes = new Car();
```

Yukarıdaki örnekte "Car" sınıfına ait 3 tane farklı nesne ürettik. Bu nesnelerin her birinin nitelikleri farklı olmakla beraber hafızada ayrı ayrı yer kaplamaktadırlar.

## Sınıf Niteliklerine Erişim

Sınıflara ait niteliklere erişim sağlamak için nokta (.) kullanılır. İlgili nesnenin ismini sonuna nokta koyularak erişilmek istenilen niteliğin ismi yazılır.

```java
public class Main {
    public static void main(String[] args) {
        Car audi = new Car();
        audi.speed = 10;
        System.out.println("Audi Hızı : " + audi.speed);

        Car bmw = new Car();
        bmw.speed = 25;
        System.out.println("Bmw Hızı : " + bmw.speed);

        Car mercedes = new Car();
        mercedes.speed = 30;
        System.out.println("Mercedes Hızı : " + mercedes.speed);

    }
}
```

Programın çıktısı :

```java
Audi Hızı : 10
Bmw Hızı : 25
Mercedes Hızı : 30
```

## Sınıf Metotlarına Erişim

Sınıfa ait davranışlara yani metotlara erişmek için nokta (.) kullanılır. İlgili nesnenin ismini sonuna nokta koyularak erişilmek istenilen metodun ismi yazılır ve var ise parametreleri girilir.

```java
public class Main {
    public static void main(String[] args) {
        Car audi = new Car();
        audi.speed = 10;
        audi.increaseSpeed(20);
        audi.printSpeed();

        Car bmw = new Car();
        bmw.increaseSpeed(10);
        bmw.increaseSpeed(25);
        bmw.increaseSpeed(5);
        bmw.decreaseSpeed(25);
        bmw.printSpeed();

        Car mercedes = new Car();
        mercedes.speed = 20;
        mercedes.printSpeed();

    }
}
```

Programın çıktısı :

```java
Speed : 30
Speed : 15
Speed : 20
```

# Constructor (Kurucu) Metotlar

Kurucu metotlar sınıf tasarlanırken yazılırlar. Sınıfınızı yazarken kurucu metotlarınızı da tanımlayabilirsiniz. Eğer sınıf içinde hiç kurucu metot tanımlamazsınız parametresiz boş bir kurucu metot Java tarafından otomatik olarak tanımlanır.

Kurucu metotlar ilgili sınıftan bir nesne üretmeye çalıştığınızda daha nesne üretme aşamasında çalıştırılan özel metotlardır (fonksiyonlardır). **Kurucu metotların isimleri Sınıf ismiyle aynı olmak zorundadır.** Dönüş tipi olarak veya void olarak herhangi bir tanımlama yapılmasına gerek yoktur.

"**new**" anahtar kelimesi ile nesne üretirken kurucu metot çağrımı yapılır. İki tip kurucu metot vardır:

- Parametresiz Varsayılan Kurucu Metot
- Parametreli Kurucu Metot

Car sınıfımız :

```java
public class Car {
    // nitelikler
    String type;
    String model;
    String color;
    int speed;

    // Constructor (Kurucu) Metot
    Car(String type, String model, String color) {
        this.type = type;
        this.model = model;
        this.color = color;
        this.speed = 0;
    }

    // davranışlar
    int increaseSpeed(int increment) {
        speed += increment;
        return speed;
    }

    int decreaseSpeed(int decrease) {
        if (speed > 0) {
            speed -= decrease;
        }
        return speed;
    }

    void printSpeed() {
        System.out.println("Speed : " + speed);
    }

    void printInfo() {
        System.out.println("================");
        System.out.println("Model  : " + this.model);
        System.out.println("Color  : " + this.color);
        System.out.println("Type  : " + this.type);
        System.out.println("Speed  : " + this.speed);
    }
    // ...
}
```

Nesnelerimiz:

```java
public class Main {
    public static void main(String[] args) {
        Car audi = new Car("Sports", "Audi", "red");
        audi.increaseSpeed(20);
        audi.printInfo();

        Car bmw = new Car("Sports" , "BMW" , "blue");
        bmw.increaseSpeed(10);
        bmw.increaseSpeed(25);
        bmw.increaseSpeed(5);
        bmw.decreaseSpeed(25);
        bmw.printInfo();

        Car mercedes = new Car("Corporate" , "Mercedes" , "black");
        mercedes.speed = 20;
        mercedes.printInfo();

    }
}
```

Program çıktısı:

```java
================
Model  : Audi
Color  : red
Type  : Sports
Speed  : 20
================
Model  : BMW
Color  : blue
Type  : Sports
Speed  : 15
================
Model  : Mercedes
Color  : black
Type  : Corporate
Speed  : 20
```

# Dizilerin Genel Mantıkları

Java'da Diziler (Arrays) , her değer için ayrı değişkenler oluşturmak yerine, birden çok değeri tek bir değişkende depolamak için kullanılır. Değişkenler hafızada tek bir değer tutmamızı sağlar. Fakat bazı durumlarda, birden çok veriyi bir arada bulundurmak isteriz. Örneğin, bir sınıfta okuyan 20 öğrenci olsun. Bu 20 öğrenci için hafızada ayrı ayrı 20 tane değişken oluşturmak yerine, tek bir değişken kullanarak 20 öğrencinin koleksiyonunu tutmak isteyebiliriz.

Bu gibi durumlarda dizileri kullanırız. Dizi, aynı türden birden fazla değişkeni tutmamızı sağlayan hafıza birimidir. Kısaca, dizileri aynı türden elemanları gruplamak için kullanırız. Dizi oluşturduktan sonra dizinin içerisindeki elemanlara indeks numarasıyla ulaşır ve değiştiririz. Ayrıca, çok boyutlu diziler oluşturmak da mümkündür. Tek boyutlu dizi kullanabileceğimiz gibi 2 veya 3 boyutlu diziler de oluşturabiliriz. 2 boyutlu dizilere matris denir.

Dizi (Array) kavramı programlama dillerinde bir veri tipini ifade eder. Bu veri tipi liste halindeki ardışık verileri bir arada tutan yapıya denilir. Bu ardışık yapıya ait elemanlara indis yoluyla erişim sağlanabilir. Diziler sabit boyutludur ve tanımlanırken boyutları belirtilir.

![Untitled](Java%20101%203a91ed2ad49a450196f252590fe2061a/Untitled%208.png)

Yukarıdaki örnek 10 eleman boyutunda "Integer" veri tipi tutan bir dizidir. Dizilerdeki herhangi bir elemana ulaşmak için indis numaraları kullanılır. Dizi indisleri her zaman 0'dan başlar o yüzden dizinin son elemanının değeri, dizi boyutuna eşit değildir ve bu dikkat edilmesi gereken bir konudur.

Dizinin hafızada bir başlangıç adresi olur ve ardışık olan diğer elemanlar sırayla hafızaya yerleştirilir. Diziler "new" anahtar sözcüğüyle oluşturulur. Böylece, Heap Hafıza bölgesinde yer kaplarlar.

```java
double[] myList;   // tercih edilen yol

veya 

double myList[];   // başka türlü tanımlama biçimi
```

Diziler veri tipi ve [] parantezler ile belirtilir. Yukarıda iki farklı tanımı görülmektedir. Hafızadan yer alıp diziye alan ayırabilmek için "new" anahtar kelimesi kullanılır.

```java
double[] myList = new double[10];
```

Yukarıda maksimum 10 eleman alabilen "double" veri tipinde olan bir dizi oluşturulmuştur.

Yukarıda "myList" isminde bir dizi tanımlamıştık. Tanımlanan dizi hafıza yukarıdaki şekildeki gibi tutulur. "myList" değişkeni dizinin başlangıç adresini tutar. Dizilerde ardışık bir sıra olduğu için ilk elemandan sonra gelen elemanların hafıza adresleri de birer birer artar. Dizi blok halinde yer kaplar. Diziye erişmek için indeks numarası kullanılır. Örneğin: "myList[0]" demek dizinin 1. Elemanını verecektir. Java'da dizilerin indeksleri sıfırdan başlar. Örneğin: "myList[5]", yani 5 nolu indeksteki dizi elemanını ver dediğimizde aslında dizinin 6. Elemanına erişmiş oluruz.

Örnekler:

```java
// Java'da diziye ilk değerler süslü parantezler arasında verilir.
double[] myList = { 1.9, 2.9, 3.4, 3.5 };

// tüm dizi elemanlarını arada boşuk bırakarak sırayla ekrana yazdırır.
for (int i = 0; i < myList.length; i++)
{
	System.out.println(myList[i] + " ");
}
```

Yukarıdaki örnekte myList isimli diziye ilk değerleri hemen verilmiştir. Süslü parantezler arasında kalan değerler dizi elemanlarıdır.

Ardından, bir "for" döngüsü ile dizi elemanları ekrana yazdırılır.

### **Dizileri Fonksiyonlara Parametre Olarak Göndermek**

Tanımladığınız dizileri fonksiyonlara parametre olarak gönderebilirsiniz.

Örneğin elimizde static bir fonksiyon olsun. Bu fonksiyona int tipinde verileri olan bir diziyi girdi (input) olarak vermek istersek aşağıdaki gibi olur.

```java
public static void printArray(int[] array) 
{
   for (int i = 0; i < array.length; i++) 
   {
      System.out.print(array[i] + " ");
   }
}
```

printArray ( int[] array ) kırmızı olarak işaretlediğimiz yer diziyi yerel değişken olarak fonksiyona gönderdiğimiz noktadır. Java'da tüm değişkenler "Pass by Value" yöntemiyle geçilir. Bu şu demektir. Sizin tanımladığınız değişkenin, nesnenin veya dizinin birebir kopyası oluşturulur. Bu kopya değer fonksiyona yerel değişken olarak gider. Bu Java mülakatlarında size sorulabilecek bir detaydır.

### **Dizileri Fonksiyonlardan Geri Döndürmek**

Fonksiyonlar belli bir işi yapıp sonucunda değer dönebilen veya dönmeyen kod bloklarıdır. Fonksiyonlar için altın kural, her fonksiyonun tek bir işi olmalıdır. Örneğin: dizi ortalaması alma işi yapan bir fonksiyon dizileri ekrana yazdırma işini yapmamalıdır. Veya dizilerin ortalamasını alma işi ile dizileri toplama işlemi aynı fonksiyon içinde olmamalıdır. Her biri ayrı fonksiyonlar olmalıdır.

```java
public static int[] reverse(int[] list) 
{
   int[] result = new int[list.length];

   for (int i = 0, j = result.length - 1; i < list.length; i++, j--) 
   {
      result[j] = list[i];
   }
   
   return result;
}
```

Yukarıda dizinin tersine çevrilmiş halini döndüren bir fonksiyon vardır. public static **int[]**
 reverse(…) koyu renkle işaretlenen alan dizi döndüreceğimizi ve bu dizinin veri tipini söylüyoruz. Burada veri tipimiz "int".

# Tek Boyutlu Diziler

Tek boyutlu diziler basitçe, aynı türden elemanların listesini tutan bir yapıdır. Dizi oluşturmak için, önce dizide yer alacak elemanların türü belirtilir, sonra diziye bir isim verilir ve isimden sonra köşeli parantezler ( [ ve ] ) konulur.

```java
int numbers[]; // Burada numbers isminde bir dizi oluşturuluyor

```

Köşeli parantezleri değişken isminden sonra koymak yerine, tür isminden sonra da yazabilirsiniz. Örneğin aşağıdaki kodun yukarıdakiyle bir farkı yoktur:

```java
int[] numbers; // Burada numbers isminde bir dizi oluşturuluyor

```

Diziler new deyimiyle oluşturulur. Dizi oluştururken kapasite değeri vermek **zorunludur**. Kapasite değeri, dizinin kaç eleman barındıracağını belirtir. Aşağıdaki örnekte, 5 adet int değişkeni tutabilecek bir dizi oluşturuluyor:

```java
int[] numbers = new int[5];

```

Bu ifade çalıştırıldığında, hafızada 5 adet int değişken için yetecek kadar alan ayrılır. Bu alanı düzenleyebilmek için indeks numaraları kullanırız. **Dizi indeksleri 0’dan başlar** ve kapasitenin 1 eksiğine kadar gider. Örneğin, yukarıdaki dizinin indeksleri 0’dan 4’e kadardır. Şimdi bu dizinin ilk elemanını verelim:

```java
numbers[0] = 10; // Dizinin ilk elemanı 10 olarak ayarlandı.

```

Dizinin diğer elemanlarını şu şekilde verelim:

```java
numbers[1] = 15;
numbers[2] = 20;
numbers[3] = 25;
numbers[4] = 30;

```

Bu kodlar çalıştırıldığında dizinin elemanları sırasıyla aşağıdaki gibi olur:

{ 10, 15, 20, 25, 30 }

Aşağıdaki kodu çalıştırdığınızda konsola 25 yazar:

```java
System.out.println(numbers[3]);

```

Dizilerle uğraşırken indeks numaralarına çok dikkat etmelisiniz. Eğer dizinin aralığı dışında bir indekse erişmeye çalışırsanız, ***IndexOutOfBoundsException*** hatası meydana gelir.

```java
System.out.println(numbers[5]); // Hata!

```

Yukarıdaki satır hataya neden olur; çünkü numbers dizisinin kapasitesi 5 olmasına rağmen dizinin 6. elemanına erişmeye çalışıyoruz.

Eğer dizinin içindeki elemanlar dizi oluşturulurken belliyse, diziyi oluştururken elemanları küme parantezi içinde ve virgülle birbirinden ayırarak verebiliriz:

```java
String[] weekDays = new String[] { "Pazartesi", "Salı", "Çarşamba", "Perşembe", "Cuma", "Cumartesi", "Pazar" };

```

Bu şekilde oluşturulan dizilere kapasite vermemize gerek yoktur; çünkü kapasite değeri zaten eleman sayısından bellidir. Yukarıdaki örnekte **weekDays** dizisinin kapasitesi otomatik olarak 7 olur.

Yukarıdaki gibi dizi oluştururken new deyimini kullanmaya gerek yoktur. Yani, yukarıdaki kodu aşağıdaki gibi yazabiliriz:

```java
String[] weekDays = { "Pazartesi", "Salı", "Çarşamba", "Perşembe", "Cuma", "Cumartesi", "Pazar" };
```

### **Dizinin Kapasitesini Öğrenmek**

Her dizinin **length** adında bir özelliği bulunur. Bu özelliği kullanarak dizinin kapasitesini öğrenebilirsiniz.

Örneğin, aşağıdaki kodu inceleyelim:

```java
int[] numbers = new int[100];
System.out.println(numbers.length); // Konsolda 100 yazar
```

### **Dizinin Bir Elemanını Değiştirme**

```java
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
cars[0] = "Opel";
cars[2] = "Toyota";

System.out.println(cars[0]);
```

# Çok Boyutlu Diziler

Java'da Çok Boyutlu Diziler varsayılan bir veri tipi olarak bulunmazlar ve matris olarak adlandırılırlar. Dizilerin 2 boyutlu halleri şeklinde tanımlanırlar. Matrisler satır ve sütun şeklinde tablo verisi formatındaki verileri tutmak için kullanılır. Diziler liste halinde veriler için uygunken, matrisler tablo şeklindeki veriler için uygundur. Oluşturulan tabloda bir değere ulaşmak istersek satır ve sütun sayısını girmemiz yeterli olacaktır.

İki boyutlu dizilerde tek boyutlu diziler gibi indis değeri 0'dan başlar. Dizide tutulacak veri tipleri aynı olmak zorundadır farklı veri tiplerini aynı matriste tutamayız.

3x3 boyutunda bir matris örneği :

![Untitled](Java%20101%203a91ed2ad49a450196f252590fe2061a/Untitled%209.png)

Tablo oluşturup bu tablonun bilgilerini matris ile gösterelim. Örneğin, şehirler arasındaki mesafeyi gösteren bu tabloyu uzaklık değişkenimizde sakladık.

Mesafe Tablosu(KM)

![Untitled](Java%20101%203a91ed2ad49a450196f252590fe2061a/Untitled%2010.png)

```java
int[][] uzaklik ={
                {0, 453, 939, 243, 783, 891},
                {453, 0, 490, 384, 620, 439},
                {939, 490, 0, 839, 863, 423},
                {243, 384, 839, 0, 544, 823},
                {783, 620, 863, 544, 0, 1045},
                {891, 439, 423, 823, 1045, 0}
        };
```

### **İki Boyutlu Dizi Tanımlama Yöntemleri**

İki boyutlu dizileri oluşturmanın farklı yöntemleri var şimdi bunlara bakalım.

Bir değişkenin dizi olduğunu köşeli parantezler ile belirtmiştik. Bir tane köşeli parantez tek boyutlu dizi belirtir. Eğer çok boyutlu dizi oluşturmak istiyorsak, boyut sayısı kadar köşeli parantez belirtmeliyiz. Örneğin aşağıdaki satır 2 boyutlu bir dizi (yani matris) belirtir:

```java
degiskenTipi[][] arrayIsmi;
int matrix[][];

```

yada

```java
degiskenTipi arrayIsmi[][];  //bu yöntem tercih edilmez

```

İki boyutlu dizimizi tanımlarken değerlerini atamak istersek aşağıdaki yöntemi kullanabiliriz.

```java
int[][] array = {
{1, 2, 3},
{4, 5, 6},
{7, 8, 9},
{10, 11, 12}
};

```

İlk köşeli parantez birinci boyutu (satırları), diğeri ise ikinci boyutu (sütunları) belirtir. Aşağıdaki kodu çalıştırırsak, 3 satırlı ve 4 sütunlu bir matris oluşturur:

```java
int matrix[][] = new int[3][4];

```

yada

```java
matrix = new int[3][4];

```

oluşturulan matrix değişkeninin default değeri (a) ile gösterilen tablodaki gibidir.

```java
[0][1][2][3]
[0] 0  0  0
[1] 0  0  0
[2] 0  0  0

    (a)

```

Bu matrisin bütün elemanlarına ulaşmak için kullanmamız gereken indeks numaralarını aşağıdaki tabloda görebilirsiniz:

![Untitled](Java%20101%203a91ed2ad49a450196f252590fe2061a/Untitled%2011.png)

```java
matrix[1][2]; // Matrisin 2. satır ve 3. sütunundaki elemana erişiliyor
matrix[0][3]; // Matrisin 1. satır ve 4. sütunundaki elemana erişiliyor
matrix[2][0]; // Matrisin 3. satır ve 1. sütunundaki elemana erişiliyor

```

Matrisin 2. satırı ve 3. sütununda yer alan değerini 7 yapalım.

```java
matrix[2][1] = 7;

```

Atadığımız 7 değerine ulaşmak istersek matrix[2] [][][1] ifadesini kullanırız.

Fark ettiğiniz gibi matrislerin dizilerden tek farkı [] parantez yanına bir tane [] açıyoruz. Zaten her [] ifadesi yeni bir boyut anlamına geliyor. "**double[][][] ucBoyutlu;**" şeklinde bir ifadeyle 3 boyutlu veri saklayan bir veri yapısı oluşturmuş oluyoruz.

Şimdi güzel bir örnek yapalım. 3 satırdan ve 4 sütundan oluşan bir matris yaratalım ve bu matrisin elemanlarını sırayla 1’den başlayacak şekilde dolduralım. Aşağıdaki kodu inceleyelim:

```java
int[][] matrix = new int[3][4];
int number = 1;

for (int x = 0; x < matrix.length; x++)
{
	int[] row = matrix[x];

    for (int y = 0; y < row.length; y++)
	{
		row[y] = number;
		number++;
	}
}

```

Şimdi yukarıdaki kodu inceleyelim. İki boyutlu diziyi oluşturduktan sonra önce for döngüsüyle dizinin satırlarını geziyoruz. Daha sonra içerideki for döngüsüyle dizinin sütunlarını dolaşıyoruz. Bu örneği vermemizdeki amaç, matrisin elemanlarına ulaşmak için iç içe 2 for döngüsü kullanmak gerektiğini göstermektir. Ayrıca dizinin *length* metodunun faydasını da burada görmüş oluyoruz.

Yukarıdaki kod çalıştığında matrisin elemanları şu şekilde olur:

![Untitled](Java%20101%203a91ed2ad49a450196f252590fe2061a/Untitled%2012.png)

**İç İçe Döngülerle Dizilere Erişim ve Dizi İşlemleri**

Aşağıdaki kod bize bi matris değerini ekrana nasıl yazdıracağımızı gösterir. Döngüye girdikten sonra her sütun sayısı her satır için tek tek ekrana bastırılır. Her bir satırın tamamlanmasından sonra System.out.println() ile bir alt satıra geçilir.

```java
for (int row = 0; row < matrix.length; row++) {
   for (int column = 0; column < matrix[row].length; column++) {
       System.out.print(matrix[row][column] + " ");
}
    System.out.println();
}

```

### **İki Boyutlu Dizilerin Uzunlukları**

İki boyutlu diziler aslında her satırının tek boyutlu olduğu dizilerdir. Çok boyutlu dizilerinde boyutuna ulaşarak işlem yapabiliriz.

Örneğin x = new int[3] [][][4] arrayinin x[0], x[1], x[2] değerleri tek boyutlu dizidir. Ve her biri aşağıdaki şekilde gösterildiği gibi 4 elemanı vardır. x.length değeri 3'tür, yani bize sahip olduğu 3 satırın değerini verir. Sütun sayısına ise her hangi bir satır değerinin uzunluğu kadardır. x[2].length değeri 4'tür.

![Untitled](Java%20101%203a91ed2ad49a450196f252590fe2061a/Untitled%2013.png)

Yukarıda öğrendiğimiz konuları pekiştirmek adına aşağıdaki kodu inceleyelim.

```java
public double[][] multiplyMatrices(double[][] firstMatrix, double[][] secondMatrix) {

	// firstMatrix.length ile ilk matrisin satır sayısını buluyoruz. örneğimizde 3 olarak gelecektir.
	// secondMatrix[0].length ile ikinci matrisin sütun sayısını buluyoruz. örneğimizde 4 olarak gelecektir.

	// C matrisi olacak olan matrisi tanımlıyoruz.
    double[][] result = new double[firstMatrix.length][secondMatrix[0].length];

 	// matrislerde çarpma, toplama gibi işlemleri yapabilmek için iç içe 3 tane döngüye ihtiyaç duyarız.
    for (int row = 0; row < result.length; row++) {
        for (int col = 0; col < result[row].length; col++) {
            result[row][col] = multiplyMatricesCell(firstMatrix, secondMatrix, row, col);
        }
    }

    return result;
}

double multiplyMatricesCell(double[][] firstMatrix, double[][] secondMatrix, int row, int col) {
	// A matrisinin satırı ile B matrisinin sütunu çarpma işlemi.
	/*
	*   row = 3, col = 4  olarak gelecektir.
	*   i = 0 ise
	*   firstMatrix[3][0] * secondMatrix[0][4]
	*   i = 1 ise
	*   firstMatrix[3][1] * secondMatrix[1][4]
	*   i = 2 ise
	*   firstMatrix[3][2] * secondMatrix[2][4]
	* şeklinde i değişerek satır ve sütun çarpılır.
	*/
    double cell = 0;
    for (int i = 0; i < secondMatrix.length; i++) {
        cell += firstMatrix[row][i] * secondMatrix[i][col];
    }
    return cell;
}

```

Yukarıdaki “multiplyMatrices” fonksiyonu iki tane matrisi girdi olarak alır. Fonksiyon matrislerin çarpım sonucunu matris olarak döndürür.

“multiplyMatrices” fonksiyonu içinde bir başka fonksiyon daha çağrılmıştır. “multiplyMatricesCell” bu fonksiyon ise iki matrisin satır ve sütununu çarpıp sonucu double tipte bir değer döndürür.

## Sütun Kapasiteleri Farklı Matris Oluşturmak - Düzensiz Diziler

Farklı sütun değerine sahip dizilere "**Ragged Arrays**" yani düzensiz diziler denir. Başka bir açıdan bakıldığında ise, 2 boyutlu dizileri, **dizilerin dizisi** (**array of arrays**) olarak düşünmek doğru olur. Yani iki boyutlu dizileri tek boyutlu diziler oluşturur.

Diziler aynı türden elemanlardan oluşmak zorundadır. int türünde bir dizi olabileceği gibi, dizinin dizisi de olabilir.

Yukarıdaki örneklerde matrisin sütun sayısını 4 olarak belirledik. Bu şekilde oluşturulursa matrisin bütün satırları 4 elemanlı olur. Fakat bu zorunlu değildir. Matris oluştururken sütun sayısı belirlemezsek, her bir satırdaki dizilerin kapasitesi farklı olabilir. Örneğin aşağıdaki kodu inceleyelim:

```java
int[][] matrix = new int[3][];
matrix[0] = new int[1];
matrix[1] = new int[2];
matrix[2] = new int[3];

```

Burada önce 3 satırdan oluşan bir matris belirttik, fakat sabit bir sütun sayısı vermedik. Sonra her bir satır için ayrı ayrı sütun sayısı belirledik.

Çok boyutlu dizi oluştururken, yalnızca ilk boyutun (en soldaki) kapasitesini belirlemeniz yeterlidir. Diğer boyutların kapasitesini dinamik olarak belirleyebilirsiniz.

# ForEach Kullanımı

Java'da ForEach deyimi adında da anlaşılacağı gibi bir döngüyü ifade eder. Genelde dizilerdeki ve listelerdeki elemanları daha hızlı şekilde ulaşmak için kullanılan kısa bir yöntemdir. Kısacası for döngüsünün modifiye edilmiş halidir.

```java
for (veritipi degisken: diziAdi) {
  // kod bloğu
}

```

Örnekte Java'da ForEach kullanımını görmektesiniz, yine bir for döngüsü oluşturuyoruz ama iki parametreyi iki nokta ile ayırıyoruz. İlk kısmında dizinin döndüreceği veri tipini ve for içinde dizinin elemanı olarak kullanacağınız değişkeni tanımlıyorsunuz, diğer kısımda ise dizimizin ismini yazıyoruz.

Bu örneğimizde arabalar dizisinin forEach ile nasıl kullanıldığını görmektesiniz.

```java
String[] arabalar = {"BMW", "Mercedes", "Ford", "Ferrari"};
for (String i : arabalar) {
  System.out.println(i);
}

// Çıktısı
// BMW
// Mercedes
// Ford
// Ferrari

```

Çok boyutlu dizilerde forEach kullanımı

```java
public class Main {public static void main(String[] args) {
        int[][] matris = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12}
        };

        for (int[] u : matris) {
            for (int elem : u) {
                System.out.println(elem);
            }
        }
    }
}
```

# Arrays Sınıfı ve Metotları

Java.util paketindeki Arrays sınıfı, Java Collection Framework'ün bir parçasıdır. Bu sınıf, Java dizilerini dinamik olarak oluşturmak ve bunlara erişmek için statik metotlar sağlar. Yalnızca statik metotlar ve Object sınıfının metotlarından oluşur. Bu sınıfın metotları, sınıf adının kendisi tarafından kullanılabilir.

```java
import java.util.Arrays;

```

Import deyimi ile java.util.Arrays sınıfını projeye dahil etmemiz gerekmektedir.

## Arrays.toString()

Diziye ait elemanları direk ekrana basmak için kullanılan bir metottur.

```java
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] dizi = {3, 5, 79, 12, 25, -3, 66, 82, -49, 152};
        System.out.println(Arrays.toString(dizi));
    }
}

// Çıktısı
// [3, 5, 79, 12, 25, -3, 66, 82,-49,152]

```

## Arrays.fill()

Arrays.fill metodu ile dizilerimizin belirli bir bölümlerine değerler atayabiliriz.

```java
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] liste = {15, 1, 99, 7, 7, -22, 11, 2, -49, 52};

        Arrays.fill(liste, 2);
        System.out.println(Arrays.toString(liste));

        int[] liste2 = {15, 1, 99, 7, 7, -22, 11, 2, -49, 52};

        Arrays.fill(liste2, 3, 5, 7);
        System.out.println(Arrays.toString(liste2));
    }
}

// Çıktısı
// [2, 2, 2, 2, 2, 2, 2, 2, 2, 2]
// [15, 1, 99, 7, 7, -22, 11, 2, -49, 52]

```

## Arrays.sort()

Arrays.sort() metodu ile dizilerdeki elemanları sıralayabiliriz.

```java
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] liste = {6, 1, 55, 21, 33, -321, -21, 2, -11, 27};
        Arrays.sort(liste);
        System.out.println(Arrays.toString(liste));
    }
}
// Çıktısı
// [-321, -21, -11, 1, 2, 6, 21, 27, 33, 55]

```

## Arrays.binarySearch()

Java'da dizideki bir elemanın indis değerini bulmak için binarySearch kullanılabilir. Ama bu metodu kullanabilmek için, dizinin sıralı olması gerekmektedir.

```java
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] liste = {6, 1, 55, 21, 33, -321, -21, 2, -11, 27};

        Arrays.sort(liste);
        System.out.println(Arrays.toString(liste));

        int index = Arrays.binarySearch(liste, 33);
        System.out.println("33'ün indeksi :" + index);
    }
}
// [-321, -21, -11, 1, 2, 6, 21, 27, 33, 55]
// 33'ün indeksi :8

```

## Arrays.copyOf() ve Arrays.copyOfRange() metotu

Mevcut diziden belli bir uzunlukta yeni bir dizi oluşturmak için Arrays.copyOf() metotu kullanılır

Mevcut diziden belli bir aralıkta yeni bir dizi oluşturmak için ise Array.copyOfRange() metodu kullanılır.

```java
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] liste = {6, 1, 55, 21, 33, -321, -21, 2, -11, 27};

        int[] copyArray = Arrays.copyOf(liste, 3);
        System.out.println(Arrays.toString(copyArray));

        int[] copyOfRangeArray = Arrays.copyOfRange(liste, 0,5);
        System.out.println(Arrays.toString(copyOfRangeArray));
    }
}
// [6, 1, 55]
// [6, 1, 55, 21, 33]

```

## Arrays.equals() metotu

Java'da iki dizinin eşitliğini kontrol etmek için Arrays.equals() metotu kullanılır.

```java
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] list1 = {1, 2, 3};
        int[] list2 = {1, 2, 3};
        int[] list3 = {1, 2, 10};

        System.out.println(Arrays.equals(list1, list2)); // true
        System.out.println(Arrays.equals(list2, list3)); // false
    }
}

```

# Math Sınıfı ve Metotları

Java bazı durumları bizim için önceden yazdığı sınıflar ile bizlerin işini kolaylaştırmıştır. Bunlardan bir tanesi de Math sınıfıdır. Adında da anlaşılacağı gibi Java'da Math sınıfı matematiksel fonksiyonlar sunmaktadır. Java Math sınıfı, sayılar üzerinde matematiksel işlemler gerçekleştirmenize izin veren birçok metoda sahiptir.

Math sınıfının kullanımı şu şekildedir;

```java
Math.MethodAdi(Parametreler)
```

## Math Sınıfı Metotları

![Untitled](Java%20101%203a91ed2ad49a450196f252590fe2061a/Untitled%2014.png)

![Untitled](Java%20101%203a91ed2ad49a450196f252590fe2061a/Untitled%2015.png)

# String Sınıfı ve Metotları

Java'da String sınıfları **char** türünden verilerden oluşmuş bir kümedir yani karakterlerden oluşur. Java işlerimizi kolaylaştırmak ve String ifadelerle işlem yapmak için String sınıfını sunar.

## Java String Sınıfı Metotları

![Untitled](Java%20101%203a91ed2ad49a450196f252590fe2061a/Untitled%2016.png)

![Untitled](Java%20101%203a91ed2ad49a450196f252590fe2061a/Untitled%2017.png)