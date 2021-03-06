### UML диаграмма паттерна Декоратор
![UML паттерна Декоратор](https://github.com/Dzhonson64/DesignPatterns/blob/master/imgReadme/umlDecorator.png)
***Паттерн Декоратор*** динамически наделяет объект новыми возоможностями и является гибкой альтернативой субклассированию в области расширения функциональности.

Декоратор добавляет своё поведение до и (или)  после делегирования операции декорируемому объекту, выполняещему остальную работу.

### Принцип работы декораторов
![Принцип работы декораторов](https://github.com/Dzhonson64/DesignPatterns/blob/master/imgReadme/Decorator2.png)

Также стоит обратить внимание, что в данному случае __наследование используется *НЕ для обеспечения поведения*, а *для согласования типов*__, потому что декораторы должны относится к тому же супертипу, то и декорируемые объекты. Само поведение формируется в результате композиции декораторов с базовыми компонентами и другими декораторами. 
И благодаря композиции мы можем произвольно смешивать декораторы во время выполнения. А при наследовании поведени опредялось бы статически во время компиляции.

Этот паттерн удовлетворяет принципу ***открытости/закрытости***. А именно открыт для расширения, но закрыт для изменения.

:negative_squared_cross_mark: Минусы паттерна:
* Если код будет зависеть от типа конкретного компонента, декораторы нарушат его работоспособность. Пока код пишется для абстрактного компонента, использование декораторов остаётся прозрачным для кода.
* В "чистом" паттерне Декоратор присутствует опасность получить ссылку, которая не отсносится к самому внешнему декоратору. К примеру, *DarkRoast* с декораторами *Mocah*, *Soy* и *Whip*, кто-нибудь по  неосторожност может использовать ссылку на *Soy* вместо *Whip* и тогда вншний декоратор не будет учтён в заказе. *Поэтому этот паттерн применяется в смеси с другими паттернами (Фабрика или Строитель).*