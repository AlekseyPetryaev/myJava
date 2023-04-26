package seminars.sem1;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
//        int[] arr = new int[]{1,1,1,1,1,1,0,0,1,1,1};
//        ex1(arr, 0);
//        int[] arr = new int[]{7,7,3,2,5,3,0,3,3,3};
//        int val = 4;
//        ex2(arr, val);
//        String text = "Р”РѕР±СЂРѕ РїРѕР¶Р°Р»РѕРІР°С‚СЊ РЅР° РєСѓСЂСЃ РїРѕ Java";
//        System.out.println(ex3(text));
        int a = 2;
        int b = 0;
        double c = ex4(a, b);
        System.out.println(c);

        System.out.println(10%3 == 0);
    }

    static double ex4(int a, int b){
        /*
        Р РµР°Р»РёР·РѕРІР°С‚СЊ С„СѓРЅРєС†РёСЋ РІРѕР·РІРµРґРµРЅРёСЏ С‡РёСЃР»Р° Р° РІ СЃС‚РµРїРµРЅСЊ b. a, b РёР· Z. РЎРІРѕРґСЏ РєРѕР»РёС‡РµСЃС‚РІРѕ РІС‹РїРѕР»РЅСЏРµРјС‹С… РґРµР№СЃС‚РІРёР№ Рє РјРёРЅРёРјСѓРјСѓ.
        РџСЂРёРјРµСЂ 1: Р° = 3, b = 2, РѕС‚РІРµС‚: 9
        РџСЂРёРјРµСЂ 2: Р° = 2, b = -2, РѕС‚РІРµС‚: 0.25
        РџСЂРёРјРµСЂ 3: Р° = 3, b = 0, РѕС‚РІРµС‚: 1
         */
        if (b == 0){
            return 1;
        }
        if (a == 0 || a == 1){
            return a;
        }
        double a1 = a;
        double b1 = b;
        if (b < 0){
            a1 = 1.0/a;
            b1 = -b;
        }
        double res = a1;
        for (int i = 0; i < b1-1; i++) {
            res *= a1;
        }
        return res;
    }
    static String ex3(String text){
        /*
        Р’Рѕ С„СЂР°Р·Рµ "Р”РѕР±СЂРѕ РїРѕР¶Р°Р»РѕРІР°С‚СЊ РЅР° РєСѓСЂСЃ РїРѕ Java" РїРµСЂРµСЃС‚Р°РІРёС‚СЊ СЃР»РѕРІР° РІ РѕР±СЂР°С‚РЅРѕРј РїРѕСЂСЏРґРєРµ.
         */
        String[] temp = text.split(" ");
        String res = "";
        for (int i = temp.length-1; i >= 0; i--) {
            res += temp[i] + " ";
        }
        return res;
    }
    static void ex2(int[] arr, int val){
        /*
        Р”Р°РЅ РјР°СЃСЃРёРІ nums = [3,2,5,3] Рё С‡РёСЃР»Рѕ val = 3.
        РёС‚РѕРі: [2,5,3,3]
        Р•СЃР»Рё РІ РјР°СЃСЃРёРІРµ РµСЃС‚СЊ С‡РёСЃР»Р°, СЂР°РІРЅС‹Рµ Р·Р°РґР°РЅРЅРѕРјСѓ, РЅСѓР¶РЅРѕ РїРµСЂРµРЅРµСЃС‚Рё СЌС‚Рё СЌР»РµРјРµРЅС‚С‹ РІ РєРѕРЅРµС† РјР°СЃСЃРёРІР°.
        РўР°РєРёРј РѕР±СЂР°Р·РѕРј, РїРµСЂРІС‹Рµ РЅРµСЃРєРѕР»СЊРєРѕ (РёР»Рё РІСЃРµ) СЌР»РµРјРµРЅС‚РѕРІ РјР°СЃСЃРёРІР° РґРѕР»Р¶РЅС‹ Р±С‹С‚СЊ РѕС‚Р»РёС‡РЅС‹ РѕС‚ Р·Р°РґР°РЅРЅРѕРіРѕ,
        Р° РѕСЃС‚Р°Р»СЊРЅС‹Рµ - СЂР°РІРЅС‹ РµРјСѓ.
         */
        int[] res = new int[arr.length];
        Arrays.fill(res, val);
        for (int i = 0, j = 0; i < res.length; i++) {
            if (arr[i] != val){
                res[j] = arr[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(res));
    }
    static void ex1(int[] arr, int val){
    /*
        Р”Р°РЅ РјР°СЃСЃРёРІ РґРІРѕРёС‡РЅС‹С… С‡РёСЃРµР», РЅР°РїСЂРёРјРµСЂ [1,1,0,1,1,1], РІС‹РІРµСЃС‚Рё РјР°РєСЃРёРјР°Р»СЊРЅРѕРµ РєРѕР»РёС‡РµСЃС‚РІРѕ РїРѕРґСЂСЏРґ РёРґСѓС‰РёС… 1.
    */
        int maxCount = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == val){
                count++;
            } else {
                if (count > maxCount){
                    maxCount = count;
                }
                count = 0;
            }
        }
        if (count > maxCount){
            maxCount = count;
        }
        System.out.println(maxCount);
    }
    static void ex0(){
        /*
        Р’ РєРѕРЅСЃРѕР»Рё Р·Р°РїСЂРѕСЃРёС‚СЊ РёРјСЏ РїРѕР»СЊР·РѕРІР°С‚РµР»СЏ. Р’ Р·Р°РІРёСЃРёРјРѕСЃС‚Рё РѕС‚ С‚РµРєСѓС‰РµРіРѕ РІСЂРµРјРµРЅРё, РІС‹РІРµСЃС‚Рё РїСЂРёРІРµС‚СЃС‚РІРёРµ РІРёРґР°
        "Р”РѕР±СЂРѕРµ СѓС‚СЂРѕ, <РРјСЏ>!", РµСЃР»Рё РІСЂРµРјСЏ РѕС‚ 05:00 РґРѕ 11:59
        "Р”РѕР±СЂС‹Р№ РґРµРЅСЊ, <РРјСЏ>!", РµСЃР»Рё РІСЂРµРјСЏ РѕС‚ 12:00 РґРѕ 17:59;
        "Р”РѕР±СЂС‹Р№ РІРµС‡РµСЂ, <РРјСЏ>!", РµСЃР»Рё РІСЂРµРјСЏ РѕС‚ 18:00 РґРѕ 22:59;
        "Р”РѕР±СЂРѕР№ РЅРѕС‡Рё, <РРјСЏ>!", РµСЃР»Рё РІСЂРµРјСЏ РѕС‚ 23:00 РґРѕ 4:59
         */
        System.out.println("РљР°Рє РІР°СЃ Р·РѕРІСѓС‚?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
//        System.out.println("РџСЂРёРІРµС‚, " + name);
        LocalTime time = LocalTime.now();
//        LocalTime time1 = LocalTime.of(5, 32);
        int hour = time.getHour();

        if (hour >= 5 && hour < 12){
            System.out.println("Р”РѕР±СЂРѕРµ СѓС‚СЂРѕ, " + name + "!");
        } else if (hour >= 12 && hour < 18) {
            System.out.println("Р”РѕР±СЂС‹Р№ РґРµРЅСЊ, " + name + "!");
        } else if (hour >= 18 && hour < 23) {
            System.out.println("Р”РѕР±СЂС‹Р№ РІРµС‡РµСЂ, " + name + "!");
        } else {
            System.out.println("Р”РѕР±СЂРѕР№ РЅРѕС‡Рё, " + name + "!");
        }
    }
}

