package com.weis.demo.service;

import com.weis.demo.dto.AppointExecution;
import com.weis.demo.entity.Book;

import java.util.List;

/**
 * Created by jiangwei on 08/08/2017.
 */
public interface BookService {
    /**
     * 查询一本图书
     *
     * @param bookId
     * @return
     */
    Book getById(long bookId);

    /**
     * 查询所有图书
     *
     * @return
     */
    List<Book> getList();

    /**
     * 预约图书
     *
     * @param bookId
     * @param studentId
     * @return
     */
    AppointExecution appoint(long bookId, long studentId);
}
