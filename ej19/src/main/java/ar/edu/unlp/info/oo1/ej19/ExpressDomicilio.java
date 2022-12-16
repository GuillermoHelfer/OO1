package ar.edu.unlp.info.oo1.ej19;

public class ExpressDomicilio implements FormaEnvio{
	
	// private Mapa mapa;
	
	@Override
	public double calcularCostoEnvio() {
		return 0.5 * 100;//100 -> mapa.distanciaEntre(dir1,dir2)
	}

}
