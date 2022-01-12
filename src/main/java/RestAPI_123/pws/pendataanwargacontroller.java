/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RestAPI_123.pws;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ASUS
 */
@CrossOrigin
@RestController
@RequestMapping("/penduduk")
public class pendataanwargacontroller {

    @Autowired
    private datarepo pendataanwarga;

    @GetMapping("/pendataanwarga")
    public List<pendataanwarga> getAllpendataanwarga() {
        return pendataanwarga.findAll();
    }

    @GetMapping("/pendataanwarga/{KTP}")
    public pendataanwarga getErialbById(@PathVariable String KTP) {
        return pendataanwarga.findById(KTP).get();
    }

    @PostMapping("/pendataanwarga")
    public pendataanwarga savependataanwargaDetails(@RequestBody pendataanwarga c) {
        return pendataanwarga.save(c);
    }

    @PutMapping("/pendataanwarga")
    public pendataanwarga updatependataanwarga(@RequestBody pendataanwarga c) {
        return pendataanwarga.save(c);
    }

    @DeleteMapping("/pendataanwarga/{KTP}")
    public ResponseEntity<HttpStatus> deletependataanwargaById(@PathVariable String KTP) {
        pendataanwarga.deleteById(KTP);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
