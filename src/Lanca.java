
public class Lanca implements InterfaceArma{
	
	/**
	** J�ssyca Ferreira
	*/
	
	private static final int DANOLANCA = 20;
	
	
	public void danoSofrido(Guerreiro guerreiro){
		
		
		if(guerreiro.getEnergia()>=20){
		
			int energiaFinal = guerreiro.getEnergia() - DANOLANCA;
			guerreiro.setEnergia(energiaFinal);
		
		} else{
		int energiaFinal = guerreiro.getEnergia() - DANOLANCA;
		guerreiro.setEnergia(energiaFinal);
		System.out.println("Morreu!");
		}
		
	}

}
