package com.udemy.methodoverloading;
public class SecondsAndMinutesChallenge {

	public static String getDurationString(long minutes, long seconds) {
		if (minutes >= 0 && (seconds >= 0 && seconds <= 59)) {
			long hours = minutes / 60;
			long remainingMinutes = minutes % 60;
			return hours + " h " + remainingMinutes + " m " + seconds + " s ";

		}
		return "NA";
	}

	public static String getDurationString(long seconds) {
		if (seconds >= 0) {
			long minutes = seconds / 60;
			long remSec = seconds % 60;
			return getDurationString(minutes, remSec);
		}
		return "NA";
	}

}
