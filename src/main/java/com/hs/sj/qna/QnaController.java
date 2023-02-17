package com.hs.sj.qna;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/qna/*")
public class QnaController {
	
	@Autowired
	private QnaService qnaService;
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public ModelAndView getQnaList(ModelAndView mv) throws Exception {
		
		mv.setViewName("/qna/list");
		mv.addObject("list", qnaService.getQnaList());
		
		return mv;
		
	}
	
	@RequestMapping(value = "/detail", method = RequestMethod.GET)
	public ModelAndView getQnaDetail(ModelAndView mv, QnaDTO qnaDTO) throws Exception {
		
		mv.setViewName("/qna/detail");
		mv.addObject("dto", qnaService.getQnaDetail(qnaDTO));
		
		return mv;
	}
	
}
