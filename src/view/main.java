package view;

import javax.swing.JOptionPane;

import controller.RedesController;

public class main {
	
	public static void main(String[] args){
	
	
		int op=0;
		while (op!=9){
			op = Integer.parseInt(JOptionPane.showInputDialog("\n1-Mostra sistema operacional\n2-Ethernet\n3-Ping\n9-Sair"));
		
		switch (op){
			
		case 1:
		RedesController redesController = new RedesController();
		String ip = redesController.ip();
		
		
		System.out.println(ip);
		break;
		
		case 2:
		redesController = new RedesController();
		String process = "ifconfig";
		redesController.callProcess(process);
		break;

		case 3:
		redesController = new RedesController();	
		String processo = "ping -4 -c 10 -q www.google.com";
		redesController.Ping(processo);
		break;
		
		case 9:
			JOptionPane.showMessageDialog(null,"Sair");
		break;
		
		default:
			JOptionPane.showMessageDialog(null,"Invalido");
	}

	}
}
}