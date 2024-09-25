package com.example.springboot_demo1.example.controller;


import com.example.springboot_demo1.example.entity.QbKey;
import com.example.springboot_demo1.example.service.QbKeyService;
import com.example.springboot_demo1.example.service.impl.QbKeyServiceImpl;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

@RestController
public class QbKeyController {

    @Autowired
    QbKeyService qbKeyService;

    @GetMapping(value = "/getQBkey")
    public ResponseEntity<Object> getQBkey(String id) {
        return new ResponseEntity<>(qbKeyService.selectAllBy_idQbKeyList(id), HttpStatus.OK);
    }

    @PostMapping(value = "/addQBkey")
    public ResponseEntity<Object> addQBkey(@RequestBody QbKey qbKey) {
        int i = qbKeyService.insertAll(qbKey);
        // 使用 if-else 语句来处理返回
        if (i > 0) {
            return new ResponseEntity<>("Insert successful", HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Insert failed", HttpStatus.EXPECTATION_FAILED);
        }
    }

    @PutMapping(value = "/updateQBkey")
    public ResponseEntity<Object> updateQBkey(@RequestBody QbKey qbKey) {
        int i = qbKeyService.updateQBById(qbKey);
        // 使用 if-else 语句来处理返回
        if (i > 0) {
            return new ResponseEntity<>("Update successful", HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Update failed", HttpStatus.EXPECTATION_FAILED);
        }
    }

    @DeleteMapping(value = "/deleteQBkey")
    public ResponseEntity<Object> deleteQBkey(String id) {
        int i = qbKeyService.deleteQBkey(id);
        if (i > 0) {
            return new ResponseEntity<>("Delete successful", HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Delete failed", HttpStatus.EXPECTATION_FAILED);
        }
    }



}
