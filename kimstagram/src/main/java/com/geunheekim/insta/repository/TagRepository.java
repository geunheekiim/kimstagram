package com.geunheekim.insta.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.geunheekim.insta.model.Tag;

public interface TagRepository extends JpaRepository<Tag, Integer> {

}
