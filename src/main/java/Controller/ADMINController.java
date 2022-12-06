package Controller;


import Model.Admin;
import Repository.AdminRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.List;

@RestController
@RequestMapping("/admin")
public class ADMINController {

    @Autowired
    AdminRepo adminRepo;

    @PostMapping("/addAdmin")
    Admin addAdmin(@RequestBody Admin newAdmin){
        return adminRepo.save(newAdmin);
    }

    @GetMapping("/getAllAdmins")
    List<Admin>getAllAdmins(){
        return adminRepo.findAll();
    }
}
