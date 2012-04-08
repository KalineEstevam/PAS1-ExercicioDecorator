
public class ArmaDecorator implements InterfaceArma{
	
	
	private InterfaceArma  reference = null;
	
	public  ArmaDecorator(InterfaceArma reference){
		this.reference = reference;
	}

	@Override
	public void danoSofrido(Guerreiro guerreiro) {
		
		reference.danoSofrido(guerreiro);
		
	}
	
	
	

}
