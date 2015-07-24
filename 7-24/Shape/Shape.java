package text;
	public abstract  class Shape {
		  double Area;
		 double longRectangle;
		 double wideRectangle;
		 double Sidelength;	
		 double AllArea;
		public Shape(double longRectangle,double wideRectangle){
			this.longRectangle=longRectangle;
			this.wideRectangle=wideRectangle;
		}
		public Shape(double Sidelength){
			this.Sidelength=Sidelength;
		}
		public double getlongRectangle(){
			return longRectangle;
		}
		public double getwideRectangle(){
			return wideRectangle;
		}
		public double getSidelength(){
			return Sidelength;
		}
		public double getArea(){
			return Area;
		}		
	public abstract double CalculateArea();
	public void AllArea( Shape c) {
		AllArea+=c.Area;
		System.out.println("总的面积为："+c.AllArea+"\n");	
	}
}
	
	