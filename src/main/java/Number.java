public class Number {
    public int Number(String str){
int x;
        if (str.equals("")) {
            return -2;
        }

            try {
                x = Integer.parseInt(str);
            }
            catch (Exception e){
                return -5;
            }
            x = Integer.parseInt(str);
            if (x < 0) {

                return -1;
            } else if (x == 0) {

                return 0;
            }

        return x;
    }
}
