package hw.haru;

public class Garment {

    private String fabric;
    private  String color;
    private static int cost;

    Garment(String fabric,String color, int cost){

        this.color=color;
        this.cost=cost;
        this.fabric=fabric;
    }
    public  void showDetails(){
        System.out.println(fabric+" "+cost+" "+color);
    }

    public void addCost(int factor){
        cost+=factor;
    }

    public void deductCost(int deduction){
       cost-=deduction;
    }

    public void showCost(){
     System.out.println(cost);
    }


}
