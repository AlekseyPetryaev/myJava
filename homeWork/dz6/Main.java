package homeWork.dz6;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Map.Entry;

public class Main{
    public static void main(String[] args) {
        laptops lap1=new laptops("PB",4540,"Hp");
        lap1.setColor("gray");
        lap1.setHDD(125);
        lap1.setOS("Windows");
        lap1.setRAM(4);
        
        laptops lap2=new laptops("wR",1234,"LG");
        lap2.setColor("black");
        lap2.setHDD(250);
        lap2.setOS("Unix");
        lap2.setRAM(6);

        laptops lap3=new laptops("YX",2345,"Acer");
        lap3.setColor("brown");
        lap3.setHDD(125);
        lap3.setOS("Linux");
        lap3.setRAM(6);

        laptops lap4=new laptops("AN",3456,"Hp");
        lap4.setColor("black");
        lap4.setHDD(250);
        lap4.setOS("Windows");
        lap4.setRAM(8);

        laptops lap5=new laptops("OK",4567,"LG");
        lap5.setColor("white");
        lap5.setHDD(1000);
        lap5.setOS("Unix");
        lap5.setRAM(8);

        HashSet <laptops> laptops = new HashSet<>(Arrays.asList(lap1,lap2,lap3,lap4,lap5));
        HashSet <laptops> res = new HashSet<>();

        System.out.println("Здравствуйте");
        System.out.print("Введите цифру, раздела:\n 1 - ОЗУ \n 2 - Объем ЖД \n 3 - Операционная система \n 4 - цвет \n 5 - чтобы осуществить поиск\n");
        Scanner sc = new Scanner(System.in);
        Integer n = sc.nextInt();
        sc.nextLine();
        HashMap<String, Object> filters = new HashMap<>();
        while(n!=5){
        if(n==1){
            System.out.println("Введите размер оперативной памяти");
            Integer temp = sc.nextInt();
            sc.nextLine();
            filters.put("RAM", temp);
        }
        if(n==2){
            System.out.println("Введите объем ЖД" );
            Integer temp = sc.nextInt();
            sc.nextLine();
            filters.put("HDD", temp);
        }
        if(n==3){
            System.out.println("Введите ОС");
            String temp = sc.nextLine();
            filters.put("OS", temp);
        }
        if(n==4){
            System.out.println("Введите цвет");
            String temp = sc.nextLine();
            filters.put("color", temp);
        }
        System.out.print("Введите цифру, раздела:\n 1 - ОЗУ \n 2 - Объем ЖД \n 3 - Операционная система \n 4 - цвет \n 5 - чтобы осуществить поиск\n");
        n = sc.nextInt();
        sc.nextLine();
    }
        for (Entry<String, Object> entry : filters.entrySet()) {
            if(entry.getKey().equals("RAM")){
                Iterator it = laptops.iterator();
                while(it.hasNext()){
                    laptops lap = (laptops) it.next();
                    if(lap.getRAM()>=(Integer)entry.getValue()){
                        res.add(lap);
                    }
                }
                }
            if(entry.getKey().equals("HDD")){
                Iterator it = laptops.iterator();
                while(it.hasNext()){
                    laptops lap = (laptops)it.next();
                    if(lap.getHDD()>=(Integer)entry.getValue()){
                        res.add(lap);
                        }
                    }
                    }
            if(entry.getKey().equals("OS")){
                Iterator it = laptops.iterator();
                while(it.hasNext()){
                    laptops lap = (laptops)it.next();
                        if(lap.getOS().equals(entry.getValue())){
                            res.add(lap);
                            }
                        }
                        }
            if(entry.getKey().equals("color")){
                Iterator it = laptops.iterator();
                while(it.hasNext()){
                    laptops lap = (laptops)it.next();
                        if(lap.getColor().equals(entry.getValue())){
                            res.add(lap);
                                    }
                                }
                            }
                        }
                    
                        Iterator it = res.iterator();
                        while(it.hasNext()){
                            laptops lap = (laptops)it.next();
                        System.out.println(lap.toString());
                        System.out.println();
                    }
                    
                    
                }}