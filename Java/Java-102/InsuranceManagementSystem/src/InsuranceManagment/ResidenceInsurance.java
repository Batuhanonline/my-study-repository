package InsuranceManagment;

import java.util.Date;

public class ResidenceInsurance extends Insurance{
    public ResidenceInsurance(String name, double price, Date startingDate, Date endDate) {
        super(name, price, startingDate, endDate);
    }

    @Override
    public double calculate() {
        return super.calculate();
    }
}
