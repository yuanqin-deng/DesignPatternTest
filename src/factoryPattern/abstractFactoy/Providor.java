package factoryPattern.abstractFactoy;

import factoryPattern.normalFactory.Sender;

/**
 * Created by DengYuanqin on 6/20/2016.
 */
public interface Providor {
    public Sender produce();
}
