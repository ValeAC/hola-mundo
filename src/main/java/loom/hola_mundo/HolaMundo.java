package loom.hola_mundo;

/**
 * Retorna un objeto String.
 * <p>
 * Este metodo siempre retorna un saludo a la persona, personalizado o no
 * @author Usuario
 * @param un string con el nombre de la persona
 * @return saludo
 * 
 */
public class HolaMundo {

    public String saludar(final String persona) {
       // throw new RuntimeException("¡Implementar este método!");
    	if(persona.isEmpty() || persona==" ")
    		return "¡Hola!"; //Saludo sin nombre
    	return "¡Hola, " + persona +"!";
    }
}
