package charClasses;

import middleEarthCharacters.MiddleEarthCharacter;

public class Wizard extends MiddleEarthCharacter{

	public Wizard(String name, double health, double power) {
		super(name, health, power);
		
	}
	
	@Override
	public boolean attack(MiddleEarthCharacter target) {
		if (target instanceof Wizard || target instanceof Human) {
			System.out.println(getName() + "ineffective attack " + target.getName());
			return false;
		}
		
		double damage = (target instanceof Dwarf) ? getPower() * 1.5 :getPower();
		target.setHealth(target.getHealth() - damage);
		System.out.println(getName() + "attacked" + target.getName() + "for " + damage + "damage!");
		
		return true;
	}
	
	@Override
	public String getRace() {
		return "Wizard";
	}

}
