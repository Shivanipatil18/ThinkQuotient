package Assigenment;

	public class SonyTv implements TV{
	private boolean on;
	private boolean off;
	private int volume;

	public SonyTv() {
		this.off=true;
		this.on=false;
		this.volume=0;
	}
	
		public boolean isOn() {
		return on;
	}

	public void setOn(boolean on) {
		this.on = on;
	}

	public boolean isOff() {
		return off;
	}

	public void setOff(boolean off) {
		this.off = off;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

		@Override
		public void increaseVolume() {
			++this.volume;
		}

		@Override
		public void decreseVolume() {
			if(this.volume==0)
				return;
			--this.volume;
		}

		@Override
		public void turnOn() {
		
			if(this.on)
				return;
			this.on=true;
			this.off=false;
		}

		@Override
		public void turnOff() {
			if(!this.on)
				return;
			this.on=false;
			this.off=true;
		}

	}



