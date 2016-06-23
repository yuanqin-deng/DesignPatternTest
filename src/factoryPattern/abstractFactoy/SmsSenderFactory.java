package factoryPattern.abstractFactoy;

import factoryPattern.normalFactory.Sender;
import factoryPattern.normalFactory.SmsSender;

/**
 * Created by DengYuanqin on 6/20/2016.
 */
public class SmsSenderFactory implements Providor{
    @Override
    public Sender produce() {
        return new SmsSender();
    }
}
