public class Main {
    public static void main(String[] args) {
        Scope scope = new Scope();
        System.out.println(scope.repeatStringHorizontal("xys", 10));
        System.out.println();
        System.out.println(scope.repeatStringVertical("xyz", 10));
    }
}
