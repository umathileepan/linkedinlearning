class Book{
    constructor(name,
                author,
                noOfPages,
                price,
                publishedDate)
    {
        this.name = name;
        this.author = author;
        this.noOfPages = noOfPages;
        this.price = price;
        this.publishedDate = publishedDate;
    }
    changeBookCover(color,design){
        this.color = color;
        this.design = design;
    }

}

export default Book;