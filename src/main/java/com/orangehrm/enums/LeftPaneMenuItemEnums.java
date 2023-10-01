package com.orangehrm.enums;

public enum LeftPaneMenuItemEnums {

    ADMIN("Admin"),
    PIM("PIM"),
    LEAVE("Leave");

    private final String menuName;

    public String getMenuName() {
        return menuName;
    }

    LeftPaneMenuItemEnums(String menuName) {
        this.menuName = menuName;
    }
}
