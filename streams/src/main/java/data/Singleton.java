package data;

public class Singleton {

    private Singleton singleton = null;
    private Singleton(){}

    public Singleton getInstance(){
        if( singleton ==null){
            this.singleton = new Singleton();
            return this.singleton;
        }
        else {
            return this.singleton;
        }
    }
}
