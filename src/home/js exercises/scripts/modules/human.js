/**
 * example of creating the class Human with a constructor (ES6)
 */

/*
class Human {
  constructor(gender) {
    this.gender = gender;
  }
  printMyGender() {
    console.log("I'm a " + this.gender);
  }
}
*/
/**
 * example of creating the class Human without a constructor (ES7)
 */
class Human {
  gender;
  setGender = (g) => {
    this.gender = g;
  };
  getGender = () => {
    console.log("I'm a " + this.gender);
    return this.gender;
  };
}

export default Human;
