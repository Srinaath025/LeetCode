class Solution {
    public double angleClock(int hour, int minutes) {
    double h=0.5*(hour*60+minutes);
    double min=6*minutes;
    double angle=Math.abs(min-h);
    return Math.min(360-angle,angle);

       
        
    }
}