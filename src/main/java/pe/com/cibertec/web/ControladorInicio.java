 
package pe.com.cibertec.web;


import java.util.ArrayList;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.com.cibertec.domain.Customer;
import pe.com.cibertec.Dao.CustomerDao;
import pe.com.cibertec.servicio.CustomerService;

//@RestController
@Controller
@Slf4j
public class ControladorInicio {
    
    @Autowired
    
    private CustomerService  customerService;
    
     @GetMapping("/")
    public String inicio(Model model ){
         
        var customer = customerService.listarCustomer();
        log.info("ejecutando el controlador spring MVC"); 
        model.addAttribute("customer", customer);
        return "index"; 
    }
    
   @GetMapping("/agregar") 
   public String agregar (Customer customer) {
    
       return "modificar";
   }
   
    @PostMapping("/guardar")
    public String guardar (Customer customer){
        customerService.guardar(customer);
        return "redirect:/"; 
    }
    
    
    @GetMapping("/editar/{id_customer}")
    public String editar(Customer customer, Model model){
        customer = customerService.encontrarCustomer(customer);
        model.addAttribute("customer" , customer);
        
        return "modificar";
    }
    
    
     @GetMapping("/eliminar/{id_customer}")
    public String eliminar(Customer customer){
        customerService.eliminar(customer);
                return "redirect:/";
    }
}
