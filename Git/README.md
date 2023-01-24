# Git Nedir?

Klasik cevap olarak bir **versiyon kontrol sistemidir**. Peki versiyon kontrol sistemi nedir?

Bir döküman (yazılım projesi, ofis belgesi vb.) üzerinde yaptığınız degişiklikleri adım adım izleyen, istediğinizde kayıt eden ve isterseniz bunu internet üzerindeki bir bilgisayarda veya yerel bir cihazda (respository / repo / depo) saklamanızı ve yönetmenizi sağlayan bir sistemdir.

Kaynak kod yönetim sistemi de aynı ifadeye çıkar.

GIT' in avantajları nelerdir?

* Birden fazla yerde (dağıtık olarak) dosyalarınızı ve versiyon kontrol bilgilerinizi depolayabilirsiniz. Böylelikle cihaz bağımsız olarak dosyalarınıza erişebilirsiniz.

* "commit" yaparak SnapShot (anlık görüntü) özelliği ile istediğiniz zaman proje veya dosyaların o anki halini kayıt altına alabilirsiniz. Böylelikle ileride bir hata ile karşılaşırsanız herhangi bir zamandaki herhangi bir versiyona dönüş yapabilirsiniz.

* SnapShot alındıktan sonra değişiklik yapılan dosyaları görebilirsiniz.

* Takımların aynı projede beraber çalışmasına imkan verir. Kim neyi düzenledi? Ne ekledi? Ne çıkarttı? Son değişiklik ne zaman yapıldı? gibi bilgilere erişebilirsiniz. Bu sayede topluluk ile proje geliştirme süreçlerini kolaylaştırabilirisiniz.

* Projede verisyonlanmasını istemediğiniz dosyaları belirtebilirsiniz. (node_modules, .mp4, .log, .env gibi)

# Peki nedir bu GitHub?

GIT yerel depolarınızı uzak bilgisayara hostlamanızı sağlar. Çeşitli kullanım tipleri vardır. GitHub daha çok yazılımcılar için bir çeşit kod kütüphanesi ve sosyal medya ortamıdır. Daha farklı amaçlara daha farklı depolama servisleride vardır.

## GitLab

Farklı olarak firmalara GitLab'ı kendi sunucularına kurma imkanı verildiği için genelde kurumsal tarafta kullanılır. GitLab ile firmalar kendi içerisinde GIT hizmetlerinden faydalanabilir.

## BitBucked

Genelde kişisel kullanıma yöneliktir. GitHub tarafındaki açık kaynak projeler ve sosyal medya ortamı burada gelişmemiştir.

# GIT Temel Komutlar

![gitcommand](https://raw.githubusercontent.com/Kodluyoruz/taskforce/main/git/git-bash-ile-git-temel-komutlari/figures/3-GitHub-cheat-sheet-graphic.jpg)

* ## git init

Proje klasörü içersindeyken klasörün boş bir git deposu oluşturmak için kullanılır.

```
$ git init
```

* ## git add

Yeni eklenen veya üzerinde değişiklik yapılan dosyaları **staged** ortamına göndermek için kullanılır.

```
$ git add <dosya_isim veya klasor_isim>
```

Tek seferde staged ortamına ekleme yapmak için:

```
$ git add .   ya da 
$ git add *
```

* ## git commit 

GIT’in bir çok konfigürasyon ve ayarı vardır, bunlardan ikisi user.name ve user.email olanıdır. Bu ayarları yapılandırmak için aşağıdaki komutları kullanırız. GIT'i ilk kurduğumuzda genellikle aldığımız ilk hata bu konfigrasyon ayarlarını yapmadığımız için gelir. 

```
$ git config --global user.name "Name Surname"
$ git config --global user.email "test@email.com"
```

Bu ayarların bütününü görüntelemek için ise:

```
$ git config --list
```


* ## git rm

Staged ortamına eklenmiş bir dosyanın takibinin bırakılması yani untracked (izlenmeyen) hale getirilmesi sağlayan komuttur.

``` 
$ git rm --cached <dosya_isim veya klasor_isim>
```

Dosyayı klasörden silmek istiyorsak:


``` 
$ git rm <dosya_isim veya klasor_isim>
```

* ## git status

Üzerinde çalışılan projenin o anki durumu hakkında bilgi verir. Yapılan değişiklikler, eklenen ve silinen dosyalar gibi bilgiler listelenir.

```
$ git status
```

* ## git commit

Commit, staged ortamına alınan dosyaların Local Repository’e gönderilmesidir. En iyi uygulama yöntemi her kayıt sırasında yapılan değişiklikleri açıklayıcı bir mesaj eklemektir. Ayrıca her commit benzersiz bir kimliğe (unique ID) sahip olur. Bu sayede eski bir commit'e geri dönebilirsiniz ve herhangi bir kayıp yaşama ihtimaliniz kalmaz.

``` 
$ git commit -m "commit mesajı"
```

* ## git log

Projedeki commit geçmişini görüntülememizi sağlar. Bütün commit'ler, id'si, yazarı, tarihi ve mesajı ile beraber listelenir.

```
$ git log
```

* ## git branch

Local veya remote repository üzerinde yeni bir branch (dal) eklemek, silmek veya listelemek için kullanılır.

Projenize yeni bir branch eklemek için;

```
$ git branch <branch_name>
```

Tüm uzak ve yerel branch'lari listelemek için;

```
$ git branch -a
```

Bir branch'ı silmek için;

```
$ git branch -d <branch_name>
```

* ## git checkout

Branch’ler arası veya commit'ler arası geçiş yapmak istediğimizde kullanılır.

Mevcutta var olan branch'a geçiş yapmak için;

```
$ git checkout <branch_name>
```

Yeni bir branch oluşturup, bu branch'a geçiş yapmak için;

```
$ git checkout -b <branch_name>
```

Commitler arası geçiş yapmak için: (Eski bir versiyona dönmek istediğimiz zaman)

```
$ git checkout <commit_ID>
```

* ## git merge

Başka bir branch'da olan değişiklikleri, bulunduğumuz branch ile birleştirmek istediğimizde kullanılır.

```
$ git merge <branch_name>
```

* ## git clone

Mevcut bir Remote Repository'de bulunan dosyaların bilgisayarımızda bir kopyasının oluşturulmasını sağlar.

```
$ git clone <remote_URL>
```

* ## git push

Projemizde aldığımız commit'leri, remote repository'e gönderir.

```
$ git push origin master
```

Burada bahsi geçen **origin** remote repository’nin kök dizinini belirtir ve sabit bir isimdir. **master** ise sizin çalıştığınız branch (dal)’ı belirtir.

Henüz remote repository’niz yoksa aşağıdaki komut ile local deponuzu uzak sunucudaki depoya bağlayabilirsiniz.

```
$ git remote add origin http://uzak_deponun_adresi.git
```

* ## git diff

Repository üzerinde yapılan değişikliklerden sonra dosyalar arasında oluşan farklılıkları göterir.

Çalışma dizini ile repository (HEAD) arasındaki farklılıkları görmek için;

```
$ git diff HEAD
```

İki commit arasındaki farklılıkları görmek için;

```
$ git diff <commit_id_1>..<commit_id_2>
```

Çalışma dizini ve staged ortamı arasındaki farkları görmek için;

```
$ git diff --staged
```

# .gitignore Dosyası Nedir? Nasıl Kullanırız?

**.gitignore** dosyası projenin ana dizinine oluşturulan bir düz metin dosyasıdır. Projemizde GIT deposunun göz ardı etmesini istediğimiz dosyaları ekleyebiliyoruz. 

## Ne tür dosyaları eklememiz gerekiyor?

* Paket yöneticisinden indirilen bağımlılıklar
* image ve video dosyalarınız(dosya boyutları çok fazla olabilir)
* IDE eklentileri
* Sadece kendi çalışma alanınızda olması gereken başkaları tarafından görülmemesi gereken dosyalarınız (veritabanınıza ilişkin konfigürasyonlar)
* API anahtarları, kimlik bilgileri veya hassas bilgiler içeren dosyalar(.env)
* Çalışma dizinizdeki geçici dosyalar
* Log dosyaları
* Yararsız sistem dosyaları
* Veya herhangi bir dosyanız da olabilir

## Nasıl oluşturulur?

Reponuzu oluştururken verilen seçeneklerde add gitignore file dosyasına tıklayarak reponuzla beraber oluşturabilirsiniz. Aynı şekilde editörünüzde **.gitignore** şeklinde de oluşturabilirsiniz.

## Nasıl kullanılır? 

| Pattern | Örnekler |
| :----:  | :----:    |
| name | /name.log - /name/file.txt - /lib/name.log |
|name/ | /name/file.txt - /name/log/name.log |
|name.file| /name.file - /lib/name.file |
|/name.file| /name.file |
| lib/name.file | /lib/name.file|
|**/lib/name.file |/lib/name.file - /test/lib/name.file|
|**/name|/name/log.file - /lib/name/log.file - /name/lib/log.file|
|/lib/**/name|/lib/name/log.file - /lib/test/name/log.file - /lib/test/ver1/name/log.file|
|*.file|/name.file - /lib/name.file|
|*name/|/lastname/log.file - /firstname/log.file|
|name?.file|	/names.file - /name1.file|
|name[a-z].file|/names.file - /nameb.file|
|*.file|/name.file - /lib/name.file|
|name/ !name/secret.log|/name/file.txt - /name/log/name.log - no match: /name/secret.log|


<br>
<br>
<br>

# İleri Seviye Git Kullanımı

- Bir önceki commitimize yeni değişiklikler eklememiz gerektiği durumlarda 
``` 
git commit --amend
```
komutunu kullanabilmekteyiz. Bu komut çalıştığında yeni eklemiş oldumuz değişiklikler bir önceki attığımız commitimize eklenmiş olup commit mesajını değiştirebilmekteyiz.

- Commit ederken yanlış yaptığımız durumlarda commiti silebilmekteyiz. Adım adım gider isek ilk olarak commitimizin logID sini almamız gerekmektedir. Logumuzu nasıl aldığımızı zaten öğrenmiştik ya peki son attığımız commitlerin kaç tanesini getirmesini nasıl belirtebiliriz.
```
git log -n 1
```
Buradan aldığımız logID ile beraber;
```
git revert logID
```
şeklinde girdiğimizde git seçili commit değişiklerini geri alan bir commit yaratmaktadır. Karşımıza çıkmakta olan mesaj ekranına ise seçili commitin neden silindiğini yazabiliriz. Yazmak istemesek bile git bizim yerimize commitin silindiğine dailr bir commit mesajı oluşturmaktadır.

<br>

- Bazı durumlarda sildiğimiz commitler için yeni commit atmak istemeyiz. Bu gibi durumlarda kullanabileceğimiz bit git komutu bulunmaktadır fakat bu komutu kullanırken dikkat edilmesi gerekmektedir. Nu komut seçili commite kadar olan tüm commitleri ortadan kaldırmaktadır. 
```
git reset --hard logID
``` 

- İki commit arasındaki değişiklikleri gösteren komut;
```
git diff eskiLogID..yeniLogID
```
komut çalıştığında iki commit arasındaki farklılıklar gösterilecektir. Aynı şekilde bu komutu tek bir dosya içinde kullanabiliriz. 
```
git diff eskiLogID..yeniLogID dosyaAdi
```
komutu çalıştığında dosyada oluşmuş iki commit arasındaki farklılıklar çıktı vermektedir.

## Branchler ile çalışmak

Proje üzerinde yaptığımız tüm değişikleri "master" branchi ile commitlemek daha karmaşık bir yapıya bizi götürecektir. Bunun için master brechinin yanına ek olarak ilgili konu üzerinde oluşturulmuş bir branch üzerinde çalışıp en son master branchinde birleştirmeliyiz.

Mevcutta oluşturulmuş olan branchleri listeleme:
```
git branch
```

Yeni bir branch oluştırma:
```
git branch isim
```

Oluşturulmuş olup branche geçiş yapma:
```
git checkout isim
```

Yeni bir branch oluşturup direk o branche geçiş yapmanında kısayolunu yapmadan olmazdı:
```
git checkout -b isim
```
Silmek istediğimiz branchleri ise şu şekilde silebilmekteyiz:
```
git branch -D isim
```

- Farklı branchler arasında çalışıldığında branch farklılıkları birbirleri ile eşitlenene kadar birbirlerinden etkilenmezler.

## Stash kullanımı
Bir önceki committen bu yana yaptığınız tüm değişikleri commit etmeden saklamaya yarayan komuttur. Örnek vermek gerekir ise biz commitimizi attktan sonra yeni bir taska geçiş yaptık ve bu taskın belli bir yerine kadar geldik. Bir önceki taskta yaptığımız bir hata olduğunu öğrendik ve hemen düzeltmemiz gerekmektedir. Yarısına kadar yazmış olduğumuz taskı 
```
git stash
``` 
kullanarak geri döndürülebilir şekilde silebiliriz ve vir önceki commitimizi düzenleyebiliriz.

Bu stashe attğımız değişiklikleri ise

```
git stash list
```

komutu ile listeleyebilriz. Yani buradan anlıyoruzki stashin içerisine istediğimiz kadar atabiliriz.
Listenin içerisini temizlemek istediğimizde ise:
```
git stash clear
```
komutu kullanabiliriz.

Peki bu stashe attğımız değişiklikleri nasıl geri alabiliriz? Bunun iki yolu bulunmaktadır.

- Stashe en son kaydettiğimiz değişiklikleri geri getirir ve listeden siler;
```
git stash pop
```

- Spesifik bir stashi geri getirmek istediğimizde ise;
```
git stash apply stash@{stashNo}
```
kullanabiliriz. Fakat dikkat etmemiz gereken başka bir şeyde var. Apply ile geri getirdiğimiz stash, stash listesinden silinmez.

## Merge kullanımı
 - Farklı branchler arasında geliştirme yaptığımızda genellikle en son branchler master brancginde birleştirilmektedir. Bu birleştirmenin birden fazla yolu olmasıyla beraber merge kullanımı şu şekilde olmaktadır;
  ```
  git merge branchIsim
  ```
merge etmiş olduğumuz branch de bulunan tüm commitleri o an olduğumuz branche aktarmaktadır. 

Çoğu zaman bu commitleri toplu şekilde birleştirme yapmaktayız. Bunun yolu ise;
  ```
  git merge -squash branchIsim
  ```

Bu komut ile merge etmiş olduğumuz branch içerisindeki tüm değişiklikleri birleştirip bizim commit etmemiz için bekletti. Yani tüm commitler ayrı ayrı gelmek yerine tek bir commit ile birleştirmiş olduk.

## Rebase kullanımı

- Rebase kullanmak, merge ile birleştirmeden farklı olarak sanki master branchinde çalışılmış gibi bir birleştirme yapmaktadır. Kullanımı ise şötledir;

```
git rebase branchIsim
```

## Conflict Oluşması

- Bazen iki farklı branch arasında aynı aynı yerde farklı değişiklikler oluşabilmektedir. Bu durumlarda git çoğu zaman kendi algoritmalarını kullanarak bir karara bağlamaktadır. Fakat bir karara bağlamadığı zamanlarda merge işlemi sonrasında hangi kodun duracağına karar verip commit işlemi gerçekleştirmelidir.

- Bazen conflict oluştuğu durumlarda karar veremeyebiliriz ya da karar verecek zamanımız olmayabilir. Bu gibi durumlarda ise kodu merge etmeden önceki hale getirmek isteyebiliriz. Şu şekide kullanılmaktadır;
```
git merge --abort
```