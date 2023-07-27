package com.kopo.controller;

import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.MatrixVariable;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.kopo.domain.Book;
import com.kopo.service.BookService;

@Controller
@RequestMapping("/books")
public class BookController {
	@Autowired
	private BookService bookService;
	
	//@RequestMapping(value = "/books", method = RequestMethod.GET)
	//@RequestMapping
	@GetMapping
	public String requestMethod(Model model) {
		List<Book> list = bookService.getAllBookList();
		model.addAttribute("bookList", list);
		return "books";
	}
	
	//@RequestMapping("/all")
//	@GetMapping("/all") //-> mav 占쏙옙占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙
//	public String requestAllBooks(Model model) {
//		List<Book> list = bookService.getAllBookList();
//		model.addAttribute("bookList", list);
//		return "books";
//	}
	
	@GetMapping("/all")
	public ModelAndView requestAllBooks() {
		ModelAndView modelAndView = new ModelAndView();
		List<Book> list = bookService.getAllBookList();
		modelAndView.addObject("bookList", list);
		modelAndView.setViewName("books");
		return modelAndView;
	}
	
	
	/*
	@GetMapping("/exam08/{category}/publisher/{publisher}")
	public String requestMethod(@PathVariable String category, <- 占싼억옙占� 占쏙옙觀占쏙옙占� 활占쏙옙
	*/
	@GetMapping("/{category}")
	public String requestBooksByCategory(@PathVariable("category") String bookCategory
										, Model model) {
		List<Book> booksByCategory = bookService.getBookListByCategory(bookCategory);
		model.addAttribute("bookList", booksByCategory);
		return "books";
	}
	
	
	//EX) http://localhost:8082/controller/books/filter/bookFilter;publisher=�씠吏��뒪�띁釉붾━�떛;category=IT�쟾臾몄꽌
	@GetMapping("/filter/{bookFilter}")
	public String requestBooksByFilter(
			@MatrixVariable(pathVar="bookFilter") Map<String, List<String>> bookFilter,
			Model model) {
		Set<Book> booksByFilter = bookService.getBookListByFilter(bookFilter);
		model.addAttribute("bookList", booksByFilter);
		return "books";
	}
	
	@GetMapping("/book")
	public String requestBookById(@RequestParam("id") String bookId, Model model) {
		Book bookById = bookService.getBookById(bookId);
		model.addAttribute("book", bookById);
		return "book";
	}
	
	@GetMapping("/add")
	//public String requestAddBookForm(Book book) {
	public String requestAddBookForm(@ModelAttribute("NewBook") Book book) {
		/*
		 * �삳꽕鍮꾧쾶�씠�뀡諛�, jumbotron, footer �쟻�슜�븳 jsp �럹�씠吏� 留뚮뱾湲�
		 * bookId
		 * name
		 * unitPrice
		 * author
		 * description <- textarea
		 * publisher
		 * category
		 * unitInStock
		 * releaseDate
		 * condition <- radioButton
		 * 
		 * */
		return "addBook";
	}
	
	@PostMapping("/add")
	public String submitAddNewBook(@ModelAttribute("NewBook") Book book) {
		MultipartFile bookImage = book.getBookImage();
		
		String saveName = bookImage.getOriginalFilename();
		File saveFile = new File("C:\\upload", saveName);
		
		if(bookImage != null && !bookImage.isEmpty()) {
			try {
				bookImage.transferTo(saveFile);
			}catch (Exception e) {
				throw new RuntimeException("이미지 업로드에 실패하였습니다.", e);
			}
		}
		
		bookService.setNewBook(book);
		return "redirect:/books"; //酉� 由щ떎�씠�젆�뀡 - �쎒 �슂泥��뿉 �뵲�씪�꽌 酉고럹�씠吏� �씠�룞		
	}
	
	@ModelAttribute
	public void addAttribute(Model model) {
		model.addAttribute("addTitle", "�떊洹� �룄�꽌 �벑濡�");
	}
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		binder.setAllowedFields("bookId", "name","unitPrice","author"
				,"description", "publisher", "category", "unitsInStock"
				,"releaseDate","condition", "bookImage");
	}
	
	
	
	
	
	
	
}
