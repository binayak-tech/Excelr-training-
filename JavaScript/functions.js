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
