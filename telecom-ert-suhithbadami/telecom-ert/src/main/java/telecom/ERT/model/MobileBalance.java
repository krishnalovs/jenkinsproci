package telecom.ERT.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;





@Entity
public class MobileBalance {




   @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String phoneNumber;
    private String rechargedPackage;
    public Long getId() {
        return id;




   }
    public void setId(Long id) {
        this.id = id;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getRechargedPackage() {
        return rechargedPackage;
    }
    public void setRechargedPackage(String rechargedPackage) {
        this.rechargedPackage = rechargedPackage;
    }
}