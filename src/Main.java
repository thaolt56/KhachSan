import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Hotel hotel = new Hotel();

		

		while (true) {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("phím 1: Thêm thông tin khách hàng. ");
			System.out.println("phím 2: Xoá thông tin khách hàng theo CMND  ");
			System.out.println("phím 3: Tính tiền thuê phòng cho khách theo CMND ");
			System.out.println("phím 4: In danh sách khách hàng  ");
			System.out.println("phím 5: Thoát. ");
			System.out.println("Nhập vào bàn phím để chọn menu thích hợp: ");
			String line = sc.nextLine();
			switch (line) {
			case "1": {
				System.out.println("Thông tin khách hàng ");
				System.out.println("Nhập vào tên khách: "); String name = sc.nextLine();
				System.out.println("Nhập vào tuổi khách: "); int age  = sc.nextInt(); sc.nextLine();
				
				System.out.println("Nhập vào CMND  khách: "); String passport = sc.nextLine();
				
				System.out.println("Nhập vào Phòng của khách:(loại A, B và C ) "); String choise = sc.nextLine();
				Room room;
				if (choise.equals("a")) {
					 room = new RoomA();
				} else if (choise.equals("b")) {
					 room = new RoomB();
				}else if (choise.equals("c")){
					 room = new RoomC();
				}else {
					continue;
				}
				
				
				System.out.println("Nhập vào số ngày thuê  của khách: "); int numberRent = sc.nextInt();
				
				Person person = new Person(name, age, passport, room, numberRent);
				hotel.addPerson(person);
				break;
				
			}
			case "2":{
				System.out.println("Xoá thông tin khách theo CMND ");
				System.out.println("Nhập vào CMND cần xoá ");String passport = sc.nextLine();
				hotel.deletePerson(passport);
				break;
			}
			case "3":{
				System.out.println("Tính tiền thuê phòng cho khách :");
				System.out.println("Nhập vào CMND ");String passport = sc.nextLine();
				System.out.println("tien thue phong: " + hotel.calculate(passport));
				break;
				
			}
			case "4":{
				System.out.println("danh sách khách hàng ");
				hotel.show();
				break;
			}
			case "5":{
				break;
			}
			default:
				System.out.println("Không hợp lệ ");
				continue;
			}
		}
	}
}
