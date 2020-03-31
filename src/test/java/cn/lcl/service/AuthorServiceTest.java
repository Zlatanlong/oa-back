package cn.lcl.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class AuthorServiceTest {
    @Autowired
    AuthorService authorService;


    @Test
    void findManagedUser() {
    }

    @Test
    void addPermissionWithRole() {
        List<Map<String,String>> list = new ArrayList<>();
        Map<String,String> map = new HashMap<>();
        map.put("api", "/department");
        map.put("name", "添加部门");
        list.add(map);
        for (Map<String, String> tempMap : list) {
            authorService.addPermissionWithRole(tempMap.get("api"), tempMap.get("name"));
        }

        System.out.println();
    }
}