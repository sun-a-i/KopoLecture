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
		Book book1 = new Book("ISBN1234", "재미있는 책", 17100);
		book1.setAuthor("블랑카");
		book1.setDescription("진짜 재미있는 책, 진짜 재미있는 책, 진짜 재미있는 책, 진짜 재미있는 책, ");
		book1.setPublisher("이지스퍼블리싱");
		book1.setCategory("IT전문서");
		book1.setUnitsInStock(1000);
		book1.setReleaseDate("2023/07/15");
		
		Book book2 = new Book("ISBN1235", "재미없는 책", 16500);
		book2.setAuthor("최준식");
		book2.setDescription("진짜 재미없는 책, 진짜 재미없는 책, 진짜 재미없는 책, 진짜 재미없는 책, 진짜 재미없는 책, ");
		book2.setPublisher("이지스퍼블리싱2");
		book2.setCategory("IT전문서2");
		book2.setUnitsInStock(600);
		book2.setReleaseDate("2023/06/14");
		
		Book book3 = new Book("ISBN12396", "조용필 조용히햇", 28000);
		book3.setAuthor("아이유");
		book3.setDescription("어쩌다 마주친 그대 눈빛에 내 가슴은 ..........");
		book3.setPublisher("이지스퍼블리싱2");
		book3.setCategory("IT전문서2");
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
			throw new IllegalArgumentException("도서의 ID를 찾을 수가 없습니다 : " + bookId);
		
		return bookInfo;
	}

	@Override
	public void setNewBook(Book book) {
		listOfBooks.add(book);
	}

}











