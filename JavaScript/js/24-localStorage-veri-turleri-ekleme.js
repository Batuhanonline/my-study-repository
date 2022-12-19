
let user = {
    userName: "batuhanguven",
    isActive: true
}

localStorage.setItem('userInfo', JSON.stringify(user) ) // stringify -> Bilgilerin objeden string değerlere dönüştürme

let userInfo = JSON.parse(localStorage.getItem('userInfo'))