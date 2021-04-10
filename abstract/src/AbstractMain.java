public class AbstractMain {

    public static void main(String[] args) {

        // TODO: 인스턴스를 생성할 수 없음
//        Player player = new Player();

        Unit[] group = new Unit[4];
        group[0] = new Marine();
        group[1] = new Tank();
        group[2] = new Marine();
        group[3] = new Dropship();

        // TODO: 추상클래스의 move 메서드가 호출되는 것이 아니라 각 인스턴스의 구현된 move 메서드가 호출됨
        for(int i=0; i<group.length; i++) {
            group[i].move(100, 200);
        }
    }
}
