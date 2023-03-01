package com.hs.sj.board;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.web.multipart.MultipartFile;

import com.hs.sj.util.Pager;




public interface BoardService {
	//list
	public List<BoardDTO> getBoardList(Pager pager) throws Exception; 
	
	//insert(add)
	public int setBoardAdd(BoardDTO boardDTO, MultipartFile [] files, HttpSession session) throws Exception;
	
	//update
	public int setBoardUpdate(BoardDTO boardDTO) throws Exception;
	
	//delete
	public int setBoardDelete(BoardDTO boardDTO, HttpSession session) throws Exception;
	
	public BoardDTO getBoardDetail(BoardDTO boardDTO) throws Exception;
	
	public BoardFileDTO getBoardFileDetail(BoardFileDTO boardFileDTO) throws Exception;
}

