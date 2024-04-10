package ejemploInterfaz;

public class Npc implements PuedeSaltar{
	
	private String nombre;

	public Npc(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public String toString() {
		return "Npc [nombre=" + nombre + "]";
	}

	@Override
	public void saltarHaciaAtras() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saltarHaciaAdelante() {
		// TODO Auto-generated method stub
		
	}

}
