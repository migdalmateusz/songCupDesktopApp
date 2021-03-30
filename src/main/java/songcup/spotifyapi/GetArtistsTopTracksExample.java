package songcup.spotifyapi;

import com.neovisionaries.i18n.CountryCode;
import com.wrapper.spotify.SpotifyApi;
import com.wrapper.spotify.exceptions.SpotifyWebApiException;
import com.wrapper.spotify.model_objects.specification.Track;
import com.wrapper.spotify.requests.data.artists.GetArtistsTopTracksRequest;
import org.apache.hc.core5.http.ParseException;
import songcup.userinterface.OpenWindow;

import java.io.IOException;

public class GetArtistsTopTracksExample {
    private static String accessToken = ClientCredentialsExample.clientCredentials_Sync();
    private static String id = OpenWindow.getArtistId();
    private static final CountryCode countryCode = CountryCode.PL;

    public static void setId(String id) {
        GetArtistsTopTracksExample.id = id;
    }

    private static final SpotifyApi spotifyApi = new SpotifyApi.Builder()
            .setAccessToken(accessToken)
            .build();
    private static final GetArtistsTopTracksRequest getArtistsTopTracksRequest = spotifyApi
            .getArtistsTopTracks(id, countryCode)
            .build();

    public static Track[] getArtistsTopTracks_Sync() {
        Track[] tracks = null;
        try {
            tracks = getArtistsTopTracksRequest.execute();

        } catch (IOException | SpotifyWebApiException | ParseException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return tracks;
    }
}
