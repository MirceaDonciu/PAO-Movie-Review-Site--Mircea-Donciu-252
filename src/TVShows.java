public class TVShows extends Production {
    private int SeasonNumber;
    private int EpisodeNumber;
    private int ReleaseYear;
    private int EndYear;
    public TVShows(int id, String name, String director, Studio studio, int profit, int seasonNumber, int episodeNumber, int releaseYear, int endYear) {
        super(id, name, director, studio, profit, 2);
        SeasonNumber = seasonNumber;
        EpisodeNumber = episodeNumber;
        ReleaseYear = releaseYear;
        EndYear = endYear;
    }
    public int getSeasonNumber() {
        return SeasonNumber;
    }
    public void setSeasonNumber(int seasonNumber) {
        SeasonNumber = seasonNumber;
    }
    public int getEpisodeNumber() {
        return EpisodeNumber;
    }
    public void setEpisodeNumber(int episodeNumber) {
        EpisodeNumber = episodeNumber;
    }
    public int getReleaseYear() {
        return ReleaseYear;
    }
    public void setReleaseYear(int releaseYear) {
        ReleaseYear = releaseYear;
    }
    public int getEndYear() {
        return EndYear;
    }
    public void setEndYear(int endYear) {
        EndYear = endYear;
    }
}
