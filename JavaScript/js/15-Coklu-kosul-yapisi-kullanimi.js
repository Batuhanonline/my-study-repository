

let username = prompt("Kullanıcı adınızı giriniz:")
let age = prompt("Yaşınız:")
let info = document.querySelector("h2#info")


if( username && age >= 18 ){
    info.innerHTML = "Ehlyet alabilirsiniz"
} else if(!username){
    info.innerHTML = "Kullanıcı adı bilginiz yok"
} else if(!(age >= 18)){
    info.innerHTML = "Yaş bilginiz yok ya da 18 yaşından küçüksünüz"
}