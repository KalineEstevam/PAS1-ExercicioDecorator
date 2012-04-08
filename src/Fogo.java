
public class Fogo extends ArmaDecorator{
	
	/**
	** Jéssyca Ferreira
	*/
	
	private static final int DANOFOGO = 5;
	
		public Fogo(InterfaceArma reference){
			super(reference);
		}
			
		public void danoSofrido(Guerreiro g){
			super.danoSofrido(g);
			int dano = g.getEnergia() - DANOFOGO;
			g.setEnergia(dano);
		}
}


