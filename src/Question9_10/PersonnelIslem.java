package Question9_10;

public class PersonnelIslem {
    public void personelListele(Person [] people){
        for(Person p: people){
            if (p.getClass().getName()=="Question9_10.Employee") {//inheritance edildiği sınıfı öğrenmek için
                Employee emp = (Employee) p;//downcasting
                System.out.println("name: "+emp.name+" age: "+emp.age+" salary "+emp.getSalary());
            } else if (p.getClass().getName()=="Question9_10.Intern") {
                Intern intern = (Intern) p;//downcasting
                System.out.println("name: "+intern.name+" age: "+intern.age+" school "+intern.getSchool());
            }
        }
    }

    public void personelDagilim(Person [] people){
        int genc = 0, yirmiOtuz =0, kirkSonrasi=0;
        for(Person p: people){
            if (p.age <= 20) {
                genc++;
            } else if ( 20 <=p.age && p.age <= 40) {
                yirmiOtuz++;
            }else if (40 < p.age) {
                kirkSonrasi++;
            }
        }

        System.out.println("0-20 arası: %"+((double)genc/people.length)*100); // (personellerin yüzde kaçı 0-20 yaş aralığında)
        System.out.println("20-40 arası: %"+((double)yirmiOtuz/people.length)*100);
        System.out.println("40 ve üzeri: %"+((double)kirkSonrasi/people.length)*100);


    }
}
