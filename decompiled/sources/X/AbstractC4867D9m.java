package X;

import java.io.IOException;
import java.io.OutputStream;

/* renamed from: X.D9m, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC4867D9m {
    public static void A00(OutputStream outputStream, int i, long j) throws IOException {
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) ((j >> (i2 * 8)) & 255);
        }
        outputStream.write(bArr);
    }
}
