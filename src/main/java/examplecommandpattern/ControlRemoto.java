package examplecommandpattern;

/**
 * @author Martin
 * @version 1.0
 * @created 14-feb.-2025 20:26:27
 */
public class ControlRemoto  {

	private Command comando;

	public ControlRemoto(){

	}

	public void finalize() throws Throwable {

	}

	public void presionarBoton(){
		comando.ejecutar();
	}


	/**
	 * 
	 * @param comando
	 */
	public void setComando(Command comando){
		this.comando = comando;
	}
}//end ControlRemoto