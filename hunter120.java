import java.util.Scanner;

public class hunter120 {

	public static void main(String[] args) {
		System.out.println("ENTER THE STRING ");
		Scanner in=new Scanner(System.in);
		String s=in.nextLine();
		int flag=0;
		for(int i=0;i<s.length();i++)
		{
			for(int j=i;j<s.length();j++)
			{
				String sa=s.substring(i, j+1);
				StringBuffer sb=new StringBuffer(sa);
				String sx=new String(sb.reverse());
				if(sa.equalsIgnoreCase(sx))
				{
					if(sx.length()==2&&flag==0)
					{
						System.out.println(sx);
						++flag;
					}
					else 
					{
						if(sx.length()==3&&flag==0)
						{
							System.out.println(sx);
							++flag;
						}
					}
					
				}
			}
		}

	}

}
