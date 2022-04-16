

let username = "batuhan"
const DOMAIN = "batuhanguven.xyz"

let email = username + "@" + DOMAIN

console.log("Merhaba", username, "email adresin:", email)


let info = `Merhaba ${username} email adresin: ${email}

mail adresinin uzunluğu: ${email.length}
borcunuz: ${(2 + 3) * 10}
günün saat bilgisi: ${new Date().getHours()}
`

console.log(info)