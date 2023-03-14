package Question9_10;

abstract class Person {
    protected String name;
    protected int age;
    protected long idNumber;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
