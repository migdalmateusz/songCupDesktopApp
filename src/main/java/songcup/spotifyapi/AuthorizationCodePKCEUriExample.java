package songcup.spotifyapi;

import com.wrapper.spotify.SpotifyApi;
import com.wrapper.spotify.SpotifyHttpManager;
import com.wrapper.spotify.requests.authorization.authorization_code.AuthorizationCodeUriRequest;

import java.net.URI;

public class AuthorizationCodePKCEUriExample {

    private static final String clientId = "d483a7a819dd4b729196977cf28b8002";
    private static final URI redirectUri = SpotifyHttpManager.makeUri("http://localhost:8080/login");
    private static String codeChallenge ="QjRhA4GbLXWNkhz5L1YTpb46kSDgiExHK5R03w_OsFU";

    private static final SpotifyApi spotifyApi = new SpotifyApi.Builder()
            .setClientId(clientId)
            .setRedirectUri(redirectUri)
            .build();
    private static final AuthorizationCodeUriRequest authorizationCodeUriRequest = spotifyApi.authorizationCodePKCEUri(codeChallenge)
//          .state("x4xkmn9pu3j6ukrs8n")
//          .scope("user-read-birthdate,user-read-email")
//          .show_dialog(true)
            .build();

    public static void authorizationCodeUri_Sync() {
        final URI uri = authorizationCodeUriRequest.execute();

        System.out.println("URI: " + uri.toString());
    }

    public static void main (String[]args){

        authorizationCodeUri_Sync();
    }
}

