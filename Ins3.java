public class Ins3 {

    public void setValSalt(String element){
        if((element.equals("F")) || (element.equals("I")) || (element.equals("Cl")) || (element.equals("Br")) || (element.equals("NO3")) || (element.equals("NO2")) || (element.equals("PO3"))  || (element.equals("K"))  || (element.equals("Na"))  || (element.equals("Li"))  || (element.equals("Rb"))  || (element.equals("Cs"))  || (element.equals("Fr"))  || (element.equals("Ag"))){
            Ins2.val=1;
        } else if((element.equals("S")) || (element.equals("SO3")) || (element.equals("SiO3")) || (element.equals("SO2")) || (element.equals("CO3"))  || (element.equals("Be"))  || (element.equals("Mg"))  || (element.equals("Ca"))  || (element.equals("Zn"))  || (element.equals("Sr"))  || (element.equals("Cd"))  || (element.equals("Ba"))  || (element.equals("Hg"))  || (element.equals("Ra"))  || (element.equals("Cu"))  || (element.equals("Mn"))  || (element.equals("Fe"))   || (element.equals("Pb"))  || (element.equals("Sn")) || (element.equals("Co"))  || (element.equals("Ni"))){
            Ins2.val=2;
        }else if((element.equals("PO4"))  || (element.equals("Al"))  || (element.equals("Ga"))  || (element.equals("In"))  || (element.equals("Cr"))){
            Ins2.val=3;
        }else if(element.equals("Ge")){
            Ins2.val=4;
        }
    }
}
