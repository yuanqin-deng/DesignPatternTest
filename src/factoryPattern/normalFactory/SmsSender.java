package factoryPattern.normalFactory;

/**
 * Created by DengYuanqin on 6/20/2016.
 */
public class SmsSender implements Sender{

    @Override
    public void sender() {
        System.out.println("This is a sms sender");
    }
}
