public class Date{
 	
	private int year;
	private int month;
	private int day;


 	public Date(int x, int y, int z){

 		this.year = x;
 		this.month = y;
 		this.day = z;	


 	}

 	public Date(){

 		this(1000,1,1);

 	}

 	public void setDate(int a, int b, int c){

 		this.year = a;
 		this.month = b;
 		this.day = c;

 	}



 	public String toString(){

 		return String.format("%02d/%02d/%d", this.day,this.month,this.year);
 	}

 	public int getYear(){
 		return year;
 	}

 	public void setYear(int year){
 		if(year < 1000 || year > 9999){
 			throw new IllegalArgumentException("Year out of range");
 		}

 		this.year = year;
 	}

 	 public int getMonth(){
 		return month;
 	}

 	public void setMonth(int month){
 		if(month < 1 || month > 12){
 			throw new IllegalArgumentException("Month out of range");
 		}
 		this.month = month;
 	}

 	 public int getDay(){
 		return day;
 	}

 	public void setDay(int day){

 		 if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12 ){
 		 	if(day < 1 || day > 31){
 			throw new IllegalArgumentException("Day out of range");
 			}
 		} else if(month == 4 || month == 6 || month == 9 || month == 11){
 			if(day < 1 || day > 30){
 				throw new IllegalArgumentException("Day out of range");
 			}
 		} else if( month == 2 && year%4 == 0){
 			if(day < 1 || day > 29){
 				throw new IllegalArgumentException("Day out of range");
 			}
 		} else if( month == 2 ){
 			if(day < 1 || day > 28){
 				throw new IllegalArgumentException("Day out of range");
 			}
 		} else {
 		this.day = day;
 		}
 	}



}
