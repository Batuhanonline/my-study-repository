

let greeting = document.querySelector("#greeting")

greeting.classList.add("title") // tekli class ekleme
greeting.classList.add("firstClass", "secondClass", "thirdClass")   // çoklu class ekleme

greeting.classList.remove("firstClass", "secondClass", "thirdClass")    // çoklu class silme

greeting.classList.replace("title", "başlik") // bir bşlığı değiştirme



console.log(greeting.classList)