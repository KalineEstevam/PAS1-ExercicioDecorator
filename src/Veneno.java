
public class Veneno extends ArmaDecorator{
	
	private static final int DANOVENENO = 3;
		
		public Veneno(InterfaceArma reference){
			super(reference);
		}
			
		public void danoSofrido(Guerreiro g){
			super.danoSofrido(g);
			int dano = g.getEnergia() - DANOVENENO;
			g.setEnergia(dano);
		}

}
