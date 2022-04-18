


// Temel Kurallar
// 1- Fonksiyon bir veya birden fazla parametre alabilir veya hiç almayabilir
// 2- Fonksiyon dışarı bilgi gönderebilir ya da göndermeyebilir
// 3- Mümkünse fonksiyonun bağımlılıklarını azaltmak gerekir



let firstName = "Batuhan"


function greetings(firstName="") { // default parametre
    //console.log(`Merhaba ${firstName ? firstName : ""}`)
    console.log(`Merhaba ${firstName}`)
}


console.log(firstName)
greetings()
greetings("Parametre")


function greetings2(firstName, lastName){
    let info = `Merhaba ${firstName} ${lastName}`
    return info
}

let info = greetings2("Batuhan", "Güven")
console.log(info)



//Örnek

function domIdWriteInfo(id, info){
    let domObject = document.querySelector(`#${id}`)
    domObject.innerHTML = info
}


domIdWriteInfo('info', greetings2("Batuhan", "Güven"))