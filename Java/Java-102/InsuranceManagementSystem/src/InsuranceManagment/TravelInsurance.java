package InsuranceManagment;

import java.util.Date;

public class TravelInsurance extends Insurance{
    public TravelInsurance(String name, double price, Date startingDate, Date endDate) {
        super(name, price, startingDate, endDate);
    }

    @Override
    public double calculate() {
        return super.calculate();
    }
}
