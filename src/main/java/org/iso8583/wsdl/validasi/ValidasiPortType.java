
package org.iso8583.wsdl.validasi;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "validasiPortType", targetNamespace = "urn:validasi")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ValidasiPortType {


    /**
     * validasidata
     * 
     * @param id
     * @return
     *     returns java.lang.String
     */
    @WebMethod(action = "urn:validasi#getData")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getData", targetNamespace = "urn:validasi", className = "validasi.GetData")
    @ResponseWrapper(localName = "getDataResponse", targetNamespace = "urn:validasi", className = "validasi.GetDataResponse")
    public String getData(
        @WebParam(name = "id", targetNamespace = "")
        String id);

}
