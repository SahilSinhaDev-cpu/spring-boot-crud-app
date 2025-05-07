-- Insert sample Departments
INSERT INTO department (name) VALUES 
('Human Resources'),
('Information Technology'),
('Finance');

-- Insert sample Employees
INSERT INTO employee (name, position, department_id) VALUES 
('Alice Smith', 'HR Manager', 1),
('Bob Johnson', 'Software Engineer', 2),
('Charlie Brown', 'Financial Analyst', 3);