package ru.netology.manager;


import ru.netology.domain.PosterManager;
import ru.netology.repository.CartRepository;

public class CartManager {
    private CartRepository repository;

    public CartManager(CartRepository repository) {
        this.repository = repository;
    }

    public int sum() {
        int result = 0;
        for (PosterManager film : repository.findAll()) {
            result = result + 10 * film.getCount();
        }
        return result;
    }
}

