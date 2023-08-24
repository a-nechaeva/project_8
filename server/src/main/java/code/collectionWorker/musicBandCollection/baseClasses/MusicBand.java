package code.collectionWorker.musicBandCollection.baseClasses;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * The `MusicBand` class represents a music band, which includes its name, creation date,
 * number of participants, singles count, establishment date, genre and studio.
 *
 */

public class MusicBand implements Serializable, Comparable<MusicBand> {
    @Serial
    @Generated
    private static final long serialVersionUID = 6529685098267757690L;
    private static Long nextID = 1L;

    /**
     * The unique ID of the music band.
     * Generates automatically, can't be null, greater than zero.
     */
    private Long id; //Поле не может быть null, Значение поля должно быть больше 0,
    // Значение этого поля должно быть уникальным, Значение этого поля должно генерироваться автоматически

    /**
     * The name of the music band. Can't be null and an empty sequence.
     */
    private String name; //Поле не может быть null, Строка не может быть пустой

    /**
     * The coordinates of the music band. Can't be null
     *
     * @see Coordinates
     */
    private Coordinates coordinates; //Поле не может быть null

    /**
     * The creation date of the music band. Generates automatically, can't be null.
     */
    private java.time.ZonedDateTime creationDate; //Поле не может быть null, Значение этого поля должно генерироваться автоматически

    /**
     * The number of participants won by the music band. Not negative.
     */
    private int numberOfParticipants; //Значение поля должно быть больше 0

    /**
     * The number of singles. Not negative.
     */
    private Integer singlesCount; //Поле может быть null, Значение поля должно быть больше 0

    /**
     * The date of establishment.
     */
    private LocalDate establishmentDate; //Поле может быть null

    /**
     * The genre of the music.
     *
     * @see MusicGenre
     */
    private MusicGenre genre; //Поле может быть null

    /**
     * The studio of the music band. The field can't be null.
     *
     * @see Studio
     */
    private Studio studio; //Поле может быть null



    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    public Coordinates getCoordinates() {
        return this.coordinates;
    }

    /**
     * Used to set the number of participants of the music band.
     *
     * @see MusicBand#numberOfParticipants
     */
    public void setNumberOfParticipants(int numberOfParticipants) {
        this.numberOfParticipants = numberOfParticipants;
    }

    public int getNumberOfParticipants() {
        return this.numberOfParticipants;
    }

    public void setSinglesCount(Integer singlesCount) {
        this.singlesCount = singlesCount;
    }

    public Integer getSinglesCount() {
        return this.singlesCount;
    }

    public void setEstablishmentDate(LocalDate establishmentDate) {
        this.establishmentDate = establishmentDate;
    }

    public LocalDate getEstablishmentDate() {
        return this.establishmentDate;
    }

    public void setGenre(MusicGenre genre) {
        this.genre = genre;
    }

    public MusicGenre getGenre() {
        return this.genre;
    }

    public void setStudio(Studio studio) {
        this.studio = studio;
    }

    public Studio getStudio() {
        return this.studio;
    }

    @Override
    public String toString() {
        String establishmentDate = new java.text.SimpleDateFormat("dd.MM.yyyy").format(this.establishmentDate);
        return id + "\n"
                + "Name of the music band: " + name + ",\n"
                + "Coordinates of the music band: " + coordinates + ",\n"
                + "Creation date: " + creationDate.format(DateTimeFormatter.ofPattern("dd.MM.yyyy")) + ",\n"
                + "Number of participants: " + numberOfParticipants + ",\n"
                + "Singles count: " + singlesCount + ",\n"
                + "Establishment date: " + establishmentDate + ",\n"
                + "Music genre: " + genre + ",\n"
                + "Studio: " + studio;
    }

    public String toString(String userName) {
        return id + (UdpServer.getDatabase().isUserEditor(userName, Math.toIntExact(id)) ? Color.GREEN
                + " you can modify this one" + Color.RESET : "") + "\n"
                + "Name of the music band: " + name + ",\n"
                + "Coordinates of the music band: " + coordinates + ",\n"
                + "Creation date: " + creationDate.format(DateTimeFormatter.ofPattern("dd.MM.yyyy")) + ",\n"
                + "Number of participants: " + numberOfParticipants + ",\n"
                + "Singles count: " + singlesCount + ",\n"
                + "Establishment date: " + establishmentDate + ",\n"
                + "Music genre: " + genre + ",\n"
                + "Studio: " + studio;
    }

    /**
     * Used see if two music bands are the same.
     */
    public boolean equals(MusicBand musicBand) {
        return coordinates.equals(musicBand.getCoordinates()) && name.equals(musicBand.getName()) &&
                numberOfParticipants == musicBand.getNumberOfParticipants() && genre == musicBand.getGenre() &&
                studio.equals(musicBand.getStudio());
    }

    /**
     * Used to compare music bands.
     */
    @Override
    public int compareTo(MusicBand musicBand) {
        return  (int) (this.getSinglesCount() - musicBand.getSinglesCount());
    }

}
