"user strict";
const ps = require("prompt-sync");
const userInput = ps();

let startN = parseInt(userInput("Enter first number: "));
let lastN = parseInt(userInput("Enter last number: "));

if(isNaN(startN) || isNaN(lastN)){
    console.log("Please input valid numbers");
    return;
}

function sumBetRange(start, end, i, currentSum){

    if(i > end) return currentSum;

    currentSum += i;

    return sumBetRange(start, end, i+1, currentSum);

}

let sum = sumBetRange(startN, lastN, 1, 0);

console.log(`The sum of numbers between ${startN} & ${lastN} is : ${sum}`);