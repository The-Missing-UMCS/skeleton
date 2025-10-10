package com.demo.application.repository;

import com.demo.application.criteria.CodeSnippetCriteria;
import com.demo.application.domain.CodeSnippet;
import com.demo.common.Repository;

import java.util.List;

public interface CodeSnippetRepository extends Repository<CodeSnippet, String> {


    List<CodeSnippet> findByCriteria(CodeSnippetCriteria codeSnippetCriteria);
}
