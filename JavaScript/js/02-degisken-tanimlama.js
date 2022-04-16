



// var ile değişken tanımlama
//var ile tanımlanan değişkenler global scope veya function scope'tur. Global scope'ta tanımlanan değişkenlere her yerden ulaşılabilir. Function içerisinde tanımlanan değişkenlere ise tanımlı olduğu fonksiyonda ulaşılabilir.

var serverName_var = "batuhanguven.xyz"


//let ile boş veri tanımlamak

let serverName_let

// let ile değişkene bilgi atamak

serverName_let = "batuhanguven.xyz"

// let ile değişkene bilgi atayarak tanımlama yapmak

let password = "1234"

// birleştirme veya ekleme işlemleri

password = password + "5" //Değişkenin sonuna değer ekledik
password = "0" + password //Değişkenin başına değer ekledik
password += "6" //Değişkenin sonuna değer ekledik

//const ile değişken tanımlama

// const SERVER_PASSWORD
//const ile boş değer tanımlayamayız

const SERVER_PASSWORD = "dssdf65s6d1f4"

//SERVER_PASSWORD = "1234"
//const ile tanımladığımız değişkenleri daha sonradan değiştiremeyiz


//const değişmesini istemedğimiz ya da değişmemesi gereken değerleri atamamız gereken bir değişken türüdür.
//let ise değişkenimin değeri daha sonradan değiştirelecek ise atanası gerekir.
//var yerine let kullanabiliriz.