package factoryPattern.abstractFactoy;

import factoryPattern.normalFactory.MailSender;
import factoryPattern.normalFactory.Sender;

/**
 * Created by DengYuanqin on 6/20/2016.
 */
class MailSenderFactory implements Providor {
    @Override
    public Sender produce() {
        return new MailSender();
    }
}
