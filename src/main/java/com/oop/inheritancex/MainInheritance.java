package com.oop.inheritancex;

public class MainInheritance {

    public static void main(String[] args) {

        Person person=new Person();
        person.setId(44L);
        person.setName("person name");
        person.setSurname("person surname");
        person.getData();
        System.out.println(person.hashCode());
        System.out.println(person);

        System.out.println("************************************");
        Teacher teacher=new Teacher();
        teacher.setId(44L);
        teacher.setName("Teacher name");
        teacher.setSurname("Teacher surname");
        teacher.getData();
        System.out.println(teacher.hashCode());
        System.out.println(teacher);

        System.out.println("************************************");
        Student student=new Student();
        student.setId(23L);
        student.setName("Student name");
        teacher.setSurname("Student surname");
        student.getData();
        System.out.println(student.hashCode());
        System.out.println(student);
    }
}
