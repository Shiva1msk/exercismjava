public class Lasagna {
    int layerTime=2;
    public int expectedMinutesInOven(){
        return 40;
        
    }
    public int remainingMinutesInOven(int a){
        int b=expectedMinutesInOven();
        
        return b-a;
    }

    public int  preparationTimeInMinutes(int a){
        return layerTime*a;
        
    }

    public int totalTimeInMinutes(int a,int b){
        int total=preparationTimeInMinutes(a);
        return total+b;
    }
    
}
