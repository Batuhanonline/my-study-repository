

// liste içerisindeki son elemana ulaşmak ve eleman eklemek

let lastChild = document.querySelector("ul#liste>li:last-child")
lastChild.innerHTML = "Son öğe değişti"


let firstChild = document.querySelector("ul#liste>li:first-child")
firstChild.innerHTML = "İlk öğe değişti"

// yeni öğe ekleme

let ulDOM = document.querySelector("ul#liste")
let liDOM = document.createElement('li')

liDOM.innerHTML = "Kendi oluşturduğumuz öğe"

// ulDOM.append(liDOM)   // sona ekleme
ulDOM.prepend(liDOM)