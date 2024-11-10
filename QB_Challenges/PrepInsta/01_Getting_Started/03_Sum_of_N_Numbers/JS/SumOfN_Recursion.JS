"user strict";
const ps = require("prompt-sync");
const userInput = ps();

let num = parseInt(userInput("Enter the number: "));

function sumOfN(i,  num, currentSum){

    if(i>num) return currentSum;

    currentSum = currentSum + i;
    
    return sumOfN(i+1, num, currentSum);
}

let sum = sumOfN(1, num, 0);

console.log(`The sum of numbers between 1 and ${num} is: ${sum}`);