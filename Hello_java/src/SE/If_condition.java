package SE;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class If_condition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = {1,2,4,5,6};

		for(int i = 0; i<num.length; i++)
		{
			if(num[i] %2 ==0)
			{
			System.out.println(num[i]);
			//break;
			}
			else
			{
				System.out.println(num[i] + " not mutliple of 2");
			}
		}
		ArrayList<String> a= new ArrayList<String>();
		a.add("Rana");
		a.add("prathap");
		a.add("Selenium");
		a.add("mad");
		a.remove(3);
		System.out.println(a.get(1));
		
		//element present or not
		
		System.out.println(a.contains("Rana"));
		String[] name = {"rana", "prathap", "mandala"};
		List<String>nameArrayList= Arrays.asList(name);
		nameArrayList.contains("xxx");
		
		
	}

}
