package edu.escuelaing.arep.servicio.calculadora;

public class FachadaCalc {

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
