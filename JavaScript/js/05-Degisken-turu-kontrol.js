

// veri türünü öğrenmek    typeof()

let price = 11
let stringPrice = "11"
let hasPrice = true

console.log(typeof(price))  // Number 
console.log(typeof(stringPrice))   // String
console.log(typeof(hasPrice))  // Boolean

// string verileri int ve float türüne dönüştürmek

let number1 = "11"
number1 = parseInt(number1)
console.log(number1, typeof(number1))   // 11 number

let number2 = "22px"
number2 = parseInt(number2)
console.log(number2, typeof(number2))   //  22 number


let number3 = "33"
number3 = Number(number3)
console.log(number3, typeof(number3))   //  33 number 


let number4 = "44px"
number4 = parseFloat(number4)
console.log(number4, typeof(number4))   //   44 number


// number veri tipinden string'e dönüştürmek

let number5 = 55    
number5 = number5.toString()
console.log(number5, typeof(number5))  // 55 string
