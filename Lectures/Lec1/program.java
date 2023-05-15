// public class program {
//     public static void main(String[] args) {
//         String s =" 2";
//         System.out.println(s);
//     }
// }

///////////////////////////////////////////////////////////////////////////
// public class program {
//     public static void main(String[] args) {
//         double f = 123.45D;
//         System.out.println(f);
//     }

// }

///////////////////////////////////////////////////////////////////////////
// public class program {
//     public static void main(String[] args) {
//         boolean f = true & false;
//         System.out.println(f);
//     }
// }
///////////////////////////////////////////////////////////////////////////
// public class program {
//     public static void main(String[] args) {
//         boolean f = true && false;
//         System.out.println(f);
//     }
// }

///////////////////////////////////////////////////////////////////////////
// public class program {
//         public static void main(String[] args) {
//             boolean f = true ^ false;
//             System.out.println(f);
//         }
//     }

///////////////////////////////////////////////////////////////////////////
// public class program {
//     public static void main(String[] args ) {
//         int i = 123;
//         System.out.println(Integer.MIN_VALUE);
//     }
// }

///////////////////////////////////////////////////////////////////////////
// public class program {
//     public static void main(String[] args ) {
//         int i = 123;
//         System.out.println(Integer.MIN_VALUE);
//     }
// }

///////////////////////////////////////////////////////////////////////////
// public class program {
//     public static void main(String[] args ) {
//         String s ="qwer";
//         s.charAt(1);
//         System.out.println(Integer.MIN_VALUE);
//     }
// }

/////////////////////////////////////////////////////////////////
// public class program {
//     public static void main(String[] args ) {
//         int a =123;
//         System.out.println(a);
//     }
// }

// 123

///////////////////////////////////////////////////////////////////////////
// public class program {
//     public static void main(String[] args ) {
//         int a =123;
//         a++;
//         System.out.println(a);
//     }
// }

//124
///////////////////////////////////////////////////////////////////////////
// public class program {
//     public static void main(String[] args ) {
//         int a =123;

//         System.out.println(a++);
//         System.out.println(a);
//     }
// }
// 123
// 124
///////////////////////////////////////////////////////////////////////////
// public class program {
//     public static void main(String[] args ) {
//         int a =123;

//         System.out.println(++a);
//     }
// }
// 124
///////////////////////////////////////////////////////////////////////////
// public class program {
//     public static void main(String[] args ) {
//         int a =123;
//         //a = a -- - --a;
//         a = --a-a--;

//         System.out.println(a);
//     }
// }
//2
//0
///////////////////////////////////////////////////////////////////////////
// public class program {
//     public static void main(String[] args ) {
//         boolean f = 123 > 234;                  // false
//         boolean f = 123 < 234;                  // true
//         boolean f = 123 >= 234;                 // false
//         boolean f = 123 <= 234;                 // true
//         boolean f = 123 != 234;                   //true
//         System.out.println(f);
//     }
// }

///////////////////////////////////////////////////////////////////////////
// public class program {
//     public static void main(String[] args ) {
        //int a = 8;                               //16
        // 1000 
        //a = a << 1; 
        //System.out.println(a << 1);     
        //int a = 18;                             // 9
        //10000
        //a = a << 1;                                                    
        //System.out.println(a >> 1);
        //int a = 5;                             // 7
        //int b = 2;
        // 101
        // 010
        // 111
        //System.out.println(a | b);
        //int a = 5;                                // 0
        //int b = 2;
        // 101
        // 010
        // 000
        //System.out.println(a & b);
        //int a = 5;                                // 7
        //int b = 2;
        // 101
        // 010
        // 000
        //System.out.println(a ^ b);
        //int a = 5;                                // 7
        //int b = 2;
        //System.out.println(a & b);               //true
        //System.out.println(a && b);              //true
//     }
// }
///////////////////////////////////////////////////////////////////////////
// public class program {
//     public static void main(String[] args ) {
//         String s = "qwer"; // 4, 0...3;                 
//         //boolean b = s.length() >= 5 && s.charAt(4) == '1';      //false
//         boolean b = s.length() >= 5 & s.charAt(4) =='1';
//         System.out.println(b);                                          
//     }
// }
///////////////////////////////////////////////////////////////////////////
// public class program {
//     public static void main(String[] args ) {
//         String s = "qwer"; // 4, 0...3;                 
//         boolean b = s.length() >= 5 || s.charAt(4) == '1';      //false
//         //boolean b = s.length() >= 5 | s.charAt(4) =='1';
//         System.out.println(b);                                          
//     }
// }
///////////////////////////////////////////////////////////////////////////
// public class program {
//     public static void main(String[] args ) {
        
//         int[] arr = new int[10];
//         System.out.println(arr[3]);   // 0                                        
//     }
// }
///////////////////////////////////////////////////////////////////////////
// public class program {
//     public static void main(String[] args ) {
        
//         int[] arr = new int[10];
//         System.out.println(arr[3]);   // 0                                        
//     }
// }
/////////////////////////////////////////////////////////////////////////////
// public class program {
//     public static void main(String[] args ) {
        
//         int[] arr = new int[10];
//         arr[3] = 13;
//         System.out.println(arr[3]);   // 0                                        
//     }
// }
////////////////////////////////////////////////////////////////////////////////
//Приветствует по имени
// import java.util.Scanner;
// public class program {
//     public static void main(String[] args) {
//         Scanner iScanner = new Scanner(System.in);
//         System.out.printf("name: ");
//         String name = iScanner.nextLine();
//         System.out.printf("Привет, %s!", name);
//         iScanner.close();
//     }
// }

// // name: Aleksey
// // Привет, Aleksey!
/////////////////////////////////////////////////////////////////////////////////
// // Складывает 
// import java.util.Scanner;
// public class program {
//     public static void main(String[] args) {
//         Scanner iScanner = new Scanner(System.in);
//         System.out.printf("int a: ");
//         int x = iScanner.nextInt();
//         System.out.printf("double a: ");
//         double y = iScanner.nextDouble();
//         System.out.printf("%d + %f = %f", x, y, x + y);
//         iScanner.close();
//     }}
///////////////////////////////////////////////////////////////////////////////////

// import java.util.Scanner;
// public class program {
//     public static void main(String[] args) {
//         Scanner iScanner = new Scanner(System.in);
//         System.out.printf("int a: ");
//         boolean flag = iScanner.hasNextInt();
//         System.out.println(flag);
//         int i = iScanner.nextInt();
//         System.out.println(i);
//         iScanner.close();
//     } }

    // Ответ
    // int a: 4
    // true
    // 4
/////////////////////////////////////////////////////////////////////////////////

// public class program {
//     public static void main(String[] args) {
//         int a = 1, b = 2;
//         int c = a + b;
//         String res = a + " + " + b + " = " + c;
//         System.out.println(res);
//     }
// }

// Ответ
// 1 + 2 = 3
//////////////////////////////////////////////////////////////////////////////////
// public class program {
//     public static void main(String[] args) {
//         String s = "qwe";
//         int a = 123;
//         String q = s + a;
//         System.out.println(q);
//     }
// }

// Ответ qwe123
/////////////////////////////////////////////////////////////////////////////////////
// public class program {
//     public static void main(String[] args) {
//         int a = 1, b = 2;
//         int c = a + b;
//         String res = String.format("%d + %d = %d \n", a, b, c);
//         System.out.printf("%d + %d = %d \n", a, b, c);
//         System.out.println(res);
//     }
// }

// 1 + 2 = 3 
// 1 + 2 = 3
///////////////////////////////////////////////////////////////////////////////////////

// public class program {
//     public static void main(String[] args) {

//     float pi = 3.1415f;
//     System.out.printf("%f\n", pi);     // 3,141500
//     System.out.printf("%.2f\n", pi);   // 3,14
//     System.out.printf("%.3f\n", pi);   // 3,141
//     System.out.printf("%e\n", pi);     // 3,141500e+00
//     System.out.printf("%.2e\n", pi);   // 3,14e+00
//     System.out.printf("%.3e\n", pi);   // 3,141e+00
//     }
// }

//////////////////////////////////////////////////////////////////////////////////////
// public class program {
//     static void sayHi() {
//         System.out.println("hi!");
//     }
//     static int sum(int a, int b) {
//         return a+b;
//     }
//     static double factor(int n) {
//         if(n==1)return 1;
//         return n * factor(n-1);
//     }
//     public static void main(String[] args) {
//         sayHi(); // hi!
//         System.out.println(sum(1, 3)); // 4
//         System.out.println(factor(5)); // 120.0
//     }}

// Ответ
//     hi!
//     4
//     120.0

//////////////////////////////////////////////////////////////////////////////////
// public class program {
//     public static void main(String[] args) {
//         int a = 1;
//         int b = 2;
//         int c;
//         if (a > b) {
//             c = a;
//         } else {
//             c = b;
//         }
//         System.out.println(c);
//     }
// }

// //Ответ 2

//                                   Управляющие конструкции:
//                                    условный оператор

// public class program {
//     public static void main(String[] args) {
//     int a = 1;
//     int b = 2;
//     int c = 0;
//     if (a > b) c = a;
//     if (b > a) c = b;
//     System.out.println(c);
//     }
// }

//Ответ 2

//                                       Управляющие конструкции:
//                                       тернарный 
// public class program {
//     public static void main(String[] args) {
//     int a = 1;
//     int b = 2;
//     int min = a < b ? a : b;
//     System.out.println(min);
//     }
// }

//Ответ 1

//                                Оператор выбора
// import java.util.Scanner;
// public class program {
//     public static void main(String[] args) {
//         int mounth = value;
//         String text = "";
//         switch (mounth) {
//             case 1:
//                 text = "Autumn";
//                 break;
//             ...
//             default:
//                 text = "mistake";
//                 break;
//         }
//         System.out.println(text);
//         iScanner.close();
//     }
// }

//                                      Цикл while
// public class program {
//     public static void main(String[] args) {
//         int value = 321;
//         int count = 0;
//         while (value != 0) {
//             value /= 10;
//             count++;
//         }
//         System.out.println(count);
//     }
// }

//Ответ 3

//                                        Цикл do while
// public class program {
//     public static void main(String[] args) {
//         int value = 321;
//         int count = 0;
//         do {
//             value /= 10;
//             count++;
//         } while (value != 0);
//         System.out.println(count);
//     }
// }