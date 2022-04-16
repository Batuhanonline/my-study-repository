

let username = prompt("Kullanıcı adınızı giriniz: ")
// eğer kullanıcı bilgisi varsa ekrana ismini yazdır

if (username) {
    console.log(`Kullanıcı bilginiz: ${username}`);
} else {
    console.log("Bilgi yok")
}

// Örnek Tahmin Oyunu: Bilgisayar tarafından 10 'a kadar tutulmuş olan rastgele sayıyı bulalım:

var randomSayi = Math.floor(Math.random() * 10);
//Girdiğimiz sayıyı aklında tutması için prompt değişkene atanır
var tahmin = prompt("Bir sayı gir ve rastgele sayıyı bulmaya çalış!");
if (tahmin === randomSayi && tahmin != null) alert("Bildin!!!");
else if (tahmin == "") alert("Boş giriş yaptınız!");
else if (tahmin == null) alert("Giriş yapmaktan vazgeçtiniz!");
else {
  alert("Bir daha denee :(, Random sayi: " + randomSayi);
}