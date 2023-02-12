public class Designer extends User {
    private double rating;

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public boolean upload(Content content) {
        return true;
    }

}
