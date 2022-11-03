package com.sinbangsa.controller;


import com.sinbangsa.data.dto.ArticleDto;
import com.sinbangsa.service.ArticleService;
import com.sinbangsa.service.UserService;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.nio.charset.Charset;

@RestController
@RequestMapping("/community")
@RequiredArgsConstructor
public class ArticleController {

    private final Logger LOGGER = LoggerFactory.getLogger(UserService.class);

    private static final String SUCCESS = "success";

    private static final String FAIL = "fail";

    private final ArticleService articleService;

    @PostMapping
    public ResponseEntity<String> createArticle(@RequestBody ArticleDto articleDto) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(new MediaType("application", "json", Charset.forName("UTF-8")));

        boolean result = articleService.createArticle(articleDto);
        if (!result) {


            return new ResponseEntity<>("게시글 작성 실패", headers, HttpStatus.BAD_REQUEST);
        }


        return new ResponseEntity<>("게시글 작성 성공", headers, HttpStatus.CREATED);
    }

}
