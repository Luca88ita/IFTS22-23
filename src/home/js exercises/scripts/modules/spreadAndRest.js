import Human from "./human.js";
import Person from "./person.js";

const arr1 = [1, 5, 9, 8, 73, 54, 51];
const arr2 = [...arr1, 2, 4];

const human1 = new Human();
human1.setGender("female");
human1.getGender();

const person1 = new Person("Pinco", "Panco", 25, "male");
let person2 = new Person();
person2 = { ...person1, height: 180 };
person1.printMyName();
person1.setGender(human1.getGender());
person1.getGender();
//person2.printMyName(); // does not work

console.log(person1);
console.log(person2);
console.log(arr2);

const filter = (...args) => {
  return args.filter((el) => el === 1);
};

console.log(filter(1, 2, 3));
console.log("");
console.log("*************************************");
console.log("");
