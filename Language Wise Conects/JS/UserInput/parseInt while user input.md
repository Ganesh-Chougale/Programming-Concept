### Without parseInt:  
```javascript
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
```  
#### Output:  
```vbnet
Enter the number: 5
The sum of numbers between 1 to 5 is: 127.5
```  
this happens because when we use `userInut("Enter the number:")` function it get input into string format. thus the giving arbitrary value.
### With parseInt:  
```javascript
"user strict";
const ps = require("prompt-sync");
const userInput = ps();

// let num = userInput("Enter the number: ");
let num = parseInt(userInput("Enter the number: "), 10);

if(!isNaN(num)){
    let sum = (num*(num+1)/2);
    console.log(`The sum of numbers between 1 to ${num} is: ${sum}`);
}else{
    console.log("Enter the valid number.");
}
```  
#### Output:  
```vbnet

```  
when we use `parseInt()` for the userInput call it converts string into Integer
example:
```javascript
let numb1 = "123abc456";
let result1 = parseInt(numb1);
console.log(result1);
```
#### Output:  
```vbnet
123
```  
```javascript
let numb2 = "-123abc456";
let result2 = parseInt(numb2);
console.log(result2);
```  
#### Output:  
```vbnet
-123
```  
`parseInt()` function converts strint to integer from left to right, as soon as it detects first non integer value. which means as soon it first the first non-numeric character in our case its `a` it will stop the parsing further right. giving use only firstly found integers.  