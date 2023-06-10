
const container = document.querySelector("container");
const button = document.querySelector("ct-button");
const posX = document.querySelector(".posX");
const posY = document.querySelector("posY");
console.log(container);

button.addEventListener("click", function () {
    console.log("Thank you!")
    },false);

    
const positionChange = ((event) => {
    posX.innerText = event.posX;
    posY.innerText = event.posY;
});

window.addEventListener("mousemove",positionChange,false);