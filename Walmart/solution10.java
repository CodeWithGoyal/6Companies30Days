class Solution {
    double radius, x_center,y_center;
    Random rand;
    public Solution(double radius, double x_center, double y_center) {
        this.radius = radius;
        this.x_center = x_center;
        this.y_center = y_center;
        rand = new Random();
    }
    
    public double[] randPoint() {
        double minx = x_center - radius;
        double maxx = x_center + radius;
        double miny = y_center - radius;
        double maxy = y_center + radius;
        do{
            double xx = rand.nextDouble(minx,maxx);
            double yy = rand.nextDouble(miny, maxy);
            if((xx - x_center)*(xx - x_center) + (yy - y_center)*(yy - y_center) <= radius*radius){
                return new double[]{xx,yy};
            }
        } while(true);
    }
}
// https://leetcode.com/problems/generate-random-point-in-a-circle/s