public class Fiction extends Book implements iBorrowable{

    private int BorrowDate;
    private int ReturnDate;
    private boolean isAvailable;

    public Fiction(String title, double price, String publishYear) {
        super(title, price, publishYear);
    }

    @Override
    public String description() {
        return this.getTitle() + " all events are imaginary and not based on real facts";
    }

    @Override
    public void setBorrowDate(int day) {
        this.BorrowDate = day;
    }

    @Override
    public void setReturnDate(int day) {
        this.ReturnDate = day;
    }

    @Override
    public boolean isAvailable(int day) {
        if(day >= BorrowDate && day <= ReturnDate)
            isAvailable = false;
        else
            isAvailable = true;

        return isAvailable;
    }
}
