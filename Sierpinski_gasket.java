public class Sierpinski_gasket{
	public static void main(String[]args){
		final int SZ = 33;
		boolean b = true;
		boolean s[][] = new boolean [SZ][SZ];
		for(int r=0;r<s.length;r++) { s[r][0] = false; }
		for(int c=2;c<s.length;c++) { s[0][c] = false; }
		s[0][1] = b;
		for(int r=0;r < s.length-1;r++){
			for(int c=1;c < s.length;c++){
				s[r+1][c] = s[r][c] ^ s[r][c-1];
				if(s[r][c]) { System.out.print("*"); }
				else 		{ System.out.print(" "); }
			}
			System.out.println("");
		}
	}
}
