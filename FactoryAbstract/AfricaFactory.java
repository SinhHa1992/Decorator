package FactoryAbstract;

public class AfricaFactory implements IContinentFactory {

	@Override
	public void createHerbivore() {
		new Deer();
		new Wildebeest();
	}

	@Override
	public void createCarnivore() {
		new Panther();
		new Lion();
	}

}
