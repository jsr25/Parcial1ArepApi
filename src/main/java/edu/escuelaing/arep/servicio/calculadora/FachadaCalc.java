package edu.escuelaing.arep.servicio.calculadora;

/**
 * Autor Juan Ramos
 *
 * Controlados calculadora
 */
public class FachadaCalc {
    /**
     * Controlador de la calculadora
     * @param valor numero a operar
     * @param oper operacion
     * @return resultado
     */
    public Double operacion(Double valor, String oper){
        Double res = 0.0;
        if(oper.equals("cos")){
            res = calc.calcCos(valor);
        }
        else if(oper.equals("sin")){
            res =calc.calcSin(valor);
        }
        else if(oper.equals("tan")){
            res = calc.calcTan(valor);
        }

        return res;
    }
}
