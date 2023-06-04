const cupboard = {
    name: "Cupboard",
    size: "Medium",
    changeSize: function(size){
        this.size = size;
    },
    color: "White",
    changeColor: function(color){
        this.color = color;
    },
    noOfSelf: 4,
    dish: {
        isCookable: true,
        dishSize: "medium"
    }
};

console.log("cupboard details: ",cupboard);
console.log("Colour of the cupboard: ", cupboard.color);
console.log("Change the colour to blue: ", cupboard.changeColor("blue"));