
<<<<<<< HEAD
/**
 * Events aplenty.
 * @link https://developer.mozilla.org/en-US/docs/Web/Events
 */

const container = document.querySelector(".container");
const button = document.querySelector(".cta-button");
const posX = document.querySelector(".posX span");
const posY = document.querySelector(".posY span");
=======
const container = document.getElementById("container");
const button = document.querySelector(".ct-button");
const posX = document.querySelector(".posX");
const posY = document.querySelector(".posY");

button.addEventListener("click", () => {
    button.style.backgroundColor="blue";
     },false);
>>>>>>> 12ea93eae5f77c23d9cd8173839002a6e146f267

// Log when the button is clicked in the console.
button.addEventListener("click", () => {
  button.classList.toggle("active");
  console.log("Button was clicked!");
}, false);

// Update the x and y displays to show the current mouse position.
const mousePosition = (event) => {
  posX.innerText = event.pageX;
  posY.innerText = event.pageY;
};

window.addEventListener("mousemove", mousePosition, false);

// Change the color of the box when the mouse enters.
container.addEventListener(
  "mouseenter",
  () => {
    container.classList.add("blue");
  },
  false
);

container.addEventListener(
  "mouseleave",
  () => {
    container.classList.remove("blue");
  },
  false
);