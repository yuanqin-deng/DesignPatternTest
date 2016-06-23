package builderPattern;

import factoryPattern.normalFactory.Sender;

import java.util.List;

/**
 * Created by DengYuanqin on 6/23/2016.
 */
public class BuilderTest {
    public static void main(String[] args){
        Builder builder = new Builder();
        int count = 3;
        List<Sender> senderList = builder.senderMailList(count);
        senderList.forEach(Sender::sender);
    }
}
