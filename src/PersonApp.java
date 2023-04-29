public class PersonApp {
    public static void main(String[] args) {

        var person1 = new Person( "", "","", "");
//        person1.name = "Achmad"; line ini dapat dihapus, setelah penambahan parameter dalam constuctor
//        person1.address = "Depok"; line ini dapat dihapus, setelah penambahan parameter dalam constuctor
//        person1.country = "Amerika"; akan error karna jika sudah final tidak bisa diubah datanya.
//        Person person2 = new Person();
//        Person person3;
//        person3 = new Person();

        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);

        person1.sayHello("Achmad","Andara","Cimanggis","Bandung");

        Person person2 = new Person("Budi", "Jakarta", "","");

        Person person3;
        person3 = new Person("", "","","");
        person3.sayHello("Tony","Andrian","Cibubur","");
//        person3.name = "Anwar"; line ini dapat dihapus, setelah penambahan parameter dalam constuctor
//        person3.sayHello("Tatang");line ini dapat dihapus, setelah penambahan parameter dalam constuctor
//        System.out.println(person2);
//        System.out.println(person3);

    }
}
