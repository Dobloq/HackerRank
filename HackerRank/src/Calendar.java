import java.io.*;
import java.lang.reflect.Method;
import java.util.*;
import java.text.*;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.math.*;
import java.util.*;

public class Calendar {
	
	class Student{
	    private String name;
	    private String id;
	    private String email;

	    public String getName() {
	        return name;
	    }
	    public void setId(String id) {
	        this.id = id;
	    }
	    public void setEmail(String email) {
	        this.email = email;
	    }
	    public void anothermethod(String ad){
	    	
	    }
	}
    public static void main(String[] args) {
        Class st = Student.class;
        Method[] methods = st.getDeclaredMethods();
        ArrayList<String> methodList = new ArrayList<>();
        for(Method s: methods){
            methodList.add(String.valueOf(s));
        }
        Collections.sort(methodList);
        for(String name: methodList){
            System.out.println(name);
        }
    }
}
