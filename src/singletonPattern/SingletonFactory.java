package singletonPattern;

/**
 * Created by DengYuanqin on 6/22/2016.
 */
public class SingletonFactory {
    private static SingletonFactory instance = null;

    private SingletonFactory(){}

    private static synchronized void singletonInit(){
        if (instance == null){
            instance = new SingletonFactory();
        }
    }

    public SingletonFactory getInstance(){
        if (instance == null){
            singletonInit();
        }
        return instance;
    }
}
