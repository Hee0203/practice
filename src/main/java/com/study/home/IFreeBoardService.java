package com.study.home;

import java.util.List;

public interface IFreeBoardService {
	public List<FreeBoardVO> getBoardList();
	public FreeBoardVO getBoard(int boNo);
	public void increaseHit(int boNo);
	public void modifyBoard(FreeBoardVO freeBoard);
	public void removeBoard(FreeBoardVO freeBoard);
	public void registBoard(FreeBoardVO freeBoard);
}
