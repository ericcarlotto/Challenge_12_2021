package Model;

public class FuelPump {

    public enum types {
        STANDARD, PREMIUM, DIESEL, ALCOHOL;
    }

    //Attributes
    private types fuelType = types.STANDARD;
    private float fuelPrice;
    private float fuelQuantity = 100000;

    //Constructor
    public FuelPump() {
    }

    //Getters and setters
    public types getFuelType() {
        return fuelType;
    }

    public void setFuelType(types fuelType) {
        this.fuelType = fuelType;
    }

    public float getFuelPrice() {
        return fuelPrice;
    }

    public void setFuelPrice(float fuelPrice) {
        this.fuelPrice = fuelPrice;
    }

    public float getFuelQuantity() {
        return fuelQuantity;
    }

    public void setFuelQuantity(float fuelQuantity) {
        this.fuelQuantity = fuelQuantity;
    }

    //Fill the fuelQuantity with price
    public float fillWithPrice(float price) {

        float litersPumped = 0;
        float fuelPriceNow = this.getFuelPrice();
        float fuelQuantityRemaining = this.getFuelQuantity();
        float fuelQuantityAtt = price/fuelPriceNow;

        if (fuelQuantityRemaining>=fuelQuantityAtt){
            litersPumped = fuelQuantityAtt;
            this.fuelQuantity-=litersPumped;

        }

        if (fuelQuantityRemaining<fuelQuantityAtt && litersPumped==0) {
            System.out.println(" The fuel quantity remaining is not enought to fill ");
        }

        return litersPumped;

    }

    //Fill the fuelQuantity with liters
    public float fillWithLiters(float liters) {

        float fuelPriceNow = this.getFuelPrice();
        float fuelQuantityRemaining = this.fuelQuantity;
        float priceToPay = liters*fuelPriceNow;
        float pricePayed = 0;

        if (fuelPriceNow>0) {
            pricePayed = priceToPay;
            this.fuelQuantity-= liters;
        }

        if (fuelQuantityRemaining<liters) {
            System.out.println(" The fuel quantity remaining is not enought to fill ");
        }

        if (fuelPriceNow==0) {
            System.out.println(" The price was not set ");
        }

        return pricePayed;
    }

    //Set the price
    public void setPrice(types typeFuel, float price) {

        this.fuelType = typeFuel;
        this.fuelPrice = price;

    }

    //Refill the fuelPump
    public void refillFuelPump(float liters) {
        if (liters>0) {
            this.fuelQuantity+=liters;
        }

        if (liters<=0) {
            System.out.println(" The fuel quantity have to be positive and bigger than 0. ");
        }
    }


}
