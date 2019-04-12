package com.baizhi.controller;

import com.baizhi.entity.Book;
import com.baizhi.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("book")
public class BookController {
    @Autowired
    private BookService bookService;
    @RequestMapping("queryAll")
    @ResponseBody
    public List<Book> queryAll(){
        List<Book> books = bookService.selectAll();
        return books;
    }
}
