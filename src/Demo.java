
public class Demo {
	public point point;
	
	public Demo(point point) {
		this.point = point;
	}

	public void Order(String order) {
		if("back".equals(order)) {
			if(null==point.getBefore()) {
				System.out.println("��ʼλ��"+point.getX()+","+point.getY());
			}
			else
			{
//				point current=point;
//				point=current.getBefore();
//				System.out.println(point.getX()+","+point.getY());
				
				
				//fiexed by wang fuzhi
				point = point.getBefore();
				System.out.println(point.getX() + "," + point.getY());
				
			}
		}
		else
			if("forward".equals(order)) {
//				point current=point;
//				point.setY(point.getY()+1);
//				point.setBefore(current);
//				System.out.println(point.getX()+","+point.getY());
				
				//fixed by wang fuzhi
				point current=new point(point.getX(), point.getY());
				current.setY(point.getY()+1);
				current.setBefore(point);
				point = current;
				System.out.println(point.getX()+","+point.getY());
				
			}
			else
				if("show".equals(order)){
					while(null!=point) {
						point current=point;
						System.out.println(current.getX()+","+current.getY());
						point=current.getBefore();
					}
			}
	}
}
