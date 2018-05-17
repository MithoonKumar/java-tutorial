package com.company;
import java.util.HashMap;

class custom {
    public int num;
    public String str;
    public custom(int num, String str){
        this.num = num;
        this.str = str;
    }


    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        custom c = (custom) obj;
        if (c.num == this.num && this.str.equals(c.str)) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return 1;
    }
}

public class Main {

    public static void main(String args[]) {
        HashMap<String, custom> map = new HashMap<>();
        custom c1 = new custom(1,"mithoon");
        custom c2 = new custom(2,"mithoon");
        map.put("first", c1);
        map.put("first", c2);
        System.out.println(c1.equals(c2));
        System.out.println("checked");
    }
}


