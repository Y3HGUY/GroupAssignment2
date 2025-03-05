package charClasses;

import middleEarthCharaacters.MiddleEarthCharacter;

public class Elf extends MiddleEarthCharacter{

	public Elf(String name, double health, double power) {
		super(name, health, power);
	}
	
	@Override
	public boolean attack(MiddleEarthCharacter target) {
		if (target instanceof Elf || target instanceof Dwarf ) {
			System.out.println(getName() + "cannot attack " + target.getName());
			return false;
		}
		
		double damage = (target instanceof Orc) ? getPower() * 1.5 :getPower();
		target.setHealth(target.getHealth() - damage);
		System.out.println(getName() + "attacked" + target.getName() + "for " + damage + "damage!");
		
		return true;
	}
	
	@Override
	public String getRace() {
		return "Elf";
	}

}
