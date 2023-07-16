package demo;

public class SingletonClass {

    SingletonClass singletInstance;
    
    private SingletonClass(){}

    public SingletonClass singletonClass(){

        if (singletInstance == null){
            return new SingletonClass();
        }
        return singletInstance;
    }

    protected Object clone() throws CloneNotSupportedException {
        if(singletInstance != null){
            return singletInstance;
        }
        throw new CloneNotSupportedException();
    }
}
