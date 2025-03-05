package charClasses;

import middleEarthCharaacters.MiddleEarthCharacter;

public class human extends MiddleEarthCharacter{

	public human(String name, double health, double power) {
		super(name, health, power);
		
	}
	@Override
	public String getRace() {
		return "Human";
	}

}
