package factoryPattern.normalFactory;

/**
 * Created by DengYuanqing on 6/20/2016.
 */
public class FactoryTest1 {

    public static void main(String[] args){
        SendFactory sendFactory = new SendFactory();
        Sender sender = sendFactory.procedure("mail");
        sender.sender();

        System.out.println("\n********************************************************************************************************\n");
        SendMultiFactory sendMultiFactory = new SendMultiFactory();
        Sender sendMail = sendMultiFactory.sendMail();
        sendMail.sender();

        Sender sendSms = sendMultiFactory.sendSms();
        sendSms.sender();
    }
}
