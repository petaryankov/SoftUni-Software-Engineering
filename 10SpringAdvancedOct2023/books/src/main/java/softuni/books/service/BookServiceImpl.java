package softuni.books.service;

import org.springframework.stereotype.Service;
import softuni.books.model.dto.AuthorDTO;
import softuni.books.model.dto.BookDTO;
import softuni.books.model.entity.Author;
import softuni.books.model.entity.Book;
import softuni.books.repository.BookRepository;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    private final BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public List<BookDTO> getAllBooks() {
        return bookRepository
                .findAll()
                .stream()
                .map(BookServiceImpl::mapBookToDTO)
                .toList();
    }

    private static BookDTO mapBookToDTO(Book book) {
        BookDTO aBook = new BookDTO();
        AuthorDTO authorDTO = new AuthorDTO();
        authorDTO.setName(book.getAuthor().getName());

        aBook.setId(book.getId());
        aBook.setTitle(book.getTitle());
        aBook.setIsbn(book.getIsbn());
        aBook.setAuthor(authorDTO);

        return aBook;
    }
}
