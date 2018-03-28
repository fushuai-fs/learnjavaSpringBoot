package com.example.demo.domain;


import javax.persistence.Entity;
import java.io.Serializable;

//public class Menu implements Serializable {
//    private static final long serialVersionUID = 1L;
//

public class Menu {
    private int ID;
    private String iconName;
    private String menuName;

    private int ParentID;
    private int MenuType;
    private String PageUrl;


    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getIconName() {
        return iconName;
    }

    public void setIconName(String iconName) {
        this.iconName = iconName;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }


    public int getParentID() {
        return ParentID;
    }

    public void setParentID(int parentID) {
        ParentID = parentID;
    }

    public int getMenuType() {
        return MenuType;
    }

    public void setMenuType(int menuType) {
        MenuType = menuType;
    }

    public String getPageUrl() {
        return PageUrl;
    }

    public void setPageUrl(String pageUrl) {
        PageUrl = pageUrl;
    }
}
