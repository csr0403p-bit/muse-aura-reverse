package X;

import com.facebook.aura.localbrowser.ManagedBrowserSitePolicy;

/* loaded from: classes5.dex */
public abstract class DKN {
    public static final char[] A00 = ManagedBrowserSitePolicy.HEX.toCharArray();

    public final boolean equals(Object object) {
        if (!(object instanceof DKN)) {
            return false;
        }
        byte[] bArr = ((DKM) this).bytes;
        int length = bArr.length;
        int i = length * 8;
        byte[] bArr2 = ((DKM) ((DKN) object)).bytes;
        int length2 = bArr2.length;
        if (i != length2 * 8 || length != length2) {
            return false;
        }
        boolean zA1Q = true;
        for (int i2 = 0; i2 < length; i2++) {
            zA1Q &= AnonymousClass002.A1Q(bArr[i2], bArr2[i2]);
        }
        return zA1Q;
    }

    public final int hashCode() {
        byte[] bArr = ((DKM) this).bytes;
        int length = bArr.length;
        if (length * 8 >= 32) {
            if (!BV5.A1P(length, 4)) {
                throw BV7.A0m("HashCode#asInt() requires >= 4 bytes (it only has %s bytes).", BV5.A1Y(length));
            }
            return ((bArr[3] & 255) << 24) | (bArr[0] & 255) | BV6.A0D(bArr, 1) | ((bArr[2] & 255) << 16);
        }
        int i = bArr[0] & 255;
        for (int i2 = 1; i2 < length; i2++) {
            i |= (bArr[i2] & 255) << (i2 * 8);
        }
        return i;
    }

    public final String toString() {
        byte[] bArr = ((DKM) this).bytes;
        StringBuilder sbA0p = BV4.A0p(bArr.length * 2);
        for (byte b : bArr) {
            char[] cArr = A00;
            sbA0p.append(cArr[(b >> 4) & 15]);
            sbA0p.append(cArr[b & 15]);
        }
        return sbA0p.toString();
    }
}
