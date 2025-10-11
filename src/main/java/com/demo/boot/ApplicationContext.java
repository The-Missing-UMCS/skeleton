package com.demo.boot;

import com.demo.application.repository.CodeSnippetRepository;
import com.demo.application.service.CodeSnippetService;
import com.demo.application.service.impl.CodeSnippetServiceImpl;
import com.demo.common.cache.Cache;
import com.demo.common.cache.CacheImpl;
import com.demo.interaction.AppRunner;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.Map;

@NoArgsConstructor(access = AccessLevel.NONE)
public final class ApplicationContext {

    private static final Cache CACHE = new CacheImpl();

    private static final CodeSnippetRepository CODE_SNIPPET_REPOSITORY = null;
    private static final CodeSnippetService CODE_SNIPPET_SERVICE = null;

    public static final AppRunner APP_RUNNER = null;

    private static final Map<Class<?>, Object> MAP = Map.of(
        CodeSnippetRepository.class, CODE_SNIPPET_REPOSITORY,
        CodeSnippetService.class, CODE_SNIPPET_SERVICE,
        AppRunner.class, APP_RUNNER
    );

    @SuppressWarnings("unchecked")
    public static <T> T get(Class<T> clazz) {
        return (T) MAP.get(clazz);
    }

}
