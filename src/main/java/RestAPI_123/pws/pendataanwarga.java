/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RestAPI_123.pws;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
 *
 * @author ASUS
 */
@Entity
@Table(name = "pendataan")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class pendataanwarga {
    @Id
    private String KTP;
    private String Nama;
    private String Alamat;
    private String Status;
}
