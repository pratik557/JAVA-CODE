public class MyClass { static String str = "";

public static void main(String[] args) { try {

str += "a";

throw new Exception(); } catch (Exception e) { str += "b";

} finally { str += "c"; method(); str += "d";

System.out.println(str);

}

static void method () {

throw new NullPointerException();

}