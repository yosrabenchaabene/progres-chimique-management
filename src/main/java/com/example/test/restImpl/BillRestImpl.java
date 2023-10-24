package com.example.test.restImpl;

import com.example.test.POJO.Bill;
import com.example.test.constents.ProductConstants;
import com.example.test.rest.BillRest;
import com.example.test.service.BillService;
import com.example.test.utils.ProductUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class BillRestImpl implements BillRest {

    @Autowired
    BillService billService;
    @Override
    public ResponseEntity<String> generateRapport(Map<String, Object> requestMap) {
        try{
            return billService.generateRapport(requestMap);

        }catch (Exception ex){
            ex.printStackTrace();

        }
        return ProductUtils.getResponseEntity(ProductConstants.SOMETHING_WENT_WRONG, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @Override
    public ResponseEntity<List<Bill>> getBills() {
        try{
            return billService.getBills();

        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }

    @Override
    public ResponseEntity<byte[]> getPdf(Map<String, Object> requestMap) {
       try{
           return billService.getPdf(requestMap);

       }catch (Exception ex){
           ex.printStackTrace();
       }

        return null;
    }

    @Override
    public ResponseEntity<String> deleteBill(Integer id) {
        try{
            return billService.deleteBill(id);
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return ProductUtils.getResponseEntity(ProductConstants.SOMETHING_WENT_WRONG,HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
