const fs = require("fs");
console.log("Current working directory: ", process.cwd());

let path = "C:/Users/RaSkull/Desktop/Code/Programming-Concept/Own QNA/Read Native Text file/Target.txt";

fs.readFile(path, "utf-8", (err, data)=>{
    if(err){
        console.log(err);
        return;
    }
    console.log(data);
});