package daos;

import Entities.Employee;

public interface EmployeeDao {
	public void createEmployee(Employee employee);
    public void createDirectSupervisor(Employee employee);
    public void createDirectManager(Employee employee);
    public void createDepartmentHead(Employee employee);
    public void createBenco(Employee employee);
    public Employee retrieveEmployeeByEmail(String email);
    public Employee retrieveDirectSupervisorByEmail(String email);
    public Employee retrieveDirectManagerByEmail(String email);
    public Employee retrieveDepartmentHeadByEmail(String email);
    public Employee retrieveBencoByEmail(String email);
}
