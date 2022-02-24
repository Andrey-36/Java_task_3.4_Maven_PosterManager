package ru.netology.manager;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.netology.domain.PosterManager;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class CartFilm {
    private int limit = 10;
    private PosterManager[] films = new PosterManager[0];

    public CartFilm(int limit) {
        this.limit = limit;
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

    public PosterManager[] findAll() {
        return films;
    }

    public PosterManager[] findLast() {
        int resultLenght = films.length;
        if (resultLenght > limit) {
            resultLenght = limit;
        }
        PosterManager[] result = new PosterManager[resultLenght];
        // перебираем массив в прямом порядке
        // но кладём в результаты в обратном
        for (int i = 0; i < resultLenght; i++) {         // ячейка в которую будем копировать
            int index = films.length - i - 1;              // ячейка из которой будем копировать
            result[i] = films[index];
        }
        return result;
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

    public void addById(int id) {
        int length = films.length + 1;
        PosterManager[] tmp = new PosterManager[length];
        int index = 0;
        for (PosterManager film : films) {
            if (film.getId() <= id) {
                tmp[index] = film;
                index++;
            }
        }
        films = tmp;
    }
}