


let fullName = prompt("Lütfen adınızı giriniz: ")

let title = document.querySelector(".baslik")
title.innerHTML = `${title.innerHTML} <small style= "color:red">${fullName}</small>
`