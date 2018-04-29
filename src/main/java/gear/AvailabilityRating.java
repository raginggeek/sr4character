package gear;

public class AvailabilityRating {
    protected int rating = 0;
    protected String classification = "";

    public AvailabilityRating() {
        this(0);
    }

    public AvailabilityRating(int rating) {
        this(rating, "");
    }

    public AvailabilityRating(int rating, String classification) {
        this.setRating(rating);
        this.setClassification(classification);
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    @Override
    public String toString() {
        return "" + rating + classification.substring(0,1);
    }
}
