import java.util.*;

public class Main {
	static class People implements Comparable<People> {
		public int age, idx;
		public String name;
		
		People(int age, String name, int idx) {
			this.age = age;
			this.name = name;
			this.idx = idx;
		}
		
		@Override
		public int compareTo(People o) {
			if(this.age == o.age) return this.idx - o.idx;
			return this.age - o.age;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		List<People> list = new ArrayList<>();
		
		for(int i=0; i<n; i++) {
			int age = sc.nextInt();
			String name = sc.next();
			list.add(new People(age, name, i));
		}
		
		Collections.sort(list);
		
		for(int i=0; i<n; i++) {
			System.out.println(list.get(i).age+" "+list.get(i).name);
		}
		sc.close();
	}
}

