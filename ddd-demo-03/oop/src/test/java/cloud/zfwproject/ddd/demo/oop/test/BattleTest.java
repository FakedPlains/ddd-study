package cloud.zfwproject.ddd.demo.oop.test;

import cloud.zfwproject.ddd.demo.oop.Dragon;
import cloud.zfwproject.ddd.demo.oop.Dragoon;
import cloud.zfwproject.ddd.demo.oop.Fighter;
import cloud.zfwproject.ddd.demo.oop.Mage;
import cloud.zfwproject.ddd.demo.oop.Orc;
import cloud.zfwproject.ddd.demo.oop.Staff;
import cloud.zfwproject.ddd.demo.oop.Sword;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author dz0401048
 * @version 1.0
 * @description TODO
 * @date 2023/5/17 11:59 AM
 */
public class BattleTest {
    @Test
    public void testDragonImmunity() {
        // Given
        Fighter fighter = new Fighter("Hero");
        Sword sword = new Sword("Excalibur", 10);
        fighter.setWeapon(sword);
        Dragon dragon = new Dragon("Dragon", 100L);

        // When
        fighter.attack(dragon);

        // Then
        Assert.assertEquals(dragon.getHealth().longValue(), 100);
    }

    @Test
    public void testDragoonSpecial() {
        // Given
        Dragoon dragoon = new Dragoon("Dragoon");
        Sword sword = new Sword("Excalibur", 10);
        dragoon.setWeapon(sword);
        Dragon dragon = new Dragon("Dragon", 100L);

        // When
        dragoon.attack(dragon);

        // Then
        Assert.assertEquals(dragon.getHealth().longValue(), 100 - 10 * 2);
    }

    @Test
    public void testFighterOrc() {
        // Given
        Fighter fighter = new Fighter("Hero");
        Sword sword = new Sword("Excalibur", 10);
        fighter.setWeapon(sword);
        Orc orc = new Orc("Orc", 100L);

        // When
        fighter.attack(orc);

        // Then
        Assert.assertEquals(orc.getHealth().longValue(), 100 - 10 / 2);
    }

    @Test
    public void testMageOrc() {
        // Given
        Mage mage = new Mage("Mage");
        Staff staff = new Staff("Fire Staff", 10);
        mage.setWeapon(staff);
        Orc orc = new Orc("Orc", 100L);

        // When
        mage.attack(orc);

        // Then
        Assert.assertEquals(orc.getHealth().longValue(), 100 - 10);
    }
}
