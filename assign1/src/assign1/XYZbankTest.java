package assign1;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;


public class XYZbankTest {
	accountDetails accountdetails;
		@Before
		public void check() {
			String ownerName = "Charles";
			String dateOfOpening = "21/07/2006";
			String city = "New York City";
			String state = "New York";
			String pincode = "23401";
			String phone = "8181818181";
			String flatNumber = "FJ-8";
			String street = "Cadbury";
			String TYPE = "current";
			String STATUS= "Active";

			accountdetails = new accountDetails(ownerName, 0, dateOfOpening, city, state, pincode, phone, flatNumber, street, 0, TYPE, STATUS);
		}

		@Test
		public void DepositGreaterThanZero() {
			boolean depositStatus = accountdetails.deposit(120);
			assertEquals(true, depositStatus);
		}

		@Test(expected = IllegalArgumentException.class)
		public void DepositLessThanZero() {
			boolean depositStatus = accountdetails.deposit(-75);
			assertEquals(false, depositStatus);
		}

		@Test(expected = IllegalArgumentException.class)
		public void ValidAmount() {
			int withdrawalAmount = 112;
			int witndrawalStatus = accountdetails.withdrawal(withdrawalAmount);
			assertEquals(withdrawalAmount, witndrawalStatus);
		}

		@Test(expected = IllegalArgumentException.class)
		public void InvalidAmount() {
			int witndrawalAmount = 770;
			int witndrawalStatus = accountdetails.withdrawal(witndrawalAmount);
			assertEquals(witndrawalAmount, witndrawalStatus);
		}

	}