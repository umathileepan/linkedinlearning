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