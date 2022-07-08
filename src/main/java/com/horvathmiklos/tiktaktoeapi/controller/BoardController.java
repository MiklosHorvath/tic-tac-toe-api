package com.horvathmiklos.tiktaktoeapi.controller;

import com.horvathmiklos.tiktaktoeapi.service.BoardService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/board")
@AllArgsConstructor
public class BoardController {

    private BoardService boardService;

    @GetMapping()
    public char[][] getNextMove(@RequestParam(defaultValue = "o") char nextPlayerMark, @RequestBody char[][] currentBoard){
        return boardService.calculateNextMove(nextPlayerMark, currentBoard);
    }
}
