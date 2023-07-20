package code.collectionWorker.musicBandCollection.baseClasses;

import lombok.*;

@Setter(AccessLevel.PUBLIC)
@Getter(AccessLevel.PUBLIC)
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Studio {
    private String name; //Поле может быть null
}
