package com.company.weapon;


public class Automat extends Weapon {
    @Override
    public void shut() {
    super.shot();
        System.out.println("Вы выбрали автомат: Тра - та - та");
    }
}
