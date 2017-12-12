package FactoryAbstract;

public class Deer implements IHerbivore {

	@Override
	public String getLocate() {
		return "Africa";
	}

	@Override
	public String getName() {
		return "Deer";
	}

	@Override
	public String eatFood(IHerbivore amimalHerbi) {
		return "Grass";
	}

	 

}
