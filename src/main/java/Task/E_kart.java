package Task;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
public class E_kart {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int  parcelId;
    private String receiverName;
    private String parcelItemName;
    private String receiverAddress;
    private long  receiverContact;
    private double itemPrice;
    private  String itemStatus;
    private  String  executiveName;
}

