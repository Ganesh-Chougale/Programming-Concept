"user strict";
const ps = require("prompt-sync");
const userInput = ps();

let num = userInput("Enter the number: ");
// let num = parseInt(userInput("Enter the number: "), 10);

if(!isNaN(num)){
    let sum = (num*(num+1)/2);
    console.log(`The sum of numbers between 1 to ${num} is: ${sum}`);
}else{
    console.log("Enter the valid number.");
}


