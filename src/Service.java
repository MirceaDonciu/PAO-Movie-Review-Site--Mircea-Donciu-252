import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
public class Service {
    ArrayList<Studio> VStudio = new ArrayList<>();
    ArrayList<Production> VProd = new ArrayList<>();
    ArrayList<Users> VUser = new ArrayList<>();
    ArrayList<Review> VReview = new ArrayList<>();

    //Scoatem din ID, aka prima parte a lui get

    public Studio getStudioById(int x)
    {
        for(int i=0; i<VStudio.size(); i++)
        {
            if(VStudio.get(i).getStudioId()==x)
                return VStudio.get(i);
        }
        return null;
    }
    public Production getProductionById(int x)
    {
        for(int i=0; i<VProd.size(); i++)
        {
            if(VProd.get(i).getId()==x)
                return VProd.get(i);
        }
        return null;
    }
    public Users getUserById(int x)
    {
        for(int i=0; i<VUser.size(); i++)
        {
            if(VUser.get(i).getUserId()==x)
                return VUser.get(i);
        }
        return null;
    }
    public Review getReviewById(int x)
    {
        for(int i=0; i<VReview.size(); i++)
        {
            if(VReview.get(i).getReviewId()==x)
                return VReview.get(i);
        }
        return null;
    }

    //Scoatem din nume

    public Studio getStudioByName(String Name)
    {
        for(int i=0; i<VStudio.size(); i++)
        {
            if(VStudio.get(i).getStudioName()==Name)
                return VStudio.get(i);
        }
        return null;
    }
    public Production getProductionByName(String Name)
    {
        for(int i=0; i<VProd.size(); i++)
        {
            if(VProd.get(i).getName()==Name)
                return VProd.get(i);
        }
        return null;
    }
    public Users getUserByName(String Name)
    {
        for(int i=0; i<VUser.size(); i++)
        {
            if(VUser.get(i).getUserName()==Name)
                return VUser.get(i);
        }
        return null;
    }



    //Scoatem toate
    public ArrayList<Studio> getStudios()
    {
        return VStudio;
    }
    public ArrayList<Users> getUsers()
    {
        return VUser;
    }
    public ArrayList<Production> getProductions()
    {
        return VProd;
    }
    public ArrayList<Review> getReviews()
    {
        return VReview;
    }



    //Amu display


    public void displayStudio(Studio studio)
    {
        System.out.println("Studio Id: " + studio.getStudioId());
        System.out.println("Studio Name: " + studio.getStudioName());
        System.out.println("Studio CEO: " + studio.getCEO());
        System.out.println("Studio Location: " + studio.getFilmingLocation());
    }
    public void displayUser(Users user)
    {
        System.out.println("User Id:" + user.getUserId());
        System.out.println("User Name:" + user.getUserName());
        System.out.println("User Join Date:" + user.getJoinDate());
        System.out.println("User Banned Status:" + user.isBanned());
    }
    public void displayProduction(Production prod)
    {
        System.out.println("Name of Production: " + prod.getName());
        if(prod.getType()==1) System.out.println("Production Type: Movie");
        else System.out.println("Production Type: TV Show");
        System.out.println("Directed by: " + prod.getDirector());
        System.out.println("Produced by: " + prod.getStudio().getStudioName());
        System.out.println("Total profit: " + prod.getProfit());
    }
    public void displayReview(Review review)
    {
        System.out.println("Review Id: " + review.getReviewId());
        System.out.println("Production: "+ review.getProduction().getName());
        System.out.println("User: " + review.getUser().getUserName());
        System.out.println("Score: " + review.getReviewScore());
        System.out.println("Review: " + review.getReviewText());
    }


    public void displayStudios()
    {
        for(Studio i: VStudio)
        {
            displayStudio(i);
            System.out.println();
        }
    }
    public void displayUsers()
    {
        for(Users i: VUser)
        {
            displayUser(i);
            System.out.println();
        }
    }
    public void displayProductions()
    {
        for(Production i: VProd)
        {
            displayProduction(i);
            System.out.println();
        }
    }
    public void displayReview()
    {
        for(Review i: VReview)
        {
            displayReview(i);
            System.out.println();
        }
    }
    public void displayAll()
    {
        displayStudios();
        displayUsers();
        displayProductions();
        displayReview();
    }

    //delete
    public void deleteStudio(int x)
    {
        for(int i=0; i<=VStudio.size(); i++)
        if(VStudio.get(i).getStudioId()==x)
        {
            VStudio.remove(i);
        }
    }
    public void deleteUser(int x)
    {
        for(int i=0; i<=VUser.size(); i++)
            if(VUser.get(i).getUserId()==x)
            {
                VUser.remove(i);
            }
    }
    public void deleteProduction(int x)
    {
        for(int i=0; i<=VProd.size(); i++)
            if(VProd.get(i).getId()==x)
            {
                VProd.remove(i);
            }
    }
    public void deleteReview(int x)
    {
        for(int i=0; i<=VReview.size(); i++)
            if(VReview.get(i).getReviewId()==x)
            {
                VReview.remove(i);
            }
    }

    public void deleteStudios()
    { VStudio.clear(); }
    public void deleteUsers()
    { VUser.clear(); }
    public void deleteProductions()
    { VProd.clear(); }
    public void deleteReviews()
    { VReview.clear(); }
    public void deleteAll()
    {
        deleteStudios();
        deleteUsers();
        deleteProductions();
        deleteReviews();
    }

    //Citim din fisier

    public void readStudios()
    {
        try
        {
            File StudioFile = new File("Studio.txt");
            Scanner StudioScan = new Scanner(StudioFile);
            int id = 1;
            if(VStudio.size()>0) id=VStudio.get(VStudio.size()-1).getStudioId()+1;
            while (StudioScan.hasNextLine()) {
                String name = StudioScan.nextLine();
                String ceo = StudioScan.nextLine();
                String location = StudioScan.nextLine();

                Studio s = new Studio (id, name, ceo, location);
                VStudio.add(s);
                id+=1;
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("Studios: An error occurred.");
            e.printStackTrace();
        }
    }
    public void readUsers()
    {
        try
        {
            File UserFile = new File("Users.txt");
            Scanner UserScan = new Scanner(UserFile);
            int id = 1;
            if(VUser.size()>0) id=VUser.get(VUser.size()-1).getUserId()+1;
            while (UserScan.hasNextLine()) {
                String name = UserScan.nextLine();

                Users u = new Users (id, name);
                VUser.add(u);
                id+=1;
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("Users: An error occurred.");
            e.printStackTrace();
        }
    }
    public void readProductions()
    {
        try
        {
            File ProdFile = new File("Production.txt");
            Scanner ProdScan = new Scanner(ProdFile);
            int id = 1;
            if(VProd.size()>0) id=VProd.get(VProd.size()-1).getId()+1;
            while (ProdScan.hasNextLine()) {
                int type = Integer.parseInt(ProdScan.nextLine());
                if(type==1)
                {
                    String name = ProdScan.nextLine();
                    String director = ProdScan.nextLine();
                    int StId = Integer.parseInt(ProdScan.nextLine());
                    Studio S = getStudioById(StId);
                    if(S==null)
                    {
                        System.out.println("Studio not found.");
                    }
                    else
                    {
                        int profit = Integer.parseInt(ProdScan.nextLine());
                        int runtime = Integer.parseInt(ProdScan.nextLine());
                        int releaseYear = Integer.parseInt(ProdScan.nextLine());
                        Movies Movie = new Movies(id, name, director, S, profit, runtime, releaseYear);
                        VProd.add(Movie);
                        id+=1;
                    }
                }
                else if(type==2) {
                    String name = ProdScan.nextLine();
                    String director = ProdScan.nextLine();
                    int StId = Integer.parseInt(ProdScan.nextLine());
                    Studio S = getStudioById(StId);
                    if(S==null)
                    {
                        System.out.println("Studio not found.");
                    }
                    else
                    {
                        int profit = Integer.parseInt(ProdScan.nextLine());
                        int SNumber = Integer.parseInt(ProdScan.nextLine());
                        int EpNumber = Integer.parseInt(ProdScan.nextLine());
                        int ReleaseYear = Integer.parseInt(ProdScan.nextLine());
                        int EndYear = Integer.parseInt(ProdScan.nextLine());
                        TVShows TVShow = new TVShows(id, name, director, S, profit, SNumber, EpNumber, ReleaseYear, EndYear);
                        VProd.add(TVShow);
                        id+=1;
                    }
                }
                else
                {
                    System.out.println("Wrong type not found.");
                }
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("Users: An error occurred.");
            e.printStackTrace();
        }
    }
    public void readReviews()
    {
        try
        {
            File ReviewFile = new File("Reviews.txt");
            Scanner ReviewScan = new Scanner(ReviewFile);
            int id = 1;
            if(VReview.size()>0) id=VReview.get(VReview.size()-1).getReviewId()+1;
            while (ReviewScan.hasNextLine()) {
                int uid = Integer.parseInt(ReviewScan.nextLine());
                int pid = Integer.parseInt(ReviewScan.nextLine());
                Users U = getUserById(uid);
                Production P = getProductionById(pid);
                if(P==null||U==null)
                {
                    System.out.println("Production or User not found.");
                }
                else{
                    int score = Integer.parseInt(ReviewScan.nextLine());
                    String text = ReviewScan.nextLine();
                    Review R = new Review(id, U, P, score, text);
                    VReview.add(R);
                    id+=1;
                }
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("Users: An error occurred.");
            e.printStackTrace();
        }
    }
    public void readAll()
    {
        readStudios();
        readUsers();
        readProductions();
        readReviews();
    }

    //editare review
    public void editReview(int x, int rating, String text)
    {
        Review R = getReviewById(x);
        if(R==null) {
            System.out.println("Reviewul nu exista!");
            return ;
        }
        R.setReviewScore(rating);
        R.setReviewText(text);
        for(int i=0; i<VReview.size(); i++)
        {
            if(VReview.get(i).getReviewId() == R.getReviewId())
            {
                VReview.set(i,R);
                return ;
            }
        }
    }
}
