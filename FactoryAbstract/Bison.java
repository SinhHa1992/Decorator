package FactoryAbstract;

public class Bison implements IHerbivore {

	@Override
	public String getLocate() {
		return "America";
	}

	@Override
	public String getName() {
		return "Bison";
	}

	@Override
	public String eatFood(IHerbivore amimalHerbi) {
		// TODO Auto-generated method stub
		return "Grass";
	}

	 
}
