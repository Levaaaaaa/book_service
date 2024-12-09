package com.example.books_service.core.service.library.delete;

import com.example.books_service.core.dto.library.request.IsbnRequest;
import com.example.books_service.core.dto.library.response.CommonResponse;
import com.example.books_service.core.model.repos.BookRepository;
import com.example.books_service.core.service.library.find.FindBookByIsbnService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
class DeleteBookByIsbnServiceImpl implements DeleteBookByIsbnService {
    @Autowired
    private FindBookByIsbnService findBookService;


    @Autowired
    private BookRepository repository;

    @Override
    public CommonResponse deleteBook(IsbnRequest request) {
        CommonResponse response = findBookService.findByIsbn(request);
        if (!response.getErrors().isEmpty()) {
            return response;
        }

        repository.deleteByIsbn(request.getIsbn());
        return response;
    }
}
