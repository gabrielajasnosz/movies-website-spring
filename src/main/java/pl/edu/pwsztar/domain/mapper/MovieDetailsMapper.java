package pl.edu.pwsztar.domain.mapper;

import org.springframework.stereotype.Component;
import pl.edu.pwsztar.domain.dto.DetailsMovieDto;
import pl.edu.pwsztar.domain.entity.Movie;

@Component
public class MovieDetailsMapper implements Converter <DetailsMovieDto,Movie> {

    @Override
    public DetailsMovieDto convert(Movie movie) {
        DetailsMovieDto detailsMovieDto = new DetailsMovieDto.Builder().videoId(movie.getVideoId()).title(movie.getTitle()).image(movie.getImage()).year(movie.getYear()).build();


        return detailsMovieDto;
    }



}
