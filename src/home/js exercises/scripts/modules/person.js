import Human from "./human.js";
/**
 * example of creating the class Person with a constructor (ES6)
 */
class Person extends Human {
  constructor(lastName, firstName, age, gender, height) {
    super();
    this.gender = gender;
    this.lastName = lastName;
    this.firstName = firstName;
    this.age = age;
    this.height = height;
  }
  printMyName() {
    this.height != undefined && //this is an alternative way to write an if
      console.log(
        "My name is " +
          this.lastName +
          " " +
          this.firstName +
          ", I'm " +
          this.height +
          " cm tall, and I'm " +
          this.age
      );
    this.height == undefined && //this is an alternative way to write an if
      console.log(
        "My name is " +
          this.lastName +
          " " +
          this.firstName +
          " and I'm " +
          this.age
      );
  }
}

export default Person;
