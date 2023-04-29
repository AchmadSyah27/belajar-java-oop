class Person {
    String name;
    String inputName;
    String address;
    String inputAddress;
    final String country = "Indonesia";

    Person(String paramName, String paramAddress, String inputParamName, String inputParamAddress){
        name = paramName;
        inputName = inputParamName;
        address = paramAddress;
        inputAddress = inputParamAddress;
    }

    void sayHello(String paramName, String inputParamName, String paramAddress, String inputParamAddress){
        System.out.println("Hello "+ inputParamName+", My Name is "+ paramName + " From "+ paramAddress);
    }
}
