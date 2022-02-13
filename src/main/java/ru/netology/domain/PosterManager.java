package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class PosterManager {
    private int id;
    private int filmId;
    private String filmName;
    private int count; //количество
}
