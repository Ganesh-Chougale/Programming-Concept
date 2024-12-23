// need the npm module : npm install prompt-sync

"use strict";
const ps = require("prompt-sync");

const userInput = ps();

const txt = userInput("Enter your name: ");
const num = userInput("Enter your age: ");

console.log(`Your name is ${txt} & your age is ${num}.`);