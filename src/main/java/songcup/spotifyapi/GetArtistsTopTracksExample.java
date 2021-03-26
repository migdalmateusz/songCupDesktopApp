package songcup.spotifyapi;

import com.neovisionaries.i18n.CountryCode;
import com.wrapper.spotify.SpotifyApi;
import com.wrapper.spotify.exceptions.SpotifyWebApiException;
import com.wrapper.spotify.model_objects.specification.Track;
import com.wrapper.spotify.requests.data.artists.GetArtistsTopTracksRequest;
import org.apache.hc.core5.http.ParseException;

import java.io.IOException;

public class GetArtistsTopTracksExample {
    private static final String accessToken = "BQBGqzoKJ10T4MndxcD_ym0Po9bA2_w5nyIaNztCHyjcjI-4KoQKadXyzOBCIUd6OmfUuVAjnLgspg1BTi_PnZJOB__yrYN42evA_Y8zHCqhDt-DzUImDeU104YlkwioPYL60NBTzkTNVyIunUBc-zjiZjRc-_oTuzI";
    private static final String id = "0oSGxfWSnnOXhD2fKuz2Gy";
    private static final CountryCode countryCode = CountryCode.PL;

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

    public static void main(String[] args) {
        Track [] tracks = getArtistsTopTracks_Sync();
        for (Track track : tracks) {
            System.out.println(track);
        }
    }
}
