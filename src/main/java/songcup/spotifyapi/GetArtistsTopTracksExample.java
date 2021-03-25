package songcup.spotifyapi;

import com.neovisionaries.i18n.CountryCode;
import com.wrapper.spotify.SpotifyApi;
import com.wrapper.spotify.exceptions.SpotifyWebApiException;
import com.wrapper.spotify.model_objects.specification.Track;
import com.wrapper.spotify.requests.data.artists.GetArtistsTopTracksRequest;
import org.apache.hc.core5.http.ParseException;

import java.io.IOException;

public class GetArtistsTopTracksExample {
    private static final String accessToken = "BQDPshAg1M18q0hKp25IjfUnOWwndntAd6noGJ-r1QDHIGW8uinD-C64xyJv8KnDuGbUJLbrvhLdntjgQPDqXr2AvbhTXeDPUW4qYfnikYNs_O3hjJ1iRo2Tfy3Jkb4-_OHQe5T5a8DUO0RXGVJIK8QN";
    private static final String id = "0oSGxfWSnnOXhD2fKuz2Gy";
    private static final CountryCode countryCode = CountryCode.PL;

    private static final SpotifyApi spotifyApi = new SpotifyApi.Builder()
            .setAccessToken(accessToken)
            .build();
    private static final GetArtistsTopTracksRequest getArtistsTopTracksRequest = spotifyApi
            .getArtistsTopTracks(id, countryCode)
            .build();

    public static void getArtistsTopTracks_Sync() {
        try {
            final Track[] tracks = getArtistsTopTracksRequest.execute();

            System.out.println("Length: " + tracks.length);
        } catch (IOException | SpotifyWebApiException | ParseException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        getArtistsTopTracks_Sync();
    }
}
