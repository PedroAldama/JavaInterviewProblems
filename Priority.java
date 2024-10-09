
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Priority {
    public static void main (String ... args){
        List<String> enterList = Arrays.asList("Enter Pedro 3.75 3","Enter Emmanuel 3.72 2", "Enter Emmanuel 3.72 1","SERVED","SERVED","SERVED");
        Priorities prio = new Priorities();
        prio.getStudents(enterList);
    }

    static class Student{
    
        private int id;
        private String name;
        private double cgpa;

        public Student(int id, String name, double cgpa){
            this.id = id;
            this.name = name;
            this.cgpa = cgpa;
        }

        int getId(){
            return this.id;
        }

        String getName(){
            return this.name;
        }

        double getCgpa(){
            return this.cgpa;
        }

        String getString(){
            return this.name + " " + this.cgpa + " " + this.id;
        }


    }

    static class Priorities{
        private List<Student> lista;

        public void addStudent(Student student){
            lista.add(student);
        }
        public Priorities(){
            this.lista = new ArrayList<>();
        }
        public void getStudents(List<String> events){
            for(String event : events){
                if(event.split(" ")[0].equals("Enter")){
                    String[] datos = event.split(" ");
                    this.addStudent(new Student(Integer.parseInt(datos[3]), datos[1], Double.parseDouble(datos[2])));
                } else {
                    this.lista.sort(Comparator.comparing(Student::getCgpa).reversed());
                    double hightCgpa = this.lista.get(0).getCgpa();
                    List<Student> founds = this.lista.stream().filter(student-> student.getCgpa() >= hightCgpa).collect(Collectors.toList());
                    if(founds.size() > 1){
                        founds.sort(Comparator.comparing(Student::getName));
                        String nameCompare = founds.get(0).getName();     
                        founds.removeIf(student -> !student.getName().equals(nameCompare));
                        if (founds.size() > 1) {
                            founds.sort(Comparator.comparing(Student::getId));
                            System.out.println(founds.get(0).getString());
                            this.lista.remove(founds.get(0));
                        } else {
                            System.out.println(founds.get(0).getString());
                            this.lista.remove(founds.get(0));
                        }
                    } else {
                        System.out.println(founds.get(0).getString());
                        this.lista.remove(founds.get(0));
                    }
                    founds.clear();
                }
                
            }
        }
    }
}
  