package com.company.weapon;

import com.company.Weapon;

public class Automat extends Weapon {
    @Override
    public void shot() {
        super.shot();
        System.out.println(" Вы выбрали автомат: Тра - та - та");
    }
}




