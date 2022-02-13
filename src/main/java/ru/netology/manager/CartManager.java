package ru.netology.manager;


import ru.netology.domain.PosterManager;
import ru.netology.repository.CartRepository;

public class CartManager {
    private CartRepository repository;

    public CartManager(CartRepository repository) {
        this.repository = repository;
    }

    public void findAll(PosterManager film) {
        repository.findAll();
    }

    public void save(PosterManager film) {
        repository.save(film);
    }

    public void findById(int id) {
        repository.findById(id);
    }

    public void removeById(int id) {
        repository.removeById(id);
    }

    public void removeAll(PosterManager film) {
        repository.removeAll();
    }

    public int sum() {
        int result = 0;
        for (PosterManager film : repository.findAll()) {
            result = result + 10 * film.getCount();
        }
        return result;
    }
}

