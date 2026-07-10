class HeadSet{
	static boolean isConnected;
	static int currentVolume;
	static int minVolume;
	static int maxVolume=8;
	public static void onOrOff(){
		if(isConnected==false){
			isConnected = true;
			System.out.println("Headset is connected....");
		}
		else{
			isConnected=false;
			System.out.println("Headset is disconnected...");
		}
	}
	public static void increaseVolume(){
		if(isConnected==true){
			if(currentVolume<maxVolume){
				currentVolume=currentVolume+1;
				System.out.println("The current volume is:"+currentVolume);
			}else{
				System.out.println("Maximum volume is reached...");
			}
		}else{
				System.out.println("Heyy... Turn on the HeadSet");
			}
	}
	public static void decreaseVolume(){
		if(isConnected==true){
		if(currentVolume>minVolume){
			currentVolume=currentVolume-1;
			System.out.println("The current volume is:"+currentVolume);
		}else{
			System.out.println("minimum volume is reached");
		}
		}else{
			System.out.println("Heyyyy... Turn on the Headset");
		}
	}
	
	
	public static void main(String[] args){
		System.out.println(isConnected);
		onOrOff();
		System.out.println(isConnected);
		increaseVolume();
		increaseVolume();
		increaseVolume();
		increaseVolume();
		increaseVolume();
		increaseVolume();
		increaseVolume();
		increaseVolume();
		increaseVolume();
		decreaseVolume();
		decreaseVolume();
		decreaseVolume();
		decreaseVolume();
		decreaseVolume();
		decreaseVolume();
		decreaseVolume();
		decreaseVolume();
		decreaseVolume();
		onOrOff();
		System.out.println(isConnected);
	}

}