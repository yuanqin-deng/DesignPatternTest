package factoryPattern.staticFactory;

import factoryPattern.normalFactory.MailSender;
import factoryPattern.normalFactory.Sender;
import factoryPattern.normalFactory.SmsSender;

/**
 * Created by DengYuanqin on 6/20/2016.
 */
public class SendFactory {
    public static Sender sendMail(){
        return new MailSender();
    }

    public static Sender sendSms(){
        return new SmsSender();
    }
}
