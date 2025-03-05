package charClasses;

import middleEarthCharacters.MiddleEarthCharacter;

public class Dwarf extends MiddleEarthCharacter {

	public Dwarf(String name, double health, double power) {
		super(name, health, power);
	}
	/**
	 * attacks another middleEarthCharacter
	 * 
	 * ineffective against dwarf and wizard
	 * 1.5 dmg to elf
	 * 
	 * @param target character being attacked
	 * @return true if character attack is hit, else false 
	 */
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
	/**
	 * returns race of character 
	 * 
	 * @return returns "Dwarf" race
	 */
	@Override
	public String getRace() {
		return "Dwarf";
	}
}
