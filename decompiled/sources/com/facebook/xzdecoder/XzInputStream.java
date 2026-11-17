package com.facebook.xzdecoder;

import X.BV4;
import X.BV6;
import X.C3463COl;
import X.C7384Etj;
import X.C8j3;
import X.FGI;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes5.dex */
public final class XzInputStream extends InputStream {
    public static final int BUF_SIZE = 32768;
    public int clientOutPos;
    public final byte[] inBuf;
    public final InputStream inFile;
    public int inPos;
    public int inSize;
    public final byte[] outBuf;
    public int outPos;
    public long state;

    public XzInputStream(InputStream inputStream) {
        C7384Etj.A0Y(inputStream, 0);
        this.inFile = inputStream;
        this.inBuf = new byte[32768];
        this.outBuf = new byte[32768];
        this.state = initializeState();
    }

    public static final native long decompressStream(long j, byte[] bArr, int i, int i2, byte[] bArr2, int i3, int i4);

    public static final native void end(long j);

    public static final native void initializeLibrary();

    public static final native long initializeState();

    private final boolean readMoreInput() throws IOException {
        this.inSize = 0;
        int i = 0;
        this.inPos = 0;
        while (true) {
            if (i >= 32768) {
                break;
            }
            InputStream inputStream = this.inFile;
            byte[] bArr = this.inBuf;
            int i2 = inputStream.read(bArr, i, bArr.length - i);
            int i3 = this.inSize;
            if (i2 != -1) {
                i = i3 + i2;
                this.inSize = i;
            } else if (i3 <= 0) {
                return false;
            }
        }
        return true;
    }

    static {
        C3463COl.loadLibrary("fb_xzdecoder");
        initializeLibrary();
    }

    private final int copyBufferedData(byte[] bArr, int i, int i2) {
        int i3 = this.outPos;
        int i4 = this.clientOutPos;
        int iA0F = C8j3.A0F(i3, i4, i2);
        System.arraycopy(this.outBuf, i4, bArr, i, iA0F);
        this.clientOutPos += iA0F;
        return iA0F;
    }

    private final void decodeMoreBytes() {
        long j = this.state;
        byte[] bArr = this.inBuf;
        int i = this.inPos;
        int i2 = this.inSize;
        byte[] bArr2 = this.outBuf;
        long jDecompressStream = decompressStream(j, bArr, i, i2, bArr2, 0, bArr2.length);
        this.inPos = BV6.A03(jDecompressStream);
        this.outPos = (int) jDecompressStream;
        this.clientOutPos = 0;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.inFile.close();
        long j = this.state;
        if (j != 0) {
            end(j);
            this.state = 0L;
        }
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (this.state == 0) {
            throw BV4.A0K("Stream closed");
        }
        if (this.clientOutPos == this.outPos) {
            if (this.inPos == this.inSize && !readMoreInput()) {
                return -1;
            }
            decodeMoreBytes();
        }
        byte[] bArr = this.outBuf;
        int i = this.clientOutPos;
        this.clientOutPos = i + 1;
        return bArr[i];
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = i;
        C7384Etj.A0Y(bArr, 0);
        if (i2 >= 0 && i >= 0 && i + i2 <= bArr.length) {
            if (this.state != 0) {
                int i4 = 0;
                int i5 = i2;
                while (i4 < i2) {
                    if (this.clientOutPos < this.outPos) {
                        int iCopyBufferedData = copyBufferedData(bArr, i3, i5);
                        i5 -= iCopyBufferedData;
                        i3 += iCopyBufferedData;
                        i4 += iCopyBufferedData;
                    } else {
                        if (this.inPos == this.inSize && !readMoreInput()) {
                            if (i4 == 0) {
                                return -1;
                            }
                            return i4;
                        }
                        decodeMoreBytes();
                    }
                }
                return i4;
            }
            throw BV4.A0K("Stream closed");
        }
        throw BV6.A0g(FGI.A0Z("buf.length = ", ", off = ", ", len = ", bArr.length, i3, i2));
    }
}
