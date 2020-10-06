package com.proj.yollowa.model.service.activity;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.ui.Model;

import com.proj.yollowa.model.entity.activity.ActivityVo;
import com.proj.yollowa.model.entity.activity.ReviewVo;

public interface ActivityService {
	//액티비티 temp가 1인 리스트
	List<ActivityVo> activitySelectAll(Model model) throws SQLException;
	//액티비티 디테일
	void activityDetail(Model model, int number) throws SQLException;
	//액티비티 리스트 카운트
	int activityCount() throws SQLException;
	//액티비티 디테일 옵션 칸
	void activityOption(int articleNumber,Model model) throws SQLException;
	// 리뷰 리스트
	ArrayList<ReviewVo> reviewList(int articleNumber,int category,Model model) throws SQLException;
	// 리뷰 카운트
	int activityReviewCount(int articleNumber,int category) throws SQLException;
}