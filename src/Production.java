public class Production {
    private int Id;
    private String Name;
    private String Director;
    private Studio Studio;
    private int Profit;
    private int Type;
    public Production(int id, String name, String director, Studio studio, int profit, int type) {
        Id = id;
        Name = name;
        Director = director;
        Studio = studio;
        Profit = profit;
        Type = type;
    }
    public int getId() {
        return Id;
    }
    public void setId(int id) {
        Id = id;
    }
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public String getDirector() {
        return Director;
    }
    public void setDirector(String director) {
        Director = director;
    }
    public Studio getStudio() {
        return Studio;
    }
    public void setStudio(Studio studio) {
        Studio = studio;
    }
    public int getProfit() {
        return Profit;
    }
    public void setProfit(int profit) {
        Profit = profit;
    }
    public void setType(int type) {
        Type = type;
    }
    public int getType() {
        return Type;
    }
}