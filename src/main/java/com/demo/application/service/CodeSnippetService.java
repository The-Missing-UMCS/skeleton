package com.demo.application.service;

import com.demo.application.dto.codesnippet.CodeSnippetModel;
import com.demo.application.dto.codesnippet.CreateCodeSnippetModel;
import com.demo.application.dto.codesnippet.QueryCodeSnippetModel;
import com.demo.application.dto.codesnippet.UpdateCodeSnippetModel;

import java.util.List;

import java.util.List;

/**
 * Service interface for managing code snippets within the system.
 * <p>
 * Provides operations to create, update, and query code snippets.
 * Implementations of this interface should handle business logic such as validation,
 * persistence, and filtering of code snippets.
 */
public interface CodeSnippetService {

    /**
     * Creates and stores a new code snippet based on the provided details.
     *
     * @param createCodeSnippetModel the model containing information required to create a code snippet;
     *                               must not be {@code null}
     * @return the created {@link CodeSnippetModel} containing persisted snippet information
     * @throws IllegalArgumentException if the input model is invalid or contains missing fields
     */
    CodeSnippetModel addCodeSnippet(CreateCodeSnippetModel createCodeSnippetModel);

    /**
     * Updates an existing code snippet with the provided details.
     *
     * @param updateCodeSnippetModel the model containing updated code snippet information;
     *                               must not be {@code null}
     * @return the updated {@link CodeSnippetModel} reflecting the latest persisted state
     * @throws IllegalArgumentException if the input model is invalid or the target snippet does not exist
     */
    CodeSnippetModel updateCodeSnippet(UpdateCodeSnippetModel updateCodeSnippetModel);

    /**
     * Retrieves a list of code snippets that match the specified query criteria.
     *
     * @param queryCodeSnippetModel the model defining search filters
     * @return a list of {@link CodeSnippetModel} objects matching the query;
     *         never {@code null}, but may be empty if no snippets are found
     */
    List<CodeSnippetModel> findCodeSnippets(QueryCodeSnippetModel queryCodeSnippetModel);
}

