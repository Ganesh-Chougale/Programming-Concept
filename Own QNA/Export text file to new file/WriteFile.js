const fs = require("fs");

const newMSG = "this is the new Text file";
let path = "./fromjs.txt"
fs.writeFile(path, newMSG, err =>{
    if(err){
        console.err;
        return;
    }
});

// this will create txt file at the directory where we run the terminal command of node or nodemon. 