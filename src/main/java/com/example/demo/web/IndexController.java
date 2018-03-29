package com.example.demo.web;

import com.example.demo.domain.Menu;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class IndexController {

    @RequestMapping(path = "/siderBar",method = {RequestMethod.GET})
    public Map<String, Object> siderBar(HttpServletRequest request, int ID) {

        Map<String,Object> map = new HashMap<>();
        map.put("msg","success");
        return map;
    }
    @RequestMapping(path = "/siderMenuByID",method = {RequestMethod.GET})
    public List<Menu> sideMenu(HttpServletRequest request, int ID)
    {
        System.out.println(ID);
        List<Menu> listMenu = new ArrayList<>();
        Menu menu = new Menu();
        menu.setID(1);menu.setIconName("glyphicon glyphicon-inbox");menu.setMenuName("系统管理");menu.setParentID(0);menu.setMenuType(1);menu.setPageUrl("/");
        listMenu.add(menu);
        menu = new Menu();
        menu.setID(2);menu.setIconName("glyphicon glyphicon-user");menu.setMenuName("客户管理");menu.setParentID(0);menu.setMenuType(1);menu.setPageUrl("/");
        listMenu.add(menu);
        return  listMenu;
    }

}
