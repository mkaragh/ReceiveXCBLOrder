package org.dxc.ngoi.order.receiver;

import java.text.SimpleDateFormat;
import java.util.Date;

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
    
    @Autowired
    private TransactionDataServiceClient transactionDataServiceClient;
	
	
	@PostMapping(path="/receive") // Map ONLY POST Requests
	public String receiveOrder (@RequestBody String orderXML) {			
				
		Order xcblOrder = XmlObjectUtil.getXCBLOrderFromXML(orderXML);		
		//String orderXML = XmlObjectUtil.objectToXml(order);		
		//System.out.println(orderXML);
	    try {
	    	
	    	this.kafkaProducer.sendMessage(topic, orderXML);
	    	
	    } catch(Exception ex)	    
	    {
	    	return "Order not received. Please resubmit" ;	    }
		
		// return XmlObjectUtil.getXMLStringFromXCBLOrder(xcblOrder);
		return "Order received successfuly" ;
	}
	
	private String getFormatedDate(String pattern) {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		return simpleDateFormat.format(new Date());
			
	}
	
	private boolean saveOrderInTransactionLog(String orderXML) {

	    TransactionLog transactionLog = new TransactionLog();
        transactionLog.setRequestMsg(orderXML);
        transactionLog.setReceivedDate(getFormatedDate("yyyy-MM-dd HH:mm:ss")); //
        transactionDataServiceClient.addNewTransactionLog(transactionLog);
        
        return true;
		
	}
	

}
