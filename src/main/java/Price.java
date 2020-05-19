public abstract class Price {
    abstract int getPriceCode();

    public abstract double addRentCost(int daysRented);

    int addFrequentRenterPoints(int daysRented) {
        return 1;
    }
}
