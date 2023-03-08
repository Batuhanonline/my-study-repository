package InsuranceManagment;

import java.util.Date;

public class HealthInsurance extends Insurance{
    public HealthInsurance(String name, double price, Date startingDate, Date endDate) {
        super(name, price, startingDate, endDate);
    }

    @Override
    public double calculate() {
        return getPrice() * 0.75;
    }
}
