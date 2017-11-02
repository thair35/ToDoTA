import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ToDoList  {
	
	List<ToDo> TodoList=new ArrayList<ToDo>();
	Scanner sc= new Scanner(System.in);
	private static int nTask=0;
	
	
	public void addItem() 
	{
		System.out.println("Enter Your Task Name");
		String task= sc.nextLine();
		
		System.out.println("Enter Your Task Time");
		String date= sc.next();
		LocalDate localDate = LocalDate.parse(date);

		ToDo t=new ToDo(task,localDate);
		TodoList.add(t);
		System.out.println("Item Added");		
	
		nTask++;
		
	}
	public void deletetItem(ToDo t) 
	{
		System.out.println("Enter item number you want to delete");
		int x=sc.nextInt();
		nTask=x;
		TodoList.remove(nTask);
		System.out.println("Item deleated");		
	}
	public void editItem(ToDo t) 
	{
		
		System.out.println("Enter the new title:");
		String task= sc.nextLine();
		
		System.out.println("Enter the new date of the task:");
		String date= sc.next();
		LocalDate localDate = LocalDate.parse(date);
		t.setTask(task);
		t.setDate(localDate);
		
	}
	public void deadLineDate() 
	{
		
		
		
	}
	
	
	




}
