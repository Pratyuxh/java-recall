 class A
    {
        public void show(){
            System.out.println("in A");
        }
    }
    class B extends A{
        public void show(){
            super.show(); // use of super keyword
            System.out.println("in B");
        }
    }

    public class OverridingDemo {
        public static void main(String[] args){
            B obj1 = new B();
            obj1.show();
        }
}
