package Algorithm.Easy;

import Algorithm.Assist.Employee;

import java.util.List;

public class EmployeeImportance {
    public int getImportance(List<Employee> employees, int id) {
        Employee curEmployee = null;
        for (Employee e: employees) {
            if (e.id == id) {
                curEmployee = e;
                break;
            }
        }
        return findImportance(curEmployee, employees);
    }
    public int findImportance(Employee cur, List<Employee> employees) {
        if (cur.subordinates == null) return cur.importance;
        int sum = cur.importance;
        for (Integer i: cur.subordinates) {
            for (Employee e: employees) {
                if (e.id == i) {
                    sum += findImportance(e, employees);
                }
            }
        }
        return sum;
    }
}
