package X;

import java.io.DataOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteOrder;

/* loaded from: classes5.dex */
public final class BqT extends FilterOutputStream {
    public ByteOrder A00;
    public final DataOutputStream A01;

    public final void A00(int i) throws IOException {
        DataOutputStream dataOutputStream;
        int i2;
        ByteOrder byteOrder = this.A00;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            dataOutputStream = this.A01;
            dataOutputStream.write(i & 255);
            dataOutputStream.write((i >>> 8) & 255);
            dataOutputStream.write((i >>> 16) & 255);
            i2 = (i >>> 24) & 255;
        } else {
            if (byteOrder != ByteOrder.BIG_ENDIAN) {
                return;
            }
            dataOutputStream = this.A01;
            dataOutputStream.write((i >>> 24) & 255);
            dataOutputStream.write((i >>> 16) & 255);
            dataOutputStream.write((i >>> 8) & 255);
            i2 = i & 255;
        }
        dataOutputStream.write(i2);
    }

    public final void A02(short s) throws IOException {
        DataOutputStream dataOutputStream;
        int i;
        ByteOrder byteOrder = this.A00;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            dataOutputStream = this.A01;
            dataOutputStream.write(s & 255);
            i = (s >>> 8) & 255;
        } else {
            if (byteOrder != ByteOrder.BIG_ENDIAN) {
                return;
            }
            dataOutputStream = this.A01;
            dataOutputStream.write((s >>> 8) & 255);
            i = s & 255;
        }
        dataOutputStream.write(i);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        this.A01.write(bArr);
    }

    public BqT(OutputStream outputStream, ByteOrder byteOrder) {
        super(outputStream);
        this.A01 = new DataOutputStream(outputStream);
        this.A00 = byteOrder;
    }

    public final void A01(int i) throws IOException {
        if (i > 65535) {
            throw C60O.A0i("val is larger than the maximum value of a 16-bit unsigned integer");
        }
        A02((short) i);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        this.A01.write(bArr, i, i2);
    }
}
