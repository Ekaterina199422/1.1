package com.company.weapon;

import com.company.Weapon;

public class SlingShot extends Weapon {
    @Override
    public void shot() {
        super.shot();
        System.out.println("Вы выбрали рогатку: Пиу - пиу");
    }


}
