
public class Faca implements InterfaceArma{
	
	/**
	** J�ssyca Ferreira
	*/
	private static final int DANOFACA = 5;
	
	
	public void danoSofrido(Guerreiro guerreiro){
		
		if(guerreiro.getEnergia()>=5){
			
			int energiaFinal = guerreiro.getEnergia() - DANOFACA;
			guerreiro.setEnergia(energiaFinal);
		
		} else{
		int energiaFinal = guerreiro.getEnergia() - DANOFACA;
		guerreiro.setEnergia(energiaFinal);
		System.out.println("Morreu!");
		}
	}

}
