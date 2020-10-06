package com.proj.yollowa.controller.lodgement;

import java.sql.SQLException;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.proj.yollowa.model.service.lodgement.LodgementService;

@Controller
@RequestMapping("/lodgement/")
public class LodgementListController {
	
	@Inject
	LodgementService lodgementService;
	
	// 숙박 리스트
	@RequestMapping("list")
	public String list(Model model) throws SQLException {
		lodgementService.lodgementListAll(model);
		
		// 리스트 temp=1인 개수
		int cnt = lodgementService.lodgementListCnt();
		model.addAttribute("cnt", cnt);
		
		return "lodgement/lodgementList";
	}
}





