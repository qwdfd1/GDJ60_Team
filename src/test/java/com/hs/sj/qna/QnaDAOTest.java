package com.hs.sj.qna;
import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hs.sj.MyTestCase;
import com.hs.sj.qna.QnaDAO;
import com.hs.sj.qna.QnaDTO;


public class QnaDAOTest extends MyTestCase{

	@Autowired
	private QnaDAO qnaDAO;
	
	@Test
	public void getQnaListTest () throws Exception {
		
		List<QnaDTO> qnaDTOs = qnaDAO.getQnaList();
		
		assertNotEquals(0, qnaDTOs.size());
	}
	
	@Test
	public void getQnaDetailTest () throws Exception {
		QnaDTO qnaDTO = new QnaDTO();
		qnaDTO.setQnaNum(2L);
		assertNotNull(qnaDAO.getQnaDetail(qnaDTO)); 
			
	}
	
	@Test
	public void setQnaAddTest() throws Exception {
		QnaDTO qnaDTO = new QnaDTO();
		qnaDTO.setQnaTitle("사이즈 문의");
		qnaDTO.setQnaDetail("더 큰 사이즈 내놔");
		qnaDTO.setQnaWriter("qwdfd");
		qnaDTO.setQnaHit(0L);
		
		assertNotNull(qnaDAO.setQnaAdd(qnaDTO));
	}

}
