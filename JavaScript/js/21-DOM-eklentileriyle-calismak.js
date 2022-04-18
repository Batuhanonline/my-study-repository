

let greeting = document.querySelector("#baslik")
greeting.addEventListener("click", domClick)

function domClick() {
    console.log("tıklandı")
    console.log(this.innerHTML = "Tıklandığı için bilgi değişti")
    this.style.color == "red" ? this.style.color = "black" : this.style.color = "red" 
    
}