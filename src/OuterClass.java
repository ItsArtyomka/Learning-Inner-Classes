class OuterClass {
    //---Fields---
    private static int a1 = 2;
    protected static int a2 = 4;
    static int a3 = 6;
    public static int a4 = 3;
    private int x1 = 40;
    protected int x2 = 20;
    int x3 = 60;
    public int x4 = 100;

    //---Methods---
    private static void privateStaticOuterMethod1(int v) {
        System.out.println(v + 20);
    }

    static void packagePrivateStaticOuterMethod1(int v) {
        System.out.println(v);
    }

    public void publicInstanceOuterMethod1(int v) {
        System.out.println(a4 * v);
    }

    // Static nested class
    static class StaticNestedClass {

        public static void main(String[] args) {
            StaticNestedClass s= new StaticNestedClass();
            s.method1();
            s.method2(new OuterClass());
        }

        public void method1() {
            // Static Inner Classes could access
            int y1 = a1;
            int y2 = a2;
            int y3 = a3;
            int y4 = a4;

            privateStaticOuterMethod1(y1 + y2);
            packagePrivateStaticOuterMethod1(y3 + y4);
        }

        // The method takes an object of Outer class as a parameter which allows it to access the private fields.
        public void method2(OuterClass oc) {
            // Access to the private field is opened through a link to the Outer class.
            int z1 = oc.x1;
            int z2 = oc.x2;
            int z3 = oc.x3;
            int z4 = oc.x4;

            oc.publicInstanceOuterMethod1(z1 + z2 + z3 + z4);
        }
    }
}