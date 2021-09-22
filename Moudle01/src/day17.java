public class day17 {
    public static void main(String[] args){

        System.out.println("helloworld");
    }
}
class Animal{
    int age;
    String name;

    public Animal() {
    }

    public Animal(int age, String name) {
        this.age = age;
        this.name = name;

    }

    public void shout() {

    }
}
class dog extends Animal{
//    public static void main(String[] args) {
//
//    }


    public void shout(){
        System.out.println("汪汪");
    }
}
