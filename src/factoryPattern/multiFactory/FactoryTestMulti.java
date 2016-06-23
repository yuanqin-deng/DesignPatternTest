package factoryPattern.multiFactory;

/**
 * Created by DengYuanqin on 6/20/2016.
 */
public class FactoryTestMulti {
    public static void main(String[] args){
        SendMultiFactory sendMultiFactory = new SendMultiFactory();
        sendMultiFactory.sendSms();
        sendMultiFactory.sendMail();
    }
}
