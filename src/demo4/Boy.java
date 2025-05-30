package demo4;

import demo3.Man;

public class Boy extends Man {
    String telephone;
    
    void playGame(){
        // this.drink(); viet nnay se loi vi nam khac package nen phai dung ham protected (protected = default + subclass) 
        // protected se chho su dung trong pham vi lop cha con
        this.drink();
    }
}
