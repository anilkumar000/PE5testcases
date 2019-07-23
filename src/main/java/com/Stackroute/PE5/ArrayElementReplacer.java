package com.Stackroute.PE5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayElementReplacer {
    public Object[] replacingElement(String[] inputString, String[] toReplace, String[] toBeReplaced){
        List<String> list=new ArrayList<>();
        for (String s:inputString) {
            list.add(s);
        }
        for (int i=0;i<toBeReplaced.length;i++)
            Collections.replaceAll(list,toBeReplaced[i],toReplace[i]);
        Object[] object=list.toArray();


        return object;

    }
}
