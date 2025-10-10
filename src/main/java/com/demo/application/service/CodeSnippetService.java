package com.demo.application.service;

import com.demo.application.dto.codesnippet.CodeSnippetModel;
import com.demo.application.dto.codesnippet.CreateCodeSnippetModel;
import com.demo.application.dto.codesnippet.QueryCodeSnippetModel;
import com.demo.application.dto.codesnippet.UpdateCodeSnippetModel;

import java.util.List;

public interface CodeSnippetService {

    CodeSnippetModel addCodeSnippet(CreateCodeSnippetModel createCodeSnippetModel);

    CodeSnippetModel updateCodeSnippet(UpdateCodeSnippetModel updateCodeSnippetModel);

    List<CodeSnippetModel> findCodeSnippets(QueryCodeSnippetModel queryCodeSnippetModel);
}
