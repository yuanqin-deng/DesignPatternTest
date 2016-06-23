package factoryPattern.staticFactory;

/**
 * Created by DengYuanqin on 6/20/2016.
 */
public class FactoryTestStatic {
    public static void main(String[] args){
        SendFactory sendFactory = new SendFactory();
        sendFactory.sendMail().sender();
        sendFactory.sendSms().sender();
    }
}
