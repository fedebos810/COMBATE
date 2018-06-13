/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package combatesi;

import java.util.ArrayList;


class Continente 
{
        private String nombre;
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
	
	public ArrayList<Integer> getTerritorios(){
		return territorios;
	}
	
	public int getValor(){
		return valor;
	}
	

}
