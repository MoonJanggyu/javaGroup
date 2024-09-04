package T08_inheritance;

public class T02Bb extends T02Aa {

	// 원의 면적 (r * r * 3.14)
	double areaCircle(int r) {
		return r*r*Math.PI;
	}
	
	// 원의 둘레 (2 * 3.14 * r)
	double lenCirlce(int r) {
		return 2 * Math.PI * r;
  }
 }
