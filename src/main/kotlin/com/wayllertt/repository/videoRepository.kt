package com.wayllertt.repository;

import com.wayllertt.entity.video;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface videoRepository : JpaRepository<video, Long>