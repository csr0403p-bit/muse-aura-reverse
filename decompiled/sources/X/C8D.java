package X;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes5.dex */
public abstract class C8D {
    public static boolean A00 = true;
    public static final boolean A01;

    static {
        boolean z;
        String property;
        try {
            property = System.getProperty("os.version");
        } catch (IllegalArgumentException | NullPointerException | SecurityException unused) {
        }
        if (property == null || property.isEmpty()) {
            z = false;
        } else {
            String[] strArrSplit = property.split("\\.");
            int[] iArr = {2, 6, 33};
            int iMin = Math.min(strArrSplit.length, 3);
            int i = 0;
            while (true) {
                if (i < iMin) {
                    int iA0F = BV6.A0F(strArrSplit, i);
                    int i2 = iArr[i];
                    if (iA0F >= i2) {
                        if (iA0F > i2) {
                            break;
                        } else {
                            i++;
                        }
                    } else {
                        z = false;
                        break;
                    }
                } else if (iMin == 3) {
                    break;
                }
            }
            z = true;
        }
        A01 = z;
    }

    public static void A00(InputStream inputStream, OutputStream outputStream, int i) throws IOException {
        byte[] bArr = new byte[32768];
        int i2 = 0;
        while (i2 < i) {
            int iA0F = C8j3.A0F(i, i2, 32768);
            int i3 = 0;
            while (true) {
                if (i3 >= iA0F) {
                    break;
                }
                int i4 = inputStream.read(bArr, i3, iA0F - i3);
                if (i4 >= 0) {
                    i3 += i4;
                } else if (i4 == -1 && i3 == 0) {
                    return;
                }
            }
            if (i3 == -1) {
                return;
            }
            outputStream.write(bArr, 0, i3);
            i2 += i3;
        }
    }
}
