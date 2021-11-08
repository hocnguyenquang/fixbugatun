import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dto.HocSinh;
import service.Manager;
import service.impl.Managerimpl;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<HocSinh> lisths = new ArrayList<HocSinh>();
		HocSinh hs = new HocSinh();
		Manager mg = new Managerimpl(hs);
		menu();
		while(true) {
			System.out.println("Moi ban nhap lua chon: ");
			int key = sc.nextInt();
			switch (key) {
			case 1:
				System.out.println("Them moi hoc sinh: ");
				mg.add(lisths);
				break;
				
			case 2:
				System.out.println("Hien thi danh sach hoc sinh 20t: ");
				mg.findByAge(lisths);
				break;
				
			case 3:
				System.out.println("So luong hoc sinh 23t va que DN: ");
				int count = mg.findByAgeAndAddress(lisths);
				System.out.println(count);
				break;
				
			default:
				
				break;

			}
		}
	}
	public static void menu() {
		System.out.println("Menu: ");
		System.out.println("1.Them hoc sinh");
		System.out.println("2.Hien thi danh sach hoc sinh 20t");
		System.out.println("3.So luong hoc sinh 23t va que DN");
	}
}
