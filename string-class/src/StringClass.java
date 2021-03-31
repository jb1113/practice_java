public class StringClass {

    /**
     * TODO: CLI에서 입력한 문자열들이 없을 경우 args에는 크기가 0인 String 배열이 생성되어 넘겨진다 (null이 아님에 주의)
     *       자바에서 크기가 0인 배열을 허용하지 않아서 매개변수의 값이 입력되지 않아서 args의 값이 null이 된다면
     *       매개변수의 개수가 2개인지 체크하는 코드는 다음과 같이 되어야 한다
     *       if (args == null || args.length != 2) { System.exit(0); }
     *       (args == null) 이 추가되어야 한다
     *
     */
    public static void main(String[] args) {

        /**
         * TODO: String 클래스는 char[](문자형 배열)과 그에 관련된 메서드들이 정의되어 있다
         * TODO: String instance의 내용은 바꿀 수 없다 (immutable)
         *
         * TODO: String a = "a";    a(0x100)
         *       String b = "b";    b(0x200)
         *       String a = a+b;    a(0x300)
         *       // 문자열을 결합 할 때마다 새로운 인스턴스가 생성되기 때문에 이 작업이 여러번 반복되면 비효율적 (StringBuffer 사용)
         *
         * TODO: 리터럴로 초기화하는 경우에는 String 인스턴스는 언제 어떻게 생성되나 ?
         * TODO: *.java 파일을 컴파일하면 *.class 파일에 constant pool(상수 목록)이 컴파일러에 의해 생성 됨
         * TODO: 문자열 리터럴들이 constant pool에 포함된다 그 후에 *.class 파일이 ClassLoader에 의해서 메모리에 올라갈 때
         *       *.class 파일의 constant pool의 목록이 JVM에 있는 constant pool에 저장 됨 (이 과정에서 리터럴 문자열의 String 인스턴스가 생성 됨)
         *
         * TODO: 모든 *.class 파일은 클래스 내에서 사용되는 상수들의 목록을 가지고 있고 JVM도 constant pool을 가지고 있는데
         *       이곳에 *.class 파일에 있는 constant pool 목록이 저장되는데 이때 문자열 리터럴에 대한 String 인스턴스가 생성 됨
         */

        // TODO: String str = "abc"와 String str = new String("abc")의 비교
        // TODO: str1, str2와 같이 문자열 리터럴로 초기화하면 내용이 같은 경우 하나의 인스턴스를 참조한다
        String str1 = "abc";
        String str2 = "abc";
        String str3 = new String("abc");
        String str4 = new String("abc");
        // 참조 변수 값 비교 (주소 값)
        // (str1==str2)로 괄호 붙여줘야함 앞의 문자열과 결합 후 비교해서 false 출력 됨
        System.out.println("str1==str2 : " + (str1==str2));
        System.out.println("str3==str4 : " + (str3==str4));
//        System.out.println(str1==str2);
//        System.out.println(str3==str4);
        // 인스턴스의 값 비교
        // TODO: Object 클래스에서는 단순히 참조변수의 값(주소 값)을 비교했는데
        // TODO: String 클래스에서는 인스턴스의 값을 비교하도록 오버라이딩 되어있음
        System.out.println("str1.equals(str2) : " + str1.equals(str2));
        System.out.println("str1.equals(str2) : " + str3.equals(str4));
        System.out.println("str1.equals(str3) : " + str1.equals(str3));
        System.out.println("str2.equals(str4) : " + str2.equals(str4));

        /**
         * TODO: 빈 문자열 ("", empty string)
         * TODO: 내용이 없는 문자열. 크기가 0인 char[](char형 배열)을 저장하는 문자열
         * TODO: 어느 타입이든 크기가 0인 배열을 생성 가능
         *       char[] charArr = new char[0];
         *       int[] intArr = {};
         *
         * TODO: C 언어에서는 크기가 0인 배열을 생성할 수 없음
         *       char str[] = "abc";
         *       일 경우 실제 저장되는 값은 [a, b, c, \0] (문자열의 끝을 알리는 Null문자 포함)
         *       때문에 char str[] = ""; 을 저장할 경우 실제로는 [\n]가 저장되는 크기가 1인 배열이 생성된다
         *
         * TODO: String str = "" 은 가능하지만 char c = ''; 는 불가능
         *       String은 참조형의 기본값인 null보다 빈 문자열로 초기화하는게 좋다 (String str = null; => String str = "";)
         *       char형은 기본값인 '\u0000'보다 공백으로 초기화하는게 좋다 (char c = '\u0000'; => char c = ' ';)
         */


    }
}
