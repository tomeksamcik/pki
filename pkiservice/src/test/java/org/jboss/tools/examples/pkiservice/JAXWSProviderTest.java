package org.jboss.tools.examples.pkiservice;

import java.net.URL;

import javax.xml.ws.spi.Provider;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;

public class JAXWSProviderTest {

    @Test
    public void test() {
    	Provider p = Provider.provider();
    	System.out.println("Current JAXWS Provider: " + p);
        Logger.getLogger(this.getClass()).warn("Current JAXWS Provider: " + p);
        Assert.assertTrue(p.getClass().getName().startsWith("org.jboss."));
    }
}
