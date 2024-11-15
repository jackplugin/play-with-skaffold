package org.jack.skaffold.skaffolddemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {
    @GetMapping("/books")
    public List<Book> getAll() {
        return List.of(new Book("Easy books", "123456789"), new Book("K8S in Action", "1234567889"));
    }
}
