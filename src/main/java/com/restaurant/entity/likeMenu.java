package com.restaurant.entity;

import java.util.Date;

public class likeMenu extends likeMenuKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column likemenu.Time
     *
     * @mbg.generated Mon Mar 04 13:58:28 CST 2019
     */
    private Date time;

    private Menu menu;

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column likemenu.Time
     *
     * @return the value of likemenu.Time
     *
     * @mbg.generated Mon Mar 04 13:58:28 CST 2019
     */
    public Date getTime() {
        return time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column likemenu.Time
     *
     * @param time the value for likemenu.Time
     *
     * @mbg.generated Mon Mar 04 13:58:28 CST 2019
     */
    public void setTime(Date time) {
        this.time = time;
    }
}