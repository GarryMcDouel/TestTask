import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Dest dest = new Dest();
    Number number = new Number();
        Scanner console = new Scanner(System.in);
        String str;
        // расчет стоимости зависящей от растояния до пункта назначения
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
        //Расчет надбавки за габариты
    Gabarit gabarit = new Gabarit();
        int length, width, high;
        int param2;
        //Ввод длины
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
        length = num;
        //Ввод ширины
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
        width = num;
        //Ввод высоты
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
        high = num;

    param2 = gabarit.gabarit(length, width, high);
//Спрашиваем про шрупкость груза
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

//Спрашиваем про степень загруженности
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
//Расчет суммы доставки.
    Sum sum = new Sum();
    Double summa;
    summa = sum.Sum(distance, param1, param2, param3, param4);
    if (summa != 0) {
        System.out.println(summa);
    }



    }
}
