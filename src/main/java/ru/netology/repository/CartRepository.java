package ru.netology.repository;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.netology.domain.PosterManager;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class CartRepository {
    private PosterManager[] films = new PosterManager[0];

    public PosterManager[] findAll() {
        return films;
    }

    public void save(PosterManager film) {
        // создать новый массив размером на 1 больше существующего
        int length = films.length + 1;
        PosterManager[] tmp = new PosterManager[length];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        int LastIndex = tmp.length - 1;
        tmp[LastIndex] = film;
        films = tmp;
    }

    public PosterManager findById(int id) {
        for (PosterManager film : films) {
            if (film.getId() == id) {
                return film;
            }
        }
        return null;
    }

    public void removeById(int id) {
        int lenght = films.length - 1;
        PosterManager[] tmp = new PosterManager[lenght];
        int index = 0;
        for (PosterManager film : films) {
            if (film.getId() != id) {
                tmp[index] = film;
                index++;
            }
        }
        films = tmp;
    }

    public void removeAll() {
        PosterManager film[];
    }
}
