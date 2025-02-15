package examplecommandpattern;

/**
 * @author Martin
 * @version 1.0
 * @created 14-feb.-2025 20:26:27
 */
public class ComandoPrenderLuz implements Command {

	private Luz dispositivo;

	public ComandoPrenderLuz(){

	}

	public void finalize() throws Throwable {

	}
	/**
	 * 
	 * @param dispositivo
	 */
	public ComandoPrenderLuz(Luz dispositivo){
		this.dispositivo = dispositivo;
	}

	public void ejecutar(){
		this.dispositivo.activar();
	}
}//end ComandoPrenderLuz