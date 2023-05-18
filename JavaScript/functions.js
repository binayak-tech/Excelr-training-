// FUNCTIONS SYNTAX

// function declaration
function functionName(parameters){
    //statement
    return "Hi " + parameters
}

// function call
const result = functionName("Binayak");
console.log(result);



// ANNONYMUS FUNCTION

const sum = function(a, b){
    return a + b;
}

console.log(sum(10,20));



// ARROW FUNCTION

const avg = (arr) => {
    let total = 0;
    for (const i of arr) {
        total += i;
    }
    return total / arr.length;
}
    
arr = [10,10,10,10,10];
console.log(avg(arr));



// using arguments to access passed values
function add() {
    let sum = 0;
    for (let ele of arguments){
        sum += ele; 
    }
    return sum;
  }

const total = add(10,2,93)
console.log(total);


// recursive function
function countdown(num){
    console.log(num);
    return num > 1 ? countdown(num-1) : num === 1 ? console.log("Happy New Year 🎉🎉🎊") : 0 ;
}

countdown(10);