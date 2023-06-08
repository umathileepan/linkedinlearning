import Backpack from "./Components/Backpack.js";
import  backpackObjectArray from "./Components/data.js";

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

const backpackList = backpackObjectArray.map((item) =>
{
    let listItem = document.createElement("article");
    listItem.classList.add("backpack");
    listItem.setAttribute("id",backpack.id);
    
    listItem.innerHTML = `
    <h1>${backpack.name}</h1>
    <ul>
        <li>${backpack.volume}</li>
        <li>${backpack.color}</li>
        <li>${backpack.pocketNum}</li>
        <li>${backpack.lidOpen}</li>
     
    </ul>
`;

return listItem;
});

const main = document.querySelector("main");

backpackList.forEach((backpack) =>{
    main.append(backpack);
});



for(const singleBackpack in backpackList){
    let listItem = document.createElement("li");
    listItem.innerHTML=`Backpack: ${backpackObjectArray[singleBackpack]}`;
    `<body>`.append(listItem);
}