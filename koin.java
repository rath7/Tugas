import java.util.*;

public class koin
{
	public static void main (String argc [])
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Program");
		System.out.println("masukkan 1 atau 0 : ");
		int tebakanuser = sc.nextInt();
		System.out.println("anda menebak : ");
		if (tebakanuser == 1)
		{
			System.out.println("Gambar");
		}
		else
		{
			System.out.println("koin");
		}
		
		
		int pcout = (int) (Math.random()+0.5);
		System.out.println("komputer memperlihatkan : ");
		
		if (pcout==1)
			{System.out.println("gambar ");}
		else
			{System.out.println("koin ");}
		
		if (tebakanuser==pcout)
			{System.out.println("selamat anda menang");}
		else
			{System.out.println("kalah");}
		
	}
}
