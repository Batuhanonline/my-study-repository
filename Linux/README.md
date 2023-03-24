# Linux terminal nedir?

Günümüzün terminalleri, genellikle bir GUI üzerinde çalışan eski fiziksel terminallerin yazılım temsilleridir. Kullanıcıların komut yazabileceği ve metin yazdırabileceği bir arayüz sağlar. Linux sunucunuza SSH yaptığınızda, yerel bilgisayarınızda çalıştırdığınız ve komutlar yazdığınız program bir terminaldir.

# Terminal ne için kullanılır?

Bir terminal kullanmak, bir dizinde gezinmek veya bir dosyayı kopyalamak gibi şeyleri yapmak için bilgisayarımıza basit metin komutları göndermemize ve daha birçok karmaşık otomasyon ve programlama becerisinin temelini oluşturmamıza olanak tanır.

# Linux'ta neden terminal kullanıyoruz?

Terminal, bir bilgisayarın gerçek gücüne herhangi bir grafik arayüzden daha iyi erişmek için verimli bir arayüz sağlar. Bir terminali açarken size bir kabuk sunulur. Mac ve Linux'ta bu kabuk Bash(Bourne Again Shell)'dir, ancak diğer kabuklar da kullanılabilir.

# GUI vs CLI

* Komut satırı, bir süre deneyimden sonra grafik arayüzünden daha kolaydır.
* Otomatikleşme / Programlanabilirlik
* Hız
* Verimlilik

Kullanıcı :left_right_arrow: Shell :left_right_arrow: İşletim Sistemi :left_right_arrow: Donanım

# Temel kavramlar

* ~ : kullanıcı dizini => home directory
* / : kök dizini => root directory
* #: yorum satırı
* . : bulunduğumuz dizini ifade eder

# Temel Komutlar

* # man(manual)

kullanımı:
```bash
man komut_isim
```

man komutu ile yazdığımız komutun dokümantasyonuna girebiliriz.

* # pwd(present working directory)

kullanımı:
```
pwd
/home/
```
pwd komutu ile çalıştığınız dizinin çıktısını alabilirsiniz.

* # clear
 kullanımı: 
 ```
 clear
 ```

 clear komutu terminal ekranını temizler.

 * # cd(change directory)
 kullanımı:

 ```
 cd <gitmek_istediğim_dizin>
 ```

 cd ile dizin değişikliği yapabiliriz.
  
```
cd
```

tek başına yazdığımız zaman kullanıcı dizinine gideriz.

```
cd -
```
cd - ile önceki dizinimize dönüp terminale nerde olduğumuzu yazdırırız.

```
cd ..
```
bir üst dizine gider.

* # ls(list)

kullanımı: 

```
ls
```

ls komutu ile bulunduğunuz dizindeki klasör ve dosyaları sıralar windows da dir komutuna benzerdir.

```
ls -a
```
-a ve --all anahtar kelimeleri ile dizindeki gizlenmiş dosyalar ile birlikte bütün dosyaları sıralar.

```
ls -l
```
-l anahtar kelimesi ile dizindeki dosya ve klasörler açıklayıcı bir format ile sıralanır.

```
ls -t
```
-t anahtar kelimesi ile dizindeki dosya ve klasörler değitirilme tarihlerine göre sıralanır.

```
ls -S
```
-S anahtar kelimesi ile dizindeki dosya ve klasörlerin boyutlarına göre sıralar.

```
ls -r 
```
-r anahtar kelimesi ile sıralamayı tersine çevirebiliriz.

```
ls -hl
```
-h ve --human-readable anahtar kelimeleri ile dosya boyutlarını daha okunabilir birime çeviriyor.

