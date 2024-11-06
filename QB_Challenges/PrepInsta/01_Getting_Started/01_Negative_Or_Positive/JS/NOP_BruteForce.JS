"user strict";
const ps = require("prompt-sync");
const userInput = ps();

let num = userInput("Enter the number: ");

if(num>0){
    console.log(`${num} is positive number`);
}else if(num<0){
    console.log(`${num} is negative number`);
}else{
    console.log(`${num} is zero`);
}