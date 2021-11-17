public class Sum {
    public double Sum(int distance, int i, int j, int k, double z){
        double sum = 0;
        if (k == 0 & distance >= 30) {
            System.out.println("Хрупкие грузы нельзя возить на расстояние более 30 км");
            return 0;
        }
        else {
            sum = (i + j + k * 300) * z;
            if (sum < 400) {
                return 400;
            } else {
                return sum;
            }
        }

    }

}
