package InsuranceManagment;

import java.util.Date;

public class CarInsurance extends Insurance{
    public CarInsurance(String name, double price, Date startingDate, Date endDate) {
        super(name, price, startingDate, endDate);
    }

    @Override
    public double calculate() {
        return getPrice() * 1.18;
    }
}
