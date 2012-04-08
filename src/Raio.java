
public class Raio extends ArmaDecorator{
	
	/**
	** J�ssyca Ferreira
	*/
	
	private static final int DANORAIO = 10;
		
		public Raio(InterfaceArma reference){
			super(reference);
		}
			
		public void danoSofrido(Guerreiro g){
			super.danoSofrido(g);
			int dano = g.getEnergia() - DANORAIO;
			g.setEnergia(dano);
		}

}
