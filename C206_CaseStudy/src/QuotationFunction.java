import java.util.ArrayList;


public class QuotationFunction {
    public static void main(String[] args) {

//Liu DeHai
        ArrayList<Quotation> QList = new ArrayList<Quotation>();
//View
    }
    public static void viewAllQuotation(ArrayList<Quotation>Quotation) {
        Helper.line(60, "-");
        System.out.println("Quotation LIST");
        Helper.line(60, "-");
        String output = String.format("%-10s %-20s %-15s %-20s \n", "Designer Name", "Total Cost Range", "Start Renovate Date Range","Renovation Type");


        for (int i = 0; i < Quotation.size(); i++) {


            output += String.format("%-15s %-20s %-15d %-20s\n",Quotation.get(i).getName(),Quotation.get(i).getCostRange()
                                    ,Quotation.get(i).getCostRange(),Quotation.get(i).getType());
        }
            System.out.println(output);
    }
//ADD
    public static void addQuotations(ArrayList<Quotation>Quotation) {
        String DesignerName = Helper.readString("Enter Designer Name >");
        String CostRange = Helper.readString("Enter Total Cost Range >");
        String SDRange = Helper.readString("Enter Start Renovate Date Range >");
        String Type = Helper.readString("Enter Renovation Type >");
        
        Quotation Y = new Quotation(DesignerName, CostRange, SDRange, Type);
        Quotation.add(Y);
        System.out.println("Quotation added");
    }
//Update
    public static void updateQuotations(ArrayList<Quotation>Quotation){
        String name =Helper.readString("Enter Designer Name >");
        for (int i = 0; i < Quotation.size(); i++) {
        if(name !=Quotation.get(i).getName()){
            System.out.println("This record is not exist");
            break;
        }else {
            String Dname =Helper.readString("Enter current Designer Name >");
            if(Dname.equals(Quotation.get(i).getName())){
                String NewDname = Helper.readString("Enter new Designer Name >");
                NewDname = (String) Quotation.get(i).getName();
                String NewCRange = Helper.readString("Enter new Cost Range  >");
                NewCRange = Quotation.get(i).getCostRange();
                String NewRDRange  = Helper.readString("Enter new Renovate Date Range >");
                NewRDRange = Quotation.get(i).getCostRange();
                String NewType = Helper.readString("Enter new Renovation Type >");
                NewType = Quotation.get(i).getType();
            
                System.out.println("Change has Successfully made");
        }
        }
        }
                
            }
//Delete
            public static void DeleteByName(ArrayList<Quotation>Quotation) {
                String name = Helper.readString("Enter name to search > ");
                boolean QuotationDeleted=false;
                for (int i =0;i< Quotation.size(); i++) {
                    if(Quotation.get(i)!=null && Quotation.get(i).Name.equalsIgnoreCase(name)) {
                        Quotation.remove(i);
                        QuotationDeleted=true;
                        break;
                    }
                }
                if(QuotationDeleted==true) {
                    System.out.println("Quotation is successfully deleted");
                }else {
                    System.out.println("Quotations is has not deleted");
                }



        }
    }








