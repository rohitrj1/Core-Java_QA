package CollectionPractice;

import java.util.ArrayList;

public class CustomArrayList extends ArrayList{
	
		@Override
		public boolean add(Object e) {
			if(this.contains(e))
				return true;
			
			return super.add(e);
		}
		
		public static void main(String[] args) {
			
			CustomArrayList arrayList = new CustomArrayList();
			arrayList.add(1);
			arrayList.add(1);
			arrayList.add(2);
			System.out.println(arrayList);
		}

}
