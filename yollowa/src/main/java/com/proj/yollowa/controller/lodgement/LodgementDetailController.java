package com.proj.yollowa.controller.lodgement;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.proj.yollowa.model.entity.lodgement.LodgementDetailPageDto;
import com.proj.yollowa.model.entity.lodgement.LodgementRoomInfoVo;
import com.proj.yollowa.model.entity.lodgement.InformationVo;
import com.proj.yollowa.model.entity.lodgement.LodgementVo;
import com.proj.yollowa.model.service.activity.ActivityService;
import com.proj.yollowa.model.service.lodgement.LodgementService;

@Controller
@RequestMapping("/lodgement/")
public class LodgementDetailController {
	
	@Inject
	LodgementService lodgementService;
	@Inject
	ActivityService activityService;
	
	// 숙박 디테일
	@RequestMapping("detail/{lodgement_number}")
	public String lodgementDetail(@PathVariable("lodgement_number") int number,Model model) throws SQLException {
		// 디테일리스트
		List<LodgementDetailPageDto> list =lodgementService.lodgementDetail(number,model);
		
		// 이미지들
		List<LodgementVo> alist=lodgementService.lodgementListAll(model);
		model.addAttribute("listImg", alist.get(0).getLodgement_img());
		
		// 기본정보들
		lodgementService.lodgementInfo(number, 2, model);
		
		//리뷰
		activityService.reviewList(number, 2, model);
		
		// 주소 위치
		String pin=list.get(0).getLodgement_location();

		// 숙소 이름
		String name = list.get(0).getLodgement_companyName();
		
		
		model.addAttribute("pin", pin);
		model.addAttribute("companyName", name);
		model.addAttribute("startEndDay", list.get(0));
		model.addAttribute("article", number);
		
		return "lodgement/lodgementDetail";
	}
	
	// 숙박 결제
	@RequestMapping(value = "detail/Inicis/{lodgement_number}",method = RequestMethod.POST)
	public String lodgementInicis(@PathVariable("lodgement_number") int articleNumber,Model model,HttpServletRequest req) throws SQLException {
		return "lodgement/lodgementInicis";
	}
	
	/////////////////////////// 예약 페이지
	
	//숙박 예약페이지
	@RequestMapping(value =  "detail/reservation/{lodgement_number}" )
	public String lodgementReservation(@PathVariable("lodgement_number") int articleNumber, HttpServletRequest req,Model model) throws SQLException{
		
		// 예약할 숙소정보
		String roomNumber =req.getParameter("roomNumber");
		String sdate =req.getParameter("sdate");
		String edate =req.getParameter("edate");
		List list =new ArrayList();
		list.add(articleNumber);
		list.add(roomNumber);
		list.add(sdate);
		list.add(edate);
		
		model.addAttribute("reservList",list);
		
		// 해당 기본정보
		List<InformationVo> infoList=lodgementService.lodgementInfo(articleNumber, 2, model);
		
		model.addAttribute("infoList", infoList);
		
		
		// 방 정보
		int rn= Integer.parseInt(roomNumber);
		List<LodgementRoomInfoVo> detailList = lodgementService.lodgementReserInfo(articleNumber,rn,model);
		
		model.addAttribute("roomDetail", detailList);
		
		
		return "lodgement/lodgementReservation";
	}
	
	
	
	
}





