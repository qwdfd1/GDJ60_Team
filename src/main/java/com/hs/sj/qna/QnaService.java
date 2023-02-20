package com.hs.sj.qna;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QnaService {
	
	@Autowired
	private QnaDAO qnaDAO;
	
	public List<QnaDTO> getQnaList() throws Exception {
		return qnaDAO.getQnaList();
	}
	
	public QnaDTO getQnaDetail(QnaDTO qnaDTO) throws Exception {
			int result = qnaDAO.setQnaHitAdd(qnaDTO);
				return qnaDAO.getQnaDetail(qnaDTO);

	}
	
	public int setQnaAdd(QnaDTO qnaDTO) throws Exception {
		return qnaDAO.setQnaAdd(qnaDTO);
	}
}
