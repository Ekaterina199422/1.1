package com.company.weapon;

import com.company.Weapon;

public class Gun extends Weapon {
    @Override
    public void shot() {
        super.shot();
        System.out.println("Вы выбрали пистолет: Пив - пав ");
    }
}
