package lab_1;

/**
 * 
 * @author Caotq
 *����������Ǯ�����У�1��50Ԫ��1��20Ԫ��1��10Ԫ��2��5Ԫ��3��1ԪӲ�ҡ�д�������ܷ����number(x)
 *
 */
public class Solution {
	
	public int number(int x) {
		int billPacket[] = {50, 20, 10, 5, 5, 1, 1, 1} ;
		if(x > 93)
			return -1 ;
		for(int i = 0; i < billPacket.length; i++) {
			if(x>=billPacket[i]) {
				x-=billPacket[i] ;
			}
		}
		if(x==0) {
			return 1 ;
		}
		return -1 ;
	}
}



