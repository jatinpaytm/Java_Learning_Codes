package com.semanticsquare.ass1;

import java.util.Comparator;

public class PubDateDescComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        // TODO Auto-generated method stub
        if (((Book)o1).getYear()== ((Book)o2).getYear())
        {
            return ((Book)o1).getTitle().compareTo(((Book)o2).getTitle());
        }
        else if (((Book)o1).getYear() < ((Book)o2).getYear())
            return 1;
        else
            return -1;

    }
}
