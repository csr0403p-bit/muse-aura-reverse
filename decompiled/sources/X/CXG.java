package X;

import com.facebook.aura.localbrowser.LocalBrowserCapacityKt;

/* loaded from: classes5.dex */
public abstract class CXG {
    public static long A00;
    public static boolean A01;
    public static final Object A02 = C3cG.A0T();
    public static final Object A03 = C3cG.A0T();

    public static long A01(byte[] bArr, int i) {
        int i2 = bArr[i];
        int i3 = bArr[i + 1];
        int i4 = bArr[i + 2];
        int i5 = bArr[i + 3];
        if ((i2 & 128) == 128) {
            i2 = (i2 & 127) + 128;
        }
        if ((i3 & 128) == 128) {
            i3 = (i3 & 127) + 128;
        }
        if ((i4 & 128) == 128) {
            i4 = (i4 & 127) + 128;
        }
        if ((i5 & 128) == 128) {
            i5 = (i5 & 127) + 128;
        }
        return (i2 << 24) + (i3 << 16) + (i4 << 8) + i5;
    }

    public static long A00(byte[] bArr, int i) {
        long jA01 = A01(bArr, i);
        long jA012 = A01(bArr, i + 4);
        if (jA01 == 0 && jA012 == 0) {
            return 0L;
        }
        return ((jA01 - 2208988800L) * 1000) + ((jA012 * 1000) / LocalBrowserCapacityKt.BACKGROUND_WAKE_MIN_RAM_BYTES);
    }
}
