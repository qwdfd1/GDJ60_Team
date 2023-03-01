package com.hs.sj.board.qna;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hs.sj.board.BoardDAO;
import com.hs.sj.board.BoardDTO;
import com.hs.sj.board.BoardFileDTO;
import com.hs.sj.util.Pager;

@Repository
public class QnaDAO implements BoardDAO {
	
	@Autowired
	SqlSession sqlSession;
	
	private final String NAMESPACE = "com.hs.sj.qna.QnaDAO.";

	@Override
	public BoardDTO getBoardDetail(BoardDTO boardDTO) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long getTotalCount(Pager pager) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BoardDTO> getBoardList(Pager pager) throws Exception {
		return sqlSession.selectList(NAMESPACE + "getBoardList", pager);
 
	}

	@Override
	public int setBoardAdd(BoardDTO bbsDTO) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int setBoardUpdate(BoardDTO bbsDTO) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int setBoardDelete(BoardDTO bbsDTO) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int setBoardFileAdd(BoardFileDTO boardFileDTO) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<BoardFileDTO> getBoardFileList(BoardDTO bbsDTO) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BoardFileDTO getBoardFileDetail(BoardFileDTO boardFileDTO) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
//	public List<QnaDTO> getQnaList() throws Exception {
//		return sqlSession.selectList(NAMESPACE+"getQnaList");
//	}
//	
//	public QnaDTO getQnaDetail(QnaDTO qnaDTO) throws Exception {
//		return sqlSession.selectOne(NAMESPACE+"getQnaDetail", qnaDTO);
//	}
//	
//	public int setQnaAdd(QnaDTO qnaDTO) throws Exception {
//		return sqlSession.insert(NAMESPACE+"setQnaAdd", qnaDTO);
//	}
//	
//	public int setQnaHitAdd(QnaDTO qnaDTO) throws Exception {
//		return sqlSession.update(NAMESPACE+"setQnaHitAdd", qnaDTO);
//	}
//	
//	public int setQnaDelete(QnaDTO qnaDTO) throws Exception {
//		return sqlSession.delete(NAMESPACE+"setQnaDelete", qnaDTO);
//	}
//	
//	public int setQnaUpdate(QnaDTO qnaDTO) throws Exception {
//		return sqlSession.update(NAMESPACE+"setQnaUpdate", qnaDTO);
//	}
	
	
	
}
