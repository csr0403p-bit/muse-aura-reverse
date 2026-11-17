package X;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* renamed from: X.C3b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3201C3b implements C3N {
    public InputStream A01;
    public final long A03;
    public final ZipEntry A04;
    public final ZipFile A05;
    public boolean A02 = true;
    public long A00 = 0;

    @Override // X.C3N
    public final int AZ5(ByteBuffer byteBuffer, long j) throws IOException {
        if (this.A01 == null) {
            throw BV4.A0K("InputStream is null");
        }
        int iRemaining = byteBuffer.remaining();
        long j2 = this.A03;
        long j3 = j2 - j;
        if (j3 <= 0) {
            return -1;
        }
        int i = (int) j3;
        if (iRemaining > i) {
            iRemaining = i;
        }
        InputStream inputStream = this.A01;
        if (inputStream == null) {
            throw BV5.A0M(this.A04.getName(), "'s InputStream is null");
        }
        long j4 = this.A00;
        if (j != j4) {
            if (j > j2) {
                j = j2;
            }
            if (j >= j4) {
                inputStream.skip(j - j4);
            } else {
                inputStream.close();
                ZipFile zipFile = this.A05;
                ZipEntry zipEntry = this.A04;
                InputStream inputStream2 = zipFile.getInputStream(zipEntry);
                this.A01 = inputStream2;
                if (inputStream2 == null) {
                    throw BV5.A0M(zipEntry.getName(), "'s InputStream is null");
                }
                inputStream2.skip(j);
            }
            this.A00 = j;
        }
        if (byteBuffer.hasArray()) {
            this.A01.read(byteBuffer.array(), 0, iRemaining);
            BV7.A1L(byteBuffer, iRemaining);
        } else {
            byte[] bArr = new byte[iRemaining];
            this.A01.read(bArr, 0, iRemaining);
            byteBuffer.put(bArr, 0, iRemaining);
        }
        this.A00 += iRemaining;
        return iRemaining;
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        InputStream inputStream = this.A01;
        if (inputStream != null) {
            inputStream.close();
            this.A02 = false;
        }
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return this.A02;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        return AZ5(byteBuffer, this.A00);
    }

    @Override // X.C3N
    public final long size() {
        return this.A03;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        throw C8j3.A18("ElfZipFileChannel doesn't support write");
    }

    public C3201C3b(ZipEntry zipEntry, ZipFile zipFile) throws IOException {
        this.A05 = zipFile;
        this.A04 = zipEntry;
        this.A03 = zipEntry.getSize();
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        this.A01 = inputStream;
        if (inputStream == null) {
            throw BV5.A0M(zipEntry.getName(), "'s InputStream is null");
        }
    }
}
