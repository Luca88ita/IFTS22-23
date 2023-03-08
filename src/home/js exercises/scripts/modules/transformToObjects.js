const nArray = [1, 2, 3];

const transformToObjects = (array) => {
  return (arrObj = array.map((e) => {
    return { val: e };
  }));
};

console.log(transformToObjects(nArray));
