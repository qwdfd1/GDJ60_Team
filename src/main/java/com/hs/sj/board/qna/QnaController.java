package com.hs.sj.board.qna;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/qna/*")
public class QnaController {
	
	@ModelAttribute (name = "boardName")
	public String getBoardName() {
		return "qna";
	}
	
	@Autowired
	private QnaService qnaService;
	
	@GetMapping("list")
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
	
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public ModelAndView setQnaAdd(ModelAndView mv) throws Exception {
		mv.setViewName("/qna/add");
		
		return mv;
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public ModelAndView setQnaAdd(ModelAndView mv, QnaDTO qnaDTO) throws Exception {
		mv.setViewName("redirect:./list");
		int result = qnaService.setQnaAdd(qnaDTO);
		return mv;
	}
	
	@RequestMapping(value ="/delete", method = RequestMethod.GET)
	public ModelAndView setQnaDelete(ModelAndView mv, QnaDTO qnaDTO) throws Exception {
		int result = qnaService.setQnaDelete(qnaDTO);
		mv.setViewName("redirect:./list");
		
		return mv;
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.GET)
	public ModelAndView setQndUpdate(ModelAndView mv, QnaDTO qnaDTO) throws Exception {
		mv.addObject("dto", qnaService.getQnaDetail(qnaDTO));
		mv.setViewName("/qna/update");
		return mv;
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public ModelAndView setQndUpdate(QnaDTO qnaDTO) throws Exception {
		ModelAndView mv = new ModelAndView();
		qnaService.setQnaUpdate(qnaDTO);
		mv.setViewName("redirect:./list");
		return mv;
	}
	
}