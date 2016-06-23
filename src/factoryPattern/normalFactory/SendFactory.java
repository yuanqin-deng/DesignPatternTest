package factoryPattern.normalFactory;

/**
 * Created by DengYuanqin on 6/20/2016.
 */
public class SendFactory {
    public Sender procedure(String msg){
        if(msg.equals("mail")){
            return new MailSender();
        }else if(msg.equals("sms")){
            return new SmsSender();
        }else {
            return null;
        }
    }

}
