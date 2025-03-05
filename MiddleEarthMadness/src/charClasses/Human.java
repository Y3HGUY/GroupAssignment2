package charClasses;

import middleEarthCharacters.MiddleEarthCharacter;

public class Human extends MiddleEarthCharacter{

	public Human(String name, double health, double power) {
		super(name, health, power);
	}
	/**
	 * attacks another middleEarthCharacter
	 * 
	 * ineffective against Human and Orc
	 * 1.5 dmg to Wizard
	 * 
	 * @param target character being attacked
	 * @return true if character attack is hit, else false 
	 */
	@Override
	public boolean attack(MiddleEarthCharacter target) {
		if (target instanceof Human || target instanceof Orc) {
			System.out.println(getName() + "ineffective attack " + target.getName());
			return false;
		}
		
		double damage = (target instanceof Wizard) ? getPower() * 1.5 :getPower();
		target.setHealth(target.getHealth() - damage);
		System.out.println(getName() + "attacked" + target.getName() + "for " + damage + "damage!");
		
		return true;
	}
	/**
	 * returns race of character 
	 * 
	 * @return returns "Human" race
	 */
	@Override
	public String getRace() {
		return "Human";
	}

}
