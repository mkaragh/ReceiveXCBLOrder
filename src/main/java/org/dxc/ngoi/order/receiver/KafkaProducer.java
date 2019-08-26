package org.dxc.ngoi.order.receiver;

import org.apache.kafka.clients.producer.RecordMetadata;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.kafka.requestreply.ReplyingKafkaTemplate;

@Service
public class KafkaProducer {

    private static final Logger logger = LoggerFactory.getLogger(KafkaProducer.class);
  

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;
    
   
	/*
	 * @Autowired private ReplyingKafkaTemplate<String, String, String>
	 * replyingKafkaTemplate;
	 * Explore this further
	 */

    public void sendMessage(String topic, String message) throws Exception {
        logger.info(String.format("#### -> Producing message -> %s", message));
        
        try
        {
        	
        	ListenableFuture<SendResult<String, String>> future = this.kafkaTemplate.send(topic, message);
        	this.kafkaTemplate.flush();
        	SendResult<String, String> sendResult = future.get();
        	RecordMetadata recordMetaData = sendResult.getRecordMetadata();
        }
        catch(Exception ex)
        {
        	throw ex;
        }
      
		/*
		 * ListenableFuture<SendResult<String, String>> future =
		 * this.kafkaTemplate.send(topic, message); SendResult<String, String>
		 * sendResult = future.get(); sendResult.
		 */
    }
}
