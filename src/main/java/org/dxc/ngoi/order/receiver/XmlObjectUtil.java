package org.dxc.ngoi.order.receiver;


import java.io.StringReader;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.namespace.QName;
import javax.xml.transform.stream.StreamSource;

import rrn.org_xcbl.schemas.xcbl.v3_5.xcbl35.Order;



public class XmlObjectUtil {
	
	
    // comment to trigger build and release
    
    public static Order getXCBLOrderFromXML(String xmlString) {
        try {
//        	JAXBContext jc = JAXBContextFactory.getInstance().createJAXBContext(cls);
        	JAXBContext jc = JAXBContext.newInstance(Order.class);
            Unmarshaller u = jc.createUnmarshaller();
            
            JAXBElement<Order> jaxbOrder = u.unmarshal(new StreamSource(new StringReader(xmlString)), Order.class);
    
            return jaxbOrder.getValue();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
    
    public static String getXMLStringFromXCBLOrder(Order order) {
        
        if ( null != order ) {
            try {
                StringWriter strWriter = new StringWriter();
            	JAXBContext jc = JAXBContext.newInstance(Order.class);
//            	JAXBContext jc = JAXBContextFactory.getInstance().createJAXBContext(obj.getClass());
                Marshaller m = jc.createMarshaller();
                m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
               // m.marshal(obj, strWriter);
                m.marshal(new JAXBElement<Order>(new QName("rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd","Order"), Order.class, order),strWriter);              
                return strWriter.getBuffer().toString();
            } catch (Exception e) {
                //throw new RuntimeException(e);
            	throw new RuntimeException(e);
            }           
        }else{
            return null;
        }

    }
}
    

	
