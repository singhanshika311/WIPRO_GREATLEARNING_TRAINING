package wiproprojects;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class employeservice {
	List<employee> ob =new ArrayList<employee>();
	int flag=0;
	
	public void addEmployee(employee emp)
	{
		if(ob.size()==0){
			ob.add(emp);
			System.out.println("record added");
		}
		
	    else {
	    	ListIterator<employee> li = ob.listIterator();
	    	while(li.hasNext()) {
	    		employee e = li.next();
	    		if(e.getId()==emp.getId()) {
	    			flag++;
	    		}
				
			}
		}
		if(flag==0) {
			ob.add(emp);
			System.out.println("record added");
		}else {
			System.out.println("id must be unique");
			
		}
	}
	
}	
	


