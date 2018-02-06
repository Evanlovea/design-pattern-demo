package iterator_pattern;

import java.util.Comparator;
//±È½ÏÆ÷Àà
public class MyComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Student s1=(Student)o1;
		Student s2=(Student)o2;
		if(s1.getStudnetAge()<s2.getStudnetAge()) {
			return 1;
		}else {
			return 0;
		}
	
	}

}
