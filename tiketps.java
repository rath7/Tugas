import java.io.*;
public class tiketps
{
	public static void main (String [] args) throws Exception
	{
		BufferedReader k = new BufferedReader (new InputStreamReader(System.in));
		String tiket [] = new String [1];
		double hrg [] = new double [1];
		double total [] = new double [1];
		int pil = 0;
		int kursi [][]= new int[13][6];
		String huruf [][]= new String[13][6];
		int jmlkursi []= new int [1];
		jmlkursi[0]=0;
		
			
			for (int i=0;i<13;i++)
					{
						for (int j=0;j<6;j++)
						{
							kursi[i][j]=0;
							if(j==0){
								huruf[i][j]=(i+1)+"A";
							}
							else if(j==1){
								huruf[i][j]=(i+1)+"B";
							}
							else if(j==2){
								huruf[i][j]=(i+1)+"C";
							}
							else if(j==3){
								huruf[i][j]=(i+1)+"D";
							}
							else if(j==4){
		}
						}	
 	}
		
do
{
System.out.println("=======================================================");
System.out.println("	\"PROGRAM PENJUALAN TIKET PESAWAT TERBANG\" ");
System.out.println("=======================================================");
System.out.println("1. PENJUALAN TIKET ");
System.out.println("2. VIEW DAFTAR KURSI YANG KOSONG "); 
System.out.println("3. VIEW DAFTAR KURSI YANG TERISI ");
System.out.println("4. VIEW SEMUA DAFTAR KURSI ");
System.out.println("5. VIEW REKAP KURSI ");
System.out.println("6. VIEW OMSET ");
System.out.println("7. SELESAI");
System.out.print("Masukan no pilihan anda (1-7) : ");
pil=Integer.parseInt(k.readLine());
switch (pil)
{
case 1:
								
				System.out.println("====================================");
					for (int i=0;i<1;i++)
switch (pil)
{
case 1:
System.out.println("====================================");
System.out.println("	\"1. PENJUALAN TIKET\" ");
System.out.println("====================================");
for (int p=0; p<1; p++)
{
System.out.println(i+1+".");
System.out.print("Masukan Nomor Kursi : ");
tiket[i]=k.readLine();
if ( tiket[i].equalsIgnoreCase("1A") || tiket[i].equalsIgnoreCase("1B") || tiket[i].equalsIgnoreCase("1C")|| 
tiket[i].equalsIgnoreCase("1D")|| tiket[i].equalsIgnoreCase("1E")|| tiket[i].equalsIgnoreCase("1F")||
tiket[i].equalsIgnoreCase("2A")|| tiket[i].equalsIgnoreCase("2B") || tiket[i].equalsIgnoreCase("2C")||
tiket[i].equalsIgnoreCase("2D")|| tiket[i].equalsIgnoreCase("2E")|| tiket[i].equalsIgnoreCase("2F")){
hrg[i]=((double)(0.75*100000))+100000;
					
					}

}
if (tiket[i].equalsIgnoreCase("3A") || tiket[i].equalsIgnoreCase("3B") || tiket[i].equalsIgnoreCase("3C")||
tiket[i].equalsIgnoreCase("3D")|| tiket[i].equalsIgnoreCase("3E")|| tiket[i].equalsIgnoreCase("3F")|| tiket[i].equalsIgnoreCase("4A")|| 
tiket[i].equalsIgnoreCase("4B") || tiket[i].equalsIgnoreCase("4C")|| tiket[i].equalsIgnoreCase("4D")|| tiket[i].equalsIgnoreCase("4E")||
tiket[i].equalsIgnoreCase("4F")|| tiket[i].equalsIgnoreCase("5A")|| tiket[i].equalsIgnoreCase("5B")|| tiket[i].equalsIgnoreCase("5C")|| 
tiket[i].equalsIgnoreCase("5D")|| tiket[i].equalsIgnoreCase("5E")||tiket[i].equalsIgnoreCase( "5F")) {
hrg[i]=((double)(0.5*100000))+100000;
					
}
else if ( tiket[i].equalsIgnoreCase("6A") || tiket[i].equalsIgnoreCase("6B") ||
tiket[i].equalsIgnoreCase("6C")|| tiket[i].equalsIgnoreCase("6D")|| tiket[i].equalsIgnoreCase("6E")|| 
tiket[i].equalsIgnoreCase("6F")|| tiket[i].equalsIgnoreCase("7A")|| tiket[i].equalsIgnoreCase("7B") || 
tiket[i].equalsIgnoreCase("7F")|| tiket[i].equalsIgnoreCase("8A")|| tiket[i].equalsIgnoreCase("8B") ||
tiket[i].equalsIgnoreCase("8C")|| tiket[i].equalsIgnoreCase("8D")|| tiket[i].equalsIgnoreCase("8E")||
tiket[i].equalsIgnoreCase("8F")|| tiket[i].equalsIgnoreCase("9A")|| tiket[i].equalsIgnoreCase("9B" )||
tiket[i].equalsIgnoreCase("9C")|| tiket[i].equalsIgnoreCase("9D")|| tiket[i].equalsIgnoreCase("9E")|| tiket[i].equalsIgnoreCase("9F")) {
hrg[i]=((double)(0.5*100000))+100000;
}
else if ( tiket[i].equalsIgnoreCase("10A") || tiket[i].equalsIgnoreCase("10B") || tiket[i].equalsIgnoreCase("10C")|| 
tiket[i].equalsIgnoreCase("10D")|| tiket[i].equalsIgnoreCase("10E")|| tiket[i].equalsIgnoreCase("10F")||
tiket[i].equalsIgnoreCase("11A")|| tiket[i].equalsIgnoreCase("11B") || tiket[i].equalsIgnoreCase("11C")||
tiket[i].equalsIgnoreCase("11D")|| tiket[i].equalsIgnoreCase("11E")|| tiket[i].equalsIgnoreCase("11F")|| 
tiket[i].equalsIgnoreCase("12A")|| tiket[i].equalsIgnoreCase("12B") || tiket[i].equalsIgnoreCase("12C")||
tiket[i].equalsIgnoreCase("12D")|| tiket[i].equalsIgnoreCase("12E")|| tiket[i].equalsIgnoreCase("12F")|| 
tiket[i].equalsIgnoreCase("13A")|| tiket[i].equalsIgnoreCase("13B") || tiket[i].equalsIgnoreCase("13C")||
tiket[i].equalsIgnoreCase("13D")|| tiket[i].equalsIgnoreCase("13E")|| tiket[i].equalsIgnoreCase("13F")) {
hrg[i]=100000;




}
jmlkursi[0]=jmlkursi[0]+1;
total[i]=total[i]+hrg[i];
System.out.println("Harga Kursi" +" "+tiket[i]+"(Rp): " + hrg[i]);

break;
case 2:
System.out.println("==============================================");
System.out.println("\"2. VIEW DAFTAR KURSI YANG KOSONG\" ");
System.out.println("==============================================");

for (int y=0;y<13;y++)
{
for (int z=0;z<6;z++)
{
if(huruf[y][z].equalsIgnoreCase(tiket[0]))
{
kursi[y][z]=1;
}

if(kursi[y][z]==1)
{
huruf[y][z]="-";
}
if(huruf[y][z].equalsIgnoreCase((y+1)+"A")){
if(z==0){
System.out.print((y+1)+"A ");
}
else if(z==1){
System.out.print((y+1)+"B ");
}
else if(z==2){
System.out.print((y+1)+"C ");
}
else if(z==3){
System.out.print((y+1)+"D ");
}
else if(z==4){
System.out.print((y+1)+"E ");
}
else if(z==5){
System.out.print((y+1)+"F ");
}							}
else if(huruf[y][z].equalsIgnoreCase((y+1)+"B")){
if(z==0){
System.out.print((y+1)+"A ");
}else if(z==1){
System.out.print((y+1)+"B ");
}
else if(z==2){
System.out.print((y+1)+"C ");
}
else if(z==3){
System.out.print((y+1)+"D ");
}
else if(z==4){
System.out.print((y+1)+"E ");
}
else if(z==5){
System.out.print((y+1)+"F ");
}
	}						
								

else if(huruf[y][z].equalsIgnoreCase((y+1)+"C")){
if(z==0){
System.out.print((y+1)+"A ");
}
else if(z==1){
System.out.print((y+1)+"B ");
}
else if(z==2){
System.out.print((y+1)+"C ");
}
else if(z==3){
System.out.print((y+1)+"D ");
}
else if(z==4){
System.out.print((y+1)+"E ");
}
else if(z==5){
System.out.print((y+1)+"F ");
}
}

else if(huruf[y][z].equalsIgnoreCase((y+1)+"D")){
if(z==0){
System.out.print((y+1)+"A ");
}
else if(z==1){
System.out.print((y+1)+"B ");
}
else if(z==2){
System.out.print((y+1)+"C ");
}
else if(z==3){
System.out.print((y+1)+"D ");
}
else if(z==4){
System.out.print((y+1)+"E ");
}
else if(z==5){
System.out.print((y+1)+"F ");
}
}
else if(huruf[y][z].equalsIgnoreCase((y+1)+"E")){
if(z==0){
System.out.print((y+1)+"A ");
}
else if(z==1){
System.out.print((y+1)+"B ");
}
else if(z==2){
System.out.print((y+1)+"C ");
}
else if(z==3){
System.out.print((y+1)+"D ");
}
else if(z==4){
System.out.print((y+1)+"E ");
}
else if(z==5){
System.out.print((y+1)+"F ");
}
}

else if(huruf[y][z].equalsIgnoreCase((y+1)+"F")){
if(z==0){
System.out.print((y+1)+"A ");
}
else if(z==1){
System.out.print((y+1)+"B ");
}
else if(z==2){
System.out.print((y+1)+"C ");
}
else if(z==3){
System.out.print((y+1)+"D ");
}
else if(z==4){
System.out.print((y+1)+"E ");
}
else if(z==5){
System.out.print((y+1)+"F ");
}
}

else{
System.out.print(" ");
}
}
System.out.println();
}
}
break;
	case 3:
		System.out.println("==============================================");
		System.out.println("	\"3. VIEW DAFTAR KURSI YANG TERISI\" ");
		System.out.println("==============================================");
{
	for (int y=0;y<13;y++)
{
	for (int z=0;z<6;z++)
{
	if(huruf[y][z].equalsIgnoreCase(tiket[0]))
{
		kursi[y][z]=1;
}
	if(kursi[y][z]==1)
{
		huruf[y][z]="-";
}
	if(huruf[y][z].equalsIgnoreCase("-")){
	if(z==0){
		System.out.print((y+1)+"A ");
}
	else if(z==1){
		System.out.print((y+1)+"B ");
}
	else if(z==2){
		System.out.print((y+1)+"C ");
}
	else if(z==3){
		System.out.print((y+1)+"D ");
}
	else if(z==4){
		System.out.print((y+1)+"E ");
}
	else if(z==5){
		System.out.print((y+1)+"F ");    }
}

}
		System.out.println();
}
}
break;
	case 4:
		System.out.println("==============================================");
		System.out.println("\"4. VIEW SEMUA DAFTAR KURSI\" ");
		System.out.println("==============================================");
{
	for (int y=0;y<13;y++)
{
	for (int z=0;z<6;z++)
{
	if(huruf[y][z].equalsIgnoreCase(tiket[0]))
{
		kursi[y][z]=1;
}
		System.out.print(huruf[y][z]+" ");
}
}
		System.out.println();
}

break;

	case 5:
		System.out.println("==============================================");
		System.out.println("	\"5. VIEW REKAP KURSI\" ");
		System.out.println("==============================================");
{
	for (int j=0;j<1;j++)
	{
		System.out.println("Total kursi yang terjual(Rp): " + jmlkursi[j]);
	}
}
break;

	case 6:
		System.out.println("==============================================");
		System.out.println("\"6. VIEW OMSET\" ");
		System.out.println("==============================================");
				{
for (int j=0;j<1;j++)
{
		System.out.println("Rata-rata omset per kursi : Rp "+(total[j]/jmlkursi[j]));
		System.out.println("Total Omset : Rp "+total[j]);
		System.out.println("Tiket kursi paling laris : "+" (terjual sebanyak "+" buah)");
}
}


break;

	case 7:
		System.exit(0);
		default: break;
		}
			}

	
while(true);
}
	}

	
	
	


