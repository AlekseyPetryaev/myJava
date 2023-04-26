Настройка рабочего места
/**
* Program
*/
public class Program {
 public static void main(String[] args) {
 System.out.println("Goodbye world");
 }
}
Структура простой программы


                                   Основы: типы данных
class Program
{
    public static void main(String[] args) {
        short age = 10;
        int salary = 123456;
        System.out.println(age); //10
        System.out.println(salary); //123456
    }
}


                                Основы: типы данных
class Program
{
    public static void main(String[] args) {
        float e = 2.7f;
        double pi = 3.1415;
        System.out.println(e); // 2.7
        System.out.println(pi); // 3.1415
    }
}


                                Основы: типы данных
class Program
{
    public static void main(String[] args) {
        char ch = '1';
        System.out.println(Character.isDigit(ch)); // true
        ch = 'a';
        System.out.println(Character.isDigit(ch)); //
    }
}

                                Основы: типы данных

public class Program {
    public static void main(String[] args) {
        boolean flag1 = 123 <= 234;
        System.out.println(flag1); // true
        boolean flag2 = 123 >= 234 || flag1;
        System.out.println(flag2); // true
        boolean flag3 = flag1 ^ flag2;
        System.out.println(flag3); // false
    }
}


                                    //Неявная типизация
public class program {
    public static void main(String[] args) {
        var a = 123;
        System.out.println(a); // 123
        var d = 123.456;
        System.out.println(d); // 123.456
        System.out.println(getType(d)); // Double
        d = 1022;
        System.out.println(d); // 1022
        //d = "mistake";
        //error: incompatible types:
        //String cannot be converted to double
    }
        static String getType(Object o){
        return o.getClass().getSimpleName();
    }
}

                            Основы: классы-обертки

Примитив                Обертка
int                     Integer
short                   Short
long                    Long
byte                    Byte
float                   Float
double                  Double
char                    Character
boolean                 Boolean


                        Основы: типы данных
class Program
{
    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE); // 2147483647
        System.out.println(Integer.MIN_VALUE); // -2147483648
    }
}


                        Операции Java
● Присваивание: =
● Арифметические: *, /, +, -, %, ++, --
● Операции сравнения: <, >, ==, !=, >=, <=
● Логические операции: ||, &&, ^, !
● Побитовые операции <<, >>, &, |, ^


                                Массивы
                                        Одномерные
public class program {
    public static void main(String[] args) {

        int[] arr = new int[10];
        System.out.println(arr.length); // 10

        arr = new int[] { 1, 2, 3, 4, 5 };
        System.out.println(arr.length); //
    }
}


                                Массивы
                                        Многомерные
public class Program {
    public static void main(String[] args) {
        int[] arr[] = new int[3][5];
        for (int[] line : arr) {
            for (int item : line) {
                System.out.printf("%d ", item);
            }
            System.out.println();
        }
    }
}


Можно
public class Program {
 public static void main(String[] args) {
 int i = 123; double d = i;
 System.out.println(i); // 123
 System.out.println(d); // 123.0
 d = 3.1415; i = (int)d;
 System.out.println(d); // 3.1415
 System.out.println(i); // 3
 d = 3.9415; i = (int)d;
 System.out.println(d); // 3.9415
 System.out.println(i); // 3
 byte b = Byte.parseByte("123");
 System.out.println(b); // 123
 b = Byte.parseByte("1234");
 System.out.println(b); // NumberFormatException: Value out of range
 }
}


НО
class Program
{
    public static void main(String[] args) {
        int[] a = new int[10];
        double[] d = a; // ИЗУЧАЕМ ковариантность и контравариантность
    }
}


Получение данных из терминала
Строки
import java.util.Scanner;
public class Program {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("name: ");
        String name = iScanner.nextLine();
        System.out.printf("Привет, %s!", name);
        iScanner.close();
    }
}


                                Получение данных из терминала
                                Некоторые примитивы
import java.util.Scanner;
public class Program {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("int a: ");
        int x = iScanner.nextInt();
        System.out.printf("double a: ");
        double y = iScanner.nextDouble();
        System.out.printf("%d + %f = %f", x, y, x + y);
        iScanner.close();
    }}

//                                    Получение данных из терминала    
//                                    Проверка на соответствие получаемого типа
import java.util.Scanner;
public class Program {
 public static void main(String[] args) {
 Scanner iScanner = new Scanner(System.in);
 System.out.printf("int a: ");
 boolean flag = iScanner.hasNextInt();
 System.out.println(flag);
 int i = iScanner.nextInt();
 System.out.println(i);
 iScanner.close();
 } }


//                                       Форматированный вывод
public class Program {
    public static void main(String[] args) {
        int a = 1, b = 2;
        int c = a + b;
        String res = a + " + " + b + " = " + c;
        System.out.println(res);
    }
}

                                        Форматированный вывод
public class Program {
    public static void main(String[] args) {
        int a = 1, b = 2;
        int c = a + b;
        String res = String.format("%d + %d = %d \n", a, b, c);
        System.out.printf("%d + %d = %d \n", a, b, c);
        System.out.println(res);
    }
}

                                        Виды спецификаторов
%d: целочисленных значений
%x: для вывода шестнадцатеричных чисел
%f: для вывода чисел с плавающей точкой
%e: для вывода чисел в экспоненциальной форме,
например, 3.1415e+01
%c: для вывода одиночного символа
%s: для вывода строковых значений

                                        Виды спецификаторов
public class Program {
 public static void main(String[] args) {

 float pi = 3.1415f;
 System.out.printf("%f\n", pi); // 3,141500
 System.out.printf("%.2f\n", pi); // 3,14
 System.out.printf("%.3f\n", pi); // 3,141
 System.out.printf("%e\n", pi); // 3,141500e+00
 System.out.printf("%.2e\n", pi); // 3,14e+00
 System.out.printf("%.3e\n", pi); // 3,141e+00
 }
}

                                    Область видимости переменных
У переменных существует понятие «область видимости».
Если переменную объявили внутри некоторого блока фигурных скобок { },
то снаружи этого блока переменная будет недоступна.
public class Program {
    public static void main(String[] args) {
    {
        int i = 123;
        System.out.println(i);
    }
    System.out.println(i); // error: cannot find symbol
    }
}


                                        Функции и методы
public class Program {
    static void sayHi() {
        System.out.println("hi!");
    }
    static int sum(int a, int b) {
        return a+b;
    }
    static double factor(int n) {
        if(n==1)return 1;
        return n * factor(n-1);
    }
    public static void main(String[] args) {
        sayHi(); // hi!
        System.out.println(sum(1, 3)); // 4
        System.out.println(factor(5)); // 120.0
    }}

                                        Управляющие конструкции:
                                        условный оператор

public class Program {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c;
        if (a > b) {
        c = a;
        } else {
        c = b;
        }
        System.out.println(c);
    }
}

//                                   Управляющие конструкции:
//                                    условный оператор

public class Program {
    public static void main(String[] args) {
    int a = 1;
    int b = 2;
    int c = 0;
    if (a > b) c = a;
    if (b > a) c = b;
    System.out.println(c);
    }
}

                                        Управляющие конструкции:
                                        тернарный 
public class program {
    public static void main(String[] args) {
    int a = 1;
    int b = 2;
    int min = a < b ? a : b;
    System.out.println(min);
    }
}


                                        Оператор выбора
import java.util.Scanner;
public class program {
    public static void main(String[] args) {
        int mounth = value;
        String text = "";
        switch (mounth) {
            case 1:
                text = "Autumn";
                break;
            ...
            default:
                text = "mistake";
                break;
        }
        System.out.println(text);
        iScanner.close();
    }
}


Циклы
Цикл — это многократное выполнение одинаковой
последовательности действий.
В java доступны следующие циклы:
● цикл while;
● цикл do while;
● цикл for; и его модификация for in

Цикл while
public class Program {
    public static void main(String[] args) {
        int value = 321;
        int count = 0;
        while (value != 0) {
            value /= 10;
            count++;
        }
        System.out.println(count);
    }
}


                                        Цикл do while
public class program {
    public static void main(String[] args) {
        int value = 321;
        int count = 0;
        do {
            value /= 10;
            count++;
        } while (value != 0);
        System.out.println(count);
    }
}