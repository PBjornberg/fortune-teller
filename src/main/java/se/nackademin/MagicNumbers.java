package se.nackademin;

import org.apache.commons.lang3.StringUtils;

public class MagicNumbers {

    private String name;
    private int income;
    private String location;
    private int age;
    private int height;

    /**
     * @return integer value between 0 and 9 
     */    
    public int calculateA() {
        
        int a = 0;
        a = StringUtils.countMatches(name, " ") + 1;
        a += age;
        for(;a>9;a-=7);
        return a;
    }
    
    /**
     * @return integer value between 0 and 9 
     */
    public int calculateB() {

        int b = 0;
        b = location.length();
        b += income;
        for(;b>9;b-=7);
        return b;
    }
    
    /**
     * @return integer value between 0 and 9 
     */
    public int calculateC() {

        int c = 0;
        c = calculateA() + calculateB() - height;
        for(;c<0;c+=10);
        return c;
    }

    
    /**
    * @return integer value between 0 and 9 
    */
    public int calculateD() {

        int d = 0;
        int a = calculateA();
        d = (a > 5) ? a + calculateB() :  a + calculateC();
        d -= income;
        for(;d<0;d+=10);
        return d;
    }

    /**
     * @return integer value between 0 and 9 
     */
    public int calculateE() {
        long e = 0;
        e = (long)age * (long)income * (long)income * (long)height;
        double eFloat = Math.sqrt(e);
        System.out.println(eFloat);

        for(;eFloat>9;eFloat/=2);
        
        e = Math.round(eFloat);
        return (int)e;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIncome(int income) {
        this.income = income;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
