

let email = "batuhan_guvenn@outlook.com"
let firstName = "batuhan"
let lastName = "GÜVEN"



// string karakter sayısı    length

console.log(email.length)


// İlk karakteri bulmak

console.log(firstName[0])
console.log(firstName.charAt(0))

// Büyük / küçük harf

firstName = firstName.toUpperCase()  // BÜYÜK
console.log(firstName)

firstName = firstName.toLowerCase()  // küçük
console.log(firstName)


// String içinde istediğimiz bilgiyi aramak ve yerini bulmak       search

console.log(email.search("@"))   // karakterin bulunduğu index


console.log(email.search("olmayan"))   // -1



// belli bir yere kadar al    slice

let DOMAIN = email.slice( email.search("@") + 1 )
console.log(DOMAIN) //outlook.com

DOMAIN = DOMAIN.slice( 0, DOMAIN.indexOf('.') )
console.log(DOMAIN) //outlook



// bilgiyi değiştir     replace

email = email.replace('outlook.com', 'gmail.com')
console.log(email)  // batuhan_guvenn@gmail.com


// istediğim bilgi var mı?    includes
email.includes('@') // true
email.includes('sadsd') // false



// istediğim bilgiyle başladı mı bitti mi?      startsWith,  endsWith

email.startsWith('batuhan_guvenn')
email.endsWith('gmail.com')


// İlk harflerini büyük yapmak

let fullName = `${firstName[0].toUpperCase}${firstName.slice(1).toLowerCase} ${lastName[0].toUpperCase}${lastName.slice(1).toLowerCase}`

console.log(fullName)   // Batuhan Güven