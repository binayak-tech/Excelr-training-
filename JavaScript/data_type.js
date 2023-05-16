// VARIABLES

var variableName = 124; // var - this way of creating variable used before ES6 is introduced.
let varName = 843; // let - unlike var, let is new and it cannot be redeclared.
const variable_name = 55.23; // const - it should be assigned while declaration and its value cannot be changed, const variable cannot be redeclared.
var_name = 234; // we can create a variable without using any keyword this takes var as a default keyword. This is rarely used.


// DATA TYPES
// javaScript is a Dynamically typed language, the data type of a variable is read during the runtime
// a variable in JavaScript can change its data type on the go.
// There many different data types in javaScript [typeof is used to get the type of the variable]


// 1. NUMBERR 

let num = 10;     // integer
let pi = 3.1415;  // floating-point

let newNum = "kd"/27;  // NaN (not a number)


// 2. STRING

let fname = 'Binayak'; // single quoted string
let lname = "Purohit"; // double quoted string
let backTile = `My name is ${fname} ${lname}, and my age is ${20+4}.`; // conmplex sting


// 3. BOOLEAN

// true / yes / 1
// false / no / 0

let isCute = true;
if(isCute){
    console.log("She is cute!!!");
}else{
    console.log("She is not cute!!")
}


// 4. NULL

//It is a special data type which can only store the value null

const youAre = null;
console.log(typeof youAre); // typeof null - object is a bug but js team never changed it 


// 5. UNDEFINED

// If a variable has no value then it is called as undefined

let a;
console.log(a);


// 6. SYMBOL

let firstName = Symbol('first name'),
    lastName = Symbol('last name');

    console.log(firstName); // Symbol(first name)
    console.log(lastName); // Symbol(last name)


    // 7. bigint it takes values larger than 2^53 - 1

    let bigInteger = 98723782359893845773977983245834n;
    console.log(bigInteger);
    console.log(typeof bigInteger);


    // 6. OBJECT

const person = {
    name: 'Binayak',
    age: 24
}

// dot notation
console.log(person.name);

// bracked notation
person['name'] = 'Ganesh';
console.log(person['name']);


// 7. ARRAY

const arr = [1,2,4,5,6,4]; 
console.log(arr);
console.log(arr[0]);
console.log(typeof arr); //object