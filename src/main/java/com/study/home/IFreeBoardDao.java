package com.study.home;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IFreeBoardDao {
	public List<FreeBoardVO> getBoardList();
	
	public FreeBoardVO getBoard(int boNo);
	public int increaseHit(int boNo);
	public int updateBoard(FreeBoardVO board);
	public int deleteBoard(FreeBoardVO board);
	public int insertBoard(FreeBoardVO board);
	
	
}
