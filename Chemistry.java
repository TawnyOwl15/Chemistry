import java.util.Scanner;



public class Chemistry {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое вещество(при вводе кислоты после Н обязательно ставьте индекс(например, H1NO3); при вводе соли - обязательно ставьте и скобки, и индексы(например, К1(NO3)1); при вводе оксида пишите оба индекса):");
        String substance = scanner.nextLine();

        Ins2 a = new Ins2();
        a.setIns(substance);

        String nat1 = Ins2.nat;

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
        double strength1=0;
        double strength2=0;

        strength1 = Ins3.strength;


        if(Ins2.nat.equals("Соль")){
            element01 = Ins2.element11;
            element02 = Ins2.element12;
            val01 = Ins2.val11;
            val02 = Ins2.val12;
            rast1=Ins3.rast;
        } else{
            element1 = Ins2.element;
            val1 = Ins2.val;
        }

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Введите второе вещество(при вводе кислоты после Н обязательно ставьте индекс(например, H1NO3); при вводе соли - обязательно ставьте и скобки, и индексы(например, К1(NO3)1); при вводе оксида пишите оба индекса):");
        substance = scanner2.nextLine();

        a.setIns(substance);
        String nat2 = Ins2.nat;

        strength2 = Ins3.strength;

        if(Ins2.nat.equals("Соль")){
            element001 = Ins2.element11;
            element002 = Ins2.element12;
            val001 = Ins2.val11;
            val002 = Ins2.val12;
            rast2=Ins3.rast;
        } else{
            element2 = Ins2.element;
            val2 = Ins2.val;
        }

        Ins3 e = new Ins3();

        if((nat1.equals("Кислота") && nat2.equals("Основа")) || (nat1.equals("Основа") && nat2.equals("Кислота")) || (nat1.equals("Щелочь") && nat2.equals("Кислота")) || (nat1.equals("Кислота") && nat2.equals("Щелочь"))|| (nat1.equals("Амфотерный") && nat2.equals("Кислота")) || (nat1.equals("Кислота") && nat2.equals("Амфотерный"))) {
            a.setKoef(val1, val2);
            int val11 = (int)Ins2.valent01;
            int val22=(int)Ins2.valent02;

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
            e.setRast(element1, element2);
            if (Ins3.rast.equals("Растворимая")){
                System.out.println("В результате реакции получим: "+ element1 + val11 + "(" + element2 + ")" + val22 + " + " + "H2O");
            } else{
                System.out.println("В результате реакции получим: "+ element1 + val11 + "(" + element2 + ")" + val22 + "↓" + " + " + "H2O");
            }

        } else if((nat1.equals("Соль")) && (nat2.equals("Соль"))){
            e.setRast(element01, element002);
            String rast3 = Ins3.rast;
            e.setRast(element001, element02);
            String rast4 = Ins3.rast;
            if(rast3.equals("No") || rast4.equals("No")){
                if(rast1.equals("Растворимая") && rast2.equals("Растворимая")){
                    a.setKoef(val01, val002);
                    int val011 = (int)Ins2.valent01;
                    int val0021=(int)Ins2.valent02;
                    a.setKoef(val001, val02);
                    int val0011 = (int)Ins2.valent01;
                    int val021=(int)Ins2.valent02;

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
                Ins2.nat = "";
                e.setMe(element01);
                e.setMe(element001);
                if(Ins2.nat.equals("Щелочь")){
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

                    a.setKoef(val2, val02);
                    int val21 = (int)Ins2.valent01;
                    int val011 = (int)val01;
                    int val021=(int)Ins2.valent02;
                    e.setRast(element2, element02);
                    if(Ins3.rast.equals("Растворимая")){
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
            e.setRast(element001, element1);
            rast1=Ins3.rast;
            if((strength1>strength2) || (rast1.equals("No"))) {
                a.setKoef(val1, val001);
                int val11 = (int) Ins2.valent01;
                int val0011 = (int) Ins2.valent02;
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
            a.setKoef(val2, val1);
            int val21 = (int) Ins2.valent01;
            int val11 = (int) Ins2.valent02;
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
            a.setKoef(val1, val2);
            int val11 = (int) Ins2.valent01;
            int val22 = (int) Ins2.valent02;
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
            a.setKoef(val1, val2);
            int val11 = (int) Ins2.valent01;
            int val22 = (int) Ins2.valent02;
            System.out.println("В результате реакции получим: " + element1 + val11 + "(" + element2 + ")" + val22 + " + H2O");
        } else if((nat1.equals("Осн. оксид") || nat1.equals("Амф. оксид") || nat1.equals("Щел. оксид")) && nat2.equals("Немет. оксид")){
            a.setKoef(val1, val2);
            int val11 = (int) Ins2.valent01;
            int val22 = (int) Ins2.valent02;
            System.out.println("В результате реакции получим: " + element1 + val11 + "(" + element2 + ")" + val22);
        }  else if((nat2.equals("Осн. оксид") || nat2.equals("Амф. оксид") || nat2.equals("Щел. оксид")) && nat1.equals("Немет. оксид")){
            a.setKoef(val1, val2);
            int val11 = (int) Ins2.valent01;
            int val22 = (int) Ins2.valent02;
            System.out.println("В результате реакции получим: " + element2 + val22 + "(" + element1 + ")" + val11);
        } else if((nat1.equals("Осн. оксид") || nat1.equals("Амф. оксид") || nat1.equals("Щел. оксид") || nat1.equals("Основа") || nat1.equals("Амфотерный") || nat1.equals("Щелочь")) && (nat2.equals("Кислота") || nat2.equals("Немет. оксид"))){
            a.setKoef(val1, val2);
            int val11 = (int) Ins2.valent01;
            int val22 = (int) Ins2.valent02;
            System.out.println("В результате реакции получим: " + element1 + val11 + "(" + element2 + ")" + val22 + " + H2O");
        } else if ((nat2.equals("Осн. оксид") || nat2.equals("Амф. оксид") || nat2.equals("Щел. оксид") || nat2.equals("Основа") || nat2.equals("Амфотерный") || nat2.equals("Щелочь")) && (nat1.equals("Кислота") || nat1.equals("Немет. оксид"))){
            a.setKoef(val1, val2);
            int val11 = (int) Ins2.valent01;
            int val22 = (int) Ins2.valent02;
            System.out.println("В результате реакции получим: " + element2 + val22 + "(" + element1 + ")" + val11 + " + H2O");
        } else if(nat1.equals("Немет. оксид") && nat2.equals("Соль")){
            if(strength1>strength2){
                a.setKoef(val001, val1);
                int val0011 = (int) Ins2.valent01;
                int val11 = (int) Ins2.valent02;
                int val0021 = (int) val002;
                System.out.println("В результате реакции получим: " + element001 + val0011 + "(" + element1 + ")" + val11 + " + " + "H" + val0021 + element002);
            } else {
                System.out.println("Вещества не взаимодействуют между собой");
            }
        } else if(nat2.equals("Немет. оксид") && nat1.equals("Соль")){
            if(strength1<strength2){
                a.setKoef(val01, val2);
                int val011 = (int) Ins2.valent01;
                int val21 = (int) Ins2.valent02;
                int val021 = (int) val02;
                System.out.println("В результате реакции получим: " + element01 + val011 + "(" + element2 + ")" + val21 + " + " + "H" + val021 + element02);
            } else {
                System.out.println("Вещества не взаимодействуют между собой");
            }
        } else {
            System.out.println("Вещества не взаимодействуют между собой");
        }


    }


}
