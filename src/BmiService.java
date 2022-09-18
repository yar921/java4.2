public class BmiService {
    public double calculate(int mass, double height){
        double increase = height * height;
        double index = mass / increase;
        return (double) index;
    }
}