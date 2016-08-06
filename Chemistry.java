import java.util.Scanner;



public class Chemistry {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое вещество(в кислотах после Н обязательно вводите коэфициент(например, H1NO3)):");
        String substance = scanner.nextLine();

        Ins2 a = new Ins2();
        a.setIns(substance);

        String nat1 = Ins2.nat;

        String element1=" ";
        String element2=" ";
        double val1=0;
        double val2=0;
        String element01;
        String element02 ;
        double val01;
        double val102;
        String element001;
        String element002;
        double val001;
        double val1002;
        String rast1="";
        String rast2="";


        if(Ins2.nat.equals("Соль")){
            element01 = Ins2.element11;
            element02 = Ins2.element12;
            val01 = Ins2.val11;
            val102 = Ins2.val12;
            rast1=Ins3.rast;
        } else{
            element1 = Ins2.element;
            val1 = Ins2.val;
        }

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Введите второе вещество(в кислотах после Н обязательно вводите коэфициент(например, H1NO3)):");
        substance = scanner2.nextLine();

        a.setIns(substance);
        String nat2 = Ins2.nat;

        if(Ins2.nat.equals("Соль")){
            element001 = Ins2.element11;
            element002 = Ins2.element12;
            val001 = Ins2.val11;
            val1002 = Ins2.val12;
            rast2=Ins3.rast;
        } else{
            element2 = Ins2.element;
            val2 = Ins2.val;
        }

        if(((nat1.equals("Кислота")) && (nat2.equals("Основа"))) || ((nat1.equals("Основа"))&&(nat2.equals("Кислота")))) {
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

            if((nat2=="Основа") && (nat1=="Кислота")){
                System.out.println("В результате реакции получится: "+ element2 + val22 + "(" + element1 + ")" + val11);
            }else if((nat2=="Кислота") && (nat1=="Основа")){
                System.out.println("В результате реакции получится: "+ element1 + val11 + "(" + element2 + ")" + val22);
            } else{
                System.out.println("Вещества не взаимодействуют между собой");
            }
        } else if((nat1.equals("Соль")) || (nat2.equals("Соль"))){
            if(rast1.equals("Растворимая") || rast2.equals("Растворимая")){
                
            }

        }





    }

}
