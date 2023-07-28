package com.kopo.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

import com.kopo.domain.Book;

public class BookRowMapper implements RowMapper<Book>{  
    public Book mapRow(ResultSet rs, int rowNum) throws SQLException {
           Book book = new Book();
           book.setBookId(rs.getString(1));
           book.setName(rs.getString(2));
           book.setUnitPrice(rs.getInt(3));
           book.setAuthor(rs.getString(4));
           book.setDescription(rs.getString(5));
           book.setPublisher(rs.getString(6));
           book.setCategory(rs.getString(7));
           book.setUnitsInStock(rs.getLong(8));
           book.setReleaseDate(rs.getString(9));
           book.setCondition(rs.getString(10));
           book.setFileName(rs.getString(11));
           return book;
    }
}  