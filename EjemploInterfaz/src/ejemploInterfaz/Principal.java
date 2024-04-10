package ejemploInterfaz;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<PuedeSaltar> listaPuedeSaltar = new ArrayList<>();
		
		//Npc npc1=new Npc("Npc1");
		//Npc npc2=new Npc("Npc2");
		
		//listaPuedeSaltar.add(npc1);
		//listaPuedeSaltar.add(npc2);
		
		listaPuedeSaltar = List.of(
			new Npc("Npc1"),
			new Npc("Npc2")
		);
		
		System.out.println();
		
		

	}

}
