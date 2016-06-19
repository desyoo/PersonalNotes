package com.example.desy.personalnotes;

/**
 * Created by desy on 6/7/16.
 */
public class NavigationDrawerItem {
    private int iconId;
    private String title;

    public NavigationDrawerItem(int iconId, String title) {
        this.iconId = iconId;
        this.title = title;
    }

    public int getIconId() {
        return iconId;
    }

    public String getTitle() {
        return title;
    }
}
