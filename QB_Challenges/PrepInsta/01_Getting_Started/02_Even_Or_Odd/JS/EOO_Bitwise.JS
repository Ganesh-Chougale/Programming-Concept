"user strict";
const ps = require("prompt-sync");
const userInput = ps();

let num = userInput("Enter the number: ");

const result = ((num & 1) === 0) ? `${num} is even number` : `${num} is odd number`;

console.log(result);