package factoryPattern.normalFactory;

/**
 * Created by DengYuanqin on 6/20/2016.
 */
public class SendMultiFactory {

    public Sender sendMail(){

        return new MailSender();
    }

    public Sender sendSms(){
        return new SmsSender();
    }

}
