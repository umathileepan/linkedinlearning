class Backpack{
    constructor(
        name,
        volume,
        color,
        pocketNum,
        strapLengthL,
        strapLengthR,
        lidOpen
    )
    {
        this.name=name;
        this.volume=volume;
        this.color=color;
        this.pocketNum=pocketNum;
        this.strapLength={
            left: strapLengthL,
            right: strapLengthR
        };
        this.lidOpen=lidOpen;
    }

    //Add method like normal function
    toggleLid(lidStatus){
        this.lidOpen = lidStatus;
    }

    newStrapLength(lengthLeft, lengthRight)
    {
        this.strapLength.left=lengthLeft;
        this.strapLength.right=lengthRight;
    }
}
