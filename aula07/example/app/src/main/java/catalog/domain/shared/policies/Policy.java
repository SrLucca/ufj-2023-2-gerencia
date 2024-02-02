package catalog.domain.shared.policies;

public interface Policy<T> {
    void validate(T entity);
}
