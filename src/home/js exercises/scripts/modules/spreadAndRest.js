import Human from "./human.js";
import Person from "./person.js";

const arr1 = [1, 5, 9, 8, 73, 54, 51];
const arr2 = [...arr1, 2, 4];
arr2.sort((a, b) => {
  return b - a; // decr order
  //return a - b; // asc order
});

const human1 = new Human();
human1.setGender("female");
human1.getGender();

const person1 = new Person("Pinco", "Panco", 25, "male");
// here I'm going to show the different behaviors the spread operator and the Object Assign have
let person2 = new Person();
person2 = { ...person1, height: 180 };

let person3 = new Person();
person3 = Object.assign(person3, { ...person1, height: 180 });

person1.setGender(human1.getGender());
person1.getGender();
person1.printMyName();
//person2.printMyName(); // does not work because it's not seen as a Person, but just as a generic object which takes the same attributes we're passing it (but not the methods)
person3.printMyName();
console.log(person1);
console.log(person2); // in the console log you can see that this object is not considered as a Person, but it is still implementing the SuperClass Human with all its methods
console.log(person3);

console.log(arr2);

const filter = (...args) => {
  return args.filter((el) => el === 1);
};

console.log(filter(1, 2, 3));
console.log("");
console.log("*************************************");
console.log("");
