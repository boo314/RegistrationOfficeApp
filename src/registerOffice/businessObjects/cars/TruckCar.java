package registerOffice.businessObjects.cars;

public class TruckCar extends Car{
	private String mark;
	private String registerNumber;
	
	public TruckCar(String mark, String registerNumber)
	{
		this.mark=mark;
		this.registerNumber=registerNumber;
	}
	
	public TruckCar()
	{
		this("","");
	}
	@Override
	public String getMark() {
		return mark;
	}
	@Override
	public void setMark(String mark) {
		this.mark = mark;
	}
	@Override
	public String getRegisterNumber() {
		return registerNumber;
	}
	@Override
	public void setRegisterNumber(String registerNumber) {
		this.registerNumber = registerNumber;
		
	}
	@Override
	public String getCarDetails() {
		return  mark+" "+registerNumber;
	}
	@Override
	public Car Clone() {
		TruckCar returnValue =new TruckCar();
		returnValue.setRegisterNumber(this.registerNumber);
		
		return returnValue;
	}
	
}

