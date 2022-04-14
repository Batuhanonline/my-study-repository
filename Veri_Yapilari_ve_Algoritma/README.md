# Temel Kavramlar

## Algoritma Nedir?

Kısaca bir problemin çözümü için kullanılan adımlar bütünüdür. Gelin bir örnekle açıklayalım.

![kahvealgoritma](https://kazimbayram.files.wordpress.com/2013/07/capture.png?w=264&h=416)

Resimde anlaşıldığı üzere kahve yapmamız için gereken adımları bir algoritma şemasına dönüştürdük.
**Algoritma belli bir durumdan başlayıp belli bir sonuç ile problemlere çözüm getiren adımlardır.**

## Bilgilerin Bilgisayarda İfadesi

Bilgisayar bilgiyi (Resim, ses, yazı vb) ifade etmek ve döngüyü sağlamak için bit (0 ve 1)' den oluşan ikili sayıları (Binary Numbers) kullanıyor.

İkili sayılarda bulunan 1 ve 0 rakamları (bit), bilgisayarın elektrik iletimi için kullandığı transistörlerin açık veya kapalı olma durumunu gösteriyor. Transistörlerde iki tane komut vardır, 0 (kapat) ve 1 (aç).

Konuyu pekiştirmek için bir örnekle açıklayalım. C#, Java gibi dillerde kullandığımız platformlar aracılığıyla yazdığımız kod ilk olarak derlenir ve makine koduna (0 ve 1'li sayılara) dönüştürülür. Bilgisayar okur ve çıktı verir.

## Recursion(Özyineleme)

Bir problemin alt problemlere bölünüp hesaplanmasına, nerde son bulacağımı belirttiğimiz ifadelere recursion (Özyineleme) diyoruz. Gelin bir python kodunda bunu inceleyelim.

```python
def factorial(x):
    if x == 1
        return 1
    
    return * factorial(x-1)
```

Yukarıdaki fonksiyonda faktoriyel hesaplama için fonksiyonun kendi içersinde kendini azaltarak çağırması bir recursion örneği olur.

# Veri Yapıları

## Arrays(Diziler)

Diziler birbirine bağlı ya da birbirleriyle beraber anlamlı verilerin yan yana konulması ile anlam ifade ederler.
* Dizilerin dezavantajlarından biri olan hafıza problemlerinden bahsedelim. Bir örnek üzerinden ifade etmek gerekirse bir arkadaş grubu ile yemek yemeye gideceksiniz hepiniz aynı masada oturmak istiyorsunuz 4 arkadaşınız ile beraber 4 kişilik masaya oturdunuz diyelim, sonradan bir arkadaşınız daha geldi ve siz hep beraber 4 kişilik masadan kalkıp 5 kişilik bir masaya geçtiniz her yeni arkadaşınızın gelmesiyle beraber bu işlem devam etmektedir. Her yeni masaya geçmenizle beraber güç kaybı yaşamaya başlarsınız.

* Dynamic arrays (Dinamik diziler) ise yeni bir eleman için boşta yer tutmasından ötürü esnektir. Örneğin 4 arkadaşınızla beraber yemek yemek için gittiniz ama bu sefer 4 kişi 10 kişilik masaya oturdunuz ve gelecek olan arkadaşlarınız için yer tutunuz.
* Bu durumun dezavantajı ise hafızada fazladan yer tutmasıdır 4 arkadaşınız daha geldi diyelim bunun sonucunda 2 kişilik fazladan yer tutmuş olursunuz.
* Avantajı ise nerede olduğunuz bellidir erişiminiz kolaydır.

## Linked List (Bağlı Listeler)

Linked-List (Bağlı listeler), yan yana zorunluluğu olmadan veri tutmamızı sağlayan yapılardır. Yeni gelen eleman için hafıza'da yeni bir alan açmamız gerekmez. Array'dan farklı olarak evet elemanlar hafıza içerisinde dağılmış olabilir, fakat son gelen eleman kendinden bir önceki elemana adresini bildirmek zorundadır.

![linked-list](https://www.101computing.net/wp/wp-content/uploads/linked-list.png)

Yukarıdaki örnekte gördüğünüz üzere, her bir düğüm bir sonrakinin adresini tutar. Her bir önceki eleman bir sonraki eleman ile bağlıdır.

## Linked List vs Array

|Array|Linked List|
| :----: | :----: |
|Arrayin istediğimiz elemanına sabit sürede erişebiliyoruz.|Eleman eklemek ve silmek arraylere göre daha kolay.|
|Sadece elemanı tuttuğumuz için daha az yer kaplıyor.|Elemanların bir blok olarak tutulması gerekmiyor, hafızada blok olarak yer yoksa da kullanılabilir.|
|Memory locality daha iyi.|

## Linked List Eleman Ekleme/Silme

* 3 elemanlı bir hücre oluşturalım.

![olusturma](https://raw.githubusercontent.com/Kodluyoruz/taskforce/main/veri-yapilari-algoritmalar/linked-list-add-delete/figures/ilk-ad%C4%B1m.png)

* Adresi #12 olan 22 sayısını listeye eklemek istiyoruz. Yapmamız gereken 6 hücresine 22 sayısının adresini yazmak.

![ekleme](https://raw.githubusercontent.com/Kodluyoruz/taskforce/main/veri-yapilari-algoritmalar/linked-list-add-delete/figures/eleman-ekleme.png)

* Adresi #20 olan 6 numaralı hücresini çıkarmak istiyoruz. Linked-List'de bir önceki eleman adresini tutuyordu. Yani 7 numaralı hücrede bulunan 6'nın hücre adresini siliyoruz. Yerine 22 numaralı hücrenin adresini yazıyoruz.

![cikarma](https://raw.githubusercontent.com/Kodluyoruz/taskforce/main/veri-yapilari-algoritmalar/linked-list-add-delete/figures/eleman-%C3%A7%C4%B1karma.png)

## Stack

* Stack, LIFO (Last in First out) (En son giren en önce çıkar) mantığına dayanan, elemanlar topluluğundan oluşan bir yapıdır.

* Push: Stack'e eleman elemek için, 
* Pop: Stack'ten eleman çıkarmak için kullanılır.

## Queue

* Queue (Kuyruk), FIFO (First in First out) (İlk giren ilk çıkar) prensibine dayanan, girişlerde ve çıkışlarda belirli bir kurala göre çalışan yapıdır.

* Enqueue: Yeni elemanın Queue'ya eklenmesi(yeni birinin sıraya girmesi)

* Dequeue: Elemanın Queue'dan çıkarılması(sırası gelenın çıkması)

## Hash Function/ Hash Table 

* ## Indexleme

Arraylerde 0 bazlı bir indexleme vardır. Bazı programlama dillerin 1 bazlı indexlemeler olsa da genel olarak 0 bazlı indexleme kullanılır.

![idexleme](https://raw.githubusercontent.com/Kodluyoruz/taskforce/main/veri-yapilari-algoritmalar/hash-table/figures/Indexleme.png)

* ## Hash Function/ Hash Table

Hash Table, key value prensibine dayanan bir array kümesidir. Key olarak çağırdığınız elemanın değerini (value) yansıtır.

Hash Table yerine dizileri kullanabilirdik. Fakat her ürünü ve fiyatını tek tek aramak istemediğimiz için hash table kullanıyoruz. Peki bu süreç nasıl işliyor? Hemen bir örnek yapalım. Örneğimiz bir kuru yemiş dükkanından gelecek.

![hash](https://raw.githubusercontent.com/Kodluyoruz/taskforce/main/veri-yapilari-algoritmalar/hash-table/figures/%C3%B6rnek-ilk-k%C4%B1s%C4%B1m.png)

Bu kısımda ilk olarak bulunan ürün sayımız kadar değeri olan bir Array oluşturduk.

Daha sonra hash fonksiyonundan ürünleri geçirerek index değerlerine ulaştık.

![hash](https://raw.githubusercontent.com/Kodluyoruz/taskforce/main/veri-yapilari-algoritmalar/hash-table/figures/%C3%B6rnek-ikinci-k%C4%B1s%C4%B1m.png)

Şifrelendiği için artık her badem keyi gönderildiğinde 85TL, fıstık keyi gönderildiğinde ise 69 sonucu verecektir.

Özetle, elimizde var olan verileri bir fonksiyondan geçirip indexliyoruz. Bu fonksiyona hash function, bu fonksiyon ile birleştiğimiz dizi yapısına ise Hash Table diyoruz.

## Hash Function 

Hash Function (Karma Fonksiyonu), karma fonksiyonu olabilmesi için bazı temel şartlar vardır.Bunlar;

* Gönderdiğimiz anahtarlar (keys) farklı olmasına rağmen bize aynı sonuçları veriyorsa bu bir hash function değildir.
* Fonksiyona gönderilen anahtarlar aynı fakat sonuç farklı ise hash function değildir.
* Hash Table için kullanılan dizinin boyutu verilen sonuçların sayısı kadar olmalı.

## Hash Collision

Hash Function farklı iki değerden aynı sayı üretilirse bu duruma Collison (çarpışma) denir. Bu olay istediğimiz bir durum değildir.

* Hash Function'lar bazen farklı durumlar için farklı sonuçlar üretemeyebilir. Örnek olarak araçları bir hash function dan geçirelim. Bu fonksiyonumuz son harflerine göre bir değer atıyor. Örneğin, motor ve tır için aynı değerleri ataması collision'a neden oluyor.
* Collision sorunuyla az karşılaşabilmek için kaliteli bir hash function olmalı. Bu sayede verimli bir Hash Table elde etmiş oluyoruz.
* Çarpışma sayısı arttıkça aradığımız şeyi bulma hızı azalır.

# Algoritma Analizi

## Algoritma Analizi Giriş

* Algoritma analizi, var olan kaynaklara göre en uygun algoritmayı seçmek için uygulanır. Peki algoritma analizi en iyi nasıl yapılır? Kulağa karmaşık geliyor ama çok basit. Programlama dillerinden ve donanımlardan bağımsız bir şekilde Algoritma analizi yapılmalıdır. Aksi taktirde en uygun sonuç alınamayabilir.
* Donanımlar veya programlama dilleri farklı cihazlarda aynı performansı vermeyebilir. Örnek verecek olursak, cep telefonları için uygulama tasarladığımızı varsayalım. Bu uygulamanın performansı Apple telefonlar için farklı, Android telefonlar için farklı, arasında donanım farklı olanlar için ayrı olacaktır. Donanım ve diller ile algoritma analizi pek sağlıklı değildir.
* Algoritma analizi, bir algoritmanın çalışabilmesi için gerekli koşulların sağlanıp sağlanamadığını gösteren bir parametredir.

## Ram Modeli

Bir algoritmayı farklı cihazlarda denemek bize pek fazla bir sonuç çıkarmıyordu. Çünkü kaynaklar değişebiliyordu. Bu probleme genel bir çözüm getirebilmek için hayalî bir cihaz düşünelim. Bu cihaz üzerinde bütün algoritmaları çalıştırdıktan sonra bize bir sonuç veriyor.

Bu hayalî cihaza RAM (Random Access Machine) diyoruz. Ram, algoritmalar arasındaki farkları belirlemek için kullanacağımız bir araç olacak.

Her işlemin birim zamanı var. Döngüler, kaç defa işlem yapıyorsa, (işlem sayısı * kaç kere tekrar edeceği) kadar birim zaman alır. Toplama, Çıkarma, and, or gibi aritmetik işlemler, 1 birim zaman alır.

## Time Complexity

Algoritmanın verimli olması için belli kurallar vardır.

Örnek: Raflara kitap yerleştirmek.
* Kitapları, gelişigüzel raflara dağıtırsak aradığımız kitabı daha fazla zamanda bulabiliriz. Aslında bu bir worst case'dir. Kitapları filtrelememiz gerekir. Kalın olanları bir rafa, ince olanları bir rafa, küçük boyutta olanları bir rafa koyduğumuz zaman aradığımız şeyi daha rahat bulabiliriz. Algoritma, en kötü senaryoya ne kadar hazırsa, bizi o kadar memnun edebilir.
* Algoritmalar için genellikle sık kullanılan average case'dir. Kitapların bölümüne göre kaç tane olduğunu biliyorsak average case kullanabiliriz. En büyük rafı miktarı fazla olana ayırabiliriz. Input yoksa average zordur.
* Bir diğer senaryomuz ise best case'dir. Beklediğimiz en iyi durum. Kitap örneğine devam edecek olursak, bütün kitapların ayrı raflarda olması, alfabeye göre sıralanması best case olarak ifade edilebilir. Çünkü aradığımızı rahatlıkla bulabiliyoruz.

## Big-O Notation

* İki farklı arama yöntemimiz var. Bunlardan A algoritması sayfa sayfa, B algoritması yarıya bölüp tarıyor. Sizce hangisi daha hızlı çalışır? Tabii ki B algoritması. Peki neden? Sürekli tarayacağı alan azalıyor. A algoritması daha işlemini bile yarılamamışken, B algoritması sonuca ulaşıyor.
* N tane işlem üzerinden big-o gösterimi yapalım. A algoritması input olarak kaç sayfa varsa o kadar işlem yapıyor. B algoritması ise sayfa sayısını azaltmak için alfabetik sıraya göre sağ ve sol olarak yarıya indiriyor.

![big-onotation](https://raw.githubusercontent.com/Kodluyoruz/taskforce/main/veri-yapilari-algoritmalar/big-o/figures/big-o.png)

