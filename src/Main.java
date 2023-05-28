import java.util.*;
public class Main {
    public static void main(String[] args) {
        Service S = new Service();
        Scanner Sc = new Scanner(System.in);
        CsvAudit C = new CsvAudit();
        int rid = 1;
        while(true)
        {
            System.out.println("Instruction Options:");
            System.out.println("0 - Read Studio Data");
            System.out.println("1 - Read User Data");
            System.out.println("2 - Read Production Data");
            System.out.println("3 - Read Review Data");
            System.out.println("4 - Read All Data");
            System.out.println("5 - Display Studio Data");
            System.out.println("6 - Display Read Production Data");
            System.out.println("8 - Display Review Data");
            System.out.println("9 - Display All Data");
            System.out.println("10 - Delete Studio Data");
            System.out.println("11 - Delete User Data");
            System.out.println("12 - Delete Production Data");
            System.out.println("13 - Delete Review Data");
            System.out.println("14 - Delete All Data");
            System.out.println("15 - Edit Review");
            System.out.println("16 - Production Report by Id");
            System.out.println("17 - Production Report by Name");
            System.out.println("18 - User Report by Id");
            System.out.println("19 - User Report by Name");
            System.out.println("20 - End Session");
            int x = Integer.parseInt(Sc.nextLine());
            switch(x)
            {
                case 0: {
                    S.readStudios();
                    C.postAction("Read Studio Data");
                    break;
                }
                case 1: {
                    S.readUsers();
                    C.postAction("Read User Data");
                    break;
                }
                case 2: {
                    S.readProductions();
                    C.postAction("Read Production Data");
                    break;
                }
                case 3: {
                    S.readReviews();
                    C.postAction("Read Review Data");
                    break;
                }
                case 4: {
                    S.readAll();
                    C.postAction("Read All Data");
                    break;
                }
                case 5: {
                    S.displayStudios();
                    C.postAction("Display Studio Data");
                    break;
                }
                case 6: {
                    S.displayUsers();
                    C.postAction("Display User Data");
                    break;
                }
                case 7: {
                    S.displayProductions();
                    C.postAction("Display Production Data");
                    break;
                }
                case 9: {
                    S.displayAll();
                    C.postAction("Display All Data");
                    break;
                }
                case 10: {
                    S.deleteStudios();
                    C.postAction("Delete Studio Data");
                    break;
                }
                case 11: {
                    S.deleteUsers();
                    C.postAction("Delete User Data");
                    break;
                }
                case 12: {
                    S.deleteProductions();
                    C.postAction("Delete Production Data");
                    break;
                }
                case 13: {
                    S.deleteReviews();
                    C.postAction("Delete Review Data");
                    break;
                }
                case 14: {
                    S.deleteAll();
                    C.postAction("Delete All Data");
                    break;
                }
                case 15: {
                    System.out.println("Review id:");
                    int y = Integer.parseInt(Sc.nextLine());
                    System.out.println("New score:");
                    int rt = Integer.parseInt(Sc.nextLine());
                    System.out.println("New text:");
                    String txt = Sc.nextLine();
                    S.editReview(y,rt,txt);
                    C.postAction("Edit Review with Id "+y);
                    break;
                }
                case 16: {
                    System.out.println("Production id:");
                    int y = Integer.parseInt(Sc.nextLine());
                    Production P = S.getProductionById(y);
                    if(P==null)
                        System.out.println("Production doesn't exist!");
                    else
                    {
                        ProductionReport PR=new ProductionReport(rid, S.getReviews(), P);
                        rid+=1;
                        PR.getReport();
                    }
                    C.postAction("Report Production with Id "+y);
                    break;
                }
                case 17: {
                    System.out.println("Production name:");
                    String y = Sc.nextLine();
                    Production P = S.getProductionByName(y);
                    if(P==null)
                        System.out.println("Production doesn't exist!");
                    else
                    {
                        ProductionReport PR=new ProductionReport(rid, S.getReviews(), P);
                        rid+=1;
                        PR.getReport();
                    }
                    C.postAction("Report Production with Name "+y);
                    break;
                }
                case 18: {
                    System.out.println("User id:");
                    int y = Integer.parseInt(Sc.nextLine());
                    Users U = S.getUserById(y);
                    if(U==null)
                        System.out.println("User doesn't exist!");
                    else
                    {
                        UserReport UR=new UserReport(rid, S.getReviews(), U);
                        rid+=1;
                        UR.getReport();
                    }
                    C.postAction("Report User with Id "+y);
                    break;
                }
                case 19: {
                    System.out.println("User name:");
                    String y = Sc.nextLine();
                    Users U = S.getUserByName(y);
                    if(U==null)
                        System.out.println("User doesn't exist!");
                    else
                    {
                        UserReport UR=new UserReport(rid, S.getReviews(), U);
                        rid+=1;
                        UR.getReport();
                    }
                    C.postAction("Report User with Name "+y);
                    break;
                }
                case 20:
                {
                    return ;
                }
                default:
                {
                    break;
                }
            }
        }
    }
}