package com.example.demo.content;

import java.util.List;
import java.util.ArrayList;

import org.springframework.stereotype.Service;

@Service
public class ContentService {

    public List<Category> getAllContent() {
        ArrayList<Course> courseArrayList1 = new ArrayList<>();
        courseArrayList1.add(new Course(2001,"AWS Essential",180,100,1001));
		courseArrayList1.add(new Course(2002,"Sales Essential",180,100,1001));
		courseArrayList1.add(new Course(2003,"Pre Essential",180,100,1001));

        ArrayList<Course> courseArrayList2 = new ArrayList<>();
        courseArrayList2.add(new Course(2004,"AWS Essential",180,100,1002));
        courseArrayList2.add(new Course(2005,"Sales Essential",180,100,1002));
        courseArrayList2.add(new Course(2006,"Pre Essential",180,100,1002));

        ArrayList<Course> courseArrayList3 = new ArrayList<>();
        courseArrayList3.add(new Course(2007,"AWS Essential",180,100,1003));
        courseArrayList3.add(new Course(2008,"Sales Essential",180,100,1003));
        courseArrayList3.add(new Course(2009,"Pre Essential",180,100,1003));

        ArrayList<Category> categoryArrayList = new ArrayList<>();
        categoryArrayList.add(new Category(1001, "Cloud Computing", "Network of remote servers hosted on the internet to store", courseArrayList1));
        categoryArrayList.add(new Category(1002, "Network Computing", "Network of remote servers hosted on the internet to store", courseArrayList2));
        categoryArrayList.add(new Category(1003, "Sales Computing", "Network of remote servers hosted on the internet to store", courseArrayList3));

        return categoryArrayList;

    }

}
