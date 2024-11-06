"user strict";
const ps = require("prompt-sync");
const userInput = ps();

let num = userInput("Enter your name: ");

if(num == 0){
    console.log(`${num} is zero`);
}else{
    if(num<0){
        console.log(`${num} is negative`);
    }else{
        console.log(`${num} is positive`);
    }
}