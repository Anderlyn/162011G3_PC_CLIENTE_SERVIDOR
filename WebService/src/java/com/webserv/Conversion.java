/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.webserv;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author als_trash
 */
@WebService(serviceName = "Conversion")
public class Conversion {

    /**
     * This is a sample web service operation
     */
    
    public double tarifa = 620;
    @WebMethod(operationName = "colToDol")
    public double hello(@WebParam(name = "monto") double monto) {
        return monto/tarifa;
    }
}
