package factoryPattern.multiFactory;

import factoryPattern.normalFactory.MailSender;
import factoryPattern.normalFactory.Sender;
import factoryPattern.normalFactory.SmsSender;

/**
 * Created by DengYuanqin on 6/20/2016.
 */
public class SendMultiFactory {

    Sender sendSms;
    Sender sendMail;

    public void sendSms(){
        sendSms = new SmsSender();
        sendSms.sender();
    }

    public void sendMail(){
        sendMail = new MailSender();
        sendMail.sender();
    }
}
