class Solution {
    public double angleClock(int hour, int minutes) {
              double Angle_hour = (30*hour)+(0.5*minutes);
        double first_angle = Math.abs(Angle_hour-6*minutes);
        double second_angle = 360-first_angle;
        return first_angle<second_angle ? first_angle :second_angle; 
    }
}