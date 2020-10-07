package com.company;

import com.company.weapon.*;

public class Player {
    // Указываем тип данных Weapon, который будет храниться в "слотах игрока"
    private Weapon[] weaponSlots;

    public Player() {
        weaponSlots = new Weapon[]{
                new Gun(),
                new Automat(),
                new RPG(),
                new SlingShot(),
                new WaterGun(),

        };
    }

    public int getSlotsCount() {
       for ( int i = 0; i < weaponSlots.length; i++);

           return weaponSlots.length;
    }

    public void shotWithWeapon(int slot) {
        if(slot>= getSlotsCount())
            throw new IllegalArgumentException();

        Weapon weapon = weaponSlots[slot];

        weapon.shot();
    }
}