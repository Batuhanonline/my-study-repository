package AddressManagment;

public abstract class Address implements IAddress{

    private String neighbourhood;
    private String street;
    private String apartmentNumber;
    private String doorNumber;
    private String district;
    private String province;
    private String statement;

    public Address(String neighbourhood, String street, String apartmentNumber, String doorNumber, String district, String province, String statement) {
        this.neighbourhood = neighbourhood;
        this.street = street;
        this.apartmentNumber = apartmentNumber;
        this.doorNumber = doorNumber;
        this.district = district;
        this.province = province;
        this.statement = statement;
    }

    @Override
    public String getAddress() {
        return getNeighbourhood() + " " + getStreet() + " " + getApartmentNumber() + " " + getDoorNumber() + " " + getDistrict()
                + "\n " + getProvince() + " " + getStatement();
    }

    public String getNeighbourhood() {
        return neighbourhood;
    }

    public void setNeighbourhood(String neighbourhood) {
        this.neighbourhood = neighbourhood;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getApartmentNumber() {
        return apartmentNumber;
    }

    public void setApartmentNumber(String apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }

    public String getDoorNumber() {
        return doorNumber;
    }

    public void setDoorNumber(String doorNumber) {
        this.doorNumber = doorNumber;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getStatement() {
        return statement;
    }

    public void setStatement(String statement) {
        this.statement = statement;
    }
}
