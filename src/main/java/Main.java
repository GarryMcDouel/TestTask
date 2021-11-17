
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Dest dest = new Dest();
    Number number = new Number();
        Scanner console = new Scanner(System.in);
        String str;

        int param1, distance, num;
        System.out.println("Введите расстояние до пункта назначения");
        num = -1;
        while (num <= 0){
            str = console.next();
            num = number.Number(str);

            if (num == -5) {
                System.out.println("Введите расстояние до пункта назначения");
            }
            if (num == -1) {
                System.out.println("Введите значение > 0");
            }
            if (num == -2) {
                System.out.println("Ошибка");
            }

        }
        distance = num;
        param1 = dest.dest(num);

    Gabarit gabarit = new Gabarit();
        int x, y, z;
        int param2;
        num = -1;
        System.out.println("Введите длинну");
        while (num <= 0){
            str = console.next();
            num = number.Number(str);

            if (num == -5) {
                System.out.println("Введите длинну");
            }
            if (num == -1) {
                System.out.println("Введите значение > 0");
            }
            if (num == -2) {
                System.out.println("Ошибка");
            }

        }
        x = num;

        num = -1;
        System.out.println("Введите Ширину");
        while (num <= 0){
            str = console.next();
            num = number.Number(str);

            if (num == -5) {
                System.out.println("Введите Ширину");
            }
            if (num == -1) {
                System.out.println("Введите значение > 0");
            }
            if (num == -2) {
                System.out.println("Ошибка");
            }

        }
        y = num;

        num = -1;
        System.out.println("Введите Высоту");
        while (num <= 0){
            str = console.next();
            num = number.Number(str);

            if (num == -5) {
                System.out.println("Введите Высоту");
            }
            if (num == -1) {
                System.out.println("Введите значение > 0");
            }
            if (num == -2) {
                System.out.println("Ошибка");
            }

        }
        z = num;
    param2 = gabarit.gabarit(x, y, z);

    Fragility fragility = new Fragility();
        String f;
    int param3;
    do {
        System.out.println("Груз хрупкий? y/n");
        while (!console.hasNext()) {
            System.out.println("Введите y/n");
            console.next();
        }
        f = console.next();
        System.out.println(f);
    } while (!f.equals("y") & !f.equals("n"));

        param3 = fragility.frag(f);
    Load load = new Load();


    double param4;
        System.out.println("Введите степень загруженности от 1 до 4");
        num = -1;
        while (num <= 0){
            str = console.next();
            num = number.Number(str);

            if (num == -5) {
                System.out.println("Введите степень загруженности от 1 до 4");
            }
            if (num == -1) {
                System.out.println("Введите значение > 0");
            }
            if (num == -2) {
                System.out.println("Ошибка");
            }
            if (num > 4){
                System.out.println("Введите степень загруженности от 1 до 4");
                num = -1;
            }
        }
        param4 = load.load(num);

    Sum sum = new Sum();
    Double summa;
    summa = sum.Sum(distance, param1, param2, param3, param4);
    if (summa != 0) {
        System.out.println(summa);
    }
    }
}
