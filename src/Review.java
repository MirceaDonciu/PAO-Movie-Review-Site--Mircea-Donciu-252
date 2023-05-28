public class Review {
    private int ReviewId;
    private Users User;
    private Production Production;
    private int ReviewScore;
    private String ReviewText;

    public Review(int reviewId, Users user, Production production, int reviewScore, String reviewText) {
        ReviewId = reviewId;
        User = user;
        Production = production;
        ReviewScore = reviewScore;
        ReviewText = reviewText;
    }
    public int getReviewId() {
        return ReviewId;
    }
    public void setReviewId(int reviewId) {
        ReviewId = reviewId;
    }
    public Users getUser() {
        return User;
    }
    public void setUserId(Users user) {
        User = user;
    }
    public Production getProduction() {
        return Production;
    }
    public void setProduction(Production production) {
        Production = production;
    }
    public int getReviewScore() {
        return ReviewScore;
    }
    public void setReviewScore(int reviewScore) {
        ReviewScore = reviewScore;
    }
    public String getReviewText() {
        return ReviewText;
    }
    public void setReviewText(String reviewText) {
        ReviewText = reviewText;
    }
}
