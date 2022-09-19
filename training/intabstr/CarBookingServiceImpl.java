package training.intabstr;

public class CarBookingServiceImpl implements BookingService {

	public Integer bookVehicle(int customerId, String customerLocation,String destinationLocation) {
		Integer bookingId=null;
		try
		{
			if((Integer.parseInt(destinationLocation)-Integer.parseInt(customerLocation))<=2)
			{
				throw new Exception("Distance too short to book");
			}
			else
			{
				bookingId=12232;
				System.out.println("Car Booking Successful");
			}
			
		}
		catch(Exception exp)
		{
			System.out.println("Exception in Booking Car.."+exp.getMessage());
		}
		return bookingId;
	}

}
