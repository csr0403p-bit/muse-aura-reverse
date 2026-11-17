package X;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes5.dex */
public abstract class F0H {
    public static final byte[] A01(InputStream inputStream) throws IOException {
        C7384Etj.A0Y(inputStream, 0);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, inputStream.available()));
        A00(inputStream, byteArrayOutputStream);
        return C7384Etj.A0d(byteArrayOutputStream);
    }

    public static final long A00(InputStream inputStream, OutputStream outputStream) throws IOException {
        boolean zA1b = AnonymousClass004.A1b(inputStream, outputStream);
        byte[] bArr = new byte[8192];
        int i = inputStream.read(bArr);
        long j = 0;
        while (i >= 0) {
            outputStream.write(bArr, zA1b ? 1 : 0, i);
            j += i;
            i = inputStream.read(bArr);
        }
        return j;
    }
}
