public class Ins2 {
    public static String element;
    public static String element11;
    public static String element12;
    public static String nat = "Empty";
    public static double val;
    public static double val11;
    public static double val12;

    public void setVal(String name, int n) {
        char num = name.charAt(n - 1);
        val = Character.getNumericValue(num);
    }

    public void setIns(String substance) {
        char sym1 = substance.charAt(0);
        String s1 = Character.toString(sym1);

        char sym2 = substance.charAt(1);
        String s2 = Character.toString(sym2);

        char sym3 = substance.charAt(2);
        String s3 = Character.toString(sym3);

        if ((substance.equals("H1F")) || (substance.equals("H1I")) || (substance.equals("H2S"))) {
            element = s3;
            nat = "Кислота";
            setVal(substance, 2);
        }else if(s3.equals("H")){
            element = s1;
            nat = "Основа";
            val=1;
        } else {
            char sym4 = substance.charAt(3);
            String s4 = Character.toString(sym4);

            if ((substance.equals("H1Br")) || (substance.equals("H1Cl"))) {
                element = s3 + s4;
                nat = "Кислота";
                setVal(substance, 2);
            }else if(s4.equals("H")){
                element = s1 + s2;
                nat="Основа";
                val=1;
            } else {
                char sym5 = substance.charAt(4);
                String s5 = Character.toString(sym5);

                switch (s5) {
                    case "H":
                        element = s1 + s2;
                        nat = "Основа";
                        setVal(substance, 7);
                        break;
                }

                if(s1.equals("H")){
                    if(s4.equals("O")){
                        element = s3 + s4 + s5;
                        nat = "Кислота";
                        setVal(substance, 2);
                    } else {
                        char sym6 = substance.charAt(5);
                        String s6 = Character.toString(sym6);

                        element = s3 + s4 + s5 + s6;
                        nat = "Кислота";
                        setVal(substance, 2);
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
                String element11 = Character.toString(symbol1);
                char symbol2 = substance.charAt(3);
                String element12 = Character.toString(symbol2);
            } else if((number4 == '(' ) && (number6 == ')' )){
                char ss =substance.charAt(0);
                char ss2 =substance.charAt(1);
                String el1=Character.toString(ss);
                String el2=Character.toString(ss2);
                String elementl1 = el1+el2;
                char symbol2 = substance.charAt(4);
                String element12 = Character.toString(symbol2);

            } else if((number3 == '(' ) && (number6 == ')' )){
                char symbol1 = substance.charAt(0);
                String element11 = Character.toString(symbol1);
                char ss = substance.charAt(3);
                char ss2 = substance.charAt(4);
                String el1=Character.toString(ss);
                String el2=Character.toString(ss2);
                String element12 = el1+el2;

            } else {
                char number7 = substance.charAt(6);

                if((number4 == '(' ) && (number7 == ')' )){
                    char symbol1 = substance.charAt(0);
                    char symbol11 = substance.charAt(1);
                    String el1=Character.toString(symbol1);
                    String el2=Character.toString(symbol11);
                    String element11 = el1+el2;
                    char ss = substance.charAt(3);
                    char ss2 = substance.charAt(4);
                    String el11=Character.toString(ss);
                    String el12=Character.toString(ss2);
                    String element12 = el11+el12;

                } else if((number3 == '(' ) && (number7 == ')' )){
                    char symbol1 = substance.charAt(0);
                    String element11 = Character.toString(symbol1);
                    char ss = substance.charAt(3);
                    char ss2 = substance.charAt(4);
                    char ss3 = substance.charAt(5);
                    String el11=Character.toString(ss);
                    String el12=Character.toString(ss2);
                    String el13=Character.toString(ss3);
                    String element12 = el11+el12+el13;

                } else {
                    char number8 = substance.charAt(7);

                    if((number4 == '(' ) && (number8 == ')' )){
                        char symbol1 = substance.charAt(0);
                        char symbol11 = substance.charAt(1);
                        String el1=Character.toString(symbol1);
                        String el2=Character.toString(symbol11);
                        String element11 = el1+el2;
                        char ss = substance.charAt(3);
                        char ss2 = substance.charAt(4);
                        char ss3 = substance.charAt(5);
                        String el11=Character.toString(ss);
                        String el12=Character.toString(ss2);
                        String el13=Character.toString(ss3);
                        String element12 = el11+el12+el13;

                    } else if((number3 == '(' ) && (number8 == ')' )){
                        char symbol1 = substance.charAt(0);
                        String element11 = Character.toString(symbol1);
                        char ss = substance.charAt(3);
                        char ss2 = substance.charAt(4);
                        char ss3 = substance.charAt(5);
                        char ss4 = substance.charAt(6);
                        String el11=Character.toString(ss);
                        String el12=Character.toString(ss2);
                        String el13=Character.toString(ss3);
                        String el14=Character.toString(ss4);
                        String element12 = el11+el12+el13+el14;

                    } else {
                        char number9 = substance.charAt(8);

                        if((number4 == '(' ) && (number9 == ')' )){
                            char symbol1 = substance.charAt(0);
                            char symbol11 = substance.charAt(1);
                            String el1=Character.toString(symbol1);
                            String el2=Character.toString(symbol11);
                            String element11 = el1+el2;
                            char ss = substance.charAt(3);
                            char ss2 = substance.charAt(4);
                            char ss3 = substance.charAt(5);
                            char ss4 = substance.charAt(6);
                            String el11=Character.toString(ss);
                            String el12=Character.toString(ss2);
                            String el13=Character.toString(ss3);
                            String el14=Character.toString(ss4);
                            String element12 = el11+el12+el13+el14;

                        } else{
                            System.out.println("Неопознанный тип соли");
                        }
                    }
                }
            }

            Ins3 b = new Ins3();
            b.setValSalt(element11);
            val11=val;
            b.setValSalt(element12);
            val12=val;

        }
    }
}
     /* switch (substance) {
            case "H1F":
                element = s3;
                nat = "Кислота";
                setVal(substance, 1, val);
                break;
            case "H1I":
                element = s3;
                nat = "Кислота";
                num2 = substance.charAt(1);
                val = Character.getNumericValue(num2);
                break;
            case "H2S":
                element = s3;
                nat = "Кислота";
                num2 = substance.charAt(1);
                val = Character.getNumericValue(num2);
                break;
            default:
                char sym4 = substance.charAt(3);
                String s4 = Character.toString(sym4);

                switch(substance) {
                    case "H1Br":
                        element = s3 + s4;
                        nat = "Кислота";
                        num2 = substance.charAt(1);
                        val = Character.getNumericValue(num2);
                        break;
                    case "H1Cl":
                        element = s3 + s4;
                        nat = "Кислота";
                        num2 = substance.charAt(1);
                        val = Character.getNumericValue(num2);
                        break;
                    default:
                        char sym5=substance.charAt(4);
                        String s5 = Character.toString(sym5);

                        char sym6 = substance.charAt(5);
                        String s6 = Character.toString(sym6);

                        switch (s1){
                            case "H":
                                element = s3 + s4 + s5 +s6;
                                nat = "Кислота";
                                num2 = substance.charAt(1);
                                val = Character.getNumericValue(num2);
                                break;
                        }

                        switch (s5){
                            case "H":
                                element=s1;
                                nat = "Основа";
                                num2 = substance.charAt(6);
                                val = Character.getNumericValue(num2);
                                break;
                        }

                        if(s6.equals("H")){
                            element = s1 + s2;
                            nat = "Основа";
                            num2 = substance.charAt(7);
                            val = Character.getNumericValue(num2);
                        }

                        switch (s6){
                            case "H":
                                element = s1 + s2;
                                nat = "Основа";
                                num2 = substance.charAt(7);
                                val = Character.getNumericValue(num2);
                                break;
                        }
                }

        }*/

      /*  if ((s4=="O") && (s5=="H") ){
            element=Character.toString(substance.charAt(0));
            nat = "Основа";
            char num2 = substance.charAt(6);
            val = Character.getNumericValue(num2);
        }else if((s5=="O") ){
            element = Character.toString(substance.charAt(0)) + Character.toString(substance.charAt(1));
            nat = "Основа";
            char num2 = substance.charAt(7);
            val = Character.getNumericValue(num2);
        } else if(s1=="H"){
            element = Character.toString(substance.charAt(2)) + Character.toString(substance.charAt(3)) + Character.toString(substance.charAt(4));
            nat = "Кислота";
            char num2 = substance.charAt(1);
            val = Character.getNumericValue(num2);
        } else {
            element="Em";
        }
        */



