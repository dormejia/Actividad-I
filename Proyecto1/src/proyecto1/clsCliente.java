/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1;

/**
 *
 * @author Renato
 */
public class clsCliente extends clssPersona{
    
    private String Nit;

    public String getNit() {
        return Nit;
    }

    public void setNit(String Nit) {
        this.Nit = Nit;
    }
    
     public String[] crear(){
          String datos[] = new String [6];
        datos[0] = getNit();
        datos[1] = getNombre();
        datos[2] = getApellido();
        datos[3] = getDireccion();
        datos[4] = getTelefono();
        datos[5] = getFecha_na();
        
        return datos;
   
     
     }
}
