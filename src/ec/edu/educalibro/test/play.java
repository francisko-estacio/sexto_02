package ec.edu.educalibro.test;

import ec.com.educalibro.dalc.clienteDalc;
import ec.com.educalibro.dalc.dalc;
import ec.com.edulibro.entidades.cliente;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author francisco estacio. franklan_st@hotmail.com
 */
public class play {

    public static void main(String[] args) {
        clienteDalc dalc = new clienteDalc();
        cliente c = new cliente(0, "234", "francisco estacio", "0995443386");
        try {
            dalc.registrar(c);
        } catch (Exception ex) {
            //Logger.getLogger(play.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error: " + ex);
        }

        try {
            List<cliente> listado = dalc.listar();
            for (cliente cli : listado) {
                System.out.println(cli.toString());
            }
        } catch (Exception ex) {
            //Logger.getLogger(play.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error: " + ex);
        }
    }
}
