package com.study.home;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FreeController {
	
	@Inject
	IFreeBoardService freeBoardService;
	
	@RequestMapping("/freeList.wow")
	public String freeList(Model model) {
		List<FreeBoardVO> freeBoardList = freeBoardService.getBoardList();
		model.addAttribute("freeBoardList",freeBoardList);
		return "freeList";
	}
	
	@RequestMapping("/freeView.wow")
	public String freeView(Model model, @RequestParam(required=true)int boNo) {
		FreeBoardVO freeBoard = freeBoardService.getBoard(boNo);
		model.addAttribute("freeBoard", freeBoard);
		freeBoardService.increaseHit(boNo);
		
		return "freeView";
	}
	
	@RequestMapping("/freeForm.wow")
	public String freeForm() {
		return "freeForm";
	}
	
	@RequestMapping("/freeEdit.wow")
	public String freeEdit(Model model, @RequestParam(required=true)int boNo) {
		FreeBoardVO freeBoard = freeBoardService.getBoard(boNo);
		model.addAttribute("freeBoard", freeBoard);
		
		return "freeEdit";
	}
	
	@PostMapping("/freeRegist.wow")
	public String freeRegist(Model model, FreeBoardVO freeBoard) {
		freeBoardService.registBoard(freeBoard);
		return "redirect:"+"/freeList.wow";
	}
	
	@PostMapping("/freeModify.wow")
	public String freeModify(Model model, FreeBoardVO freeBoard) {
		System.out.println(freeBoard);
		freeBoardService.modifyBoard(freeBoard);
		return "redirect:"+"/freeList.wow";
	}
	
	@RequestMapping("/freeDelete.wow")
	public String freeDelete(Model model, FreeBoardVO freeBoard) {
		freeBoardService.removeBoard(freeBoard);
		return "redirect:"+"/freeList.wow";
	}
	
}
