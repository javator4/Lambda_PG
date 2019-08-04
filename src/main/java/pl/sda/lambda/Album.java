package pl.sda.lambda;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;
@AllArgsConstructor
@Data
public class Album {

    private String name;
    private List<Track> tracks;
    private List<Artist> musicians;
}
