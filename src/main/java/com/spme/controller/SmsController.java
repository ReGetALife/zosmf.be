package com.spme.controller;


import com.spme.domain.*;
import com.spme.service.SmsService;
import com.spme.utils.AuthUtil;
import org.springframework.http.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

/**
 * @author Qingguo Li
 */
@Controller
public class SmsController {

    @Resource
    private SmsService ss;

    /**
     * Display base configuration of a SCDS
     */
    @CrossOrigin(origins = "*", allowCredentials = "true")
    @RequestMapping(value = "/sms/base-configuration/{scds}", method = RequestMethod.GET)
    public ResponseEntity<String> getBaseConfig(@PathVariable String scds, HttpSession session) {
        if (AuthUtil.notLogin(session)) {
            return ResponseEntity.status(401).body(null);
        }
        String res = ss.getBaseConfig(session, scds);
        if (res == null || res.equals("")) {
            res = "Can not get base configuration of " + scds +
                    ".\n Or time out.";
        }
        return ResponseEntity.ok(res);
    }

    /**
     * Create base configuration of a SCDS
     */
    @CrossOrigin(origins = "*", allowCredentials = "true")
    @RequestMapping(value = "/sms/base-configuration", method = RequestMethod.POST)
    public ResponseEntity<String> createBaseConfig(@RequestBody BaseConfiguration config, HttpSession session) {
        if (AuthUtil.notLogin(session)) {
            return ResponseEntity.status(401).body(null);
        }
        String res = ss.createBaseConfig(session, config);
        if (res == null || res.equals("")) {
            res = "Can not create base configuration of " + config.getScds() +
                    ".\n Or time out.";
        }
        return ResponseEntity.ok(res);
    }

    /**
     * Alter base configuration of a SCDS
     */
    @CrossOrigin(origins = "*", allowCredentials = "true")
    @RequestMapping(value = "/sms/base-configuration", method = RequestMethod.PUT)
    public ResponseEntity<String> alterBaseConfig(@RequestBody BaseConfiguration config, HttpSession session) {
        if (AuthUtil.notLogin(session)) {
            return ResponseEntity.status(401).body(null);
        }
        String res = ss.alterBaseConfig(session, config);
        if (res == null || res.equals("")) {
            res = "Can not alter base configuration of " + config.getScds() +
                    ".\n Or time out.";
        }
        return ResponseEntity.ok(res);
    }

    /**
     * Create data class of a SCDS
     */
    @CrossOrigin(origins = "*", allowCredentials = "true")
    @RequestMapping(value = "/sms/data-class", method = RequestMethod.POST)
    public ResponseEntity<String> createDataClass(@RequestBody DataClass dataClass, HttpSession session) {
        if (AuthUtil.notLogin(session)) {
            return ResponseEntity.status(401).body(null);
        }
        String res = ss.createDataClass(session, dataClass);
        if (res == null || res.equals("")) {
            res = "Can not create data class of " + dataClass.getScds() +
                    ".\n Or time out.";
        }
        return ResponseEntity.ok(res);
    }

    /**
     * Create storage class
     */
    @CrossOrigin(origins = "*", allowCredentials = "true")
    @RequestMapping(value = "/sms/storage-class", method = RequestMethod.POST)
    public ResponseEntity<String> createStorageClass(@RequestBody StorageClass storageClass, HttpSession session) {
        if (AuthUtil.notLogin(session)) {
            return ResponseEntity.status(401).body(null);
        }
        String res = ss.createStorageClass(session, storageClass);
        if (res == null || res.equals("")) {
            res = "Can not create storage class of " + storageClass.getScds() +
                    ".\n Or time out.";
        }
        return ResponseEntity.ok(res);
    }

    /**
     * Create management class
     */
    @CrossOrigin(origins = "*", allowCredentials = "true")
    @RequestMapping(value = "/sms/management-class", method = RequestMethod.POST)
    public ResponseEntity<String> createManagementClass(@RequestBody ManagementClass managementClass, HttpSession session) {
        if (AuthUtil.notLogin(session)) {
            return ResponseEntity.status(401).body(null);
        }
        String res = ss.createManagementClass(session, managementClass);
        if (res == null || res.equals("")) {
            res = "Can not create management class of " + managementClass.getScds() +
                    ".\n Or time out.";
        }
        return ResponseEntity.ok(res);
    }

    /**
     * Create storage group of pool type
     */
    @CrossOrigin(origins = "*", allowCredentials = "true")
    @RequestMapping(value = "/sms/storage-group/pool", method = RequestMethod.POST)
    public ResponseEntity<String> createPoolStorageGroup(@RequestBody PoolStorageGroup poolStorageGroup, HttpSession session) {
        if (AuthUtil.notLogin(session)) {
            return ResponseEntity.status(401).body(null);
        }
        String res = ss.createPoolStorageGroup(session, poolStorageGroup);
        if (res == null || res.equals("")) {
            res = "Can not create pool storage group of " + poolStorageGroup.getScds() +
                    ".\n Or time out.";
        }
        return ResponseEntity.ok(res);
    }
}


