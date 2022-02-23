package  ProgramPractice;

public class PositionOfNumber {
public static int get_Num_Position(int number, int digit) {
	
	if(digit<0) {
		return -1;
	}
	if(digit>9) {
		return -2;
	}
	int position=1;
	int rem=0;
	while(number!=0) {
		rem=number%10;
		if(rem==digit) {
			break;
		}
		number=number/10;
		position=position*10;
	}
	
	return position;
}


public static void main(String[] args) {
	int nc = get_Num_Position(1089, 2);
	System.out.println(nc);
}
}
