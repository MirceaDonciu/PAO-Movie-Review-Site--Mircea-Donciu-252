import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.*;
public class ProductionReport extends Report {
    private Production Prod;
    public ProductionReport(int reportId, ArrayList<Review> vector, Production prod) {
        super(reportId, 1, vector);
        Prod = prod;
    }
    public Production getProduction() {
        return Prod;
    }
    public void setProduction(Production prod) {
        Prod = prod;
    }
    public void getReport()
    {
        System.out.println("Name of Production: " + Prod.getName());
        if(Prod.getType()==1) System.out.println("Production Type: Movie");
        else System.out.println("Production Type: TV Show");
        System.out.println("Regizat de: " + Prod.getDirector());
        System.out.println("Produs de: " + Prod.getStudio().getStudioName());
        System.out.println("Profit total: " + Prod.getProfit());
        ArrayList<Review> V2 = Vector;
        Collections.sort(V2, new Comparator<Review>() {
            @Override
            public int compare(Review R1, Review R2) {
                if(R1.getReviewScore() < R2.getReviewScore()) return -1;
                if(R1.getReviewScore() == R2.getReviewScore()) return 0;
                return 1;
            }
        });
        int i = 0;
        if(V2.size()==0) return ;
        while (i<V2.size() && V2.get(i).getProduction() != Prod){
            i+=1;
        }
        if(i<V2.size()) System.out.println("Persoana care a dat cel mai mic scor e: " + V2.get(i).getUser().getUserName());
        i = V2.size()-1;
        while (i>=0&& V2.get(i).getProduction() != Prod){
            i-=1;
        }
        if(i>=0) System.out.println("Persoana care a dat cel mai mare scor e: " + V2.get(i).getUser().getUserName());
    }
}
