package training.intabstr;

public class BookingClient {

	public static void main(String[] args) {
		Integer bookingId=null;
		try {
			
			BookingService bookVehicle = new CarBookingServiceImpl();
			bookingId=bookVehicle.bookVehicle(1001, args[0], args[1]);
			if(bookingId==null)
			{
				bookVehicle = new TwoWheelerBookingServiceImpl();
				bookingId=bookVehicle.bookVehicle(1001, args[0], args[1]);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
