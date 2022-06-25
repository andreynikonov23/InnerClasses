public class Util {
    public static void testClass(Object obj) throws UnsupportedInterfaceMarkerException {
        if (obj == null){
            throw new UnsupportedInterfaceMarkerException();
        } else
            System.out.println("Nice");
    }
}
