package com.study.home;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.study.home.IFreeBoardDao;

@Service
public class FreeBoardServiceImpl implements IFreeBoardService{
	
	@Inject
	IFreeBoardDao freeBoardDao;
	
	@Override
	public List<FreeBoardVO> getBoardList(){
		return freeBoardDao.getBoardList();
	}
	
	@Override
	public FreeBoardVO getBoard(int boNo) {
		return freeBoardDao.getBoard(boNo);
	}
	
	@Override
	public void increaseHit(int boNo) {
		freeBoardDao.increaseHit(boNo);
	}
	
	@Override
	public void modifyBoard(FreeBoardVO freeBoard) {
		freeBoardDao.updateBoard(freeBoard);
	}
	
	@Override
	public void removeBoard(FreeBoardVO freeBoard) {
		freeBoardDao.deleteBoard(freeBoard);
	}
	
	@Override
	public void registBoard(FreeBoardVO freeBoard) {
		freeBoardDao.insertBoard(freeBoard);
	}
	
}
