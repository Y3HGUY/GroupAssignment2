package charClasses;

import middleEarthCharaacters.MiddleEarthCharacter;

public class wizard extends MiddleEarthCharacter{

	public wizard(String name, double health, double power) {
		super(name, health, power);
		
	}
	
	@Override
	public String getRace() {
		return "Wizard";
	}

}
