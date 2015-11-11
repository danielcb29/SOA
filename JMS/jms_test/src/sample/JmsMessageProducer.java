package sample;



import javax.annotation.PostConstruct;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;
import javax.jms.TextMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Component;

 
@Component
public class JmsMessageProducer {
  

    @Autowired
    private JmsTemplate template = null;

    /** 
     * Generates JMS messages
     */
    @PostConstruct
    public void generateMessages() throws JMSException {
       
            template.send(new MessageCreator() {
                public Message createMessage(Session session) throws JMSException {
                    TextMessage message = session.createTextMessage("Hello World!!! ");
                    System.out.println("Sending message... " );
                    return message;
                }
            });
       
    }

}