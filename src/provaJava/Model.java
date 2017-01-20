package provaJava;

import java.util.LinkedList;
import java.util.List;

public class Model {
	
	private List<String > parole = new LinkedList <String>();
	
	public void addParola(String parolaNuova){
		if(!parole.contains(parolaNuova))                    
			parole.add(parolaNuova);
	}
	public void stampaLista(){
		for(String s : parole){
			System.out.println(s +"" );
		}
		//System.out.println(parole.toString());
	}
	
	public boolean parolaPresente (String parolaNuova){
		if(parole.contains(parolaNuova)){
			return true;
		}
		else return false;
	}
	
	public boolean parolaAccettata(String parolaNuova){               //se la lista è vuota, la prima parola deve essere accettataa
	
		boolean presente = parolaPresente(parolaNuova);
		boolean nonLegata = parolaNonLegata(parolaNuova);
		if(!presente && !nonLegata ){
			parole.add(parolaNuova);
			System.out.println(true);
		    return true;
		}
		else 
			System.out.println(false);
		    return false;	
	}
	
	public boolean parolaNonLegata(String parolaNuova){    
		//se non è vuota
		
	   if(!parole.isEmpty()){	                                                                                //se la lista non è vuota
		  String ultimaParola = parole.get(parole.size()-1);                                                     //ultima parola      //ok
		  String ultimeLettere =ultimaParola.substring(ultimaParola.length()-2, ultimaParola.length());         //ultime 2 lettere   //ok
		  String primeLettere = parolaNuova.substring(0,2);                                                    //prime 2 lettere    //ok
		    if(ultimeLettere.equals(primeLettere)){   
		        System.out.println(false);                   //sono legate
			    return  false;
		       }
		        else{
			             System.out.println(true);           //non sono legate
		                 return true;
	                 }
	   }
	   if(parole.isEmpty())
	   System.out.println(false);	                //xke la devo aggiungere
	   return false;
	   
	}
	
	public int totale(){
		int tot=0;
		tot= parole.size();
		System.out.println(tot);
		return tot;
	}
	
	public void stampaParole(){
		System.out.println(parole);
	}
}
