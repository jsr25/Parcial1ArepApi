package edu.escuelaing.arep.servidorweb;

import com.google.gson.Gson;
import edu.escuelaing.arep.servicio.calculadora.FachadaCalc;

import static spark.Spark.*;

/**
 * Autor Juan Ramos
 *
 * Servidor web que muestra un formulario
 * para solicitar la operacion
 *
 */
public class ServidorWeb {

    public static void main(String[] args) {
        port(getPort());
        get("/calc",(req,res)->{
            FachadaCalc fachada = new FachadaCalc();
            String valor = req.queryParams("valor");
            String ope = req.queryParams("opera");
            Double val = Double.parseDouble(valor);
            Double respuesta = fachada.operacion(val,ope);
            String Json ="{\"respuesta"+" "+ope+"\": \""+respuesta+"\"}";
           return new Gson().toJson(Json);

        });
    }

    private static int getPort() {
        if(System.getenv("PORT")!= null){
            return  Integer.parseInt(System.getenv("PORT"));
        }
        return 3478;
    }




}
