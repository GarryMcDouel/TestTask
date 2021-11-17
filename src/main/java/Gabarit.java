public class Gabarit {
    public int gabarit(int x, int y, int z) {
        if (x < 30) {
            if (y < 30) {
                if (z < 30){
                    return 100;
                }
            }
        }

        return 200;
    }
}