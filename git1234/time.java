class Time{
	private int hour=0;
	private int minute=0;
	private int second=0;

	Time(){
		
	}

	public MyTime(int hour, int minute, int second){
		
	}

	public void setTime(int hour, int minute, int second){
		if(hour<0||hour>23||minute<0||minute>59||second<0||second>59){
			throw new IllegalArgumentException("Invalid hour, minute, or second!");
		}
	}

	public void setHour(int hour){
		if(hour<0||hour>23){
			throw new IllegalArgumentException("Invalid hour!");
		}
		this.hour = second;
	}

	public void setMinute(int minute){
		if(minute<0||minute>59){
			throw new IllegalArgumentException("Invalid minute!");
		}
	