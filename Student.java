public class Student{

public Student(int currentId, String name, String email) {
		// TODO Auto-generated constructor stub
	}

public static void main (String[] args ) {
		
	}

	public class student {
		private int id;
		private String name;
		private String email;
		
		
		public student(int id, String name, String email){
			this.id = id;
			this.name = name;
			this.email = email;
			
		}
		
		public int getId() {
			return id;
		}
		
		public void setId(int id) {
			this.id = id;
		}
		
		public String getName() {
			return name;
		}
		
		public void setName(String name) {
			this.name = name;
		}
		
		public String getEmail() {
			return email;
		}
		
		public void setEmail(String email) {
			this.email = email;
			
		}
		
		@Override
		public String toString() {
			return "Student{" +
					"id=" + id +
					", name= ' " + name + '\'' +
					", email=' " + email + '\'' +
					'}';
			
					
		}
		
	


	}

	public int getId() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void setEmail(String email) {
		// TODO Auto-generated method stub
		
	}

	public void setName(String name) {
		// TODO Auto-generated method stub
		
	}
}
