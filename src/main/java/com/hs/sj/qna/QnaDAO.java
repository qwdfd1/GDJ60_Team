package com.hs.sj.qna;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class QnaDAO {
	
	@Autowired
	SqlSession sqlSession;
	
	private final String NAMESPACE = "com.hs.sj.qna.QnaDAO.";
	
	public List<QnaDTO> getQnaList() throws Exception {
		return sqlSession.selectList(NAMESPACE+"getQnaList");
	}
	
	public QnaDTO getQnaDetail(QnaDTO qnaDTO) throws Exception {
		return sqlSession.selectOne(NAMESPACE+"getQnaDetail", qnaDTO);
	}
	
	public int setQnaAdd(QnaDTO qnaDTO) throws Exception {
		return sqlSession.insert(NAMESPACE+"setQnaAdd", qnaDTO);
	}
	
}
