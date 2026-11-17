package X;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: X.Euk, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC7406Euk {
    public static final byte[] A00 = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};

    public static final String A00(String str) throws NoSuchAlgorithmException {
        C7384Etj.A0Y(str, 0);
        try {
            byte[] bytes = str.getBytes(C7384Etj.A0M("utf-8"));
            try {
                try {
                    MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
                    messageDigest.update(bytes, 0, bytes.length);
                    byte[] bArrDigest = messageDigest.digest();
                    C7384Etj.A0X(bArrDigest);
                    return A01(bArrDigest);
                } catch (UnsupportedEncodingException e) {
                    throw BV4.A0e(e);
                }
            } catch (NoSuchAlgorithmException e2) {
                throw BV4.A0e(e2);
            }
        } catch (UnsupportedEncodingException e3) {
            throw BV4.A0e(e3);
        }
    }

    public static final String A01(byte[] bArr) {
        StringBuilder sbA0p = BV4.A0p(bArr.length);
        for (byte b : bArr) {
            byte[] bArr2 = A00;
            sbA0p.append((char) (bArr2[(b & 255) >>> 4] & 65535));
            sbA0p.append((char) (bArr2[b & 15] & 65535));
        }
        return sbA0p.toString();
    }
}
