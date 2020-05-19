class Rental {
    private Movie movie;
    private int daysRented;
    public Rental(Movie newmovie, int newdaysRented) {
        movie = newmovie;
        daysRented = newdaysRented;
    }
    public int getDaysRented() {
        return daysRented;
    }
    public Movie getMovie() {
        return movie;
    }

    public double getRentCosts() {
        return movie.getRentCosts(daysRented);
    }

    public int addFrequentRenterPoints() {
        return movie.addFrequentRenterPoints(daysRented);
    }
}