package training.intabstr;

public class TwoWheelerBookingServiceImpl implements BookingService {

	@Override
	public Integer bookVehicle(int customerId, String customerLocation, String destinationLocation) {
		Integer bookingId=null;
		try
		{
			if((Integer.parseInt(destinationLocation)-Integer.parseInt(customerLocation))>=50)
			{
				throw new Exception("Distance too Long to book");
			}
			else
			{
				bookingId=22232;
				System.out.println("Two Wheeler Booking Successful");
			}
			
		}
		catch(Exception exp)
		{
			System.out.println("Exception in Booking Two Wheeler.."+exp.getMessage());
		}
		return bookingId;
	}

}
