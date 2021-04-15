package pl.edu.pwsztar.domain.dto;

import java.io.Serializable;

public class MovieDto implements Serializable {

    private Long movieId;
    private String title;
    private String image;
    private Integer year;


    private MovieDto(Builder builder) {
        title = builder.title;
        image = builder.image;
        year = builder.year;
        movieId = builder.movieId;
    }

    public MovieDto() {
    }

    public Long getMovieId() {
        return movieId;
    }

    public String getTitle() {
        return title;
    }

    public String getImage() {
        return image;
    }

    public Integer getYear() {
        return year;
    }






    public static final class Builder {
        private String title;
        private String image;
        private Integer year;
        private Long movieId;


        public Builder() {
        }

        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public Builder image(String image) {
            this.image = image;
            return this;
        }

        public Builder year(Integer year) {
            this.year = year;
            return this;
        }

        public Builder movieId(Long movieId) {
            this.movieId = movieId;
            return this;
        }

        public MovieDto build() {
            return new MovieDto(this);
        }

    }
}
