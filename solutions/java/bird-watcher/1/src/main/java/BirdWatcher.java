
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
return birdsPerDay;
    }

    public int getToday() {
        int n=birdsPerDay.length;
      return birdsPerDay[n-1];
    }

    public void incrementTodaysCount() {
        int n=birdsPerDay.length;
        birdsPerDay[n-1]=birdsPerDay[n-1]+1;
        
    }

    public boolean hasDayWithoutBirds() {
    for(int n:birdsPerDay){
        if(n==0){
            return true;
        }
    }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int sum=0;
        int n=birdsPerDay.length;

        if(numberOfDays>n){
            numberOfDays=n;
        }
            
       for(int i=0;i<numberOfDays;i++){
           sum=sum+birdsPerDay[i];
       }
        return sum;
    }

    public int getBusyDays() {
        int count=0;
        for(int i=0;i<birdsPerDay.length;i++){
            if(birdsPerDay[i]>=5){
                count++;
            }
        }
        return count;
    }
}
