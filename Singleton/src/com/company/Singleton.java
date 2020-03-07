package com.company;

public class Singleton {
    private volatile static Singleton uniqieInstance;
    private Singleton(){}
    public static synchronized Singleton getInstance(){
        if (uniqieInstance == null) {
            /* Экземепляр класса не существует */
            synchronized (Singleton.class){
                /* Повторяем проверку */
                if (uniqieInstance == null) {
                    uniqieInstance = new Singleton();
                }
            }
        }
        return uniqieInstance;
    }

    // другие методы
}
