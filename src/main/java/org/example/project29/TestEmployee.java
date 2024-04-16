package org.example.project29;

import org.example.project29.Entity.Department;
import org.example.project29.Entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestEmployee {

    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();

        Session session = null;

        try {

//            session = factory.getCurrentSession();
//
//            Department department = new Department("HR", 1000, 300);
//            Employee emp1 = new Employee("Violetta", "Snegireva", 1000);
//            Employee emp2 = new Employee("Zhanna", "Kutuzova", 500);
//
//            department.addEmployeeToDepartment(emp1);
//            department.addEmployeeToDepartment(emp2);
//
//            session.beginTransaction();
//            session.persist(department);
//            session.getTransaction().commit();
//
//            System.out.println("Успешно!");

            //////////////////////////////////

//            session = factory.getCurrentSession();
//
//            session.beginTransaction();
//
//            Department department = session.get(Department.class, 2);
//            System.out.println(department);
//            System.out.println(department.getEmps());
//
//            session.getTransaction().commit();
//
//            System.out.println("Успешно!");

            /////////////////////////////////

//            session = factory.getCurrentSession();
//
//            session.beginTransaction();
//
//            Employee employee = session.get(Employee.class, 3);
//
//            System.out.println(employee);
//            System.out.println(employee.getDepartment());
//
//            session.getTransaction().commit();
//
//            System.out.println("Успешно!");

            /////////////////////////////////////

            session = factory.getCurrentSession();

            session.beginTransaction();

            Department department = session.get(Department.class, 2);

            session.remove(department);

            session.getTransaction().commit();

            System.out.println("Успешно!");

        }
        finally {
            session.close();
            factory.close();
        }
    }
}
