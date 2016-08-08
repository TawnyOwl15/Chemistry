public class Ins3 {
    public static String rast;

    public void setValSalt(String element){
        if((element.equals("F")) || (element.equals("I")) || (element.equals("Cl")) || (element.equals("Br")) || (element.equals("NO3")) || (element.equals("NO2")) || (element.equals("PO3"))  || (element.equals("K"))  || (element.equals("Na"))  || (element.equals("Li"))  || (element.equals("Rb"))  || (element.equals("Cs"))  || (element.equals("Fr"))  || (element.equals("Ag"))){
            Ins2.val=1;
        } else if((element.equals("S")) || (element.equals("SO4")) || (element.equals("SiO3")) || (element.equals("SO3")) || (element.equals("CO3"))  || (element.equals("Be"))  || (element.equals("Mg"))  || (element.equals("Ca"))  || (element.equals("Zn"))  || (element.equals("Sr"))  || (element.equals("Cd"))  || (element.equals("Ba"))  || (element.equals("Hg"))  || (element.equals("Ra"))  || (element.equals("Cu")) || (element.equals("Pb"))  || (element.equals("Sn")) || (element.equals("Co"))  || (element.equals("Ni"))){
            Ins2.val=2;
        }else if((element.equals("PO4"))  || (element.equals("Al"))  || (element.equals("Ga"))  || (element.equals("In"))  || (element.equals("Cr"))){
            Ins2.val=3;
        }else if(element.equals("Ge")){
            Ins2.val=4;
        } else{
            Ins2.val = 0;
        }
    }

    public void setRast(String el1, String el2){
        if(el2.equals("NO3")) {
            rast = "Растворимая";
        } else if(el1.equals("Na") || el1.equals("K") || el1.equals("Li")){
            rast = "Растворимая";
        } else if(el2.equals("F")){
            if(el1.equals("Mg") || el1.equals("Ca") || el1.equals("Ba") || el1.equals("Al") || el1.equals("Cr") || el1.equals("Zn") || el1.equals("Ni") || el1.equals("Co") || el1.equals("Fe") || el1.equals("Pb")){
                rast="No";
            }else{
                rast="Растворимая";
            }
        }else if(el2.equals("Cl")){
            if(el1.equals("Pb") || el1.equals("Ag")){
                rast="No";
            }else{
                rast="Растворимая";
            }
        }else if(el2.equals("Br")){
            if(el1.equals("Pb") || el1.equals("Ag") || el1.equals("Hg")){
                rast = "No";
            }else{
                rast="Растворимая";
            }
        }else if(el2.equals("I")){
            if(el1.equals("Pb")  || el1.equals("Ag")  || el1.equals("Sn")  || el1.equals("Hg")  || el1.equals("Cr")){
                rast="No";
            }else{
                rast="Растворимая";
            }
        }else if(el2.equals("S")){
            if(el1.equals("Ba")){
                rast="Растворимая";
            }else{
                rast="No";
            }
        } else if(el2.equals("SO3") || el2.equals("PO4") || el2.equals("CO3") || el2.equals("SiO3")) {
            rast = "No";
        } else if(el2.equals("SO4")){
            if(el1.equals("Ba") || el1.equals("Pb") || el1.equals("Ag") || el1.equals("Ca")){
                rast="No";
            }else{
                rast="Растворимая";
            }
        }
    }

    public void setMe(String me){
        if(me.equals("K") || me.equals("Li") || me.equals("Na") || me.equals("Ca") || me.equals("Ba") || me.equals("Rb") || me.equals("Fr") || me.equals("Cs")){
            Ins2.nat = "Щелочь";
        }else if(me.equals("Al") || me.equals("Be") || me.equals("Ti") || me.equals("V") || me.equals("Cr") || me.equals("Mn") || me.equals("Fe") || me.equals("Zn") || me.equals("Ga") || me.equals("Ge") || me.equals("Y") || me.equals("Zr") || me.equals("Nb") || me.equals("Mo") || me.equals("Tc") || me.equals("Ru") || me.equals("Rh") || me.equals("Pd") || me.equals("Sn") || me.equals("Sb") || me.equals("Pb") || me.equals("Bi") || me.equals("Po") || me.equals("Hf") || me.equals("Ta") || me.equals("W") || me.equals("Re") || me.equals("Os") || me.equals("Ir")){
            Ins2.nat= "Амфотерный";
        }
    }
}
