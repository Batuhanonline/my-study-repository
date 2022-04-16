

let a = 10
let b = "10"
user = "guest"
let deger


// == Eşitse
deger = a == b  // true

// === Hem değeri hem türü eşitse
deger = a === b // false

// != Eşit değilse
deger = a != b  // false
deger = a !== b // true


b = 10
// < Küçükse 
deger = a < b   // false

// <= Küçük veya eşitse
deger = a <= b  // true

// > Büyükse
deger = a > b   // false

// >= Büyük veya eşitse
deger = a >= b  // true

// && ve
deger = a >= 10 && user != "guest"  // true
deger = a >= 10 && user == "guest"  // false

// || veya
deger = a >= 10 || user != "guest"  // true
deger = a >= 10 || user == "guest"  // true

// ! değil
deger = !a >= 10 || user == "guest"  // false


