package songcup.spotifyapi;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CodeGenerator {
    public static void main(String[] args) {
            try {

                PkceUtil pkce = new PkceUtil();

                String codeVerifier = pkce.generateCodeVerifier();
                System.out.println("Code verifier = " + codeVerifier);

                String codeChallenge = pkce.generateCodeChallange(codeVerifier);
                System.out.println("Code challenge = " + codeChallenge);

            } catch (UnsupportedEncodingException | NoSuchAlgorithmException ex) {
                Logger.getLogger(CodeGenerator.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
}
