import Book from "../Book.js";
import Backpack from "./Backpack.js";

const book = new Book(
    "Healthy Life Style",
    "Victoria Jone",
    200,
    15.00,
    "16/09/1990"
);

console.log("book details: ",book);
console.log("Colour of the : ", book.changeBookCover("green","Tree"));
console.log("after the change of book cover: ", book);

const everydayPack = new Backpack(
    "Everyday Backpack",
    30,
    "grey",
    15,
    26,
    26,
    false
);

console.log("The everydayPack object: ",everydayPack);

const content = `
<main>
    <article>
        <h1> Everyday Backpack</h1>
        <ul>
            <li class="volume">Volume: ${everydayPack.volume} </li>
            <li>Color: ${everydayPack.Color} </li>
            <li>Number of pockets: ${everydayPack.pocketNum}</li>
            <li>Left strap length: ${everydayPack.strapLength.left}</li>
            <li>Right strap length: ${everydayPack.strapLength.right} </li>
            <li>Lid Status: ${everydayPack.lidOpen}</li>
        </ul>
    </article>
</main>
`

document.body.innerHTML = content;
//document.querySelectorAll("main li").forEach(item => item.style.backgroundColor="blue");
document.querySelector("main h1").style.backgroundColor="Green";
document.querySelector("main .volume").style.backgroundColor="Red";
