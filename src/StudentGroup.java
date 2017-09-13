import java.util.Date;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		// Add your implementation here
		if(students!=null)
			return students;
		
		else
			return null;
	}

	@Override
	public void setStudents(Student[] students) throws IllegalArgumentException {
		// Add your implementation here
		if(students==null)
			throw new IllegalArgumentException();
		else
			this.students=students;
	}

	@Override
	public Student getStudent(int index) throws IllegalArgumentException{
		// Add your implementation here
		if(index>=students.length||index<0)
		{
			throw new IllegalArgumentException();
		}
		else{
			return students[index];
		}
		
	}

	@Override
	public void setStudent(Student student, int index) throws IllegalArgumentException {
		// Add your implementation here
		if(index>=students.length||index<0||student==null)
		{
			throw new IllegalArgumentException();
		}
		else{
			this.students[index]=student;
		}
	}

	@Override
	public void addFirst(Student student) throws IllegalArgumentException{
		// Add your implementation here
		if(student==null)
			throw new IllegalArgumentException();
		Student s=students[0];
		students[0]=student;
		Student temp;
		for(int i=1;i<students.length;i++)
		{
			temp=students[i];
			students[i]=s;
			s=temp;
		}
	}

	@Override
	public void addLast(Student student) throws IllegalArgumentException{
		// Add your implementation here
		if(student==null)
			throw new IllegalArgumentException();
		for(int j=0;j<students.length;j++)
		{
			if(students[j]!=null){
				students[j]=student;
			break;
			}
		}
				
	}

	@Override
	public void add(Student student, int index) throws IllegalArgumentException{
		// Add your implementation here
		if(index<0||index>=this.students.length||student==null)
			throw new IllegalArgumentException();
		Student temp= students[index];
		students[index]=student;
		Student temp1;
		for(int i=index+1;i<students.length;i++)
		{
			temp1=students[i];
			students[i]=temp;
			temp=temp1;
		}
	}

	@Override
	public void remove(int index) throws IllegalArgumentException {
		// Add your implementation here
		if(index<0||index>=this.students.length||students==null)
			throw new IllegalArgumentException();
		for(int i=index;i<students.length-1;i++)
		{
			students[i]=students[i+1];
		}
	}

	@Override
	public void remove(Student student) throws IllegalArgumentException {
		// Add your implementation here
		int c=0;
		if(student==null)
			throw new IllegalArgumentException();
		for(int i=0;i<students.length;i++)
		{
			if(students[i]==student)
			{
				for(int k=1;k<students.length-1;k++)
				{
					students[k]=students[k+1];
				}
				c++;
				break;
			}
		}
		if(c==0)
			throw new IllegalArgumentException("Student do not exist");
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
		if(index<0||index>=this.students.length)
			throw new IllegalArgumentException();
		else
		{
			for(int i=index+1;i<students.length;i++)
			{
				students[i]=null;
			}
		}
	}

	@Override
	public void removeFromElement(Student student) throws IllegalArgumentException {
		// Add your implementation here
		if(student==null)
			throw new IllegalArgumentException();
		for(int i=0;i<students.length;i++)
		{
			if(students[i]==student)
			{
				for(int k=i+1;k<students.length;k++)
				{
					students[k]=null;
				}
				break;
			}
		}
	}

	@Override
	public void removeToIndex(int index) throws IllegalArgumentException {
		// Add your implementation here
		int a=0;
		if(index<0||index>=students.length)
			throw new IllegalArgumentException();
		for(int i=index+1;i<students.length;i++)
		{
			students[a++]=students[i];
		}
		for(int i=a;i<students.length;i++)
		{
			students[i]=null;
			
		}
	}

	@Override
	public void removeToElement(Student student) throws IllegalArgumentException {
		// Add your implementation here
		int a=0;
		
		for(int i=0;i<students.length;i++)
		{
			if(students[i]==student)
			{
				for(int j=i+1;j<students.length;j++)
				{
					students[a++]=students[j];
				}
				break;
			}
		}
		for(int i=a;i<students.length;i++)
		{
			students[i]=null;
		}
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
		Student temp;
		for(int i=0;i<students.length-1;i++)
		{
			for(int j=0;j<students.length-i-1;j++)
			{
				if(this.students[j].getId()>this.students[j+1].getId())
				{
					temp=this.students[j];
					this.students[j]=this.students[j+1];
					this.students[j+1]=temp;
				}
			}
		}
			
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		return null;
	}
}
