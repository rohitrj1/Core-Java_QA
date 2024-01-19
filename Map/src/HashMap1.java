import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HashMap1 {
	
	
	static void hmMethod() {
		//synatx
		Map<String , Integer> mp = new HashMap<>();
		mp.put("Akash", 20);
		mp.put("Mohan", 23);
		mp.put("Radha", 30);
		mp.put("Mahesh", 45);
		
		// print value
		System.out.println(mp.get("Mahesh"));
		// update value
		mp.put("Mahesh", 75);
		System.out.println(mp.get("Mahesh"));
		
		// remove entry
		mp.remove("Mahesh");
		System.out.println(mp.get("Mahesh"));
		
		mp.remove("Kalli");
		System.out.println(mp.get("Kalli"));
		// check value contains or not 
		System.out.println(mp.containsKey("Mahesh"));
		System.out.println(mp.containsKey("Mohan"));
		
		if(!mp.containsKey("Shyam")) mp.put("Shyam", 99);
		System.out.println(mp.get("Shyam"));
		
		mp.putIfAbsent("Akash", 65);
		mp.putIfAbsent("Yahika", 55);
		
		System.out.println(mp.keySet());
		System.out.println(mp.values());
		
		System.out.println(mp.entrySet());
		
		for(String key : mp.keySet()) {
			System.out.println(key +" "+mp.get(key));
		}
		System.out.println("================================================");
		
		for(Map.Entry e : mp.entrySet()) {
			System.out.println(e.getKey() +" " + e.getValue());
		}
			
		System.out.println("================================================");
		
		for(var e : mp.entrySet()) {
			System.out.println(e.getKey() +" " + e.getValue());
		}
				
		ArrayList<Integer> al = new ArrayList<>();
		al.add(1);
		al.add(9);
		al.add(5);
		al.add(3);
		
		for(var e : al) {
			System.out.println(e +" values of arraylist");
		}
		
	}
	
	static void  frequency(int arr[]) {
		
		Map<Integer,Integer> map = new HashMap<>();
		
		for(int a :arr) {
			if(map.containsKey(a)) {
				map.put(a, map.get(a) + 1);
			}else {
				map.put(a, 1);
			}
		}
		
		System.out.println(map);
		
	}
	
	static void freqArr(int arr[]) {
		
		int n = arr.length;
		
		boolean b[] = new boolean[n];
		int count =0;
		for(int i = 0 ; i < n; i++) {
			if(b[i]==true) {
			count = 1;
			for(int j = i+1;j<n;j++) {
				if(arr[i] == arr[j]) {
					count++;
					b[i] = true;
				}
				}
			}
			System.out.println(arr[i] +" -- " + count);
		}
	}

	public static void main(String[] args) {
		
		hmMethod();
		int a[] = {1,2,3,1,5,3,7,6,5,9,2};
		frequency(a);
		
		freqArr(a);

	}

}
