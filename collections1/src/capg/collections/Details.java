package capg.collections;


import java.util.TreeMap;

public class Details {

	public static void main(String[] args) {
	
		 TreeMap<Long,Contact> treemap = new TreeMap<>();
		 
		 Contact cd = new Contact(92123456785L, "suraj", "suraj@gmail.com");
		 Contact cd1 = new Contact(887675678L, "raja", "raja@gmail.com");
		 Contact cd2 = new Contact(7654289872L, "Sanjay", "sanjay@gmail.com");
		 Contact cd3 = new Contact(7802345683L, "sumit", "aumit@gmail.com");
		 
		 treemap.put(1L, cd);
		 treemap.put(2L, cd1);
		 treemap.put(3L, cd2);
		 treemap.put(4L, cd3);
		
		 for(long L:treemap.keySet()) {
			 System.out.println(L+" ");
		 }
		 
		 System.out.println("-----------------------------");
		 System.out.println(treemap.get(1L));
		 System.out.println(treemap.get(2L));
		 System.out.println(treemap.get(3L));
		 System.out.println(treemap.get(4L));
		 
		 System.out.println("-----------------------------");
		 System.out.println(treemap);
	}

}

