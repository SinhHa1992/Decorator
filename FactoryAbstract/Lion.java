package FactoryAbstract;

public class Lion implements ICarnivore {

	@Override
	public String getName() {
		return "Lion";
	}

	@Override
	public String eatFood(IHerbivore amimalHerbi) {
		if (amimalHerbi.getLocate().equals("Africa")){
			return "eat";
		}
		return "not eat";
	}

	@Override
	public String getLocate() {
		// TODO Auto-generated method stub
		return "Africa";
	}

}
