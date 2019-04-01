package hw.haru;

public class GarmentMainApp {
    public static void main(String[] args) {
        Jean jeans=new Jean();
        jeans.showDetails();
        jeans.addCost(100);
        jeans.deductCost(50);
        jeans.showCost();

       tops t=new tops();
       t.showDetails();
       t.deductCost(50);
       t.showCost();

       Blazer blazer=new Blazer();
       blazer.showDetails();
    }
}
