package charClasses;

import middleEarthCharacters.MiddleEarthCharacter;

public class Orc extends MiddleEarthCharacter {

	public Orc(String name, double health, double power) {
		super(name, health, power);
	}
	
	@Override
	public boolean attack(MiddleEarthCharacter target) {
		if (target instanceof Orc || target instanceof Elf ) {
			System.out.println(getName() + "ineffective attack " + target.getName());
			return false;
		}
		
		double damage = (target instanceof Human) ? getPower() * 1.5 :getPower();
		target.setHealth(target.getHealth() - damage);
		System.out.println(getName() + "attacked" + target.getName() + "for " + damage + "damage!");
		
		return true;
	}
	
	@Override
	public String getRace() {
		return "Orc";
	}
}
