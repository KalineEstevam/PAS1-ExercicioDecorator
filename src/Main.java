import javax.swing.JOptionPane;


public class Main {

	/**
	 * Kaline Estevam
	 */
	public static void main(String[] args) {
		
		Guerreiro g1 = new Guerreiro("JOAO");
		Guerreiro g2 = new Guerreiro("PAULO");
		JOptionPane.showMessageDialog(null, "Os guerreiros tem energia 100");
		
		InterfaceArma lanca = new Lanca();
		InterfaceArma faca = new Faca();
		g1.setArma(lanca);
		g2.setArma(faca);
		
		JOptionPane.showMessageDialog(null, "A luta começará por sorteio. Boa sorte!");
		
		while( (g1.getEnergia()!=0) && (g2.getEnergia()!=0) ){
			
		
			int numeroSorteado = (int)(Math.random() * 10);
			
			if(numeroSorteado % 2 == 0){
				
				JOptionPane.showMessageDialog(null, "Guerreiro "+g1.getNome()+" ataque!");
				InterfaceArma golpeG1 = g1.getArma();
				golpeG1.danoSofrido(g2);
				JOptionPane.showMessageDialog(null, g2.getNome()+" foi atacado. Sua energia agora é: "+g2.getEnergia());
				
			}	else{
					JOptionPane.showMessageDialog(null, "Guerreiro "+g2.getNome()+" ataque!");
					InterfaceArma golpeG2 = g2.getArma();
					golpeG2.danoSofrido(g1);
					JOptionPane.showMessageDialog(null, g1.getNome()+" foi atacado. Sua energia agora é: "+g1.getEnergia());
				}
		}
		
		if(g1.getEnergia() > g2.getEnergia()){
			
			JOptionPane.showMessageDialog(null, "Guerreiro "+g1.getNome()+" venceu!");
		}else {
			JOptionPane.showMessageDialog(null, "Guerreiro "+g2.getNome()+" venceu!");
		}
	}

}
