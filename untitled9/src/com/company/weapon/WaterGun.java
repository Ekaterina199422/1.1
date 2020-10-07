package com.company.weapon;

import com.company.Weapon;

public class WaterGun extends Weapon {
    @Override
    public void shot() {
        super.shot();
        System.out.println("Вы выбрали водяной пистолет: Псс - псс");
    }

}
