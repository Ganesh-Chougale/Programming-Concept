"user strict";
const ps = require("prompt-sync");
const userInput = ps();

let num = userInput("Enter the number: ");

let sum=0;

if(!isNaN(num)){
    for(let i=1; i<=5; i++){
        sum = sum+i;
    }
    console.log(`The sum of numbers between 1 to ${num} is: ${sum}`);
}else{
    console.log("Enter the valid number");
}
