
let user = {
    userName: "batuhanguven",
    isActive: true
}

localStorage.setItem('userInfo', JSON.stringify(user) )

let userInfo = JSON.parse(localStorage.getItem('userInfo'))