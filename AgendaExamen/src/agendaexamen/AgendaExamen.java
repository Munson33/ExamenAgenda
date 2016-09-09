/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agendaexamen;

/**
 *
 * @author Gustavo Enrique
 */
public class AgendaExamen {
    
    private static Agenda agenda;
    private static Persona persona[];
    private static int contador;
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        agenda= new Agenda();
        persona = new Persona[10];
        // TODO code application logic here
        for (int x =0 ; x<10; x++){
            persona[x]= new Persona();
        }
        contador = 0;
        
        agenda.setVisible(true);
    }
    public static void guardar(String n, String a, String c, int num){
    
        persona[contador].setNombre(n);
        persona[contador].setApellido(a);
        persona[contador].setCorreo(c);
        persona[contador].setCelular(num);
        
        contador++;
    }
    public static void buscar(String bus){
    
        for (int y =0; y < persona.length; y++){
        if (persona[y].getNombre().equals(bus)){
            agenda.cargadatos(persona[y]);
        }
        }
    }
    
}
