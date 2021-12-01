package Controller;

import Model.Student;

import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;


public class ThirteenOverAvaregeController {

    //Variable TreeMap instantiated to control the result.
    Map<String, Student> map = new TreeMap<String, Student>();


    public void howManyStudents() throws InterruptedException {

        //Variables instantiated to control the result.
        float n_Students = 0;
        float allHeights = 0;
        float avarageHeight = 0;

        //Instantiated variables, initialized with the students(data) described in the challenge
        Student a = new Student("Bruno", 170, 14);
        Student b = new Student("Leonardo", 174, 21);
        Student c = new Student("Juan", 156, 12);
        Student d = new Student("Juliana", 166, 13);
        Student e = new Student("Wagner", 184, 17);
        Student f = new Student("Micaela", 172, 18);
        Student g = new Student("Bento", 150, 14);
        Student h = new Student("Lucia", 162, 13);
        Student i = new Student("Pedro", 169, 14);
        Student j = new Student("Carla", 158, 16);

        //Populating the TreeMap with data
        map.put("Bruno", a);
        map.put("Leonardo", b);
        map.put("Juan", c);
        map.put("Juliana", d);
        map.put("Wagner", e);
        map.put("Micaela", f);
        map.put("Bento", g);
        map.put("Lucia", h);
        map.put("Pedro", i);
        map.put("Carla", j);

        //Instantiated variable, initialized with TreeMap values to operate on them
        Collection<Student> students = map.values();

        //Operating to find the average height
        for (Student s : students) {
            allHeights += s.getHeitght();
            n_Students++;
        }

        avarageHeight = allHeights/n_Students;


        n_Students = 0;
        //Shows all students under the age of thirteen below average height
        for (Student s : students) {

            //Variables to control the result
            float sHeight = s.getHeitght();
            int sAge = s.getAge();
            String sName = s.getName();

            //Students with the required condition
            if (sHeight<avarageHeight && s.getAge()>13) {

                System.out.println(" ++++++++++++");
                System.out.println(" ");
                System.out.println(" Name: " + sName);
                System.out.println(" Height: " + sHeight);
                System.out.println(" Age: " + sAge);
                System.out.println(" ");
                System.out.println(" ++++++++++++");
                n_Students++;
                Thread.sleep(500);
            }
        }


        //Console interface with the result
        System.out.println(" -------------------- ");
        System.out.println(" ");
        System.out.println(" The number of students shorter than the average height and over thirteen years old is: " + n_Students);
        System.out.println(" ");
        System.out.println(" -------------------- ");
        Thread.sleep(1000);


        System.out.println(" -------------------- ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" Evaluated students: ");
        for (Student s : students) {

            //Variables to control the result
            float sHeight = s.getHeitght();
            int sAge = s.getAge();
            String sName = s.getName();

            //All Students
            System.out.println(" ++++++++++++");
            System.out.println(" ");
            System.out.println(" Name: " + sName);
            System.out.println(" Height: " + sHeight);
            System.out.println(" Age: " + sAge);
            System.out.println(" ");
            System.out.println(" ++++++++++++");
            Thread.sleep(500);
        }
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" -------------------- ");

    };
}
