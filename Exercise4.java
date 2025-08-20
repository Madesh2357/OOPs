class Car{
	private String color;
	private String model;
	public Car(String model, String color){
		this.model = model;
		this.color = color;
}
	public void start(){
		System.out.println(color + " " + model  + " "+ "Car Started");
}
	public void stop(){
		System.out.println(color + " " + model + " "+ "Car Stopped" );
}
	public static void main(String[] args){
		Car car1 = new Car("Tesla", "Red");
		car1.start();
		car1.stop();
}
}
