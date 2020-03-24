package com.company;

import java.rmi.Remote;
import java.rmi.RemoteException;


// Интрефейс, используемый для поддержки удалённых вызовов (аргументы и возваращаемые значения должны быть примитивами или Serializable)
public interface MyRemote extends Remote {

    // Т.к. вызовы удалённых методов считаются "рискованными". Объявляение RemoteException в каждом методе обращает внимание клиента на то, что вызов может не сработать
     public String sayHello() throws RemoteException;
}
