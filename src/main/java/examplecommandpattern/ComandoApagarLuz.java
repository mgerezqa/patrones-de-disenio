package examplecommandpattern;

/**
 * @author Martin
 * @version 1.0
 * @created 14-feb.-2025 20:26:27
 */
public class ComandoApagarLuz implements Command {

	private Luz dispositivo;
	public Luz m_Luz;

	public ComandoApagarLuz(){

	}

	public void finalize() throws Throwable {

	}
	/**
	 * 
	 * @param dispositivo
	 */
	public ComandoApagarLuz(Luz dispositivo){
		this.dispositivo = dispositivo;
	}

	public void ejecutar(){
		dispositivo.desactivar();
	}
}//end ComandoApagarLuz