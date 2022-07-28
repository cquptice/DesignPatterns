public class Singleton {
    //1.饿汉式
//    private Singleton(){}
//    private static Singleton instance = new Singleton();
//    public static Singleton getInstance(){
//        return instance;
//    }
    //2.懒汉式(双检锁)
    private Singleton(){}
    private static volatile Singleton instance = null;
        //volatile预防内存共用问题
    public static Singleton getInstance(){
        //加锁时机延后
        if (instance==null){
            synchronized (Singleton.class){
                if (instance==null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
    public void hello(){
        System.out.println("hello*");
    }
}
