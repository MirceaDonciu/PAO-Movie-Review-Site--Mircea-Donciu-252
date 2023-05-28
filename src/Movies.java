public class Movies extends Production {
    private int Runtime;
    private int ReleaseYear;
    public Movies(int id, String name, String director, Studio studio, int profit, int runtime, int releaseYear) {
        super(id, name, director, studio, profit, 1);
        Runtime = runtime;
        ReleaseYear = releaseYear;
    }
    public int getRuntime() {
        return Runtime;
    }
    public void setRuntime(int runtime) {
        Runtime = runtime;
    }
    public int getReleaseYear() {
        return ReleaseYear;
    }
    public void setReleaseYear(int releaseYear) {
        ReleaseYear = releaseYear;
    }
}
