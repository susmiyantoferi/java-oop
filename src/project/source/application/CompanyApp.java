package project.source.application;

import project.source.data.Company;

public class CompanyApp {
    public static void main(String[] args) {
        Company company = new Company();
        company.setName("wonderful bwi");

        Company.Employee employee = company.new Employee();

        employee.setName("Feri sussmiyanto");
        System.out.println("employee name: " + employee.getName());
        System.out.println("company name: " + employee.getCompany());

    }
}
