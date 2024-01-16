package com.yfass.board.post.infra;


import com.yfass.board.post.service.port.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@RequiredArgsConstructor
@Repository
public class PostRepositoryImpl implements PostRepository {
    private final PostJpaRepository postJpaRepository;
}
