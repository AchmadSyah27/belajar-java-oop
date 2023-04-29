public class PersonApp {
    public static void main(String[] args) {

        var person1 = new Person();
        person1.name = "Achmad";
        person1.address = "Depok";
//        person1.country = "Amerika"; akan error karna jika sudah final tidak bisa diubah datanya.
//        Person person2 = new Person();
//        Person person3;
//        person3 = new Person();

        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);

        person1.sayHello("Andara");

        Person person3;
        person3 = new Person();
        person3.name = "Anwar";
        person3.sayHello("Tatang");
//        System.out.println(person2);
//        System.out.println(person3);

    }
}
