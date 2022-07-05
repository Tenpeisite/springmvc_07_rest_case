package com.itheima.controller;

import com.itheima.domain.Book;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 朱焕杰
 * @version 1.0
 * @Date 2022/6/27 14:23
 */
@RestController
@RequestMapping("/books")
public class UserController {
     public String save(Book book){
         System.out.println("book save ==>"+book);
         System.out.println("book2 save ==>"+book);
         System.out.println("book3 save ==>"+book);
         return "{'module':'booksave success'}";
     }
}
