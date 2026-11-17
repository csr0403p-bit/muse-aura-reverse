package X;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteOrder;

/* loaded from: classes5.dex */
public final class BqJ extends FilterOutputStream {
    public ByteOrder A00;
    public final OutputStream A01;

    public final void A00(int i) throws IOException {
        OutputStream outputStream;
        int i2;
        ByteOrder byteOrder = this.A00;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            outputStream = this.A01;
            outputStream.write(i & 255);
            outputStream.write((i >>> 8) & 255);
            outputStream.write((i >>> 16) & 255);
            i2 = (i >>> 24) & 255;
        } else {
            if (byteOrder != ByteOrder.BIG_ENDIAN) {
                return;
            }
            outputStream = this.A01;
            outputStream.write((i >>> 24) & 255);
            outputStream.write((i >>> 16) & 255);
            outputStream.write((i >>> 8) & 255);
            i2 = i & 255;
        }
        outputStream.write(i2);
    }

    public final void A01(short s) throws IOException {
        OutputStream outputStream;
        int i;
        ByteOrder byteOrder = this.A00;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            outputStream = this.A01;
            outputStream.write(s & 255);
            i = (s >>> 8) & 255;
        } else {
            if (byteOrder != ByteOrder.BIG_ENDIAN) {
                return;
            }
            outputStream = this.A01;
            outputStream.write((s >>> 8) & 255);
            i = s & 255;
        }
        outputStream.write(i);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        this.A01.write(bArr);
    }

    public BqJ(OutputStream outputStream, ByteOrder byteOrder) {
        super(outputStream);
        this.A01 = outputStream;
        this.A00 = byteOrder;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        this.A01.write(bArr, i, i2);
    }
}
