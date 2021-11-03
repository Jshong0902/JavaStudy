public class OrderTest {

	public static void main(String[] args) {
		Order woowahan = new Order();
		
		woowahan.orderNumber = "202109150003";
		woowahan.customerPhone = "01012345678";
		woowahan.customerAddress = "부산광역시 강서구 가락대로 1393";
		woowahan.orderDate = "20210915";
		woowahan.orderTime = "130258";
		woowahan.price = 18000;
		woowahan.menuName = "알싸한 마늘치킨";
		woowahan.menuId = "0003";
		
		woowahan.showOrderInfo();
	}

}