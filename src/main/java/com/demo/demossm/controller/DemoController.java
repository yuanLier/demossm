package com.demo.demossm.controller;

import com.demo.demossm.exception.InfoNotFullyException;
import com.demo.demossm.model.Demo;
import com.demo.demossm.service.DemoService;
import com.demo.demossm.util.Pager;
import com.demo.demossm.util.ToMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
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

//    @DeleteMapping
//    public Map deleteOneDemo(@RequestBody Demo demo) {
//        Map<String,Object> map;
//        try {
//            map = ToMap.toSuccessMap(demoService.deleteByPrimaryKey(demo));
//        } catch (InfoNotFullyException infoNotFullyException){
//            map = ToMap.toFalseMap(infoNotFullyException.getMessage());
//        } catch (RuntimeException e){
//            map = ToMap.toFalseMap(e.getMessage());
//        }
//        return map;
//    }

    //批量删除可以直接覆盖主键删除的 看需要哪一种了
    @DeleteMapping
    public Map deleteByIds(@RequestBody List<String> idList) {
        Map<String,Object> map;
        try {
            map = ToMap.toSuccessMap(demoService.deleteByIds(idList));
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

    @GetMapping("/all")
    public Map getAllDemos(@RequestParam Integer page,
                           @RequestParam Integer size,
                             Pager<Demo> pager){
        pager.setCurrentPage(page);
        pager.setPageSize(size);
        return ToMap.toSuccessMap(demoService.getAllDemos(pager));
    }

    @PostMapping("/filter")
    public Map workFilter(@RequestBody Demo demo,
                          @RequestParam Integer page,
                          @RequestParam Integer size,
                          Pager<Demo> pager){
        pager.setPageSize(size);
        pager.setCurrentPage(page);
        Map<String,Object> map;
        try {
            map = ToMap.toSuccessMap(demoService.demoFilter(pager, demo));
        } catch (InfoNotFullyException infoNotFullyException){
            map = ToMap.toFalseMap(infoNotFullyException.getMessage());
        }
        return map;
    }

}
