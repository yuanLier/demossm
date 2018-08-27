package com.demo.demossm.controller;

import com.demo.demossm.exception.InfoNotFullyException;
import com.demo.demossm.model.Demo;
import com.demo.demossm.service.DemoService;
import com.demo.demossm.util.Pager;
import com.demo.demossm.util.ToMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/demossm/demo")
public class DemoController {
    @Autowired
    private DemoService demoService;

    @PostMapping
    public Map insertOneDemo(@RequestBody Demo demo) {
        Map<String,Object> map;
        try {
            map = ToMap.toSuccessMap(demoService.insert(demo));
        } catch (InfoNotFullyException infoNotFullyException){
            map = ToMap.toFalseMap(infoNotFullyException.getMessage());
        } catch (RuntimeException e){
            map = ToMap.toFalseMap(e.getMessage());
        }
        return map;
    }

    @DeleteMapping
    public Map deleteOneDemo(@RequestBody Demo demo) {
        Map<String,Object> map;
        try {
            map = ToMap.toSuccessMap(demoService.deleteByPrimaryKey(demo));
        } catch (InfoNotFullyException infoNotFullyException){
            map = ToMap.toFalseMap(infoNotFullyException.getMessage());
        } catch (RuntimeException e){
            map = ToMap.toFalseMap(e.getMessage());
        }
        return map;
    }

    @PutMapping
    public Map updateOneDemo(@RequestBody Demo demo) {
        Map<String,Object> map;
        try {
            map = ToMap.toSuccessMap(demoService.updateByPrimaryKey(demo));
        } catch (InfoNotFullyException infoNotFullyException){
            map = ToMap.toFalseMap(infoNotFullyException.getMessage());
        } catch (RuntimeException e){
            map = ToMap.toFalseMap(e.getMessage());
        }
        return map;
    }

    @GetMapping
    public Map selectOneDemo(@RequestBody Demo demo) {
        Map<String,Object> map;
        try {
            map = ToMap.toSuccessMap(demoService.selectByPrimaryKey(demo));
        } catch (NullPointerException e){
            map = ToMap.toFalseMap(e.getMessage());
        }
        return map;
    }

    @GetMapping("/all/{page}")
    public Map getAllDemos(@PathVariable Integer page,
                             Pager<Demo> pager){
        pager.setCurrentPage(page);
        return ToMap.toSuccessMap(demoService.getAllDemos(pager));
    }

    @GetMapping("/byName/{page}")
    public Map findByName(@RequestParam String name,
                          @PathVariable Integer page,
                          Pager<Demo> pager){
        pager.setCurrentPage(page);
        Map<String,Object> map;
        try {
            map = ToMap.toSuccessMap(demoService.findByName(pager, name));
        } catch (InfoNotFullyException e){
            map = ToMap.toFalseMap(e.getMessage());
        }
        return map;
    }

}
