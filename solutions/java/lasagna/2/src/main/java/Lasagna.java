public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
    int expectedMinutes=40;
    int layerTime=2;
    public int expectedMinutesInOven(){
        return expectedMinutes;
        
    }
    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int a){
        return expectedMinutes-a;
    }

    // TODO: define the 'preparationTimeInMinutes()' method
    public int  preparationTimeInMinutes(int a){
        return layerTime*a;
        
    }

    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int a,int b){
        int total=preparationTimeInMinutes(a);
        return total+b;
    }
    
}
