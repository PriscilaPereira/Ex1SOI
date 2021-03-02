package controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class RedesController {
	public RedesController(){
		super();
	}
	
public String ip(){
		String ip = System.getProperty("os.name");
		return ip;
}

public void callProcess(String process){
	try{
		Process p = Runtime.getRuntime().exec(process);
		java.io.InputStream fluxo = p.getInputStream();
		InputStreamReader leitor = new InputStreamReader(fluxo);
		BufferedReader buffer = new BufferedReader(leitor);
		String linha = buffer.readLine();
		while (linha != null){
			System.out.println(linha);
			linha = buffer.readLine();
		}
		buffer.close();
		leitor.close();
		fluxo.close();
	}catch (Exception e){
		e.printStackTrace();
	}
}
public void Ping(String processo){
	try{
		Process s = Runtime.getRuntime().exec(processo);
		java.io.InputStream fl = s.getInputStream();
		InputStreamReader ler = new InputStreamReader(fl);
		BufferedReader buf = new BufferedReader(ler);
		String lin = buf.readLine();
		while (lin != null){
			System.out.println(lin);
			lin = buf.readLine();
		}
		buf.close();
		ler.close();
		fl.close();
	}catch (Exception i){
		i.printStackTrace();
	
}

	
}
}


	






