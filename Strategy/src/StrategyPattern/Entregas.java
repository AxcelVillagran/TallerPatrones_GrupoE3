public class Entregas {
	private DistributionStrategy strategy;
	private Carga carga;

	public void setStrategy(DistributionStrategy strategy) {
		this.strategy=strategy;
	}

	public void realizarEntregas(Carga carga) {
		strategy.transportar(carga);
		
	}
}