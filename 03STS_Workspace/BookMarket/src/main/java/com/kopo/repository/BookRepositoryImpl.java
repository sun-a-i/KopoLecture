package com.kopo.repository;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Repository;

import com.kopo.domain.Book;

@Repository
public class BookRepositoryImpl implements BookRepository {
	private List<Book> listOfBooks = new ArrayList<Book>();
	
	public BookRepositoryImpl() {
		Book book1 = new Book("book1", "�옱誘몄엳�뒗 梨�", 17100);
		book1.setAuthor("釉붾옉移�");
		book1.setDescription("吏꾩쭨 �옱誘몄엳�뒗 梨�, 吏꾩쭨 �옱誘몄엳�뒗 梨�, 吏꾩쭨 �옱誘몄엳�뒗 梨�, 吏꾩쭨 �옱誘몄엳�뒗 梨�, ");
		book1.setPublisher("�씠吏��뒪�띁釉붾━�떛");
		book1.setCategory("IT�쟾臾몄꽌");
		book1.setUnitsInStock(1000);
		book1.setReleaseDate("2023/07/15");
		
		Book book2 = new Book("book2", "�옱誘몄뾾�뒗 梨�", 16500);
		book2.setAuthor("理쒖��떇");
		book2.setDescription("吏꾩쭨 �옱誘몄뾾�뒗 梨�, 吏꾩쭨 �옱誘몄뾾�뒗 梨�, 吏꾩쭨 �옱誘몄뾾�뒗 梨�, 吏꾩쭨 �옱誘몄뾾�뒗 梨�, 吏꾩쭨 �옱誘몄뾾�뒗 梨�, ");
		book2.setPublisher("�씠吏��뒪�띁釉붾━�떛2");
		book2.setCategory("IT�쟾臾몄꽌2");
		book2.setUnitsInStock(600);
		book2.setReleaseDate("2023/06/14");
		
		Book book3 = new Book("book3", "議곗슜�븘 議곗슜�엳�뻼", 28000);
		book3.setAuthor("�븘�씠�쑀");
		book3.setDescription("�뼱姨뚮떎 留덉＜移� 洹몃� �늿鍮쏆뿉 �궡 媛��뒾�� ..........");
		book3.setPublisher("�씠吏��뒪�띁釉붾━�떛2");
		book3.setCategory("IT�쟾臾몄꽌2");
		book3.setUnitsInStock(511);
		book3.setReleaseDate("2023/05/31");
		
		listOfBooks.add(book1);
		listOfBooks.add(book2);
		listOfBooks.add(book3);
	}
	
	@Override
	public List<Book> getAllBookList() {
		// TODO Auto-generated method stub
		return listOfBooks;
	}

	@Override
	public List<Book> getBookListByCategory(String category) {
		List<Book> booksByCategory = new ArrayList<Book>();
		for(int i =0; i < listOfBooks.size(); i++) {
			Book book = listOfBooks.get(i);
			System.out.println("cate : "+book.getCategory());
			if (category.equalsIgnoreCase(book.getCategory()))
				booksByCategory.add(book);
		}
		
		return booksByCategory;
	}
	
	//localhost:8080/controller/books/filter/bookFilter;publisher=;category=IT
	@Override
	public Set<Book> getBookListByFilter(Map<String, List<String>> filter) {
		//category & publisher
		Set<Book> booksByPublisher = new HashSet<Book>();
		Set<Book> booksByCategory = new HashSet<Book>();
		
		Set<String> booksByFilter = filter.keySet();
		
		if(booksByFilter.contains("publisher")) {
			for(int j = 0; j < filter.get("publisher").size(); j++) {
				String publisherName = filter.get("publisher").get(j);
				for (int i = 0; i < listOfBooks.size(); i++) {
					Book book = listOfBooks.get(i);
					System.out.println("pub : "+book.getPublisher());
					if(publisherName.equalsIgnoreCase(book.getPublisher()))
						booksByPublisher.add(book);
				}
			}
		}
		if(booksByFilter.contains("category")) {
			for(int i=0; i < filter.get("category").size(); i++) {
				String category = filter.get("category").get(i);
				List<Book> list = getBookListByCategory(category);
				booksByCategory.addAll(list);
			}
		}
		booksByCategory.retainAll(booksByPublisher);
		return booksByCategory;
	}

	@Override
	public Book getBookById(String bookId) {
		Book bookInfo = null;
		for(int i=0; i < listOfBooks.size(); i++) {
			Book book = listOfBooks.get(i);
			if(book != null && book.getBookId() != null && book.getBookId().equals(bookId)) {
				bookInfo = book;
				break;
			}
		}
		if(bookInfo == null)
			throw new IllegalArgumentException("�룄�꽌�쓽 ID瑜� 李얠쓣 �닔媛� �뾾�뒿�땲�떎 : " + bookId);
		
		return bookInfo;
	}

	@Override
	public void setNewBook(Book book) {
		listOfBooks.add(book);
	}

}











