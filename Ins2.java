public class Ins2 {
    public static String element;
    public static String element11;
    public static String element12;
    public static String nat = "Empty";
    public static double val;
    public static double val11;
    public static double val12;
    double koef1=0;
    double koef2=0;
    public static double valent01;
    public static double valent02;

    public void setVal(String name, int n) {
        char num = name.charAt(n - 1);
        val = Character.getNumericValue(num);
    }

    public void setIns(String substance) {
        nat="Empty";
        char sym1 = substance.charAt(0);
        String s1 = Character.toString(sym1);

        char sym2 = substance.charAt(1);
        String s2 = Character.toString(sym2);

        char sym3 = substance.charAt(2);
        String s3 = Character.toString(sym3);

        Ins3 b = new Ins3();

        if ((substance.equals("H1F")) || (substance.equals("H1I")) || (substance.equals("H2S"))) {
            element = s3;
            nat = "Кислота";
            b.setStrength(substance, 0,0);
            setVal(substance, 2);
        }else if(s3.equals("H")){
            element = s1;
            b.setMe(element);
            val=1;
        } else {
            char sym4 = substance.charAt(3);
            String s4 = Character.toString(sym4);

            if ((substance.equals("H1Br")) || (substance.equals("H1Cl"))) {
                element = s3 + s4;
                nat = "Кислота";
                b.setStrength(substance, 0,0);
                setVal(substance, 2);
            }else if(s4.equals("H")){
                element = s1 + s2;
                b.setMe(element);
                val=1;
            } else if(s3.equals("O") && s1!="H") {
                element = s1;
                b.setMe(element);
                if (nat.equals("Empty")) {
                    nat = "Немет. оксид";
                    b.setStrength(substance, 2, 4);
                    if(element.equals("P")){
                        element="PO4";
                        val=3;
                    }else if(element.equals("N")){
                        setVal(substance, 4);
                        if(val==5){
                            element="NO3";
                            val = 1;
                        } else if (val==3){
                            element="NO2";
                            val=1;
                        } else {
                            double val1 = val + 1;
                            int val11 = (int) val1;
                            element = s1 + s2 + s3 + val11;
                            setVal(substance, 2);
                            if(val==2){
                                element="NO2";
                                val=1;
                            } else {
                                koef1 = val;
                                setVal(substance, 4);
                                koef2 = val;
                                val = 2 * koef2 / koef1+1;
                                val = 2 * val11 - val;
                            }
                        }
                    } else {
                        setVal(substance, 4);
                        double val1 = val + 1;
                        int val11 = (int) val1;
                        element = s1 + s2 + s3 + val11;
                        setVal(substance, 2);
                        koef1 = val;
                        setVal(substance, 4);
                        koef2 = val;
                        val = 2 * koef2 / koef1;
                        val = 2 * val11 - val;
                    }
                } else {
                    setVal(substance, 2);
                    koef1 = val;
                    setVal(substance, 4);
                    koef2 = val;
                    val = 2 * koef2 / koef1;
                    if (nat.equals("Основа")) {
                        nat = "Осн. оксид";
                    } else if (nat.equals("Щелочь")) {
                        nat = "Щел. оксид";
                    } else if (nat.equals("Амфотерный")) {
                        nat = "Амф. оксид";
                    }
                }
            } else {
                char sym5 = substance.charAt(4);
                String s5 = Character.toString(sym5);

                if(s5.equals("H")){
                    element = s1 + s2;
                    b.setMe(element);
                    setVal(substance, 7);
                } else if(s1.equals("H")){
                    if(sym4=='('){
                        nat = "Empty";
                    } else {
                        if(s4.equals("O")){
                            element = s3 + s4 + s5;
                            nat = "Кислота";
                            b.setStrength(substance, 2, 5);
                            setVal(substance, 2);
                        } else {
                            char sym6 = substance.charAt(5);
                            String s6 = Character.toString(sym6);
                            element = s3 + s4 + s5 + s6;
                            nat = "Кислота";
                            b.setStrength(substance, 2, 6);
                            setVal(substance, 2);
                        }
                    }
                } else if(s4.equals("O") && s1!="H") {
                    element = s1 + s2;
                    b.setMe(element);
                    if (nat.equals("Empty")) {
                        nat = "Немет. оксид";
                        b.setStrength(substance, 3, 5);
                        setVal(substance, 5);
                        double val1 = val + 1;
                        int val11 = (int) val1;
                        element = s1 + s2 + s3 + s4 + val11;
                        setVal(substance, 3);
                        koef1 = val;
                        setVal(substance, 5);
                        koef2 = val;
                        val = 2 * koef2 / koef1;
                        val = 2 * val11 - val;
                    } else {
                        setVal(substance, 3);
                        koef1 = val;
                        setVal(substance, 5);
                        koef2 = val;
                        val = 2 * koef2 / koef1;
                        if (nat.equals("Основа")) {
                            nat = "Осн. оксид";
                        } else if (nat.equals("Щелочь")) {
                            nat = "Щел. оксид";
                        } else if (nat.equals("Амфотерный")) {
                            nat = "Амф. оксид";
                        }
                    }
                }
            }
        }


        if(nat.equals("Empty")){
            nat = "Соль";
            char number3 = substance.charAt(2);
            char number4 = substance.charAt(3);
            char number5 = substance.charAt(4);
            char number6 = substance.charAt(5);

            if((number3 == '(' ) && (number5 == ')' )){
                char symbol1 = substance.charAt(0);
                element11 = Character.toString(symbol1);
                char symbol2 = substance.charAt(4);
                element12 = Character.toString(symbol2);

                setVal(substance, 2);
                koef1=val;
                setVal(substance, 6);
                koef2=val;
            } else if((number4 == '(' ) && (number6 == ')' )){
                char ss =substance.charAt(0);
                char ss2 =substance.charAt(1);
                String el1=Character.toString(ss);
                String el2=Character.toString(ss2);
                element11 = el1+el2;
                char symbol2 = substance.charAt(4);
                element12 = Character.toString(symbol2);

                setVal(substance, 3);
                koef1=val;
                setVal(substance, 7);
                koef2=val;

            } else if((number3 == '(' ) && (number6 == ')' )){
                char symbol1 = substance.charAt(0);
                element11 = Character.toString(symbol1);
                char ss = substance.charAt(3);
                char ss2 = substance.charAt(4);
                String el1=Character.toString(ss);
                String el2=Character.toString(ss2);
                element12 = el1+el2;

                setVal(substance, 2);
                koef1=val;
                setVal(substance, 7);
                koef2=val;

            } else {
                char number7 = substance.charAt(6);

                if((number4 == '(' ) && (number7 == ')' )){
                    char symbol1 = substance.charAt(0);
                    char symbol11 = substance.charAt(1);
                    String el1=Character.toString(symbol1);
                    String el2=Character.toString(symbol11);
                    element11 = el1+el2;
                    char ss = substance.charAt(4);
                    char ss2 = substance.charAt(5);
                    String el11=Character.toString(ss);
                    String el12=Character.toString(ss2);
                    element12 = el11+el12;

                    setVal(substance, 3);
                    koef1=val;
                    setVal(substance, 8);
                    koef2=val;

                } else if((number3 == '(' ) && (number7 == ')' )){
                    char symbol1 = substance.charAt(0);
                    element11 = Character.toString(symbol1);
                    char ss = substance.charAt(3);
                    char ss2 = substance.charAt(4);
                    char ss3 = substance.charAt(5);
                    String el11=Character.toString(ss);
                    String el12=Character.toString(ss2);
                    String el13=Character.toString(ss3);
                    element12 = el11+el12+el13;
                    setVal(substance, 2);
                    koef1=val;

                    setVal(substance, 8);
                    koef2=val;

                } else {
                    char number8 = substance.charAt(7);

                    if((number4 == '(' ) && (number8 == ')' )){
                        char symbol1 = substance.charAt(0);
                        char symbol11 = substance.charAt(1);
                        String el1=Character.toString(symbol1);
                        String el2=Character.toString(symbol11);
                        element11 = el1+el2;
                        char ss = substance.charAt(4);
                        char ss2 = substance.charAt(5);
                        char ss3 = substance.charAt(6);
                        String el11=Character.toString(ss);
                        String el12=Character.toString(ss2);
                        String el13=Character.toString(ss3);
                        element12 = el11+el12+el13;
                        setVal(substance, 3);
                        koef1=val;

                        setVal(substance, 9);
                        koef2=val;

                    } else if((number3 == '(' ) && (number8 == ')' )){
                        char symbol1 = substance.charAt(0);
                        element11 = Character.toString(symbol1);
                        char ss = substance.charAt(3);
                        char ss2 = substance.charAt(4);
                        char ss3 = substance.charAt(5);
                        char ss4 = substance.charAt(6);
                        String el11=Character.toString(ss);
                        String el12=Character.toString(ss2);
                        String el13=Character.toString(ss3);
                        String el14=Character.toString(ss4);
                        element12 = el11+el12+el13+el14;
                        setVal(substance, 2);
                        koef1=val;

                        setVal(substance, 9);
                        koef2=val;

                    } else {
                        char number9 = substance.charAt(8);

                        if((number4 == '(' ) && (number9 == ')' )){
                            char symbol1 = substance.charAt(0);
                            char symbol11 = substance.charAt(1);
                            String el1=Character.toString(symbol1);
                            String el2=Character.toString(symbol11);
                            element11 = el1+el2;
                            char ss = substance.charAt(4);
                            char ss2 = substance.charAt(5);
                            char ss3 = substance.charAt(6);
                            char ss4 = substance.charAt(7);
                            String el11=Character.toString(ss);
                            String el12=Character.toString(ss2);
                            String el13=Character.toString(ss3);
                            String el14=Character.toString(ss4);
                            element12 = el11+el12+el13+el14;
                            setVal(substance, 3);
                            koef1=val;
                            setVal(substance, 10);
                            koef2=val;


                        } else{
                            System.out.println("Неопознанный тип соли");
                        }
                    }
                }
            }


            b.setValSalt(element11);
            val11=val;
            b.setValSalt(element12);
            val12=val;

            b.setRast(element11, element12);

            if(val11==0){
                val11=(val12*koef2)/koef1;
            }else if(val12==0){
                val12=(val11*koef1)/koef2;
            }

            int str = (int)val12;
            b.setStrength(element12, str, element12.length());

        }

    }

    public void setKoef(double valent1, double valent2){
        if((valent1==1) || (valent2==1)){
            double x=valent1;
            valent01=valent2;
            valent02=x;
        } else if(valent1>valent2){
            double del = valent1/valent2;
            if((del==2) || (del==3) || (del==4)){
                valent01=valent1/del;
                valent02=valent2/del;
            }else{
                double x=valent1;
                valent01=valent2;
                valent02=x;
            }
        } else if(valent2>valent1){
            double del = valent2/valent1;
            if((del==2) || (del==3) || (del==4)){
                valent01=valent1/del;
                valent02=valent2/del;
            }else{
                double x=valent1;
                valent01=valent2;
                valent02=x;
            }
        } else {
            valent01=1;
            valent02=1;
        }
    }
}





