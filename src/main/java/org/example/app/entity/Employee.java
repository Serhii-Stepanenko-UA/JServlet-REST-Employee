package org.example.app.entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "employees")
public class Employee {

    // @Id
    // Визначає первинний ключ об'єкта.
    //
    // @GeneratedValue(strategy = GenerationType.IDENTITY)
    // Для автоматичного генерування значення первинного ключа.
    // Визначає стратегію генерації значень первинних ключів.
    // GenerationType.IDENTITY вказує, що первинні ключі для сутності
    // повинні призначатися, використовуючи стовпець ідентифікації БД.
    // Вони автоматично збільшуються.
    //
    // @Column (name = "id")
    // Вказує зіставлення стовпців в БД.
    // Атрибут name використовується для вказівки імені стовпця таблиці.
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    // Тут, найменування стовпця в БД
    // не збігається із найменуванням змінної.
    // Атрибут name розв'язує проблему.
    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "job_position")
    private String jobPosition;

    @Column(name = "phone")
    private String phone;

    public Employee() {
    }

    public Employee(Long id, String firstName, String lastName, String jobPosition, String phone) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.jobPosition = jobPosition;
        this.phone = phone;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getJobPosition() {
        return jobPosition;
    }

    public void setJobPosition(String jobPosition) {
        this.jobPosition = jobPosition;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;
        return Objects.equals(id, employee.id) && Objects.equals(firstName, employee.firstName) && Objects.equals(lastName, employee.lastName) && Objects.equals(jobPosition, employee.jobPosition) && Objects.equals(phone, employee.phone);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(id);
        result = 31 * result + Objects.hashCode(firstName);
        result = 31 * result + Objects.hashCode(lastName);
        result = 31 * result + Objects.hashCode(jobPosition);
        result = 31 * result + Objects.hashCode(phone);
        return result;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", jobPosition='" + jobPosition + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
