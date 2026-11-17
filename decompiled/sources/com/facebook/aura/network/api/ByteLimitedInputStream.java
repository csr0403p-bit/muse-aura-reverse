package com.facebook.aura.network.api;

import X.C7384Etj;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes2.dex */
public final class ByteLimitedInputStream extends FilterInputStream {
    public long bytesRead;
    public final long maxBytes;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ByteLimitedInputStream(InputStream inputStream, long j) {
        super(inputStream);
        C7384Etj.A0Y(inputStream, 0);
        this.maxBytes = j;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        C7384Etj.A0Y(bArr, 0);
        if (i2 == 0) {
            return 0;
        }
        long j = this.bytesRead;
        long j2 = this.maxBytes;
        if (j == j2) {
            return readPastBoundary();
        }
        int i3 = super.read(bArr, i, (int) Math.min(i2, j2 - j));
        if (i3 <= 0) {
            return i3;
        }
        this.bytesRead += i3;
        return i3;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i) {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() throws IOException {
        throw new IOException("mark/reset is not supported on a bounded stream");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) throws IOException {
        if (j > 0) {
            long j2 = this.bytesRead;
            long j3 = this.maxBytes;
            if (j2 != j3) {
                long jSkip = super.skip(Math.min(j, j3 - j2));
                this.bytesRead += jSkip;
                return jSkip;
            }
            readPastBoundary();
        }
        return 0L;
    }

    private final int readPastBoundary() throws ByteLimitExceededException {
        if (super.read() < 0) {
            return -1;
        }
        long j = this.maxBytes;
        throw new ByteLimitExceededException(j, 1 + j, false);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() {
        return (int) Math.min(super.available(), this.maxBytes - this.bytesRead);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        if (this.bytesRead == this.maxBytes) {
            return readPastBoundary();
        }
        int i = super.read();
        if (i < 0) {
            return i;
        }
        this.bytesRead++;
        return i;
    }
}
