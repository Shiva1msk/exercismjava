public class JedliksToyCar {
            int drive=0;
             int battery=100;

    public static JedliksToyCar buy() {
      JedliksToyCar car=new JedliksToyCar();
        return car;
    }

    public String distanceDisplay() {
        String distanceResult=String.valueOf(drive);
        return "Driven "+distanceResult+" meters";
    }

    public String batteryDisplay() {
        String batteryResult=String.valueOf(battery);
        if(battery==0){
            return "Battery empty";
        }

        return "Battery at "+batteryResult+"%";
    }

    public void drive() {
        if(battery==0) return;
        battery=battery-1;
        drive=drive+20;
        
    }
}
