public class ObjectClassMethod {

    public static void main(String[] args) {

        Person person1 = new Person(8911131234567L);
        Person person2 = new Person(8911131234567L);

        System.out.println("person1 == person2 : " + (person1==person2));
        System.out.println("person1.equals(person2) : " + person1.equals(person2));

        // TODO: String 클래스는 문자열이 같으면 true를 반환하도록 equals 메소드를 오버라이딩 했음
        String str1 = new String("ABC");
        String str2 = new String("ABC");

        System.out.println("str1.equals(str2) : " + str1.equals(str2));

        /**
         * TODO: hashCode 메소드도 오버라이딩 했음
         * TODO: 때문에 *** equals 메소드의 결과가 true인 두 객체의 hashCode가 일치한다 ***
         * TODO: String의 hashCode 메소드는 문자열의 내용을 가지고 hashCode를 만들기 때문에 문자열의 내용이 같으면 몇번을 수행해도 hashCode의 값이 같다
         * TODO: 반면에 Object 클래스의 hashCode 메소드는 객체의 주소를 가지고 hashCode를 만들기 때문에 실행할 때마다 hashCode가 달라질 수 있다.
         */
        System.out.println("str1.hashCode() : " + str1.hashCode());
        System.out.println("str2.hashCode() : " + str2.hashCode());

        // TODO: Object.hashCode()가 오버라이딩 된 경우에 객체마다 다른 hashCode를 얻고자 할때 사용 (System.identityHashCode(Object obj))
        System.out.println("System.identityHashCode(str1) : " + System.identityHashCode(str1));
        System.out.println("System.identityHashCode(str2) : " + System.identityHashCode(str2));

        System.out.println("Object.toString()  : Person@511d50c0");
        System.out.println("person1.toString() : " + person1.toString());

        Person original = new Person(8911137654321L);
        Person copy = (Person) original.clone();
        System.out.println(original);
        System.out.println(copy);
    }
}
