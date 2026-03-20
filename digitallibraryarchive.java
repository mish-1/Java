abstract class libraryitem{
    private String itemid;
    private String title;
    protected boolean isReserved;
    public libraryitem(String itemid, String title){
        this.itemid = itemid;
        this.title = title;
        this.isReserved = false;
    }
    public void showDetails(){
        System.out.println("Item ID: " + itemid);
        System.out.println("Title: " + title);
        System.out.println("Reserved: " + isReserved);
    }
    abstract void processloan();
}
class book extends libraryitem{
   
    public book(String itemid, String title, String author){
        super(itemid, title);
       
    }
    @Override
    void processloan() {
        if(!isReserved){
            System.out.println("hardcopy issued for 14 days");
            isReserved = true;
        } else {
            System.out.println("Sorry, already reserved.");
        }
    }
}
class researchpaper extends libraryitem{
    
    public researchpaper(String itemid, String title, String journal){
        super(itemid, title);
        
    }
    @Override
    void processloan() {
        System.out.println("Generating secure PDF link ...  ");
    }
}
class digitallibraryarchive {
    public static void main(String[] args) {
        book myBook = new book("B001", "The Great Gatsby", "F. Scott Fitzgerald");
        researchpaper myPaper = new researchpaper("RP001", "Quantum Computing Advances", "Nature Journal");

        System.out.println("Book Details:");
        myBook.showDetails();
        myBook.processloan();

        System.out.println("\nResearch Paper Details:");
        myPaper.showDetails();
        myPaper.processloan();
    }
}