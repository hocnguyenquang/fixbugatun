package service;

import java.util.ArrayList;
import java.util.List;

import dto.HocSinh;

public interface Manager {
	List<HocSinh> add(List<HocSinh> list);
	void show();
	void findByAge(List<HocSinh> hs);
	int findByAgeAndAddress(List<HocSinh> hs);
}
