
package com.jyoti.client;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "AuthenticationException", targetNamespace = "http://ws.bookingservice.jyoti.com/")
public class AuthenticationException_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private AuthenticationException faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public AuthenticationException_Exception(String message, AuthenticationException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public AuthenticationException_Exception(String message, AuthenticationException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.jyoti.client.AuthenticationException
     */
    public AuthenticationException getFaultInfo() {
        return faultInfo;
    }

}
