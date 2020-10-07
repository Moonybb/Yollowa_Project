package com.proj.yollowa.model.service.cs;

import java.sql.SQLException;
import java.util.List;

import org.springframework.ui.Model;

import com.proj.yollowa.model.entity.SearchVo;
import com.proj.yollowa.model.entity.cs.NoticeVo;
import com.proj.yollowa.model.entity.cs.PagingScaleVo;


public interface NoticeService {

//	void getNoticeListService(Model model) throws SQLException;
//	List<NoticeVo> getNoticeListService(PagingScaleVo pagingScale) throws SQLException;
	List<NoticeVo> getNoticeListService(SearchVo searchVo) throws SQLException;
	void getNoticeService(Model model, int noticeno) throws SQLException;
	int countNoticeService(SearchVo searchVo) throws SQLException;
	void deleteNoticeService(int noticeno) throws SQLException;
	void insertNoticeService(NoticeVo bean) throws SQLException;
	void updateNoticeService(NoticeVo bean) throws SQLException;
}
