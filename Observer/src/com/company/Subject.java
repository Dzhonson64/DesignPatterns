package com.company;

public interface Subject {
    // Регистарция и удаления наблюдателей
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);

    //Оповещение наблюдателей об изменении состояния субъекта
    public void notifyObservers();

}
