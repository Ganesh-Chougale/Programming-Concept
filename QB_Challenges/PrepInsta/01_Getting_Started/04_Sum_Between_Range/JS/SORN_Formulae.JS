
"user strict";
const ps = require("prompt-sync");
const userInput = ps();

let num1 = parseInt(userInput("Enter the first number: "))
let num2 = parseInt(userInput("Enter the last number: "))

if(!isNaN(num1) || !isNaN(num2)){
    let sum = num2*(num2+1)/2 - num1*(num1+1)/2 + num1;
    console.log(`The sum of numbers between ${num1} & ${num2} is : ${sum}`);

}else{
    console.log(`Enter the valid numbers.`);
}