@Service
public class DepartmentService {
    @Autowired
    private DepartmentRepository repo;
    
    public List<Department> listAll() { return repo.findAll(); }
    public void save(Department department) { repo.save(department); }
    public Department get(Long id) { return repo.findById(id).orElseThrow(); }
}