"user strict";
const ps = require("prompt-sync");
const userInput = ps();

let startN = parseInt(userInput("Enter the first number: "), 10);
let lastN = parseInt(userInput("Enter the last number: "), 10);

let sum = 0;
if(!isNaN(startN) || !isNaN(lastN)){
    for(let i= startN; i<=lastN; i++){
        sum = sum + i;
    }
    console.log(`The sum of numbers between ${startN} & ${lastN} is : ${sum}`);
}else{
    console.log(`Enter the valid numbers.`);
}