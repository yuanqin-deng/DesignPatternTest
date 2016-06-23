package factoryPattern.abstractFactoy;

import factoryPattern.normalFactory.Sender;

/**
 * Created by DengYuanqin on 6/20/2016.
 */
public class FactoryTestAbstract {
    public static void main(String[] args){
        Providor providorMail = new MailSenderFactory();

        Sender senderMail = providorMail.produce();
        senderMail.sender();

        Providor providorSms = new SmsSenderFactory();

        Sender senderSms = providorSms.produce();
        senderSms.sender();
    }
}
