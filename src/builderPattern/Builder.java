package builderPattern;

import factoryPattern.normalFactory.MailSender;
import factoryPattern.normalFactory.Sender;
import factoryPattern.normalFactory.SmsSender;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by DengYuanqin on 6/23/2016.
 */

/**
 * Builder pattern builds a complex object using simple objects and using a step by step approach.
 * This type of design pattern comes under creational pattern as this pattern provides one of the best ways to create an object.
 * A Builder class builds the final object step by step. This builder is independent of other objects.
 */
public class Builder {

    /**
     * A list for stock the list of objects.
     */
    private List<Sender> senderList = new ArrayList<Sender>();


    /**
     * Call the implementation Sms.
     * @param count
     * @return list of Sender
     */
    public List<Sender> senderSmsList(int count){
        for(int i=0;i<count;i++){
            senderList.add(new SmsSender());
        }
        return senderList;
    }


    /**
     * Call the implementation Mail
     * @param count
     * @return list of Sender
     */
    public List<Sender> senderMailList(int count){
        for(int i=0;i<count;i++){
            senderList.add(new MailSender());
        }
        return senderList;
    }
}
