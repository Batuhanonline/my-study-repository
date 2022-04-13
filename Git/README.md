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
