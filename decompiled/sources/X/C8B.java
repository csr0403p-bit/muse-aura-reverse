package X;

import java.io.IOException;
import java.io.OutputStream;
import java.util.zip.GZIPOutputStream;

/* loaded from: classes5.dex */
public final class C8B extends GZIPOutputStream {
    public final byte[] A00;

    @Override // java.util.zip.DeflaterOutputStream, java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i) throws IOException {
        byte[] bArr = this.A00;
        bArr[0] = (byte) i;
        write(bArr, 0, 1);
    }

    public C8B(OutputStream outputStream) {
        super(outputStream);
        this.A00 = new byte[1];
    }
}
