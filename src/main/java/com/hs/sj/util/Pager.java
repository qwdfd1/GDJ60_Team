package com.hs.sj.util;

public class Pager {
	private Long bookNumber;
	
	//검색 종류(사용할 Column)
	private String kind;
	
	//검색어
	private String search;
	
	//하나의 페이지의 출력할 Row의 갯수
	private Long perPage;
	
	//한 블럭당 출력할 번호의 갯수
	private Long perBlock;
	
	//전체 page 갯수
	private Long totalPage;
	
	//사용자가 보고싶은 페이지 번호
	private Long page;
	
	//Table에서 조회할 시작 Row번호
	private Long startRow;
	
	//Table에서 조회할 끝 Row번호
	private Long lastRow;
	
	//현재블럭에서 보여줄 첫 번호
	private Long startNum;
	
	//현재블럭에서 보여줄 끝 번호
	private Long lastNum;
	
	private boolean before;
	private boolean after;

	
	
	
	public Pager() {
		this.perPage = 10L;
	}

	public Long getBookNumber() {
		return bookNumber;
	}

	public void setBookNumber(Long bookNumber) {
		this.bookNumber = bookNumber;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public String getSearch() {
		if(search == null) {
			search = "";
		}
		return search;
	}

	public void setSearch(String search) {
		this.search = search;
	}

	public Long getPerPage() {
		if(this.perPage == null || this.perPage == 0) {
			this.perPage = 10L;
		}
		return perPage;
	}

	public void setPerPage(Long perPage) {
		this.perPage = perPage;
	}

	public Long getPerBlock() {
		if(this.perBlock == null || this.perBlock<1) {
			this.perBlock = 5L;
		}
		return perBlock;
	}

	public void setPerBlock(Long perBlock) {
		this.perBlock = perBlock;
	}

	public Long getTotalPage() {
		return totalPage;
	}


	public Long getPage() {
		if(this.page == null || this.page < 1) {
			this.page = 1L;
		}
		return page;
	}

	public void setPage(Long page) {
		this.page = page;
	}

	public Long getStartRow() {
		return startRow;
	}

	public void setStartRow(Long startRow) {
		this.startRow = startRow;
	}

	public Long getLastRow() {
		return lastRow;
	}

	public void setLastRow(Long lastRow) {
		this.lastRow = lastRow;
	}

	public Long getStartNum() {
		return startNum;
	}

	public void setStartNum(Long startNum) {
		this.startNum = startNum;
	}

	public Long getLastNum() {
		return lastNum;
	}

	public void setLastNum(Long lastNum) {
		this.lastNum = lastNum;
	}

	public boolean isBefore() {
		return before;
	}

	public void setBefore(boolean before) {
		this.before = before;
	}

	public boolean isAfter() {
		return after;
	}

	public void setAfter(boolean after) {
		this.after = after;
	}
	
	public void makeRow() {
		this.startRow = (this.getPage()-1)*this.getPerPage()+1;
		this.lastRow = this.getPage()*this.getPerPage();
	}
	
	public void makeNum(Long totalPage) {
		//1. 전체 row의 갯수 구하기
		this.totalPage = this.getPerPage()/this.getPage();
		//2. 총 page의 갯수 구하기
	}
	
	
}
