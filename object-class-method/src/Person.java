    /**
     * TODO: Cloneable 인터페이스를 구현한 클래스의 인스턴스만 복제할 수 있다
     */
public class Person implements Cloneable {
    long id;

    Person(long id) {
        this.id = id;
    }

    /**
     * TODO: Object 클래스에 정의된 equals 메소드는 단순히 참조 변수의 값(객체의 주소)를 비교한다
     * TODO: 때문에 서로 다른 인스턴스의 참조 변수 값(주소 값)은 다르기 때문에 항상 FALSE 를 반환하게 된다
     * TODO: 때문에 equals 메소드를 오버라이딩해서 인스턴스 변수의 값을 비교하도록 해야 한다
     */
    @Override
    public boolean equals(Object obj) {
//         return super.equals(obj);
        if (obj!=null && obj instanceof Person) {
            return id == ((Person)obj).id;
        } else {
            return false;
        }
    }

    /**
     * TODO: Object 클래스에 정의된 hashCode 메소드는 객체의 주소를 반환하는데 실제 메모리 주소가 아닌 JVM에서 별도로 관리하는 내부주소를 반환한다
     * TODO: 실제 Object 클래스의 hashCode 메소드는 native 메소드이며 기존의 다른 언어로 작성된 메소드를 자바에서 호출 할 때 사용한다
     * TODO: (주로 OS의 System 함수를 호출할 때 사용하며 기존 System에 있던 메소드라는 뜻)
     * TODO: native 메소드는 기존에 작성되어 있던 함수를 호출하는 것이기 때문에 추상메소드와 같이 내용이 없고 선언부만 존재한다
     * TODO: 선언부만 작성해주는 게 끝은 아니고 실제 native 메소드와 자바에서 선언한 메소드를 연결해주기 위한 여러가지 작업들이 필요하다 (JNI)
     *
     * TODO: *** equals 메소드를 오버라이딩하면 hashCode 메소드도 오버라이딩 해주는게 관례 ***
     * TODO: 필수는 아니지만 equals()의 결과가 true인 두 객체는 hashCode도 같아야 하기 때문이다
     * TODO: 그렇지 않을 경우 해싱 기법을 사용하는 클래스에서 제대로 동작하지 않을 수 있음
     *
     * TODO: System.identityHashCode(Object obj)는 Object.hashCode()와 동일한 결과를 반환한다 (주소 값으로 생성)
     * TODO: Object.hashCode()가 오버라이딩 된 경우에 객체마다 다른 hashCode를 얻고자 할때 사용한다
     *
     * TODO: hashCode의 오버라이딩은 Collection에서 다룸
     *
     */
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    /**
     * TODO: 객체를 문자열로 표현해서 반환하기 위한 메소드로 객체의 데이터(인스턴스 변수)들을 문자열로 반환
     * TODO: Object 클래스에 정의된 toString 메소드는 클래스 이름과 hashCode(16진 문자열)를 문자열로 반환
     */
    @Override
    public String toString() {
//        return super.toString();
        return "id = " + id;
    }

    /**
     * TODO: Object 클래스에 정의된 clone 메소드는 인스턴스 변수의 값 만을 복사한다
     * TODO: *** 인스턴수 변수가 기본형일 경우에는 아무런 문제가 되지 않지만 인스턴스 변수가 참조형일 때에는 참조하는 객체도 복제되게 오버라이딩 해야한다 ***
     *
     * TODO: Cloneable 인터페이스를 구현한 클래스에서만 clone 메소드를 호출할 수 있다
     * TODO: 이 인터페이스를 구현하지 않고 clone 메소드를 호출하면 예외가 발생한다
     *
     * TODO: 기존 Object.clone() 메소드의 접근제어자는 protected인데 접근제어자를 protected로 한 이유는 clone 메소드를 감추기 위해서이다
     * TODO: clone 메소드를 사용하려면 Cloneable 인터페이스도 구현해야 하고 예외 처리도 해주어야 하므로
     * TODO: 처음부터 public으로 지정해 놓으면 오버라이딩하지 않고 바로 clone 메소드를 호출 할 수 있기 떄문에 못하도록 막아놓기 위함이다
     * TODO: 그러므로 오버라이딩 할때 예외처리와 함께 접근제어자도 public으로 변경해 주어야 한다
     * TODO: 만일 private으로 해놓으면 오버라이딩은 가능하지만 Object에 작성된 clone 메소드를 호출할 수 없다 (super.clone() 불가)
     * TODO: 때문에 자식 클래스에서 오버라이딩 할 가능성이 있는 메소드는 private으로 지정하지 않는 것이 좋다 오버라이딩 할 경우 부모 클래스의 메소드를 호출하는 경우가 많으므로
     */
    @Override
    public Object clone() {
        Object obj = null;
        try {
            obj = super.clone();
        } catch (CloneNotSupportedException e) { }
        // TODO: 인스턴스 변수가 참조형일 경우에는 참조형 객체를 생성하는 코드를 작성해 주어야 한다 (object-class-clone 프로젝트 참고)
        return obj;
    }
//    protected Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }

    /**
     * TODO: getClass 메소드는 자신이 속한 클래스의 Class 객체를 반환하는 메소드
     * TODO: Class 객체는 클래스의 모든 정보를 담고 있으며 클래스 당 단 1개만 존재한다
     * TODO: 클래스파일(*.class)이 ClassLoader에 의해 메모리에 로드 될 때 생성된다
     *
     * TODO: ClassLoader는 실행 시에 필요한 클래스를 동적으로 메모리에 로드하는 역할을 한다
     * TODO: 먼저 메모리에 기존에 생성된 Class 객체가 있는지 확인하고 있을 경우 객체의 참조를 반환하고,
     * TODO: 없으면 classpath에 지정된 경로를 따라서 class 파일을 찾는다
     * TODO: 못 찾는 경우 ClassNotFound Exception이 발생하고 찾으면 해당 class 파일을 읽어서 Class 객체로 변환 한다
     *
     * TODO: |*.class파일| -----> |ClassLoader| -----> |Class 객체|
     * TODO: *.class 파일 형태로 저장되어 있는 class를 읽어서 Class class의 정의된 형식으로 변환한다
     * TODO: (간단히 *.class 파일의 내용을 읽어서 사용하기 편한 형식으로 저장해 놓은것이 Class 객체)
     *
     * TODO: Class 객체를 얻는 여러 방법
     * TODO: 1. Person person = new Person();
     *          Class personObject = person.getClass();
     *       // getClass 메소드는 객체가 생성되어 있어야만 쓸 수 있음
     *       // 생성되어 있는 객체가 없거나 생성할 필요가 없는 경우에는 아래처럼
     * TODO: 2. Class personObject = Person.class;
     *          String className = personObject.getName();
     *          // Person.class (클래스 객체를 의미) -> Person 클래스의 class라는 static 변수를 의미하는 것 같지만 아님
     *          // String className = Person.class.getName(); 과 동일
     * TODO: 3. Class personObject = Class.forName("Person");
     *          // class 이름을 가지고도 Class 객체를 얻을 수 있음
     *          // 특정 클래스를 메모리에 로드할 때 사용하기도 함 (ex. JDBC Driver를 메모리에 올릴때 forName 메소드를 사용함)
     *
     * TODO: Class 객체를 이용한 인스턴스 생성 방법 (Reflection API 참고)
     *       Person person = new Person();
     *       Person person = (Person) personObject.newInstance();
     *       둘 은 동일한 역할을 수행한다
     */
//    public final native Class<?> getClass();
}
