package com.example.sklep;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Api {

    List<ItemDao> list = List.of(
            new ItemDao("tani kod", "0.99", 3L),
            new ItemDao("koszulka ncdc", "9.99", 18L),
            new ItemDao("praktyki ncdc", "0", 18L),
            new ItemDao("wspomnienia z hot", "99.99", 6L),
            new ItemDao("obiad ncdc", "29.99", 30L)
    );

    @GetMapping("/item")
    ResponseEntity<ItemDao> get(@RequestParam String name) {
        try {
            return ResponseEntity.ok().body(list.stream().filter(item -> name.equals(item.getName())).toList().get(0));
        } catch (Exception e) {
            return ResponseEntity.ok().build();
        }
    }
}
