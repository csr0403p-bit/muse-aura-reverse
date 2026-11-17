package X;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* loaded from: classes5.dex */
public abstract class CA7 {
    public static final byte[] A00(String str) {
        try {
            Charset charsetForName = Charset.forName("ASCII");
            C7384Etj.A0U(charsetForName);
            return str.getBytes(charsetForName);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("ASCII not found!", e);
        }
    }
}
