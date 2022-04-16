
//getElement

let title = document.getElementById('title')
title.innerHTML = "Değişen Bilgi"


// querySelector

let link = document.querySelector('ul#list>li>a')  // id değerinide yzabiliriz
link.innerHTML += " değişti"
link.style.color = "red"
link.classList.add('btn')