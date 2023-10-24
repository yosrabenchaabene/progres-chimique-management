package com.example.test.service;


import com.example.test.POJO.Bill;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Map;

public interface BillService {
    ResponseEntity<String> generateRapport(Map<String,Object> requestMap);
    ResponseEntity<List<Bill>>getBills();
    ResponseEntity<byte[]> getPdf(Map<String,Object> requestMap);
    ResponseEntity<String> deleteBill(Integer id);

}
