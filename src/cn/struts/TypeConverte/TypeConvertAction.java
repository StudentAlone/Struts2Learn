package cn.struts.TypeConverte;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

import cn.strutslerat.bean.Point;

public class TypeConvertAction implements Action {
     private Point point;
     
	@Override
	public String execute() throws Exception {
		
		System.out.println(point.getX()+":"+point.getY());
		
		return Action.SUCCESS;
	}

	public Point getPoint() {
		return point;
	}

	public void setPoint(Point point) {
		this.point = point;
	}
	
     
     
     
}
