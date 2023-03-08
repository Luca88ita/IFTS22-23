import * as bundle from "./modules/module1.js";
import Person from "./modules/person.js";
import Human from "./modules/human.js";
let fName = "Luca";
let lName = "Pennini";
let age = 35;
let gender = "male";

console.log(bundle.multiply(3));
bundle.printMyName2(fName, age);

const me = new Person(lName, fName, age, gender);
const me2 = new Human();
me.printMyName();
me.getGender();
me2.setGender("robot");
me2.getGender();

console.log("");
console.log("*************************************");
console.log("");
