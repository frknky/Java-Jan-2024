/*----------------------------------------------------------------------------------------------------------------------	
	Yukarıdaki demo örnekte sınıflara count static veri elemanı eklenerek anlatılan problemler çözülebilir. 
	
	Anahtar Notlar: ** ve ** ile belirtilen kodların detayları şu an önemsizdir. Burada sayacın nesne yaratıldıkça
	artırıldığına odaklanınız. Buradaki detaylar ileride ele alınacaktır
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args) 
	{	
		DemoGameApp.run();
	}
}

class DemoGameApp {
	public static void run()
	{		
		//...
		
		for (int i = 0; i < 10; ++i) {
			Alien a = new Alien();		
				
			//...
		}
		
		for (int i = 0; i < 20; ++i) {
			Soldier soldier = new Soldier();		
			
			//...
		}
		
		//...
		
		System.out.printf("Number of aliens:%d%n", Alien.count);
		System.out.printf("Number of soldiers:%d%n", Soldier.count);			
	}
}

class Alien {
	public static int count;
	public int color;
	public int armCount;
	
	// ...
	public Alien() //**
	{
		//...
		++count;		
	}
	//...
}

class Soldier {
	
	public static int count;
	public int title;
	public int gunCount; 
	 
	 //...

	
	public Soldier() //***
	{
		++count;
		//...
	}
	 
	 //...
}

class Civilian {
	public static int count;
	//...
}

class Building {
	public static int count;
	//...
}

class Animal {
	public static int count;
	//...
}

//...
