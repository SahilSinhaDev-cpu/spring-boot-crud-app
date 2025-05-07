public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    @Query("SELECT e FROM Employee e JOIN e.department d")
    List<Employee> findAllEmployeesWithDepartment();
}