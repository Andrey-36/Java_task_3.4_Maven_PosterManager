package ru.netology.repository;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import ru.netology.domain.PosterManager;
import ru.netology.manager.CartManager;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.verify;

class CartRepositoryTest {
private CartRepository repository = Mockito.mock(CartRepository.class);
private CartManager manager = new CartManager(repository);
    private PosterManager first = new PosterManager(1, 1, "filmone", 1);
    private PosterManager second = new PosterManager(2, 2, "filmtwo", 2);
    private PosterManager third = new PosterManager(3, 3, "filmthree", 3);

    @Test
    public void shouldSum() {
        PosterManager[] returned = {first, second, third};
        doReturn(returned).when(repository).findAll();

        int expected = 60;
        int actual = manager.sum();
    assertEquals(expected, actual);
    verify(repository).findAll();
    }

    @Test
    void removeById() {
        PosterManager first = new PosterManager(1, 1, "filmone", 1);
        PosterManager second = new PosterManager(2, 2, "filmtwo", 2);
        PosterManager third = new PosterManager(3, 3, "filmthree", 3);

        CartRepository repo = new CartRepository();
        repo.save(first);
        repo.save(second);
        repo.save(third);

        repo.removeById(3);

        PosterManager[] expected = {first, second};
        PosterManager[] actual = repo.findAll();
        assertArrayEquals(expected, actual);
    }
    @Test
    void findByIdInsideArray() {
        PosterManager first = new PosterManager(1, 1, "filmone", 1);
        PosterManager second = new PosterManager(2, 2, "filmtwo", 2);
        PosterManager third = new PosterManager(3, 3, "filmthree", 3);

        CartRepository repo = new CartRepository();
        repo.save(first);

        repo.findById(1);

        PosterManager[] expected = {first};
        PosterManager[] actual = repo.findAll();
        assertArrayEquals(expected, actual);
    }
   }