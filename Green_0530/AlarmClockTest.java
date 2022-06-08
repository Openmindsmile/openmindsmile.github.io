// p216 AlarmClockTest
class Time {
	private int time;
	private int minute;
	private int second;

	public Time(int t, int m, int s) {
		time = t;
		minute = m;
		second = s;
	}
	
	public int getTime() {
		return time;
	}
	public int getMinute() {
		return minute;
	}
	public int getSecond() {
		return second;
	}
	public void printAll() {
		System.out.println(time + ":" + minute + ":" + second);
	}
}

class AlarmClock {
	private Time currentTime;
	private Time alarmTime;

	public AlarmClock(Time a, Time c) {
		alarmTime = a;
		currentTime = c;
	}
	public Time getCurrentTime() {
		return currentTime;
	}
}

public class AlarmClockTest {
	public static void main(String args[]) {
		Time alarm = new Time(6, 0, 0);
		Time current = new Time(12, 56, 34);
		AlarmClock c = new AlarmClock(alarm, current);
		
		Time hour = c.getCurrentTime();
		System.out.println(hour.getTime());
		hour.printAll();
	} // end main
} // end class
