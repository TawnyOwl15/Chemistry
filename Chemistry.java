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

        if(Ins2.nat.equals("Соль")){
            String element01 = Ins2.element11;
            String element02 = Ins2.element12;
            double val01 = Ins2.val11;
            double val102 = Ins2.val12;
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
            String element001 = Ins2.element11;
            String element002 = Ins2.element12;
            double val001 = Ins2.val11;
            double val1002 = Ins2.val12;
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

            if((Ins2.nat=="Основа") && (nat1=="Кислота")){
                System.out.println("В результате реакции получится: "+ element2 + val22 + "(" + element1 + ")" + val11);
            }else if((Ins2.nat=="Кислота") && (nat1=="Основа")){
                System.out.println("В результате реакции получится: "+ element1 + val11 + "(" + element2 + ")" + val22);
            } else{
                System.out.println("Вещества не взаимодействуют между собой");
            }
        }





    }

}
