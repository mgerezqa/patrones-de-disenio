package examplecommandpattern;

/**
 * @author Martin
 * @version 1.0
 * @created 14-feb.-2025 20:26:27
 */
public class Luz {

	private String ubicacion;

	public Luz(){

	}

	public void finalize() throws Throwable {

	}
	/**
	 * 
	 * @param identificacion
	 */
	public Luz(String identificacion){
		ubicacion = identificacion;
	}

	public void activar(){
		System.out.println(ubicacion + ": La luz está encendida");

	}

	public void desactivar(){
		System.out.println(ubicacion + ": La luz está apagada");

	}
}//end Luz