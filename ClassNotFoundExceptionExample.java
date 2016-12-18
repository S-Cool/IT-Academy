import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ClassNotFoundExceptionExample {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {

//        Class clazz2 = Class.forName("com.lib.Myclass");
//        Class clazz2 = Class.forName("java.lang.Object");
        Class clazz2 = Class.forName("java.lang.Integer");
        Constructor[] constructors = clazz2.getDeclaredConstructors();
        for (Constructor c : constructors)
            System.out.println(c);

//        Object ref = clazz2.newInstance();
//        System.out.println(ref.toString());
    }
}

class C {
    public void x() {
        System.out.println("x");
    }

    public void yy() {
        System.out.println("yy");
    }

    public void zzz() {
        System.out.println("zzz");
    }

static class Util {
        public static void print(Object arg) throws InvocationTargetException, IllegalAccessException {
            Method[] metArr = arg.getClass().getDeclaredMethods();
            for (Method m : metArr) {
                if (m.getName().length() % 2 == 1) {
                    m.invoke(arg);
                }
            }
        }
    }

 static class Test {
        public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
            Util.print(new C());
//            Util.print(new Integer(0));
        }
    }
}