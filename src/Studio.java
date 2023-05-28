public class Studio {
    private int StudioId;
    private String StudioName;
    private String CEO;
    private String FilmingLocation;
    public Studio(int studioId, String studioName, String ceo, String filmingLocation)
    {
        StudioId = studioId;
        StudioName = studioName;
        CEO = ceo;
        FilmingLocation = filmingLocation;
    }
    public int getStudioId() {
        return StudioId;
    }
    public String getStudioName() {
        return StudioName;
    }
    public void setStudioName(String studioName) {
        StudioName = studioName;
    }
    public String getCEO() {
        return CEO;
    }
    public void setCEO(String ceo) {
        CEO = ceo;
    }
    public String getFilmingLocation() {
        return FilmingLocation;
    }
    public void setFilmingLocation(String filmingLocation) {
        FilmingLocation = filmingLocation;
    }
}
