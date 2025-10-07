package com.demo.boot;

import com.demo.sample.repository.SampleRepository;
import com.demo.sample.service.SampleService;
import com.demo.sample.service.SampleServiceImpl;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.Map;

@NoArgsConstructor(access = AccessLevel.NONE)
public final class ApplicationContext {

    private static final SampleRepository SAMPLE_REPOSITORY = new SampleRepository();
    private static final SampleService SAMPLE_SERVICE = new SampleServiceImpl(SAMPLE_REPOSITORY);

    private static final Map<Class<?>, Object> MAP = Map.of(
        SampleRepository.class, SAMPLE_REPOSITORY,
        SampleService.class, SAMPLE_SERVICE
    );

    @SuppressWarnings("unchecked")
    public static <T> T get(Class<T> clazz) {
        return (T) MAP.get(clazz);
    }

}
