package FactoryAbstract;

public class Wildebeest implements IHerbivore{

	@Override
	public String getLocate() {
		return "Africa";
	}

	@Override
	public String getName() {
		return "Wildebeest";
	}

	@Override
	public String eatFood(IHerbivore amimalHerbi) {
		return "Grass";
	}

}
