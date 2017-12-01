package cn.struts.TypeConverte;

import java.util.Map;

import org.apache.struts2.util.StrutsTypeConverter;

import cn.strutslerat.bean.Point;

public class Tconvert extends StrutsTypeConverter {

	@Override
	public Object convertFromString(Map context, String[] values, Class toClass) {
		
		String tempvalue=values[0];//(3,4)
		System.out.println("22222");
		String _x=tempvalue.substring(0, tempvalue.indexOf(","));
		String _y=tempvalue.substring(tempvalue.indexOf(",")+1, tempvalue.length()-1);
		System.out.println(_x+"=:"+_y);
		Point temp=new Point();
		temp.setX(Integer.parseInt(_x));
		temp.setY(Integer.parseInt(_y));
		
		return temp;
	}

	@Override
	public String convertToString(Map context, Object o) {
		// TODO Auto-generated method stub
		return null;
	}

}
