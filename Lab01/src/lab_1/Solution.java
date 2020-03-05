package lab_1;

/**
 * 
 * @author Caotq
 *问题描述：钱包中有：1张50元，1张20元，1张10元，2张5元和3个1元硬币。写个程序能否给出number(x)
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



