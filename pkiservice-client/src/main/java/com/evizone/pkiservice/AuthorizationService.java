
/*
 * 
 */

package com.evizone.pkiservice;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.3.3
 * 2014-05-27T16:24:01.733+02:00
 * Generated source version: 2.3.3
 * 
 */


@WebServiceClient(name = "AuthorizationService", 
                  wsdlLocation = "${authServiceUrl}",
                  targetNamespace = "http://pkiservice.evizone.com/") 
public class AuthorizationService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://pkiservice.evizone.com/", "AuthorizationService");
    public final static QName AuthorizationPort = new QName("http://pkiservice.evizone.com/", "AuthorizationPort");
    static {
        URL url = null;
        try {
            url = new URL("${authServiceUrl}");
        } catch (MalformedURLException e) {
            System.err.println("Can not initialize the default wsdl from http://127.0.0.1:8080/authservice/AuthorizationService?wsdl");
            // e.printStackTrace();
        }
        WSDL_LOCATION = url;
    }

    public AuthorizationService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public AuthorizationService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public AuthorizationService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    /**
     * 
     * @return
     *     returns Authorization
     */
    @WebEndpoint(name = "AuthorizationPort")
    public Authorization getAuthorizationPort() {
        return super.getPort(AuthorizationPort, Authorization.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Authorization
     */
    @WebEndpoint(name = "AuthorizationPort")
    public Authorization getAuthorizationPort(WebServiceFeature... features) {
        return super.getPort(AuthorizationPort, Authorization.class, features);
    }

}
