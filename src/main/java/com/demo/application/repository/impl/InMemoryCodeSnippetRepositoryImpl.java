package com.demo.application.repository.impl;

import com.demo.application.criteria.CodeSnippetCriteria;
import com.demo.application.domain.CodeSnippet;
import com.demo.application.repository.CodeSnippetRepository;

import java.util.List;
import java.util.Optional;

public class InMemoryCodeSnippetRepositoryImpl implements CodeSnippetRepository {

    @Override
    public List<CodeSnippet> findByCriteria(CodeSnippetCriteria codeSnippetCriteria) {
        return List.of();
    }

    @Override
    public CodeSnippet save(CodeSnippet codeSnippet) {
        return null;
    }

    @Override
    public Optional<CodeSnippet> findById(String id) {
        return Optional.empty();
    }

    @Override
    public List<CodeSnippet> findAll() {
        return List.of();
    }

    @Override
    public boolean deleteById(String id) {
        return false;
    }

}
