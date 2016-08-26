import java.util.Scanner;

public class Chemistry {
    public static void main(String[] args) {
        String element1=" ";
        String element2=" ";
        double val1=0;
        double val2=0;
        String element01="";
        String element02 = "";
        double val01=0;
        double val02=0;
        String element001="";
        String element002="";
        double val001=0;
        double val002=0;
        String rast1="";
        String rast2="";
        double strength1;
        double strength2;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое вещество(при вводе кислоты после Н обязательно ставьте индекс(например, H1NO3); соли - и скобки, и индексы(К1(NO3)1); основы - скобки и индексы необязательны(КОН, Са(ОН)2); при вводе оксида пишите оба индекса(S1O3)):");
        String substance = scanner.nextLine();

        Inspection a = new Inspection();
        a.setIns(substance);

        String nat1 = Inspection.nat;

        strength1 = Inspection2.strength;

        if(Inspection.nat.equals("Соль")){
            element01 = Inspection.element11;
            element02 = Inspection.element12;
            val01 = Inspection.val11;
            val02 = Inspection.val12;
            rast1= Inspection2.rast;
        } else{
            element1 = Inspection.element;
            val1 = Inspection.val;
        }

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Введите второе вещество(при вводе кислоты после Н обязательно ставьте индекс(например, H1NO3); соли - и скобки, и индексы(К1(NO3)1); основы - скобки и индексы необязательны(КОН, Са(ОН)2); при вводе оксида пишите оба индекса(S1O3)):");
        substance = scanner2.nextLine();

        a.setIns(substance);
        String nat2 = Inspection.nat;

        strength2 = Inspection2.strength;

        if(Inspection.nat.equals("Соль")){
            element001 = Inspection.element11;
            element002 = Inspection.element12;
            val001 = Inspection.val11;
            val002 = Inspection.val12;
            rast2= Inspection2.rast;
        } else{
            element2 = Inspection.element;
            val2 = Inspection.val;
        }

        Inspection2 c = new Inspection2();

        if((nat1.equals("Кислота") && nat2.equals("Основа")) || (nat1.equals("Основа") && nat2.equals("Кислота")) || (nat1.equals("Щелочь") && nat2.equals("Кислота")) || (nat1.equals("Кислота") && nat2.equals("Щелочь"))|| (nat1.equals("Амфотерный") && nat2.equals("Кислота")) || (nat1.equals("Кислота") && nat2.equals("Амфотерный"))) {
            a.setIndex(val1, val2);
            int val11 = (int) Inspection.valent01;
            int val22=(int) Inspection.valent02;

            if(nat1.equals("Кислота")) {
                String element;
                element = element1;
                element1 = element2;
                element2 = element;
                int val;
                val = val11;
                val11 = val22;
                val22 = val;
            }
            c.setRast(element1, element2);
            if (Inspection2.rast.equals("Растворимая")){
                System.out.println("В результате реакции получим: "+ element1 + val11 + "(" + element2 + ")" + val22 + " + " + "H2O");
            } else{
                System.out.println("В результате реакции получим: "+ element1 + val11 + "(" + element2 + ")" + val22 + "↓" + " + " + "H2O");
            }

        } else if((nat1.equals("Соль")) && (nat2.equals("Соль"))){
            c.setRast(element01, element002);
            String rast3 = Inspection2.rast;
            c.setRast(element001, element02);
            String rast4 = Inspection2.rast;
            if(rast3.equals("No") || rast4.equals("No")){
                if(rast1.equals("Растворимая") && rast2.equals("Растворимая")){
                    a.setIndex(val01, val002);
                    int val011 = (int) Inspection.valent01;
                    int val0021=(int) Inspection.valent02;
                    a.setIndex(val001, val02);
                    int val0011 = (int) Inspection.valent01;
                    int val021=(int) Inspection.valent02;

                    if(rast3.equals("No") && rast4.equals("No")){
                        System.out.println("В результате реакции получим: " + element01 + val011 + "(" + element002 + ")" + val0021 + "↓" + " + " + element001 + val0011 + "(" + element02 + ")" + val021 + "↓");
                    } else if(rast3.equals("No")){
                        System.out.println("В результате реакции получим: " + element01 + val011 + "(" + element002 + ")" + val0021 + "↓" + " + " + element001 + val0011 + "(" + element02 + ")" + val021);
                    } else  if(rast4.equals("No")){
                        System.out.println("В результате реакции получим: " + element01 + val011 + "(" + element002 + ")" + val0021 + " + " + element001 + val0011 + "(" + element02 + ")" + val021 + "↓");
                    }
                } else{
                    System.out.println("Соли не взаимодействуют между собой(одна или обе не растворимы в воде)");
                }
            } else {
                System.out.println("Соли не взаимодействуют между собой(в результате реакции не выпадает осадок)");
            }

        } else if((nat1.equals("Соль") && nat2.equals("Щелочь")) || (nat1.equals("Щелочь") && nat2.equals("Соль"))){
            if(rast1.equals("Растворимая") || rast2.equals("Растворимая")) {
                Inspection.nat = "";
                c.setMe(element01);
                c.setMe(element001);
                if(Inspection.nat.equals("Щелочь")){
                    System.out.println("Щелочь и соль не взаимодействуют между собой(соль содержит лужный металл)");
                } else {
                    if(nat2.equals("Соль")){
                        element2=element1;
                        element02=element002;
                        element01=element001;
                        val2=val1;
                        val02=val002;
                        val01=val001;
                    }

                    a.setIndex(val2, val02);
                    int val21 = (int) Inspection.valent01;
                    int val011 = (int)val01;
                    int val021=(int) Inspection.valent02;
                    c.setRast(element2, element02);
                    if(Inspection2.rast.equals("Растворимая")){
                        System.out.println("В результате реакции получим: " + element01 + "(OH)" + val011 + "↓ + " + element2 + val21 + "(" + element02 + ")" + val021);
                    } else {
                        System.out.println("В результате реакции получим: " + element01 + "(OH)" + val011 + "↓ + " + element2 + val21 + "(" + element02 + ")" + val021 + "↓");
                    }
                }
            } else{
                System.out.println("Соль не растворима в воде");
            }
        } else if((nat1.equals("Кислота") && nat2.equals("Соль")) || (nat1.equals("Соль") && nat2.equals("Кислота"))){
            if(nat1.equals("Соль")){
                element001=element01;
                element002=element02;
                element1=element2;
                val001=val01;
                val002=val02;
                val1=val2;
                double strength;
                strength=strength1;
                strength1=strength2;
                strength2=strength;
            }
            c.setRast(element001, element1);
            rast1= Inspection2.rast;
            if((strength1>strength2) || (rast1.equals("No"))) {
                a.setIndex(val1, val001);
                int val11 = (int) Inspection.valent01;
                int val0011 = (int) Inspection.valent02;
                int val0021 = (int) val002;
                if(rast1.equals("No")){
                    System.out.println("В результате реакции получим: " + "H" + val0021 + element002 + " + " + element001 + val0011 + "(" + element1 + ")" + val11 + "↓");
                } else{
                    System.out.println("В результате реакции получим: " + "H" + val0021 + element002 + " + " + element001 + val0011 + "(" + element1 + ")" + val11);
                }
            } else {
                System.out.println("Вещества не взаимодействуют между собой");
            }

        } else if(nat1.equals("Амф. оксид") && nat2.equals("Щел. оксид")){
            double h;
            double o = val1;
            for (h = val1; h > 2; h = h - 2) {
                o = o - 1;
            }
            int oO = (int) o;
            element1 = element1 + "O" + oO;
            val1 = h;
            a.setIndex(val2, val1);
            int val21 = (int) Inspection.valent01;
            int val11 = (int) Inspection.valent02;
            System.out.println("В результате реакции получим: " + element2 + val21 + "(" + element1 + ")" + val11);

        } else if(nat2.equals("Амф. оксид") && nat1.equals("Щел. оксид")) {
            double h;
            double o = val2;
            for (h = val2; h > 2; h = h - 2) {
                o = o - 1;
            }
            int oO = (int) o;
            element2 = element2 + "O" + oO;
            val2 = h;
            a.setIndex(val1, val2);
            int val11 = (int) Inspection.valent01;
            int val22 = (int) Inspection.valent02;
            System.out.println("В результате реакции получим: " + element1 + val11 + "(" + element2 + ")" + val22);

        } else if(((nat1.equals("Амфотерный") || nat1.equals("Амф. оксид")) && (nat2.equals("Щелочь") || nat2.equals("Щел. оксид"))) || ((nat2.equals("Амфотерный") || nat2.equals("Амф. оксид")) && (nat1.equals("Щелочь") || nat1.equals("Щел. оксид")))) {
            if (nat2.equals("Щелочь") || nat2.equals("Щел. оксид")) {
                double x;
                x = val1;
                val1 = val2;
                val2 = x;
                String element;
                element = element1;
                element1 = element2;
                element2 = element;
            }
            double h;
            double o = val2;
            for (h = val2; h > 2; h = h - 2) {
                o = o - 1;
            }
            int oO = (int) o;
            element2 = element2 + "O" + oO;
            val2 = h;
            a.setIndex(val1, val2);
            int val11 = (int) Inspection.valent01;
            int val22 = (int) Inspection.valent02;
            System.out.println("В результате реакции получим: " + element1 + val11 + "(" + element2 + ")" + val22 + " + H2O");

        } else if((nat1.equals("Осн. оксид") || nat1.equals("Амф. оксид") || nat1.equals("Щел. оксид")) && nat2.equals("Немет. оксид")){
            a.setIndex(val1, val2);
            int val11 = (int) Inspection.valent01;
            int val22 = (int) Inspection.valent02;
            c.setRast(element1, element2);
            if(Inspection2.rast.equals("No")){
                System.out.println("В результате реакции получим: " + element1 + val11 + "(" + element2 + ")" + val22 + "↓");
            } else {
                System.out.println("В результате реакции получим: " + element1 + val11 + "(" + element2 + ")" + val22);
            }

        }  else if((nat2.equals("Осн. оксид") || nat2.equals("Амф. оксид") || nat2.equals("Щел. оксид")) && nat1.equals("Немет. оксид")){
            a.setIndex(val1, val2);
            int val11 = (int) Inspection.valent01;
            int val22 = (int) Inspection.valent02;
            c.setRast(element2, element1);
            if(Inspection2.rast.equals("No")){
                System.out.println("В результате реакции получим: " + element2 + val22 + "(" + element1 + ")" + val11 + "↓");
            } else {
                System.out.println("В результате реакции получим: " + element2 + val22 + "(" + element1 + ")" + val11);
            }

        } else if((nat1.equals("Осн. оксид") || nat1.equals("Амф. оксид") || nat1.equals("Щел. оксид") || nat1.equals("Основа") || nat1.equals("Амфотерный") || nat1.equals("Щелочь")) && (nat2.equals("Кислота") || nat2.equals("Немет. оксид"))){
            a.setIndex(val1, val2);
            int val11 = (int) Inspection.valent01;
            int val22 = (int) Inspection.valent02;
            c.setRast(element1, element2);
            if(Inspection2.rast.equals("No")){
                System.out.println("В результате реакции получим: " + element1 + val11 + "(" + element2 + ")" + val22 + "↓ + H2O");
            } else {
                System.out.println("В результате реакции получим: " + element1 + val11 + "(" + element2 + ")" + val22 + " + H2O");
            }

        } else if ((nat2.equals("Осн. оксид") || nat2.equals("Амф. оксид") || nat2.equals("Щел. оксид") || nat2.equals("Основа") || nat2.equals("Амфотерный") || nat2.equals("Щелочь")) && (nat1.equals("Кислота") || nat1.equals("Немет. оксид"))){
            a.setIndex(val1, val2);
            int val11 = (int) Inspection.valent01;
            int val22 = (int) Inspection.valent02;
            c.setRast(element2,element1);
            if(Inspection2.rast.equals("No")){
                System.out.println("В результате реакции получим: " + element2 + val22 + "(" + element1 + ")" + val11 + "↓ + H2O");
            } else {
                System.out.println("В результате реакции получим: " + element2 + val22 + "(" + element1 + ")" + val11 + " + H2O");
            }

        } else if(nat1.equals("Немет. оксид") && nat2.equals("Соль")){
            if((strength1>strength2) && (strength1>2)){
                a.setIndex(val001, val1);
                int val0011 = (int) Inspection.valent01;
                int val11 = (int) Inspection.valent02;

                if(element002.equals("Cl") || element002.equals("Br") || element002.equals("I") || element002.equals("F")){
                    int val0021 = 2;
                    element002=element002+val0021;
                } else if(element002.equals("S")){

                } else {
                    char s2 = element002.charAt(1);
                    if(s2=='O'){
                        a.setVal(element002, 3);
                        double valEl= Inspection.val*2-val002;
                        a.setIndex(valEl, 2);
                        char s1 = element002.charAt(0);
                        int val0021 = (int) Inspection.valent02;
                        int o = (int) Inspection.valent01;
                        element002 = Character.toString(s1)+val0021+"O"+o;
                    } else {
                        a.setVal(element002, 4);
                        double valEl = Inspection.val * 2 - val002;
                        a.setIndex(valEl, 2);
                        char s1 = element002.charAt(0);
                        int val0021 = (int) Inspection.valent02;
                        int o = (int) Inspection.valent01;
                        element002 = Character.toString(s1) + Character.toString(s2) + val0021 + "O" + o;
                    }
                }
                c.setRast(element001,element1);
                if(Inspection2.rast.equals("No")){
                    System.out.println("В результате реакции получим: " + element001 + val0011 + "(" + element1 + ")" + val11 + "↓ + " + element002);
                } else {
                    System.out.println("В результате реакции получим: " + element001 + val0011 + "(" + element1 + ")" + val11 + " + " + element002);
                }
            } else {
                System.out.println("Вещества не взаимодействуют между собой");
            }
        } else if(nat2.equals("Немет. оксид") && nat1.equals("Соль")){
            if((strength1<strength2) && (strength2>2)){
                a.setIndex(val01, val2);
                int val011 = (int) Inspection.valent01;
                int val21 = (int) Inspection.valent02;

                if(element02.equals("Cl") || element02.equals("Br") || element02.equals("I") || element02.equals("F")) {
                    int val021 = 2;
                    element02 = element02 + val021;
                } else if(element02.equals("S")){
                    //елемент и индекс остаются те же
                } else {
                    char s2 = element02.charAt(1);
                    if(s2=='O'){
                        a.setVal(element02, 3);
                        double valEl= Inspection.val*2-val02;
                        a.setIndex(valEl, 2);
                        char s1 = element02.charAt(0);
                        int val021 = (int) Inspection.valent02;
                        int o = (int) Inspection.valent01;
                        element02 = Character.toString(s1)+val021+"O"+o;
                    } else {
                        a.setVal(element02, 4);
                        double valEl = Inspection.val * 2 - val02;
                        a.setIndex(valEl, 2);
                        char s1 = element02.charAt(0);
                        int val021 = (int) Inspection.valent02;
                        int o = (int) Inspection.valent01;
                        element02 = Character.toString(s1) + Character.toString(s2) + val021 + "O" + o;
                    }
                }
                c.setRast(element01, element2);
                if(Inspection2.rast.equals("No")){
                    System.out.println("В результате реакции получим: " + element01 + val011 + "(" + element2 + ")" + val21 + "↓ + " + element02);
                } else {
                    System.out.println("В результате реакции получим: " + element01 + val011 + "(" + element2 + ")" + val21 + " + " + element02);
                }
            } else {
                System.out.println("Вещества не взаимодействуют между собой");
            }
        } else {
            System.out.println("Вещества не взаимодействуют между собой");
        }
    }
}
