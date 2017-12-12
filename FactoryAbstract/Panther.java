package FactoryAbstract;

public class Panther implements ICarnivore{
	@Override
	public String getName() {
		return "Panther";
	}

	@Override
	public String getLocate() {
		return "Africa";
	}

	@Override
	public String eatFood(IHerbivore amimalHerbi) {
		if (amimalHerbi.getLocate().equals("Africa")){
			return "eat";
		}
		return "not eat";
	}
}
