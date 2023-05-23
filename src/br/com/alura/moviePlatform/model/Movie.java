public class Movie {
    private String name;
    private int year;
    private boolean inclusedInPlan;
    private double reviews;
    private int totalReviews;
    private int durationMin;

    public void showMovieInfo(){
        System.out.println("MOVIE: " + this.name);
        System.out.println("LAUNCH YEAR: " + this.year);
    }

    public void review(double grade){
        this.reviews += grade;
        totalReviews++;
    }

    public double showReviewAvarege(){
        return reviews/totalReviews;
    }

    public double getReviews() {
        return reviews;
    }

    public int getDurationMin() {
        return durationMin;
    }

    public int getTotalReviews() {
        return totalReviews;
    }

    public int getYear() {
        return year;
    }

    public String getName() {
        return name;
    }

    public void setDurationMin(int durationMin) {
        this.durationMin = durationMin;
    }

    public void setInclusedInPlan(boolean inclusedInPlan) {
        this.inclusedInPlan = inclusedInPlan;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setReviews(double reviews) {
        this.reviews = reviews;
    }

    public void setTotalReviews(int totalReviews) {
        this.totalReviews = totalReviews;
    }

    public void setYear(int year) {
        this.year = year;
    }
}