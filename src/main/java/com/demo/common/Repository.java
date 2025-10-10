package com.demo.common;

import java.util.List;
import java.util.Optional;

/**
 * Defines a generic repository interface for performing basic CRUD (Create, Read, Update, Delete)
 * operations on entities.
 *
 * @param <T>  the type of entity managed by this repository
 * @param <ID> the type of the entity's identifier
 */
public interface Repository<T, ID> {

    /**
     * Saves the given entity to the underlying data store.
     * <p>
     * If the entity already exists, this operation may update the existing record;
     * otherwise, a new record will be created.
     *
     * @param t the entity to save; must not be {@code null}
     * @return the persisted entity instance, potentially with updated state (e.g., generated ID)
     */
    T save(T t);

    /**
     * Retrieves an entity by its unique identifier.
     *
     * @param id the identifier of the entity to retrieve; must not be {@code null}
     * @return an {@link Optional} containing the entity if found, or an empty {@link Optional} if not found
     */
    Optional<T> findById(ID id);

    /**
     * Retrieves all entities managed by this repository.
     *
     * @return a {@link List} of all entities; never {@code null}, but may be empty
     */
    List<T> findAll();

    /**
     * Deletes the entity associated with the given identifier.
     *
     * @param id the identifier of the entity to delete; must not be {@code null}
     * @return {@code true} if the entity was found and deleted; {@code false} otherwise
     */
    boolean deleteById(ID id);
}
