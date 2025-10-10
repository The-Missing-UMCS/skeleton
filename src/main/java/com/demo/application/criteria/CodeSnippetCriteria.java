package com.demo.application.criteria;

import com.demo.application.domain.CodeSnippet;

public class CodeSnippetCriteria implements Criteria<CodeSnippet> {

    @Override
    public boolean test(CodeSnippet object) {
        return false;
    }
}
