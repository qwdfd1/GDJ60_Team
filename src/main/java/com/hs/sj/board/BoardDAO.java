package com.hs.sj.board;

import java.util.List;

import com.hs.sj.util.Pager;



public interface BoardDAO {
	//totalCount
	public Long getTotalCount(Pager pager) throws Exception;
	
	//list
	public List<BoardDTO> getBoardList(Pager pager) throws Exception;
	
	//insert(add)
	public int setBoardAdd(BoardDTO bbsDTO) throws Exception;
	
	//update
	public int setBoardUpdate(BoardDTO bbsDTO) throws Exception;
	
	//delete
	public int setBoardDelete(BoardDTO bbsDTO) throws Exception;
	
	//list
	
	//detail
	public BoardDTO getBoardDetail(BoardDTO boardDTO) throws Exception;
	
	//add
	
	//fileAdd
	public int setBoardFileAdd(BoardFileDTO boardFileDTO) throws Exception;
	
	//update
	
	//delete
	
	//BoardFileList
	public List<BoardFileDTO> getBoardFileList(BoardDTO bbsDTO) throws Exception;
	
	//BoardFileDetail
	public BoardFileDTO getBoardFileDetail(BoardFileDTO boardFileDTO) throws Exception;
	
}
