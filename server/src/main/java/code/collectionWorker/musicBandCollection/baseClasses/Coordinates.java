package code.collectionWorker.musicBandCollection.baseClasses;


import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString(includeFieldNames = true)
public class Coordinates {
    private Float x; //Значение поля должно быть больше -97, Поле не может быть null
    private Double y; //Значение поля должно быть больше -480, Поле не может быть null
}
