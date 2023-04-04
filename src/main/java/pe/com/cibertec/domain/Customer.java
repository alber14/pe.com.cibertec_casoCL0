
package pe.com.cibertec.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;
import net.bytebuddy.dynamic.loading.ClassReloadingStrategy;

@Data
@Entity
@Table (name= "customer") 
public class Customer implements Serializable{
    
    private static final long serialVersionUID = 1L ;
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id_customer ;
    
    private String nombre;
     private String telefono;  
    private String correo;
}
