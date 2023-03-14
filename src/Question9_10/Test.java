package Question9_10;

public class Test {
    public static void main(String[] args) {

            Employee emp1 = new Employee("Tarkan");
            emp1.age = 52;
            emp1.salary = 30.000;

            Intern int1 = new Intern("Humeyra");
            int1.age = 25;
            int1.school = "Akdeniz Üniversitesi";

             Employee emp2 = new Employee("Mehmet");
             emp2.age = 48;
             emp2.salary = 30.000;

             Intern int2 = new Intern("Sezen");
             int2.age = 18;
             int2.school = "Akdeniz Üniversitesi";

        PersonnelIslem islem = new PersonnelIslem();
            Person[] personel = {emp1, int1,emp2,int2};

            islem.personelListele(personel);
            islem.personelDagilim(personel);

    }
}
