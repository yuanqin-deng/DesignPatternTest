package singletonPattern;

/**
 * Created by DengYuanqin on 6/21/2016.
 */

/**
 * This class is for the singleton (design pattern)
 * Singleton class provides a static method to get its static instance to outside world
 */
public class Singleton {
    /*
     * Keep private static instance, to protect this instance that can't be referenced,
     * and the value is null, in order to realise a lazy loading.
     */
    private static Singleton instance = null;

    /**
     * Private constructor, to prevent instantiation.
     */
    private Singleton(){}

    /**
     * Static method to create instance.
     * Lazy initialisation.
     * @return Singleton
     */
    public static Singleton getInstance(){
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }

    /**
     * Synchronized method for the instance.
     * It's only for single thread.
     * @return
     */
    public static synchronized Singleton getInstanceSync(){
        if(instance == null){
            synchronized (instance){
                instance = new Singleton();
            }
        }
        return instance;
    }

    /**
     * If the object is used to serialize, to ensure the consistency of the object serialization of before and after.
     * @return
     */
    public Object getResolve() {
        return instance;
    }
}
