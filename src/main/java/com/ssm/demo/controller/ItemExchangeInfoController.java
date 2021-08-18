package com.ssm.demo.controller;

import com.ssm.demo.entity.Itemexchangeinfo;
import com.ssm.demo.entity.ItemexchangeinfoExample;
import com.ssm.demo.mapper.ItemexchangeinfoMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

//import javax.validation.Valid;
import java.util.List;

@RestController
public class ItemExchangeInfoController {
    private final ItemexchangeinfoMapper infoMapper;


    public ItemExchangeInfoController(ItemexchangeinfoMapper infoMapper) {
        this.infoMapper = infoMapper;
    }

    @GetMapping("/")
    public List<Itemexchangeinfo> getAll(){
        return infoMapper.findAll();
    }

    @GetMapping("/{id}")
    public Itemexchangeinfo get(@PathVariable int id) {
        ItemexchangeinfoExample example = new ItemexchangeinfoExample();
        ItemexchangeinfoExample.Criteria criteria = example.createCriteria();
        criteria.andIdEqualTo(id);

        return infoMapper.selectByExample(example).get(0);
    }

//    @PostMapping("/")
//    public ResponseEntity save(@Valid @RequestBody EmployeeRequest request) {
//        infoMapper.insert(new Employee(request.getEmail(), request.getLastName(), request.getEmail()));
//        return ResponseEntity.status(HttpStatus.CREATED).build();
//    }


}
