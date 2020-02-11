package com.example.adminpanel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.adminpanel.domain.Article;

@Repository
public interface ArticleRepository extends JpaRepository<Article, Integer>{

}
