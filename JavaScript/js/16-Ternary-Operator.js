

// eğer kullanıcı adın varsa yazdır yoksa bilgi yok yazdır

let username = prompt("Kullanıcı adınızı giriniz:")

let info = document.querySelector("h2#info")


// ternary kullanımı:
// koşul ? doğruysa : yanlışsa

info.innerHTML = `${username ? username : "Kullanıcı bilgisi yok"}`


// Zincirleme ternary kullanımı:

let money = 40

const canBuy = (money < 17) ? "Satın alamazsın" : (money > 30) ? "Satın alabilirsin." : "Para miktarını girmen gerekmektedir."

console.log(canBuy)