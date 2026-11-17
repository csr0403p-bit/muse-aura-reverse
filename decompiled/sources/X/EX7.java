package X;

import com.facebook.aura.localbrowser.ManagedBrowserSitePolicy;

/* loaded from: classes5.dex */
public abstract class EX7 {
    public static String A00(final byte[] bytes) {
        StringBuilder sbA0p = BV4.A0p(bytes.length * 2);
        for (byte b : bytes) {
            int i = b & 255;
            BV6.A1M(ManagedBrowserSitePolicy.HEX, sbA0p, i / 16);
            BV6.A1M(ManagedBrowserSitePolicy.HEX, sbA0p, i % 16);
        }
        return sbA0p.toString();
    }

    public static byte[] A01(String hex) {
        int length = hex.length();
        if (length % 2 != 0) {
            throw C60O.A0i("Expected a string of even length");
        }
        int i = length / 2;
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = i2 * 2;
            int iDigit = Character.digit(hex.charAt(i3), 16);
            int iDigit2 = Character.digit(hex.charAt(i3 + 1), 16);
            if (iDigit == -1 || iDigit2 == -1) {
                throw C60O.A0i("input is not hexadecimal");
            }
            bArr[i2] = (byte) ((iDigit * 16) + iDigit2);
        }
        return bArr;
    }
}
