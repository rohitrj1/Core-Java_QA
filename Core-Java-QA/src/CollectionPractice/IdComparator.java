package CollectionPractice;

import java.util.Comparator;

public class IdComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		if(o1.getId() == o2.getId())
			return o1.getName().compareTo(o2.getName());
		else if(o1.getId() > o2.getId())
			return 1;
		return -1;
	}

}
