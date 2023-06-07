console.log(__dirname);

setInterval(()=>{
    console.log('Well done!!!')
}, 1000)


setInterval(compName = (name)=>{
    if(name==='Uma'){
        console.log('You are back on track');
    }else{
        console.log('I don\'t know you');
    }
},5000)

compName('Uma');

const path = require("path");
console.log(`The file name is ${path.basename(__filename)}`);

for(let key in global){
    console.log(key);
}

console.log(process.argv);

function grab(flag){
    let indexAfterFlag = process.argv.indexOf(flag) + 1;
    return process.argv[indexAfterFlag];
}

let greeting = grab("--greeting");
let user = grab("--user");

console.log(greeting);
console.log(user);