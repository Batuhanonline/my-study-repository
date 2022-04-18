



//S5 Function

function hello(firtName) {
    console.log(`Merhaba ${firtName}`)
}

hello("JavaScript")


// S6 Arrow Function

const helloFuncV1 = (firtName) => {console.log(`Merhaba ${firtName}`)}

helloFuncV1("helloFuncV1")


const helloFuncV2 = firtName => console.log(`Merhaba ${firtName}`) // Bir parametre bir dönüş

helloFuncV2("helloFuncV2")


const helloFuncV3 = (firtName, lastName) =>  // İki parametre tek dönüş
console.log(`Merhaba ${firtName} ${lastName}`)

helloFuncV3("helloFuncV3","last")


const helloFuncV4 = (firtName, lastName) => {   //Birden fazla parametre ve dönüş
    let info = `Merhaba ${firtName} ${lastName}`
    console.log(info)
    return info
}

helloFuncV4("helloFuncV4","last")