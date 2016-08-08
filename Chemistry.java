import java.util.Scanner;



public class Chemistry {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое вещество(при вводе кислоты после Н обязательно ставьте коэфициент(например, H1NO3); при вводе соли - обязательно ставьте и скобки, и коэфициенты(например, К1(NO3)1)):");
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
        System.out.println("Введите второе вещество(при вводе кислоты после Н обязательно ставьте коэфициент(например, H1NO3); при вводе соли - обязательно ставьте и скобки, и коэфициенты(например, К1(NO3)1):");
        substance = scanner2.nextLine();

        a.setIns(substance);
        String nat2 = Ins2.nat;

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

        if((nat1.equals("Кислота") && nat2.equals("Основа")) || (nat1.equals("Основа") && nat2.equals("Кислота")) || (nat1.equals("Щелочь") && nat2.equals("Кислота")) || (nat1.equals("Кислота") && nat2.equals("Щелочь"))) {
            if((val1==1) || (val2==1)){
                double x=val1;
                val1=val2;
                val2=x;
            } else if(val1>val2){
                double del = val1/val2;
                if((del==2) || (del==3) || (del==4)){
                    val1=val1/del;
                    val2=val2/del;
                }else{
                    double x=val1;
                    val1=val2;
                    val2=x;
                }
            } else if(val2>val1){
                double del = val2/val1;
                if((del==2) || (del==3) || (del==4)){
                    val1=val1/del;
                    val2=val2/del;
                }else{
                    double x=val1;
                    val1=val2;
                    val2=x;
                }
            } else {
                val1=1;
                val2=1;
            }

            int val11 = (int)val1;
            int val22=(int)val2;

            Ins3 e = new Ins3();

            if((nat2=="Основа" && nat1=="Кислота") || (nat2=="Щелочь" && nat1=="Кислота")){
                e.setRast(element2, element1);
                if(Ins3.rast.equals("Растворимая")){
                    System.out.println("В результате реакции получится: "+ element2 + val22 + "(" + element1 + ")" + val11 + " + " +"H2O");
                } else {
                    System.out.println("В результате реакции получится: "+ element2 + val22 + "(" + element1 + ")" + val11 + "↓" + " + " +"H2O");
                }
            }else if((nat2=="Кислота" && nat1=="Основа") || (nat2=="Кислота" && nat1=="Щелочь")){
                e.setRast(element1, element2);
                if (Ins3.rast.equals("Растворимая")){
                    System.out.println("В результате реакции получится: "+ element1 + val11 + "(" + element2 + ")" + val22 + " + " + "H2O");
                } else{
                    System.out.println("В результате реакции получится: "+ element1 + val11 + "(" + element2 + ")" + val22 + "↓" + " + " + "H2O");
                }

            }
        } else if((nat1.equals("Соль")) && (nat2.equals("Соль"))){
            Ins3 c = new Ins3();
            c.setRast(element01, element002);
            String rast3 = Ins3.rast;
            c.setRast(element001, element02);
            String rast4 = Ins3.rast;
            if(rast3.equals("No") || rast4.equals("No")){
                if(rast1.equals("Растворимая") && rast2.equals("Растворимая")){
                    if((val01==1) || (val002==1)){
                        double x=val01;
                        val01=val002;
                        val002=x;
                    } else if(val01>val002){
                        double del = val01/val002;
                        if((del==2) || (del==3) || (del==4)){
                            val01=val01/del;
                            val002=val002/del;
                        }else{
                            double x=val01;
                            val01=val002;
                            val002=x;
                        }
                    } else if(val002>val01){
                        double del = val002/val01;
                        if((del==2) || (del==3) || (del==4)){
                            val01=val01/del;
                            val002=val002/del;
                        }else{
                            double x=val01;
                            val01=val002;
                            val002=x;
                        }
                    } else {
                        val01=1;
                        val002=1;
                    }
                    if((val001==1) || (val02==1)){
                        double x=val001;
                        val001=val02;
                        val02=x;
                    } else if(val001>val02){
                        double del = val001/val02;
                        if((del==2) || (del==3) || (del==4)){
                            val001=val001/del;
                            val02=val02/del;
                        }else{
                            double x=val001;
                            val001=val02;
                            val02=x;
                        }
                    } else if(val02>val001){
                        double del = val02/val001;
                        if((del==2) || (del==3) || (del==4)){
                            val001=val001/del;
                            val02=val02/del;
                        }else{
                            double x=val001;
                            val001=val02;
                            val02=x;
                        }
                    } else {
                        val001=1;
                        val02=1;
                    }
                    int val011 = (int)val01;
                    int val0011 = (int)val001;
                    int val021=(int)val02;
                    int val0021=(int)val002;

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
                Ins3 d = new Ins3();
                Ins2.nat = "";
                d.setMe(element01);
                d.setMe(element001);
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

                    if((val02==1) || (val2==1)){
                        double x=val02;
                        val02=val2;
                        val2=x;
                    } else if(val02>val2){
                        double del = val02/val2;
                        if((del==2) || (del==3) || (del==4)){
                            val02=val02/del;
                            val2=val2/del;
                        }else{
                            double x=val02;
                            val02=val2;
                            val2=x;
                        }
                    } else if(val2>val02){
                        double del = val2/val02;
                        if((del==2) || (del==3) || (del==4)){
                            val02=val02/del;
                            val2=val2/del;
                        }else{
                            double x=val02;
                            val02=val2;
                            val2=x;
                        }
                    } else {
                        val02=1;
                        val2=1;
                    }
                    int val21 = (int)val2;
                    int val011 = (int)val01;
                    int val021=(int)val02;
                    d.setRast(element2, element02);
                    if(Ins3.rast.equals("Растворимая")){
                        System.out.println("В результате реакции получим: " + element01 + "(OH)" + val011 + "↓ + " + element2 + val21 + "(" + element02 + ")" + val021);
                    } else {
                        System.out.println("В результате реакции получим: " + element01 + "(OH)" + val011 + "↓ + " + element2 + val21 + "(" + element02 + ")" + val021 + "↓");
                    }
                }
            } else{
                System.out.println("Соль не растворима в воде");
            }
        }





    }

}
