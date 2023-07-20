package code.collectionWorker.musicBandCollection.baseClasses;

import java.io.Serializable;

public class MusicBand implements Serializable, Comparable<MusicBand> {
    private static Long nextID = 1L;
    private Long id; //Поле не может быть null, Значение поля должно быть больше 0, Значение этого поля должно быть уникальным, Значение этого поля должно генерироваться автоматически
    private String name; //Поле не может быть null, Строка не может быть пустой
    private Coordinates coordinates; //Поле не может быть null
    private java.time.ZonedDateTime creationDate; //Поле не может быть null, Значение этого поля должно генерироваться автоматически
    private int numberOfParticipants; //Значение поля должно быть больше 0
    private Integer singlesCount; //Поле может быть null, Значение поля должно быть больше 0
    private java.time.LocalDate establishmentDate; //Поле может быть null
    private MusicGenre genre; //Поле может быть null
    private Studio studio; //Поле может быть null


}
