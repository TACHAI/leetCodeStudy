package combinationSum;

import java.io.File;

/**
 * @author tachai on 2022/2/9 2:25 下午
 * gitHub https://github.com/TACHAI
 * Email tc1206966083@gmail.com
 */
public class Test {
//    static {
//        int x = 5;
//    }
//    static int x, y;
//    public static void main(String args[]) {
//        x--;
//        myMethod();
//        System.out.println(x);
//        System.out.println(y);
//        System.out.println(x + y + ++x);
//    }
//    public static void myMethod() {
//        y = x++ + ++x;
//    }


    static void throwMethod() throws IllegalAccessException {
        System.out.println("Inside throwMethod.");
        throw new IllegalAccessException("demo");
    }
    public static void main(String args[]) {

        int a = 5;
        System.out.println("Value is - " + ((a < 5) ? 9.9 : 9));

    }
    public float getNum(){
        return 3.0f;
    }
    public class Sub extends Test{

    }
}
