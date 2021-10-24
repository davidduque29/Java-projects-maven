/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WS;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author SantiDuque
 */
@WebService(serviceName = "Calculadora")
public class Calculadora {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Calculadora")
    public int Calculadora(@WebParam(name = "dato1") int dato1, @WebParam(name = "dato2") int dato2, @WebParam(name = "con") int con) {
        //TODO write your implementation code here:
        int result = 0;
        switch (con) {
            case 1:
                result = dato1 - dato2;
                break;
            case 2:
                result = dato1 + dato2;
                break;
            case 3:
                result = dato1 * dato2;
                break;
            case 4:
                result = dato1 / dato2;
                break;
            default:
                result = 00;
        }
        return result;
    }

}
