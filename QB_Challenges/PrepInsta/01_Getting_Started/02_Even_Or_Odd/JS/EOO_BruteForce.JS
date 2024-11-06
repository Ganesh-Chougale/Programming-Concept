"user strict";
const ps = require("prompt-sync");
const userInput = ps();

let num = userInput("Enter your number: ");

if(num % 2 === 0){
    console.log(`${num} is even number`);
}else{
    console.log(`${num} is odd number`);
}