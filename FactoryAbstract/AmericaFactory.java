package FactoryAbstract;

public class AmericaFactory implements IContinentFactory {

	@Override
	public void createHerbivore() {
		new Bison();
	}

	@Override
	public void createCarnivore() {
		new Wolf();
	}
}
