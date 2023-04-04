
package pe.com.cibertec.servicio;

import java.util.List;
import pe.com.cibertec.domain.Customer;


public interface CustomerService {
    
    public List<Customer> listarCustomer();
    
    public void guardar(Customer customer);
    
    public void eliminar (Customer customer);
    
    public Customer encontrarCustomer(Customer customer);
    
    
}
