"user strict";
const ps = require("prompt-sync");
const userInput = ps();

let num = userInput("Enter your number: ");

    result = (num%2===0) ? `${num} is even number` : `${num} is odd number`;


console.log(result);