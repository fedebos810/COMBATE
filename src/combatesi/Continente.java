/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package combatesi;


class Continente 
{
    private String name;
	private ArrayList<Integer> territorios;
	private int valor;
	Territorio t;
	
	
	Continente(String nm, ArrayList<Integer> t, int v){
		nombre = nm;
		valor = v;
		territorios = t;
	}
	
	public String getName(){
		return nombre;
	}
	
	public ArrayList<Integer> getTerritories(){
		return territorios;
	}
	
	public int getValue(){
		return value;
	}
	
	public boolean isTerritoryOf(Territory t){
		return (territories.contains(t.getId()));
	}
	
	public boolean isContinentCaptured(Player p){
		Vector<Integer> t1 = new Vector<Integer>();
		Vector<Territory> t2 = p.getOccupiedTerritories();
                
		for (int c = 0; c < t2.size(); c++)
			t1.add(t2.elementAt(c).getId());              
		for (int i = 0; i < territories.size(); i++){
                    if(!t1.contains(territories.elementAt(i)))
			return false;
		}//end for loop		
	return true; 
	}

}

    
}
