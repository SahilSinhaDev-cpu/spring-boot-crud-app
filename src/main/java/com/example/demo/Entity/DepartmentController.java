package com.example.demo.controller;
import com.example.demo.entity.Department;
import com.example.demo.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class DepartmentController {
    @Autowired
    private DepartmentService service;
    
    @GetMapping("/departments")
    public String listDepartments(Model model) {
        model.addAttribute("departments", service.listAll());
        return "departments"; // Refers to departments.jsp
    }
    
    @PostMapping("/departments/save")
    public String saveDepartment(@ModelAttribute Department department) {
        service.save(department);
        return "redirect:/departments";
    }
}