public class OrderTest {

	public static void main(String[] args) {
		Order woowahan = new Order();
		
		woowahan.orderNumber = "202109150003";
		woowahan.customerPhone = "01012345678";
		woowahan.customerAddress = "�λ걤���� ������ ������� 1393";
		woowahan.orderDate = "20210915";
		woowahan.orderTime = "130258";
		woowahan.price = 18000;
		woowahan.menuName = "�˽��� ����ġŲ";
		woowahan.menuId = "0003";
		
		woowahan.showOrderInfo();
	}

}