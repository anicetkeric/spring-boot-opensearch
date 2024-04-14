package com.bootlabs.opensearch.service;


import com.bootlabs.opensearch.document.Author;

import java.util.List;

public interface AuthorService {

    List<Author> getAll();

    Author add(Author author);

    Author getById(String id);

    Author update(Author author, String id);

    void deleteById(String id);
}
