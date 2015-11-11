package sample;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;
import org.springframework.stereotype.Component;

/**
 *
 * @author dc
 */

@Component
public class JmsMessageListener implements MessageListener {

    public void onMessage(Message message) { 
        try {
            if (message instanceof TextMessage) {
                TextMessage tm = (TextMessage)message;
                String msg = tm.getText();
                System.out.println("Message receive "+msg);
            }
        } catch (JMSException e) {
            e.printStackTrace();
        }
    }

}