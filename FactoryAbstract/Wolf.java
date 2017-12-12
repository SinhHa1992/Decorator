package FactoryAbstract;

public class Wolf implements ICarnivore{
	@Override
	public String getName() {
		return "Wolf";
	}

	@Override
	public String getLocate() {
		return "America";
	}

	@Override
	public String eatFood(IHerbivore amimalHerbi) {
		if (amimalHerbi.getLocate().equals("America")){
			return "eat";
		}
		return "not eat";
	}
}
