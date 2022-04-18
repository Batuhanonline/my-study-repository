

function hello() {
    console.log('Merhaba')
    helloWorld()
}

function helloWorld() {
    console.log("Hello World");
}

hello()

//parametre tanımlama
function printHello(name) {
    console.log("Merhaba" + name)
}

printHello("Batuhan")


// Fonksiyon Kapsamı
// JavaScript'de fonksiyon içinde tanımlamış olduğunuz değişkene fonksiyon dışındaki herhangi bir yerden erişemezsiniz. Çünkü o değişken tanımlandığı fonksiyonun kapsamındadır. Bu sebeple değişkenimiz o fonksiyon içinde kullanılan bir lokal değişkendir. Fakat tanımlanan fonksiyon tanımlandığı kapsamdaki diğer değişkenlere erişebilir. Yani fonksiyon kendi dışında tanımlanan fakat aynı kapsamda bulunduğu global değişkenlere de erişebilir. Aşağıda örneğini görerek bunu çok daha iyi anlayacağız:

//global değişkenleri tanımlıyoruz
var sayi1 = 5;
var sayi2 = 2;   
function addition(){
    var sayi3 = 3;             //sayi3 adında lokal bir değişken tanımlıyoruz
    return sayi1+sayi2+sayi3;  //Fonksiyon içinde global ve local değişkenleri kullanıyoruz
}

function multiplication(){
    return sayi1 * sayi3  
//Burada hata alıyoruz: bunun nedeni başka bir fonksiyonun içinde tanımlı olan sayi3 lokal değişkenini kapsamı dışında 
//kullanmaya çalışmamız. sayi1 değişkeni ise global olduğundan burada kullanılabilir
}


// Callback Fonksiyonlar ve Asenkron Çalışma
// Senkron dediğimiz kavram şunu ifade etmektedir: kodumuz yukarıdan aşağı doğru sırayla işlenir ve bir satırdaki işlem bitmeden bir sonraki satıra geçilmez. Asenkron yapıda ise fonksiyonların birbirlerini beklemelerine gerek yoktur. Uzun zaman ala veya farklı görevleri olan fonksiyonlar aynı anda çalışabilir. JavaScript asenkron yapıdaki bir programlama dilidir. Bunu anlamak için içinde setTimeout(parameter1, parameter2) fonksiyonunu kullanacağız. Bu fonksiyon gördüğünüz gibi iki parametre ile kullanılacak: ilk parametre çalışması istenen fonksiyonu, ikinci parametre ise ne kadar süre sonra çalışması istendiğini ifade ediyor. Örneğin 1000 yazılarak 1000 milisaniye yani 1 saniye gecikme sağlanıyor.

function printScreen1 (){
    console.log("İlk ekran çıktısı");
}

 function printScreen2 (){
   setTimeout(function(){
console.log("İkinci ekran çıktısı")  
}, 3000);
}

function printScreen3 (){
    console.log("Üçüncü ekran çıktısı");
}
printScreen1();
printScreen2();
printScreen3();


//Çıktılar
// İlk ekran çıktısı
// Üçüncü ekran çıktısı
// İkinci ekran çıktısı



//Recursion
// Direkt örnek vererek açıklamak gerekirse, yapmamız gereken bir task var diyelim ve biz bu task'i birden fazla parçaya ayırıp daha basit halde yazmak istersek veya bu task'ı aksiyon alacak bir fonksiyona ve bu task'i daha basit bir task'e dönüştürmek istersek veya belirli bir data yapısı ile ilgileniyorsak, recursion bu noktada bize yardımı dokunabilecek bir programlama pattern'idir diyebiliriz.

// Bir fonksiyonu çağırdığımız zaman o fonksiyon bir çok fonksiyonu daha çalıştırabilir. Kısaca bir fonksiyon kendisini tekrar çağırıyor ise biz buna recursion diyoruz.

// bir fonksiyon yazalım bu fonksiyon sayının kuvvetini alsın.
// pow(2,2) = 4
// pow(2,3) = 8
// pow(2,4) = 16 değerlerini verecek şekilde diyelim.

// 1.ci yol (recursion patterni ile düşünmeden)
function pow(x, n) {
    let result = 1;
  
    for (let i = 0; i < n; i++) {
      result *= x;
    }
  
    return result;
  }
  
  alert(pow(2, 3)); // 8


  // recursion ile
  function pow(x, n) {
    if (n == 1) {
      return x;
    } else {
      return x * pow(x, n - 1);
    }
  }
  
  alert(pow(2, 3)); // 8


  //Aşağıdaki soruyu recursion ile arrow function ve if else clause kullanarak yeniden nasıl yazarız
function pow(x, n) {
    return n == 1 ? x : x * pow(x, n - 1);
  }


function pow(x, n) {
    if (n == 1) {
        return x    
    } else return x * pow(x, n - 1)
}

// Nested Functions
// Nested Functions ( İç içe fonksiyonlar ) JavaScript'te yaygın olarak kullandığımız bir yapı. Bir Fonksiyon içerisinde başka bir fonksiyonu tanımladığımız zaman buna nested functions yapısı diyoruz aslında.

function programDetayi(bootcamp, organizasyon) {
    // nested yardımcı fonk
    const tumProgram = () => bootcamp + ' ' + organizasyon;
  
    console.log('Basladi, ' + tumProgram());
    consol.log('Bitti, ' + tumProgram());
}

