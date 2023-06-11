
const container = document.getElementById("container");
const button = document.querySelector(".ct-button");
const posX = document.querySelector(".posX");
const posY = document.querySelector(".posY");

button.addEventListener("click", () => {
    button.style.backgroundColor="blue";
     },false);

    
const positionChange = ((event) => {
    posX.innerText = event.posX;
    posY.innerText = event.posY;
});

window.addEventListener("mousemove",positionChange,false);