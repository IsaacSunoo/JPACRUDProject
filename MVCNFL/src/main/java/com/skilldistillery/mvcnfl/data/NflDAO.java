package com.skilldistillery.mvcnfl.data;

import java.util.List;

import com.skilldistillery.nfl.entities.NFL;

public interface NflDAO {

	NFL show(int id);

	List<NFL> index();

}
