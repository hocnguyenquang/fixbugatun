package service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import dto.HocSinh;
import service.Manager;

@SuppressWarnings("unused")
public class Managerimpl implements Manager {
	private Scanner sc = new Scanner(System.in);
	private HocSinh hs;
	
	public Managerimpl(HocSinh hs) {
		super();
		this.setHs(hs);
	}

	@Override
	public List<HocSinh>add(List<HocSinh> list) {
		System.out.println("Nhap vao cac thong tin cua hoc sinh: ");
		System.out.println("Nhap ho ten hoc sinh: ");
		hs.setName(sc.next());
		System.out.println("Nhap lop hoc sinh: ");
		hs.setClass(sc.next());
		System.out.println("Nhap tuoi hoc sinh: ");
		hs.setAge(sc.nextInt());
		System.out.println("Nhap dia chi hoc sinh: ");
		hs.setAddess(sc.next());
		list.add(hs);
		return list;
	}

	@Override
	public void show() {
		hs.toString();
		
	}

	public HocSinh getHs() {
		return hs;
	}

	public void setHs(HocSinh hs) {
		this.hs = hs;
	}

	@Override
	public void findByAge(List<HocSinh> hs) {
		for (HocSinh hocSinh : hs) {
			if(hocSinh.getAge() == 20) {
				System.out.println(hocSinh.toString());
			}
		}
	}

	public Managerimpl() {
		super();
	}

	@Override
	public int findByAgeAndAddress(List<HocSinh> hs) {
		int count = 0;
		for (HocSinh hocSinh : hs) {
			if(hocSinh.getAge() == 23 && hocSinh.getAddess().equals("DN")) {
				count++;
			}
		}
		return count;
	}
	
}
