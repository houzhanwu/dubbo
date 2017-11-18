package cn.cttic.utils;

public class VehicleNoUtil {
	
	public static int AC_VIN_CODE[] = { 194179, 189242, 188189, 189250, 187166,
		203213, 213227, 190169, 212165, 205238, 195246, 184211, 195201,
		193201, 188170, 186218, 185240, 199237, 211229, 180168, 185243,
		212198, 178216, 201194, 184202, 199224, 196254, 208194, 182245,
		207230, 212193 };
	
	public static String AC_VIN_CODE_STR[] = { "鲁", "津", "冀", "晋", "泸", "苏",
		"浙", "京", "豫", "皖", "闽", "赣", "蒙", "辽", "吉", "黑", "桂", "琼", "渝",
		"川", "贵", "云", "藏", "陕", "甘", "青", "宁", "新", "鄂", "湘", "粤" };

	public static String getVehicleNo(String vehicleNo){
		String str = vehicleNo.substring(0,1);//截取第一个汉字
		String str1 = vehicleNo.substring(1);//汉字后面的字符
		int result=0;
		for(int i=0;i<AC_VIN_CODE_STR.length;i++){
			if(str.equals(AC_VIN_CODE_STR[i])){
				result = AC_VIN_CODE[i];
			}
		}
		return result+str1;
	}
	
	public static void main(String[] args){
		System.out.println(getVehicleNo("藏A00001"));
	}
}
