const container = document.querySelector(".container");
const button = document.querySelector(".cta-button");
const posX = document.querySelector(".posX");
const posY = document.querySelector("posY");

button.addEventListener("click",() => {
    button.classList.toggle("active");
    console.log("I got clicked");
},false);

const positionChange = ((event) => {
    posX.innerText = event.posX;
    posY.innerText = event.posY;
});

window.addEventListener("mousemove",positionChange,false);