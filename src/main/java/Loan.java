public class Loan {
    private int amount;
    private String borrower;
    private boolean isPaid;
    private double interestRate;
    private String contactNumber;

    public Loan(int amount, String borrower, double interestRate, String contactNumber) {
        this.amount = amount;
        this.borrower = borrower;
        this.interestRate = interestRate;
        this.contactNumber = contactNumber;
        this.isPaid = false;
    }

    public int geAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getBorrower() {
        return borrower;
    }

    public void setBorrower(String borrower) {
        this.borrower = borrower;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public void setPaid(boolean paid) {
        isPaid = paid;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }
}
