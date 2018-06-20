package com.codecool.uml.overloading;

import java.util.Date;

public class FeaturedProductCategory extends ProductCategory {

    Date startDate;
    Date endDate;

    public void schedule(Date startDate, Date endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
    }


    @Override
    public String toString() {
        return "FeaturedProductCategory:" + super.toString() + ",startDate:" + startDate
            + ",endDate:" + endDate;
    }
}
