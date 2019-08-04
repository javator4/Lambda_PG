package pl.sda.lambda;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.List;
@AllArgsConstructor
@Data
public class Artist {

    private String name;

    public Artist(String name, String nationality) {
        this.name = name;
        this.nationality = nationality;
    }

    private List<Artist> members;
    private String nationality;
}
