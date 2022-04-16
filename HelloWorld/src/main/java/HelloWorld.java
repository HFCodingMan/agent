public class HelloWorld {
    public HelloWorld() {
    }

    public String sayHello(String name) {
        String sayHello = "hello " + name;
        return sayHello;
    }

    public static void main(String[] args) {
        HelloWorld hl = new HelloWorld();
        System.out.println(hl.sayHello("zhang"));
    }
}