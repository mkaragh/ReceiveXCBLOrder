package org.dxc.ngoi.order.receiver;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



import rrn.org_xcbl.schemas.xcbl.v3_5.xcbl35.Order;

@RestController    // This means that this class is a Controller
@RequestMapping(path="/order/XCBL") // This means URL's start with /demo (after Application path)
public class ReceiveXCBLOrderController {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private KafkaProducer kafkaProducer;
	

    @Value("${cloudkarafka.topic}")
    private String topic;
	
	
	@PostMapping(path="/receive") // Map ONLY POST Requests
	public String receiveOrder (@RequestBody String orderXML) {	
	
		  for (int i = 100; i < 110; i++) {
		      logger.info("Log is coming " + i);
		    }
				
		Order xcblOrder = XmlObjectUtil.getXCBLOrderFromXML(orderXML);
		
		//String orderXML = XmlObjectUtil.objectToXml(order);
		
		System.out.println(orderXML);
	    
		this.kafkaProducer.sendMessage(topic, orderXML);
		
		// return XmlObjectUtil.getXMLStringFromXCBLOrder(xcblOrder);
		return "Order received successfuly" ;
	}
	

}
