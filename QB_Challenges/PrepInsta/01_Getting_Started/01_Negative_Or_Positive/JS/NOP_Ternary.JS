"user strict";

const ps = require("prompt-sync");
const userInput = ps();

let num = userInput("Enter your number: ");

const result =
(num < 0) ? `${num} is negative number` :
(num > 0) ? `${num} is postive number` :
`${num} is zero`;

console.log(result);