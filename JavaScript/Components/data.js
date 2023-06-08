import Backpack from "../Backpack.js";


//create new Backpack object
const everydayPack = new Backpack(
    "pack01",
    "Everyday Backpack",
    30,
    "grey",
    15,
    26,
    26,
    false
);

//create new Backpack object
const frogPack = new Backpack(
    "pack02",
    "Frog Backpack",
    8,
    "green",
    3,
    6,
    6,
    false
);

//Add backpack objects into a array
const backpackObjectArray = [everydayPack, frogPack];

//Export the array to be used in other files
export default backpackObjectArray;