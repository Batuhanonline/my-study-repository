

// Number veri türünde değişken tanımlama

let price = 100
let tax = 0.18
let priceTax = price * tax

console.log("Fiyat: ", price, "KDV: ", tax, "KDV Tutarı: ", priceTax);

// arttırma azaltma işlemleri

let counter = 320

counter = counter + 1 //uzun yöntem
counter += 1 //daha kısa yöntem
counter++ //en kısa yöntem

counter-- // 1 azaltma

counter *= 10 // 10 ile çarp

// İşlem önceliği temel dört işlem kuralları, JavaScript içinde geçerlidir.

//mod(kalan) alma %:
//sayı çift mi tek mi?

console.log(18 % 2) //Kalan 0 olduğu için çift sayı
console.log(19 % 2) //Kalan 1 olduğu için tek sayı

//8 ürün alan bir koliye tüm ürünler sığıyor mu?

console.log("Dışarıda kalan ürünler: ", 18 % 8)

// üs alma **

const ikininkaresi = 2 ** 2

// aşağı yuvarlama işlemi    Math.floor

let down = Math.floor(1.7)  //1 çıktısı verir

// yukarı yuvarlama    Math.ceil

let up = Math.ceil(1.2)   // 2 çıktısı verir

// yakına yuvarlama işlemi     Math.round

let round = Math.round(1.4)   // 1 çıktısını verir




// Veri tipini değitirme     Number

let stringNumber = "15"
let newNumber = Number(stringNumber)

