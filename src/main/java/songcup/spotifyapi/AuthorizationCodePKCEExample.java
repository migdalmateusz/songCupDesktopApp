package songcup.spotifyapi;

import com.wrapper.spotify.SpotifyApi;
import com.wrapper.spotify.SpotifyHttpManager;
import com.wrapper.spotify.exceptions.SpotifyWebApiException;
import com.wrapper.spotify.model_objects.credentials.AuthorizationCodeCredentials;
import com.wrapper.spotify.requests.authorization.authorization_code.pkce.AuthorizationCodePKCERequest;
import org.apache.hc.core5.http.ParseException;

import java.io.IOException;
import java.net.URI;

public class AuthorizationCodePKCEExample {
    private static final String clientId = "d483a7a819dd4b729196977cf28b8002";
    private static final URI redirectUri = SpotifyHttpManager.makeUri("http://localhost:8080/login");
    private static final String code = "AQCNzI1EnuZRIf_bWPygmem7HtefSGfVvQUNFgsP7PRfWaaEMehIU9eQhFkOO7BYOyirbpcnF600k_fL12s1MI8RBAK8hm7E_1lYmjc1Mvz_zWwjT90LH9ZoizXhnUT5dy0HtVTzvY7Dhr7VEScZMMf4GkXaU4Kbnb6LyWlVfYCroTie9Qe1AxahtKzdBXg3q03lCoNennHyhlSimk99UES-IJLsu9FWIZG-v58F8lS68w";
    private static String codeVerifier = "ReUFV6yZLaXo7PTZ5MVoczwnh5uEsvtMyIbHdTD9Ru0" ;

    public static void setCodeVerifier(String codeVerifier) {
        AuthorizationCodePKCEExample.codeVerifier = codeVerifier;
    }

    private static final SpotifyApi spotifyApi = new SpotifyApi.Builder()
            .setClientId(clientId)
            .setRedirectUri(redirectUri)
            .build();
    private static final AuthorizationCodePKCERequest authorizationCodePKCERequest = spotifyApi.authorizationCodePKCE(code, codeVerifier)
            .build();

    public static void authorizationCode_Sync() {
        try {
            final AuthorizationCodeCredentials authorizationCodeCredentials = authorizationCodePKCERequest.execute();

            // Set access and refresh token for further "spotifyApi" object usage
            spotifyApi.setAccessToken(authorizationCodeCredentials.getAccessToken());
            spotifyApi.setRefreshToken(authorizationCodeCredentials.getRefreshToken());

            System.out.println("Expires in: " + authorizationCodeCredentials.getExpiresIn());
        } catch (IOException | SpotifyWebApiException | ParseException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {


        authorizationCode_Sync();
    }
}
