package application.controller;

import application.dto.SellerDTO;
import application.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sellers")
public class SellerController {

    @Autowired
    private SellerService sellerService;

    @GetMapping
    public ResponseEntity<List<SellerDTO>> getAllSellers() {
        List<SellerDTO> sellers = sellerService.getAllSellers();
        return new ResponseEntity<>(sellers, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<SellerDTO> getSellerById(@PathVariable String id) {
        SellerDTO seller = sellerService.getSellerById(id);
        if (seller != null) {
            return new ResponseEntity<>(seller, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public ResponseEntity<SellerDTO> saveSeller(@RequestBody SellerDTO sellerDTO) {
        sellerService.saveSeller(sellerDTO);
        return new ResponseEntity<>(sellerDTO, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<SellerDTO> updateSeller(@PathVariable String id, @RequestBody SellerDTO sellerDTO) {
        sellerService.updateSeller(id, sellerDTO);
        return new ResponseEntity<>(sellerDTO, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> deleteSeller(@PathVariable String id) {
        sellerService.deleteSeller(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}