package com.lee.elasticsearchdemo.controller;

import com.lee.elasticsearchdemo.dao.EsBookRepository;
import com.lee.elasticsearchdemo.model.Book;
import com.lee.elasticsearchdemo.service.EsQueryService;
import lombok.RequiredArgsConstructor;
import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by hehai on 2021/7/14
 */
@RestController
@RequiredArgsConstructor
public class BookController {

    private final EsBookRepository esBookRepository;

    private final RestHighLevelClient restHighLevelClient;

    private final EsQueryService esQueryService;

    @PostMapping("/book")

    public Map<String, String> addBook(@RequestBody Book book) {
        esBookRepository.save(book);
        Map<String, String> map = new HashMap<>();
        map.put("msg", "ok");
        return map;
    }

    @GetMapping("/book/search")
    public Book search(String key) {
        return esBookRepository.findById("4").get();
    }

    @GetMapping("/book/more")
    public void searchMore() throws IOException {
        esQueryService.moreLikeThis();
    }
}