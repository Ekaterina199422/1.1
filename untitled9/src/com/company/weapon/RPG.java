package com.company.weapon;

import com.company.Weapon;

public class RPG extends Weapon {
    @Override
    public void shot() {
        super.shot();
        System.out.println("Вы выбрали РПГ: Бух");
    }
}
