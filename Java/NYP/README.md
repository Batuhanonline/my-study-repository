# Nesne Yönelimli Programlama

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

## Nesne(Object) Nedir ?

Nesne kelimesinin TDK'de ki tanımına bir bakalım :

**1.** *isim* Belli bir ağırlığı ve hacmi, rengi olan her türlü cansız varlık, şey, obje.

**2.** *isim, dil bilgisi* Geçişli fiili bütünleyen yalın veya belirtme durumunda bulunan tümleç: *`Ali bir kitap almış` cümlesinde `kitap` nesnedir.*

**3.** *isim, felsefe* Öznenin dışında kalan her konu, obje: "*Her nesne ve olaya alaycı bir gözle bakmak ilkesinden yola çıkar bu görüş." -* **Salâh Birsel**

### **Nesnelere Örnekler**

- Araba, telefon, elma, ördek, kalem gibi günlük hayatta kullandığımız eşyalar.

Bildiğimiz gibi her nesnenin kendine ait **nitelikleri** ve **davranışları** vardır. Nesneler birbirlerinden farklıdır ve kendi **varoluşlarına** göre davranırlar ve kendi kimliklerine sahiptirler.

**Nitelik** : Nitelik kavramı, bir nesnenin özellikleridir ve nesnenin mevcut durumunu tanımlar. Mesela bir ördeğin rengi ve ağırlığı o ördeğin nitelikleridir. Bir ördeğimizin rengi siyah, diğer ördeğimizin rengi beyazdır. Bu durumda her iki nesne (yani ördek) nitelikleri sebebi ile birbirilerinden bağımsızdırlar.

**Davranış** : Bir nesnenin kendine özel yaptığı eylemlerdir. Yine ördek örneğine bakarsak, bir ördek uçabiliyorken diğer bir ördek fiziksel durumu gereği uçamayabilir.

Nesneler hakkında bilmemiz gereken bir diğer husus ise, nesneler bir isimdir. Nesnelerin kendilerine ait nitelik ve davranışları vardır.

## Sınıf(Class) Nedir ?

NYP sınıflar ve nesneler üzerine kurulmuştur, "**Sınıflar**" bir problemi soyutlamak ve genelleştirmek için kullanılan yapılardır veya kılavuzlardır. Sınıflar, bir nesneye ait tüm özellikleri temsil eder. Bu özellikler nesnenin ne tür **nitelikleri ve davranışları** olacağını belirler.

Mesela "**Araba**" bir sınıftır. Arabalara ait nitelikler **renk, hız, vites sayısı, yakıt türü vb.** bir sürü nitelik olabilir. Park sensörü, oto pilot, hız sabitleme gibi arabaların kendilerine özel davranışları da olabilir. Bir araba üretilirken, bir yapım kılavuzuna ihtiyaç vardır. Programlama da bu kılavuzlara "**Sınıf (Class)**" denir.

![Untitled](Nesne%20Yo%CC%88nelimli%20Programlama%2065d4426cd6c14f92a8c8317a8c0cdad3/Untitled.png)

**Örnek : Banka Sınıf Tasarımı**

![Untitled](Nesne%20Yo%CC%88nelimli%20Programlama%2065d4426cd6c14f92a8c8317a8c0cdad3/Untitled%201.png)

**Örnek : Banka Nesne İlişkileri**

![Untitled](Nesne%20Yo%CC%88nelimli%20Programlama%2065d4426cd6c14f92a8c8317a8c0cdad3/Untitled%202.png)

# **UML Modelleme ve Sınıf Diyagramları**

## Modelleme Nedir ?

Gerçek hayattaki problemleri bilgisayarın sanal ortamında çözebilmek için, her şeyden önce problemin uygun şekilde bilgisayar ortamına aktarılması gerekmektedir. Bu işlem “**soyutlama (abstraction)**” ya da “**modelleme (modeling)**” olarak anılır.

Modelleme, insanın problem çözmek üzere eskiden beri kullandığı bir yöntemdir. Büyükçe bir problemin tamamını zihinde canlandırıp çözmeye çalışmak yerine, oluşturulacak model ya da modeller üzerinde hedef sistemin görünüşü, davranışı ya da bazı durumlarda verdiği tepkiler gözlemlenebilir

## UML (Unified Modeling Language) Nedir ?

UML’ in Türkçe deki karşılığı “Birleşik Modelleme Dili” olsa da aslında bir programlama dili değil yazılım mühendisliğinde nesne tabanlı modellemede kullanılan standart olmuş görsel modelleme dilidir. Bir yazılımın hayata geçirilmesinde farklı görev tanımlamaları bulunmaktadır (Tasarımcılar, programcılar, analistler, testçiler, kalite sorumluları, kullanıcılar) gibi. Bir yazılım için her kişinin farklı bakış açısı vardır. Müşteri açısından projeye baktığımızda müşteriyi işlerin sıralandırılması, sisteme artıları ve eksileri , işler arasındaki ilişkiler ilgilendirirken bir fonksiyonun detayları ilgilendirmemektedir. Analist açısından baktığımızda nesne özellikleri, fonksiyonlar ve alacakları parametreler yeterli iken tasarımcı açısından parametrelerin veri tipleri, fonksiyonun performansı, yaşam süresi gibi bilgiler de önemli olmaktadır.

Bu nedenle UML bu ekip için gerekli farklı diyagramlar içermektedir. Yazılım geliştirme işinde yer alacak farklı ekiplerin farklı bakış açılarına uygun farklı UML diyagramları bulunmaktadır.

## Peki Neden UML ?

- Hataların kolaylıkla fark edilip en düşük seviyeye indirgenmesi.(Risk, zaman, maliyet)
- Kodlama kolaylığı sağlar.
- Kullanılan tekrar kod sayısı ayırt edilebilir bu sayede verim sağlanır.
- Mantıksal hataların minimum seviyeye düşürülmesini sağlar.
- Geliştirme maliyetinin düşmesini sağlar.
- Resmin tamamının görülmesini sağlar.
- UML diyagramları ile yazılım tamamını görebileceğimiz için verimli bellek kullanımı sağlanabilir.
- Karmaşık sistemlerde değişiklik yapmayı kolaylaştırır.
- UML ile dokümanlandırılmış kodları düzenlemek daha az zaman alacaktır
- UML diyagramlarını kullanan yazılımcılar aynı dili konuşacaklarından kolay iletişim sağlanır.

## UML Diyagram Türleri

![Untitled](Nesne%20Yo%CC%88nelimli%20Programlama%2065d4426cd6c14f92a8c8317a8c0cdad3/Untitled%203.png)

# Sınıf Diyagramları (Class Diagram)

Nesne yönelimli programlamada her bir nesnenin konseptini belirten yapılara sınıf (class) adı verilmektedir. Sınıflar çok farklı yapılarda ve işlevlerde olabilirler. Bununla birlikte, genellikle programlamada bütün iş tek bir sınıfın üzerine yüklenmez. Kuracağınız sistem ile ilgili önce temel sınıflar belirlenip daha sonra bunlar arasındaki bağlantıların açıklanması gerekir. Bunu bir yazılım geliştirme sürecinin tasarım aşamasında yaparız. Burada sınıfların modellemesi için UML kullanırız ve Sınıf Diyagramları adı veririz.

Programlamada sınıfların niteliklerini "değişkenler" , davranışlarını da "metotlar" tanımlar.

## Sınıf Tanımlama

![Untitled](Nesne%20Yo%CC%88nelimli%20Programlama%2065d4426cd6c14f92a8c8317a8c0cdad3/Untitled%204.png)

Şekilde görüldüğü üzere bir dikdörtgen 3 parçaya bölünerek, ilk parçasına "Sınıf Adını", ikinci parçaya "Sınıfın Değişkenleri" , son parçaya da "Sınıf Metotları" yazılır.

### **Nitelikler (Değişkenler)**

Sınıfa ait niteliklerin sözdizimi (syntax):

`<Görünürlük> <İsim>: <Tür> <Multiplicity> = <Varsayılan Değer>`

- **Görünürlük (Visibility)**: Niteliğin dışarıdan erişim ilkesinin ne olduğunu belirtir. Eğer bir sınıfın niteliği public ise buraya “+“, private ise buraya “–“, protected ise buraya “#” işareti konulur.
- **İsim (Name)**: Niteliğe ait isimlendirme yapılır.
- **Tür (Type)**: Bir niteliğin veri tipini belirtir.
- **Varsayılan Değer (Default Value)**: Niteliğin, ilk değerini belirtir.

### **Davranışlar (Metotlar)**

Sınıfa ait davranışlara ait sözdizimi (syntax):

`<Görünürlük> <İsim>(<Parametreler>): <Geri Dönüş Tipi>`

- **Görünürlük (Visibility)**: Bu davranışın dışarıdan erişim ilkesinin ne olduğunu belirtir. Alabileceği değerler niteliklerde olduğu gibidir.
- **İsim (Name)**: Metoda ait isimlendirme yapılır.
- **Parametre Listesi (Parameter List)**: Programlamada metodun aldığı parametreler tür bilgileri ile birlikte buraya yazılır.
- **Geri Dönüş Türü (Return Type)**: Metodun geri dönüş tipini belirtir.

![Untitled](Nesne%20Yo%CC%88nelimli%20Programlama%2065d4426cd6c14f92a8c8317a8c0cdad3/Untitled%205.png)

## Sınıflar Arası İlişkiler

Yazılımlar çoğu zaman tek sınıftan oluşmazlar. Küçük programlar bile çoğu zaman birden fazla sınıfa ihtiyaç duymaktadır. Bir yazılımda sınıf sayısı arttıkça programın tasarlanması da karmaşıklaşır. Bu yüzden UML diyagramlar kullanılarak, bu karmaşıklığı daha olayın en başında minimuma indirip maliyeti azaltmaktır. Sınıflar birbirleriyle ilişki içerisinde olan yapılardır. Bu ilişkileri UML diyagramlarında da göstermek gerekir. Elbette ilişkinin türüne göre gösterim de değişiklik gösterecektir.

- Bağlantı İlişkisi (Association)
- Genelleme/Kalıtım İlişkisi (Generalization/Inheritance)
- Bağımlılık İlişkisi (Dependency) (Aggregation, Composition)
- Gerçekleştirim İlişkisi (Realization)

![Untitled](Nesne%20Yo%CC%88nelimli%20Programlama%2065d4426cd6c14f92a8c8317a8c0cdad3/Untitled%206.png)

### **Bağıntı İlişkisi (Association Class)**

Sınıflar arasındaki ilişkiler çizgi ile gösterilir ve çizginin üstüne ilişki şekli yazılır. Sınıflar arası ilişkiler bire bir, bire çok, bire n gibi olabilir.

Örneğin aşağıdaki gösterimde e-ticaret sisteminde müşteri ve ürün ilişkisini görmektesiniz.

![Untitled](Nesne%20Yo%CC%88nelimli%20Programlama%2065d4426cd6c14f92a8c8317a8c0cdad3/Untitled%207.png)

Yukarıda ki diyagrama göre müşteri ve ürün arasında Satın Alma ilişkisi vardır ve bunun için de Sipariş oluşturması gerekir. Yukarıda ki diyagram da bire bir ilişkisi vardır.

Sınıf diyagramlarında sınıflar arasında bire n ilişki kurulabilir. Bir sınıf, n tane başka bir sınıf ile ilişkiliyse buna bire-çok (1-n) ilişki denir.

![Untitled](Nesne%20Yo%CC%88nelimli%20Programlama%2065d4426cd6c14f92a8c8317a8c0cdad3/Untitled%208.png)

Bu örnekte ise bir sepette n tane ürün olabileceği gösterilmiştir. İki sınıf arasında yalnızca tek bir bağıntı çizilmesi gibi bir kısıt yoktur. En temel bağıntı ilişki tipleri aşağıdaki gibi listelenebilir;

- Bire-bir (1-1)
- Bire-çok (1-*)
- Çoka bir (* - 1)
- Bire-sıfır (1-0)
- Bire-Beş yada Bire-sekiz (1-5 veya 1-8)

Diğer bir ilişki türü ise bir sınıfın kendisiyle kurduğu ilişkidir. Bu tür ilişkiler genellikle bir sınıfın sistemde birden fazla rolü varsa ortaya çıkar. Bu tür ilişkilere "reflexive associations" denir.

![Untitled](Nesne%20Yo%CC%88nelimli%20Programlama%2065d4426cd6c14f92a8c8317a8c0cdad3/Untitled%209.png)

### **Sınıflar Arasında Türetme (Inheritance) ve Genelleme (Generalization) İlişkisi**

Nesne yönelimli programlamanın en önemli parçası türetme (inheritance)'dir. Türetme yoluyla bir sınıf başka bir sınıfın var olan özelliklerini alarak, o sınıf türünden başka bir nesneymiş gibi kullanılabilir. Bir sınıfın işlevleri türetme yoluyla genişletilecekse, türetmenin yapılacağı sınıfa taban sınıf (super class), türetilmiş olan sınıfa da türemiş sınıf (sub class) denir. Şekilsel olarak türemiş sınıftan taban sınıfa bir ok olarak belirtilir.

![Untitled](Nesne%20Yo%CC%88nelimli%20Programlama%2065d4426cd6c14f92a8c8317a8c0cdad3/Untitled%2010.png)

Bu örnekte "Şekiller" sınıfına ait tüm özellikler altında üretilmiş olan, diğer sınıflara aktarılmıştır.

### **Bağımlılık İlişkisi (Dependency) ve Birleştirme (Aggregation, Composition)**

Birden fazla parçadan oluşan sınıflar arasındaki ilişkiye "Aggregation" denir. Aggregation ilişkisini 'bütün parça' yukarıda olacak şekilde ve bütün parçanın ucuna içi boş elmas yerleştirecek şekilde gösteririz. İçi boş elmas ile gösterilen ilişkilerde her bir parça ayrı bir sınıftır ve tek başlarına anlam ifade ederler.

Örneğin Araba sınıfını 1 Motor, 5 Koltuk ve 4 Lastik sınıflarının oluşturduğunu düşünürsek aralarındaki ilişki aşağıdaki gibi gösterilir.

![Untitled](Nesne%20Yo%CC%88nelimli%20Programlama%2065d4426cd6c14f92a8c8317a8c0cdad3/Untitled%2011.png)

Asıl sınıf üretildiğinde parçaları da üretilecek ise bu ilişkiye **Composite** denir. Eğer Araba sınıfı oluşturulduğunda Motor, Koltuk ve Lastik sınıfları da oluşturulacak ise içi dolu dörtgen dolu olarak gösterilir.

### **Gerçekleştirim (Realization) İlişkisi**

Gerçekleştirim ilişkisi en çok kullanıcı arayüzlerinin (user interface) modellenmesinde kullanılır. Arayüz yalnızca method adlarını ve bunların parametrelerini içermektedir. Program yazarken, yalnızca arayüzlerin kullanılması ve arayüzü gerçekleştiren sınıfın diğer sınıflardan ayrı tutulması, yazılımın geliştirilmesi ve bakımında önemli kolaylık sağlar.

![Untitled](Nesne%20Yo%CC%88nelimli%20Programlama%2065d4426cd6c14f92a8c8317a8c0cdad3/Untitled%2012.png)

# **Sınıf Diyagram Örnekleri**

**Sipariş İşlemleri Sınıf Tasarımı**

![Untitled](Nesne%20Yo%CC%88nelimli%20Programlama%2065d4426cd6c14f92a8c8317a8c0cdad3/Untitled%2013.png)

- 0 veya 1 müşterinin (Customer) en az 1 veya daha fazla siparişi (Order) olabilir.
- Siparişin (Order) ürünü (Product) vardır.
- Stoğun (Stock) ürünü (Product) vardır.

## Banka Yönetim Sistemi Sınıf Tasarımı

![Untitled](Nesne%20Yo%CC%88nelimli%20Programlama%2065d4426cd6c14f92a8c8317a8c0cdad3/Untitled%2014.png)

- Bankanın (Bank) ATM, Müşteri (Customer), Hesap (Account) sınıfları vardır.
- 1 müşterinin (Customer) en az 1 en çok 2 hesabı (Account) olabilir.
- 1 hesap (Account) 0 veya daha fazla ATM işlemi yapabilir.
- Hesap (Account) sınıfına ait iki tane alt sınıf vardır, Ana Hesap (Main Account) ve Birikim Hesabı (Saving Account).

## Şirket Yönetim Sistemi Sınıf Tasarımı

![Untitled](Nesne%20Yo%CC%88nelimli%20Programlama%2065d4426cd6c14f92a8c8317a8c0cdad3/Untitled%2015.png)

- Şirketin (Company) 0 veya daha fazla departman (Department) ve ofisi (Office) vardır.
- Şirket (Company) olmadan departman (Department) ve ofis (Office) olamaz.
- Bir departmanın (Department) en az bir çalışanı (Employee) olmalıdır.
- Bir departman (Department) bir çalışan (Employee) tarafından yönetilir.
- Ofise (Office) ait bir merkez ofis (Headquarter) olabilir.

## Okul Yönetim Sistemi Sınıf Tasarımı

![Untitled](Nesne%20Yo%CC%88nelimli%20Programlama%2065d4426cd6c14f92a8c8317a8c0cdad3/Untitled%2016.png)

- 1 okulun (School) en az bir veya daha fazla departmanı (Department) olabilir.
- En az 1 veya daha fazla okulun (School) birden fazla öğrencisi (Student) olabilir.
- 0 veya daha fazla öğrenci (Student) , en az 1 veya daha fazla ders (Subject) alabilir.
- En az 1 veya daha fazla dersin (Subject), en az 1 veya daha fazla öğretmeni (Instructor) olabilir.
- Bir departmanın (Department) en az 1 veya daha fazla dersi (Subject) olabilir.
- Bir veya daha fazla departmana (Department), 1 veya daha fazla öğretmen (Instructor) atanabilir.

## Sipariş Yönetim Sistemi Sınıf Tasarımı

![Untitled](Nesne%20Yo%CC%88nelimli%20Programlama%2065d4426cd6c14f92a8c8317a8c0cdad3/Untitled%2017.png)

- Bir müşterinin 0 veya daha fazla siparişi olabilir.
- Bir siparişe ait sipariş detayı ve ürünleri olur.
- 1 siparişin birden fazla ödemesi olabilir.
- Nakit , Çek ve Kredi Kartı ödeme yöntemleridir.

# Encapsulation (Kapsülleme)

Sarmalama ilkesi, bir sınıfa ait değişkenlerin veya niteliklerin ancak o sınıfa ait metotlar tarafından değiştirilebilmesi ve okunabilmesi ilkesidir. Bu ilke sayesinde nesnelerde oluşacak anlamsızlıkların önüne geçilebilir.

Ayrıca değişkenlere sınıfların dışından erişim olmaması ve bir sınıf içindeki değişkenlerin nasıl ve ne kadar olacağının da başka kodlardan saklanmış olması anlamına gelir. Böylelikle biz değişkenlerimizi sarmalayarak istenmeyen durumlardan korunacak bir filtre haline dönüştürebiliriz. Bunu bir örnek ile anlamaya çalışalım.

## Encapsuliaton Örneği

Kitap adında bir sınıfımız olsun ve bu sınıfımıza ait 3 adet değişkenimiz olsun bunlar ; kitapAdi, sayfaSayisi ve yazar. Bu değişkenlerin erişim belirleyicileri public olsun ve her sınıftan erişilsin. Kitap sınıfından oluşturacağımız bir nesne bu niteliklerin hepsini taşısın. Bu yüzden oluşturacağımız Constructor (kurucu) metodunu bu şekilde oluşturalım.

```java
public class Kitap {
    public int sayfaSayisi;
    public String kitapAdi, yazar;
    Kitap(String kitapAdi, int sayfaSayisi, String yazar) {
        this.kitapAdi = kitapAdi;
        this.sayfaSayisi = sayfaSayisi;
        this.yazar = yazar;
    }
}

```

Görüldüğü üzere normal bir sınıfımız ve kurucu metodumuz var. Kitap sınıfından bir nesne oluşturalım.

```java
Kitap book = new Kitap("Harry Potter", 500, "JK Rowling");

```

Kitap sınıfından **book** adlı bir nesne oluşturduk ve bu nesnemizin niteliklerini belirttik. Peki biz bu kurucu metotta sayfa sayısını negatif bir değer girseydik ne olurdu ? Hiç bir kitabın sayfa sayısı negatif bir değer olamayacağı için, nesnemizde bir **anlamsızlık** olacaktı. Biz bu sorunu **constructor** (kurucu) metotumuza yazacağımız bir **if** kontrolü ile çözebiliriz.

```java
public class Kitap {
    public int sayfaSayisi;
    public String kitapAdi, yazar;
    Kitap(String kitapAdi, int sayfaSayisi, String yazar) {
        this.kitapAdi = kitapAdi;
        this.yazar = yazar;
        if (sayfaSayisi < 1) {
            this.sayfaSayisi = 10;
        } else {
            this.sayfaSayisi = sayfaSayisi;
        }
    }
}

```

**Constructor** metodu görüldüğü gibi modifiye ettik ve nesne oluşturulurken anlamız verilerin olmasını engelledik. Ama sorunlarımız hala bitmedi , biz nesneye ait niteliklere hala dışarıdan erişebiliyoruz ve book.sayfaSayisi = -10 dersek , nesneye ait sayfa sayısını yine anlamsızlaştırmış oluruz. Bu sorunu çözmek için sınıfa ait değişkenlere dışarıdan erişimi kapatmamız gerekir ve oluşturduğumuz değişkenlerin erişim belirleyicilerini **(Access Modifiers)** değiştirmemiz gerekli. Tüm **public'leri private** olarak değiştiriyoruz.

Sınıfımızın son hali

```java
public class Kitap {
    private int sayfaSayisi;
    private String kitapAdi, yazar;
    Kitap(String kitapAdi, int sayfaSayisi, String yazar) {
        this.kitapAdi = kitapAdi;
        this.yazar = yazar;
        if (sayfaSayisi < 1) {
            this.sayfaSayisi = 10;
        } else {
            this.sayfaSayisi = sayfaSayisi;
        }
    }
}

```

Sınıfa ait değişkenlerimin izinlerini **private** yaparak bu sorunu çözdük ama, biz book nesnesine ait değişkenlere erişimi tamamen kısıtladık. Yani biz oluşturduğumuz nesneye ait sayfa sayısını ekrana bastıramayız çünkü değişken **private** olarak tanımlandı. Ya da sayfa sayısı yanlış girilmiş bir nesneyi daha sonrasında düzenleyemeyiz. Bu sorunu çözmek için sınıfa ait değişkenlerimizi **sarmalayarak**, sınıf içerisinde ki **metotlar** yardımı ile değişkenlerimizi **koruma** altına alıyoruz ve kullanıma sunuyoruz. Bu metotlara sonrasında ismini çok duyacağımız **Getter ve Setter** metotları diyoruz.

## Getter ve Setter Metotları

### **Getter**

Sınıfımıza ait **private** değişkenler mevcut. Bu değişkenlere dışarıdan erişebilmek için **her bir değişkenimiz** için **Getter** metodu yazmalıyız. Nesneye ait bu metot çağrıldığında geriye bir değer döndürmeli ve bu değer bizim istediğimiz **private** değişken olmalı. **sayfaSayisi** değişkeni için **getter metodu** tanımlayalım,

```java
public class Kitap {
	private int sayfaSayisi;
	private String kitapAdi, yazar;

	Kitap(String kitapAdi, int sayfaSayisi, String yazar) {
		this.kitapAdi = kitapAdi;
		this.yazar = yazar;
		if (sayfaSayisi < 1) {
			this.sayfaSayisi = 10;
		} else {
			this.sayfaSayisi = sayfaSayisi;
		}
	}

	public int getSayfaSayisi() {
		return this.sayfaSayisi;
	}
}

```

Görüldüğü gibi basit bir metot yardımı ile sınıfa ait **private** değişkenimize ulaşabildik. Burada dikkat edilmesi gereken noktalar **getter** metotları **geri dönüşü** olan metot tipindedir ve isimlendirilmesi ise **get** ile başlayıp sonra değişken ismi yazılmalıdır. İsimlendirmeyi bu şekilde yapmasak da çalışacaktır lakin kodun okunabilirliği adına bu kurala uyulması **gerekir.**

### **Setter**

Biz **getter** metodu ile **private** olan değişkenimize ulaştık.Peki bu değişkenin değerini değiştirmek istediğimizde ne yapmalıyız ? Bir sınıfa ait **private** bir değişkenin değerini değiştirmek için, **setter** metodu yazılmalıdır. sayfaSayisi değişkeni için setter metodu yazalım.

```java
public class Kitap {
	private int sayfaSayisi;
	private String kitapAdi, yazar;

	Kitap(String kitapAdi, int sayfaSayisi, String yazar) {
		this.kitapAdi = kitapAdi;
		this.yazar = yazar;
		if (sayfaSayisi < 1) {
			this.sayfaSayisi = 10;
		} else {
			this.sayfaSayisi = sayfaSayisi;
		}
	}

	public int getSayfaSayisi() {
		return this.sayfaSayisi;
	}

	public void setSayfaSayisi(int sayfaSayisi) {
		this.sayfaSayisi = sayfaSayisi;
	}
}

```

Görüldüğü üzere **setter** metodu sadece değiştirme işlemi yapacağı için **void** olarak tanımlandı ve bir adet parametre aldı. Bu parametre bizim yeni değerimi taşıyor olup, sınıfa ait değişkene aktarılmıştır. Ama burada hala bir sorun söz konusudur, bizler **setter** metodunu kullanarak sayfa sayısını negatif girebiliriz. Bu sorunu aşmak için **constructor** (kurucu) metotta yaptığımız gibi bir **if** koşulu ile bu sorunu çözebiliriz.

```java
public class Kitap {
	private int sayfaSayisi;
	private String kitapAdi, yazar;

	Kitap(String kitapAdi, int sayfaSayisi, String yazar) {
		this.kitapAdi = kitapAdi;
		this.yazar = yazar;
		if (sayfaSayisi < 1) {
			this.sayfaSayisi = 10;
		} else {
			this.sayfaSayisi = sayfaSayisi;
		}
	}

	public int getSayfaSayisi() {
		return this.sayfaSayisi;
	}

	public void setSayfaSayisi(int sayfaSayisi) {
		if (sayfaSayisi < 1) {
			this.sayfaSayisi = 10;
		} else {
			this.sayfaSayisi = sayfaSayisi;
		}
	}
}

```

**Setter** metodunu modifiye ederek nesnemiz için anlamsız olan durumu ortadan kaldırmış olduk. **Setter** metodunun genel özellikleri ise , geriye bir değer döndürmeyen metot olması ve isimlendirme yaparken başlangıç olarak set yazıp sonrasında değişken ismini yazmaktır.

Bu örnekteki **sayfaSayisi** değişkenini koruma ve anlamsızlaşmasını önlemek için **Nesne Yönelimli Programlamanın** ilkesi olan **Encapsulation** (Sarmalama) ilkesinden yararlandık. Bir sınıfa ait değişkenlerimizi **Getter** ve **Setter** metotları yardımı ile sarmaladık ve istenilen şartlara göre oluşmasını sağladık.

# Kalıtım (Inheritance)

Kalıtım, programlama ortamında da gerçek hayattaki tanımına benzer bir işi gerçekleştirir. Bir sınıfın başka bir sınıftan kalıtım yapması demek, kalıtımı yapan sınıfın diğer sınıftaki nitelik ve davranışlarını kendisine alması demektir. Kalıtımı yapan sınıfa **alt sınıf**, kendisinden kalıtım yapılan sınıfa **ata sınıf** dersek, ata sınıfta tanımlı olan her şeyin alt sınıf için de tanımlı olduğunu söyleyebiliriz.

Eğer bir A sınıfın B sınıfından kalıtım yapması isteniyorsa, aşağıda ki şekilde tanımlanır.

```java
public class A extends B {
     //
}

```

## Kalıtım Türleri

### **Tek Yönlü Kalıtım (Single Inheritance)**

Bir sınıfın başka bir sınıfı genişlettiği alt ve ata sınıf ilişkisini ifade eder.

![Untitled](Nesne%20Yo%CC%88nelimli%20Programlama%2065d4426cd6c14f92a8c8317a8c0cdad3/Untitled%2018.png)

Bu örnekte B sınıfı A sınıfını miras alır.

### **Çoklu Kalıtım (Multiple Inheritance)**

Bir sınıfın birden fazla sınıfı miras almasını ifade eder; bu, bir alt sınıfın iki ata sınıfa sahip olduğu anlamına gelir.

Not : Java çoklu kalıtımı desteklemez. (Interface kullanılır)

![Untitled](Nesne%20Yo%CC%88nelimli%20Programlama%2065d4426cd6c14f92a8c8317a8c0cdad3/Untitled%2019.png)

### **Çok Seviyeli Kalıtım (Multilevel Inheritance)**

Bir sınıfa ait alt sınıfın başka sınıfları genişletmesine denir.

![Untitled](Nesne%20Yo%CC%88nelimli%20Programlama%2065d4426cd6c14f92a8c8317a8c0cdad3/Untitled%2020.png)

Bu örnekte , C sınıfı B sınıfını miras alır, B sınıfı ise A sınıfını miras alır. C sınıfı dolaylı yoldan A sınıfını da miras almış olur.

### **Hiyerarşik Kalıtım (Hierarchical Inheritance)**

Birden fazla sınıfın aynı sınıfı genişlettiği bir alt ve üst sınıf ilişkisini ifade eder.

![Untitled](Nesne%20Yo%CC%88nelimli%20Programlama%2065d4426cd6c14f92a8c8317a8c0cdad3/Untitled%2021.png)

Bu örnekte : B, C ve D sınıfları aynı A sınıfını genişletir.

### **Hibrit Kalıtım (Hybrid Inheritance)**

Programda birden fazla kalıtım türünün kombinasyonuna denir. Örneğin, A ve B sınıfı, C sınıfını genişletir ve başka bir D sınıfı, A sınıfını genişletir, bu bir hibrit kalıtım örneğidir, çünkü bu, tek yönlü ve hiyerarşik kalıtımın bir birleşimidir.

![Untitled](Nesne%20Yo%CC%88nelimli%20Programlama%2065d4426cd6c14f92a8c8317a8c0cdad3/Untitled%2022.png)

## Kalıtım'da Constructor Zinciri ve Super Anahtar Sözcüğü

Bir sınıfa ait nesne oluşturulurken, o sınıfın bir kurucusunun işletildiğini, kurucunun çalışması tamamlandıktan sonra bellekte artık bir nesnenin oluştuğunu biliyoruz. Kurucuları da nesneleri ilk oluşturuldukları anda anlamlı durumlara taşıyabilmek için kullanıyoruz. Bu durumda, eğer nesnesi oluşturulacak sınıf başka bir sınıfın alt sınıfıysa, önce ataya ait iç nesnesinin oluşturulması ve bu nesnenin niteliklerinin ilk değerlerinin verilmesi gerektiğini söyleyebiliriz.

İç içe nesnelerin oluşabilmesi için nesnelerin içten dışa doğru oluşması gerekir. İç-nesnenin oluşabilmesi için, nesnesi oluşturulacak sınıfa ait kurucu işletilmeye başladığı zaman ilk iş olarak ata sınıfa ait kurucu çağrılır. Eğer ata sınıf da başka bir sınıfın alt sınıfıysa, bu kez o sınıfın kurucusu çağrılır. Kurucu zinciri alt sınıftan ata sınıfa doğru bu şekilde ilerler. En üstte, kalıtım ağacının tepesindeki sınıfın kurucusunun çalışması sonlandıktan sonra sırası ile alt sınıfların kurucularının çalışması sonlanacaktır. Böylece iç içe nesneler sıra ile oluşturularak en son en dıştaki nesne oluşturulmuş olur ve kurucu zinciri tamamlanır.

### **Super Kullanımı**

Eğer ata sınıfta varsayılan kurucu yoksa ve programcı alt sınıftaki kurucunun içinde ata sınıfın hangi kurucusunun çağrılacağını belirtmezse derleme hatası alınacaktır. Çünkü derleyici aksi belirtilmedikçe ata sınıfın varsayılan kurucusunu çağıran super() kodunu üretecektir. Ata sınıfın hangi kurucusunun çağrılacağı, super anahtar sözcüğü ile birlikte verilen parametrelere göre belirlenir. Nasıl ki new işleci ile birlikte kullandığımız parametreler hangi kurucunun çağrılacağını belirliyorsa, super anahtar sözcüğü ile birlikte kullanılan parametreler de aynı şekilde ata sınıfın hangi kurucusunun işletileceğini belirler.

![Untitled](Nesne%20Yo%CC%88nelimli%20Programlama%2065d4426cd6c14f92a8c8317a8c0cdad3/Untitled%2023.png)

![Untitled](Nesne%20Yo%CC%88nelimli%20Programlama%2065d4426cd6c14f92a8c8317a8c0cdad3/Untitled%2024.png)

![Untitled](Nesne%20Yo%CC%88nelimli%20Programlama%2065d4426cd6c14f92a8c8317a8c0cdad3/Untitled%2025.png)

# Çok Biçimlilik(Polymorphism)

Polymorphism(çok biçimlilik) NYP'de programlama dilinin farklı tip verileri ve sınıfları farklı şekilde işleme yeteneğini belirten özelliğidir. Daha belirgin olmak gerekirse, metotları ve türetilmiş sınıfları yeniden tanımlama yeteneğidir.

Polimorfizm, alt sınıfların ata sınıflardaki metotları geçersiz kılması(method overriding) sayesinde çok biçimli olarak davranmasına denir. Bu sayede alt sınıf ata sınıfından gelen davranışı kendine göre şekillendirebilir.

Metotlarda "Geçersiz Kılma" ise bir alt sınıfın içine doğrudan ya da dolaylı ata sınıflarından gelen bir(ya da daha fazla) yöntemin aynısının(aynı yöntem adı ve aynı parametre listesi) kodlanmasına verilen addır.

Polimorfizm sayesinde uygulamaların genişletilebilirliğini sağlarız ve bir ata sınıfın sunduğu yöntemleri geçersiz kılan alt sınıflar yardımı ile ata sınıfa göre kodlanmış tek bir kod kesimine farklı davranışlar yüklemek olanaklı olmaktadır. Öyleyse, elimizde esnek bir altyapı var demektir. Bu esneklik altyapıya yeni türlerin eklenmesi, kalıtım ve geçersiz kılma ilişkileri çerçevesinde oldukça kolaydır.

## Polimorfizm Örneği

![Untitled](Nesne%20Yo%CC%88nelimli%20Programlama%2065d4426cd6c14f92a8c8317a8c0cdad3/Untitled%2026.png)

# Soyutlama (Abstraction)

Nesne yönelimli programlamada Soyutlama (Abstraction) ilkesi, eğer bir sınıf için nesne üretmek mantıksız geliyorsa o sınıf soyutlanabilir. Alt sınıfların ortak özelliklerini ve işlevlerini taşıyan ancak henüz bir nesnesi olmayan bir üst sınıf oluşturmak istenirse bir soyut (abstract) üst sınıf oluşturulur.

Soyutlama, bir sınıfa veya metoda temel görevlerin tanımlanması, detayların ise tanımlanmaması demektir. Temel olarak bir soruna ait çözüme giderken kullanılacak yöntemlerin, ilk etapta daha genel basit ve soyut bir tanımını yapmaktır.

## "abstract" Anahtar Kelimesi ve Soyut Sınıf Kavramı (Abstract Class)

Soyutlama kavramı sınıfın içindeki iç işleyişi dışarıdan izole etmek, yani gizlemektir. Örneğin: bilgisayarı kullanırken çoğu kullanıcı bilgisayarın iç işleyişinden haberi olmaz. Hafızanın işlemciyle haberleşmesi, işlemler arası senkronizasyon, klavyeden girilen değerlerin ekrana yansıması gibi birçok işlemin detayı kullanıcılardan gizlenmiş durumdadır. Kullanıcılar sadece bu fonksiyonları veya işlevleri bir arayüz vasıtasıyla çağırıp kullanmaktadır. İç detaylarına müdahale etmemektedir.

Aynı şekilde Java'da sınıflarımızı tasarlarken bazı fonksiyonların ve işlevlerin sadece sınıf içinde kalması, dış dünyada bu sınıftan nesneleri kullanan kişilerin bu iç fonksiyonları bilemelerine gerek yoktur. Örneğin: KDV tutarını hesaplayan fonksiyonun sınıf içinde kullandığı birçok başka fonksiyon olabilir. Bu fonksiyonların sınıf dışına açılmasının bir anlamı yoktur. Sadece miktarı verip o miktara göre KDV tutarını hesaplayacak bir dış fonksiyon yeterlidir. Yazılım dünyasında bu nedenle soyutlama kavramı yazılım tasarımında önemli bir kavramdır. Soyutlama yapabilmek için "abstract" anahtar kelimesi, "interface" gibi yapılar bizlere yardımcı olmaktadır.

Soyutlama için Java'da iki yöntem mevcuttur:

- "interface" tanımlamak
- "abstract" sınıf tanımlamak

## Soyut Sınıf (Abstract Class)

"abstract" anahtar kelimesi ile tanımlanan sınıflardır. Sınıfın içinde soyut ("abstract") metotlar veya normal fonksiyonlar tanımlanabilir. Soyut sınıflardan "new" anahtar kelimesi ile bir nesne oluşturulamaz.

**Soyut Sınıf Özellikleri:**

- "abstract" anahtar kelimesi ile tanımlanmış olması gerekiyor.
- Soyut veya soyut olmayan fonksiyonlar tanımlanabilir.
- Soyut sınıflardan "new" anahtar kelimesi ile nesne oluşturulamaz.
- Kurucu metodu ve static fonksiyonlar tanımlanabilir.
- "final" kelimesi ile tanımlanmış fonksiyonları içerebilir. Bu final fonksiyonlar alt sınıflarda ezilemezler (override).

```java
// abstract sınıf örneği
public abstract class Doping {

	protected double price;
	protected double[] taxes;

	public double[] getTaxes() {
		return taxes;
	}

	public void setTaxes(double[] taxes) {
		this.taxes = taxes;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	// soyut metot örneği
	public abstract double calculate();
}

```

Yukarıda soyut bir sınıf tanımladık. "abstract" kelimesi ile sınıf tanımladık, ayrıca sınıfın içinde "calculate" isimli "abstract" metot tanımladık. Aynı zamanda soyut olmayan metotlar da tanımladık. Senaryomuzda bir e-ticaret sisteminde "Doping" tipinde ek ürünler olduğunu düşünelim. İlan tarihini güncelleyen bir doping çeşidimiz olsun, bir de üst sırada çıkmanızı sağlayan bir doping olsun. Bu iki alt sınıfta "Doping" isimli sınıftan kalıtım alarak belli özellikleri kendilerine alsınlar. Fakat, her dopingin ücret hesaplama yöntemi birbirinden farklı olabilir. Ayrıca, her dopingin mutlaka fiyat hesaplama fonksiyonu olmalıdır.

Yukarıdaki durumda "abstract" sınıf tanımlayıp diğer doping çeşitleri bu ATA sınıftan kalıtım alacaklardır. "calculate" isimli "abstract" metodu, "metod ezme" (overriding) yöntemiyle ezip metodun içini kendilerine göre dolduracaklardır. Alt sınıflardaki diğer özellikler soyutlama tekniğiyle dış dünyadan gizlenecektir. Dış dünyadan dopingi kullanmak isteyen baka bir sınıf veya kod parçası doping nesnesi üzerindeki "calculate" fonksiyonunu çağırıp fiyatı hesaplayacaktır. Diğer iç hesaplama ve çalışma detaylarını bilmeyecektir.

```java
public class TopOfListDoping extends Doping {

	public TopOfListDoping(double price)
	{
		super.setPrice(price);
	}

	// "Doping" soyut sınıfından kalıtımla gelen, "calculate" isimli soyut metodu metot ezmesi yöntemiyle alt sınıf kendi ihtiyacına göre dolduruyor.
	// "TopOfList" isimli doping tipinde vergiler olmadığı için komisyon oranı eklenip ücret hesaplanıyor. Fakat, başka doping çeşitlerinde hesaplama farklı olabilir.
	@Override
	public double calculate() {

		return super.getPrice() + super.getPrice() * 0.35;
	}
}

public class UptodateDoping extends Doping {

	public UptodateDoping(double price, double[] taxes) {
		super.setPrice(price);
		super.setTaxes(taxes);
	}

	// "Doping" soyut sınıfından kalıtımla gelen, "calculate" isimli soyut metodu metot ezmesi yöntemiyle alt sınıf kendi ihtiyacına göre dolduruyor.
	// "UptodateDoping" isimli doping tipinde vergiler fiyata dahil olduğu için komisyon oranı eklenip ve vergiler hesaplanıp ücret belirleniyor.
	// Görüldüğü gibi her doping çeşidinin fiyat hesaplama yöntemleri birbirinden farklıdır. Soyutlama ile sınıflara ait iç çalışma detayları gizlenmmiş oluyor.
	// Doping tiplerinde sadece "calculate" isimli fonksiyonu dış dünyaya açtık. Diğer tüm fonksiyonlar ve özellikler sınıf içinde kaldı.
	@Override
	public double calculate() {

		return calculateTaxes() + commisionRate();
	}

	private double calculateTaxes() {

		double totalTaxValue = 0;
		for(int i=0; i < super.getTaxes().length; i++) {
			totalTaxValue += super.getTaxes()[i];
		}
		return totalTaxValue;
	}

	private double commisionRate() {
		return super.getPrice() * 0.2;
	}
}

```

"Doping" soyut sınıfından kalıtımla gelen, "calculate" isimli soyut metodu metot ezmesi yöntemiyle alt sınıf kendi ihtiyacına göre dolduruyor. "UptodateDoping" isimli doping tipinde vergiler fiyata dahil olduğu için komisyon oranı eklenip ve vergiler hesaplanıp ücret belirleniyor. Görüldüğü gibi her doping çeşidinin fiyat hesaplama yöntemleri birbirinden farklıdır. Soyutlama ile sınıflara ait iç çalışma detayları gizlenmiş oluyor. Doping tiplerinde sadece "calculate" isimli fonksiyonu dış dünyaya açtık. Diğer tüm fonksiyonlar ve özellikler sınıf içinde kaldı.