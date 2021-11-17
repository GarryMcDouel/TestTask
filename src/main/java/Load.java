public class Load {
    public double load(int x){
        if (x < 0){
            return -1;
        } else if (x == 0) {
            return 0;
        } else {
            switch (x) {
                case 1:
                    return 1;
                case 2:
                    return 1.2;
                case 3:
                    return 1.4;
                case 4:
                    return 1.6;
                default:
                    return 0;
            }
        }

    }
}
