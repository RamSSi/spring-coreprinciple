package hello.core.singleton;

public class SingletonService {

    private static final SingletonService instance = new SingletonService();

    public static SingletonService getInstance() {
        return instance;
    }

    private SingletonService() {

    }   // 생성자가 private이므로 다른 곳에서 새로운 인스턴스 생성 불가

    public void logic() {
        System.out.println("싱글톤 객체 로직 호출");
    }
}