package com.a508.studyservice.service;

import com.a508.studyservice.dto.response.EssayResponse;
import com.a508.studyservice.repository.TopicRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly =true)
@RequiredArgsConstructor
public class TopicProblemServiceImpl  implements  TopicProblemService{
    private final TopicRepository topicRepository;

    @Override
    public List<EssayResponse> getEssayProblem(String token) {
        return null;
    }
}
