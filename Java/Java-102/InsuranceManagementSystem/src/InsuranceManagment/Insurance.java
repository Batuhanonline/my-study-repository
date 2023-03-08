package InsuranceManagment;

import java.util.Date;

public abstract class Insurance {
    String name;
    double price;
    Date startingDate;
    Date endDate;

    public Insurance(String name, double price, Date startingDate, Date endDate) {
        this.name = name;
        this.price = price;
        this.startingDate = startingDate;
        this.endDate = endDate;
    }

    public double calculate(){
        return -1;
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getStartingDate() {
        return startingDate;
    }

    public void setStartingDate(Date startingDate) {
        this.startingDate = startingDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}
