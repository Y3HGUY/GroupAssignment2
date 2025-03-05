package charClasses;

import middleEarthCharacters.MiddleEarthCharacter;

public class Dwarf extends MiddleEarthCharacter {

	public Dwarf(String name, double health, double power) {
		super(name, health, power);
	}
	
	@Override
	public boolean attack(MiddleEarthCharacter target) {
		if (target instanceof Dwarf || target instanceof Wizard) {
			System.out.println(getName() + "ineffective attack " + target.getName());
			return false;
		}
		
		double damage = (target instanceof Elf) ? getPower() * 1.5 :getPower();
		target.setHealth(target.getHealth() - damage);
		System.out.println(getName() + "attacked" + target.getName() + "for " + damage + "damage!");
		
		return true;
	}
	
	@Override
	public String getRace() {
		return "Dwarf";
	}
}
