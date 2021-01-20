package service;

import database.Database;
import frs.Reservation;

public class ReadData {
	
	public static Reservation getReservationByCode(String resCode) {
		return Database.resCodeMap.get(resCode);
	}

}
