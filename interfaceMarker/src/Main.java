public class Main {
    /*
    1. Создайте интерфейс-маркер SelfInterfaceMarker
    2. Создайте класс SelfInterfaceMarkerImpl, который реализует SelfInterfaceMarker
    3. Добавьте в SelfInterfaceMarkerImpl минимум 2 любых различных public метода
        (дефолтовый public конструктор должен присутствовать)
    4. Создайте исключение UnsupportedInterfaceMarkerException
    5. В методе testClass класса Util: если параметр == null, то выбросьте UnsupportedInterfaceMarkerException
     */
    public static void main(String[] args) throws UnsupportedInterfaceMarkerException {
        SelfInterfaceMarker selfInterfaceMarker = new SelfInterfaceMarkerImpl();
        SelfInterfaceMarker selfInterfaceMarker1 = null;
        SelfInterfaceMarkerImpl selfInterfaceMarker2 = new SelfInterfaceMarkerImpl();
        Util.testClass(selfInterfaceMarker);
        Util.testClass(selfInterfaceMarker1);
        Util.testClass(selfInterfaceMarker2);
    }
}