package X;

import android.util.Log;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;

/* renamed from: X.BqS, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C2971BqS extends InputStream implements DataInput {
    public int A00;
    public int A01;
    public ByteOrder A02;
    public byte[] A03;
    public final DataInputStream A04;

    public final void A00(int i) throws IOException {
        int i2 = 0;
        while (i2 < i) {
            DataInputStream dataInputStream = this.A04;
            int i3 = i - i2;
            int iSkip = (int) dataInputStream.skip(i3);
            if (iSkip <= 0) {
                byte[] bArr = this.A03;
                if (bArr == null) {
                    bArr = new byte[8192];
                    this.A03 = bArr;
                }
                iSkip = dataInputStream.read(bArr, 0, Math.min(8192, i3));
                if (iSkip == -1) {
                    throw new EOFException(FGI.A0I("Reached EOF while skipping ", i, " bytes."));
                }
            }
            i2 += iSkip;
        }
        this.A01 += i2;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.A04.available();
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        throw C8j3.A18("Mark is currently unsupported");
    }

    @Override // java.io.InputStream
    public final int read() {
        this.A01++;
        return this.A04.read();
    }

    @Override // java.io.DataInput
    public final boolean readBoolean() {
        this.A01++;
        return this.A04.readBoolean();
    }

    @Override // java.io.DataInput
    public final byte readByte() throws IOException {
        this.A01++;
        int i = this.A04.read();
        if (i >= 0) {
            return (byte) i;
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final char readChar() {
        this.A01 += 2;
        return this.A04.readChar();
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr) throws IOException {
        this.A01 += bArr.length;
        this.A04.readFully(bArr);
    }

    @Override // java.io.DataInput
    public final int readInt() throws IOException {
        this.A01 += 4;
        DataInputStream dataInputStream = this.A04;
        int i = dataInputStream.read();
        int i2 = dataInputStream.read();
        int i3 = dataInputStream.read();
        int i4 = dataInputStream.read();
        if ((i | i2 | i3 | i4) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.A02;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            return (i4 << 24) + (i3 << 16) + (i2 << 8) + i;
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            return (i << 24) + (i2 << 16) + (i3 << 8) + i4;
        }
        throw BV8.A0j(byteOrder, "Invalid byte order: ");
    }

    @Override // java.io.DataInput
    public final String readLine() {
        Log.d("ExifInterface", "Currently unsupported");
        return null;
    }

    @Override // java.io.DataInput
    public final long readLong() throws IOException {
        long j;
        long j2;
        this.A01 += 8;
        DataInputStream dataInputStream = this.A04;
        int i = dataInputStream.read();
        int i2 = dataInputStream.read();
        int i3 = dataInputStream.read();
        int i4 = dataInputStream.read();
        int i5 = dataInputStream.read();
        int i6 = dataInputStream.read();
        int i7 = dataInputStream.read();
        int i8 = dataInputStream.read();
        if ((i | i2 | i3 | i4 | i5 | i6 | i7 | i8) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.A02;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            j = (i8 << 56) + (i7 << 48) + (i6 << 40) + (i5 << 32) + (i4 << 24) + (i3 << 16) + (i2 << 8);
            j2 = i;
        } else {
            if (byteOrder != ByteOrder.BIG_ENDIAN) {
                throw BV8.A0j(byteOrder, "Invalid byte order: ");
            }
            j = (i << 56) + (i2 << 48) + (i3 << 40) + (i4 << 32) + (i5 << 24) + (i6 << 16) + (i7 << 8);
            j2 = i8;
        }
        return j + j2;
    }

    @Override // java.io.DataInput
    public final short readShort() throws IOException {
        int i;
        this.A01 += 2;
        DataInputStream dataInputStream = this.A04;
        int i2 = dataInputStream.read();
        int i3 = dataInputStream.read();
        if ((i2 | i3) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.A02;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            i = (i3 << 8) + i2;
        } else {
            if (byteOrder != ByteOrder.BIG_ENDIAN) {
                throw BV8.A0j(byteOrder, "Invalid byte order: ");
            }
            i = (i2 << 8) + i3;
        }
        return (short) i;
    }

    @Override // java.io.DataInput
    public final String readUTF() {
        this.A01 += 2;
        return this.A04.readUTF();
    }

    @Override // java.io.DataInput
    public final int readUnsignedByte() {
        this.A01++;
        return this.A04.readUnsignedByte();
    }

    @Override // java.io.DataInput
    public final int readUnsignedShort() throws IOException {
        this.A01 += 2;
        DataInputStream dataInputStream = this.A04;
        int i = dataInputStream.read();
        int i2 = dataInputStream.read();
        if ((i | i2) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.A02;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            return (i2 << 8) + i;
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            return (i << 8) + i2;
        }
        throw BV8.A0j(byteOrder, "Invalid byte order: ");
    }

    @Override // java.io.InputStream
    public final void reset() {
        throw C8j3.A18("Reset is currently unsupported");
    }

    public C2971BqS(byte[] bArr) {
        this(BV4.A0E(bArr), ByteOrder.BIG_ENDIAN);
        this.A00 = bArr.length;
    }

    @Override // java.io.DataInput
    public final double readDouble() {
        return Double.longBitsToDouble(readLong());
    }

    @Override // java.io.DataInput
    public final float readFloat() {
        return Float.intBitsToFloat(readInt());
    }

    @Override // java.io.DataInput
    public final int skipBytes(int i) {
        throw C8j3.A18("skipBytes is currently unsupported");
    }

    public C2971BqS(InputStream inputStream, ByteOrder byteOrder) {
        int i;
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.A04 = dataInputStream;
        dataInputStream.mark(0);
        this.A01 = 0;
        this.A02 = byteOrder;
        if (inputStream instanceof C2971BqS) {
            i = ((C2971BqS) inputStream).A00;
        } else {
            i = -1;
        }
        this.A00 = i;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.A04.read(bArr, i, i2);
        this.A01 += i3;
        return i3;
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr, int i, int i2) throws IOException {
        this.A01 += i2;
        this.A04.readFully(bArr, i, i2);
    }
}
