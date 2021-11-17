public class Load {
    public double load(int x){
        if (x < 0){
            return -1;
        } else if (x == 0) {
            return 0;
        } else {
            return switch (x) {
                case 1 -> 1;
                case 2 -> 1.2;
                case 3 -> 1.4;
                case 4 -> 1.6;
                default -> 0;
            };
        }

    }
}
