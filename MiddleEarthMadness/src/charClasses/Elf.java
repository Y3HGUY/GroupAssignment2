package charClasses;

import middleEarthCharacters.MiddleEarthCharacter;

public class Elf extends MiddleEarthCharacter{

	public Elf(String name, double health, double power) {
		super(name, health, power);
	}
	/**
	 * attacks another middleEarthCharacter
	 * 
	 * Elves do 1.5 dmg to Orcs
	 * Can't dmg elf or dwarf
	 *
	 *@param target The character being attacked
	 *@return true if attack successful, else false
	 */
	@Override
	public boolean attack(MiddleEarthCharacter target) {
		if (target instanceof Elf || target instanceof Dwarf ) {
			System.out.println(getName() + "ineffective attack " + target.getName());
			return false;
		}
		
		double damage = (target instanceof Orc) ? getPower() * 1.5 :getPower();
		target.setHealth(target.getHealth() - damage);
		System.out.println(getName() + "attacked" + target.getName() + "for " + damage + "damage!");
		
		return true;
	}
	/**
	 * returns race of Character
	 * 
	 * @return returns "Elf" race
	 */
	@Override
	public String getRace() {
		return "Elf";
	}

}
