package com.demo.application.service.impl;

import com.demo.application.converter.CodeSnippetConverter;
import com.demo.application.domain.CodeSnippet;
import com.demo.application.dto.codesnippet.CodeSnippetModel;
import com.demo.application.dto.codesnippet.CreateCodeSnippetModel;
import com.demo.application.dto.codesnippet.QueryCodeSnippetModel;
import com.demo.application.dto.codesnippet.UpdateCodeSnippetModel;
import com.demo.application.repository.CodeSnippetRepository;
import com.demo.application.service.CodeSnippetService;
import com.demo.common.cache.Cache;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class CodeSnippetServiceImpl implements CodeSnippetService {

    private final Cache cache;
    private final CodeSnippetRepository codeSnippetRepository;

    @Override
    public CodeSnippetModel addCodeSnippet(CreateCodeSnippetModel createCodeSnippetModel) {
        return CodeSnippetConverter.convert(new CodeSnippet());
    }

    @Override
    public CodeSnippetModel updateCodeSnippet(UpdateCodeSnippetModel updateCodeSnippetModel) {
        return null;
    }

    @Override
    public List<CodeSnippetModel> findCodeSnippets(QueryCodeSnippetModel queryCodeSnippetModel) {
        return List.of();
    }
}
