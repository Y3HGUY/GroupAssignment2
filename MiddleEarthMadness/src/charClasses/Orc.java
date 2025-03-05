package charClasses;

import middleEarthCharacters.MiddleEarthCharacter;

public class Orc extends MiddleEarthCharacter {

	public Orc(String name, double health, double power) {
		super(name, health, power);
	}
	/**
	 * attacks another middleEarthCharacter
	 * 
	 * ineffective against Orc and Elf
	 * 1.5 dmg to Human
	 * 
	 * @param target character being attacked
	 * @return true if character attack is hit, else false 
	 */
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
	
	/**
	 * returns race of character 
	 * 
	 * @return returns "Orc" race
	 */
	
	@Override
	public String getRace() {
		return "Orc";
	}
}
