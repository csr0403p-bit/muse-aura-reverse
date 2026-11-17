package com.facebook.acra.util;

import X.AnonymousClass002;
import java.io.FilterWriter;
import java.io.IOException;
import java.io.Writer;

/* loaded from: classes5.dex */
public class UrlEncodingWriter extends FilterWriter {
    public static final boolean THROW_ON_INVALID_INPUT = false;
    public static final int U16_SURROGATE_OFFSET = 56613888;
    public static final byte[] UPPER_CASE_DIGITS = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90};
    public static final byte UTF16_REPLACEMENT_BYTE = 63;
    public char mUtf16State;

    private void resetState() {
        this.mUtf16State = (char) 0;
    }

    @Override // java.io.FilterWriter, java.io.Writer
    public void write(int i) throws IOException {
        int i2;
        char c = (char) i;
        char c2 = this.mUtf16State;
        if (c2 != 0) {
            if (!utf16IsSurrogate(c) || !AnonymousClass002.A1L(c & '\u0400')) {
                writeHexByte(UTF16_REPLACEMENT_BYTE);
                this.mUtf16State = (char) 0;
                write(c);
                return;
            } else {
                int i3 = ((c2 << '\n') + c) - U16_SURROGATE_OFFSET;
                writeHexByte((byte) ((i3 >> 18) | 240));
                writeHexByte((byte) (((i3 >> 12) & 63) | 128));
                writeHexByte((byte) (((i3 >> 6) & 63) | 128));
                writeHexByte((byte) ((i3 & 63) | 128));
                this.mUtf16State = (char) 0;
                return;
            }
        }
        int i4 = '\uffff' & c;
        if (i4 < 128) {
            writeByte((byte) c);
            return;
        }
        if (i4 < 2048) {
            i2 = (c >> 6) | 192;
        } else {
            if (utf16IsSurrogate(c)) {
                if (AnonymousClass002.A1M(c & '\u0400')) {
                    this.mUtf16State = c;
                    return;
                } else {
                    writeHexByte(UTF16_REPLACEMENT_BYTE);
                    return;
                }
            }
            writeHexByte((byte) ((c >> '\f') | 224));
            i2 = ((c >> 6) & 63) | 128;
        }
        writeHexByte((byte) i2);
        writeHexByte((byte) ((c & '?') | 128));
    }

    public static int utf16GetSupplementary(char c, char c2) {
        return ((c << '\n') + c2) - U16_SURROGATE_OFFSET;
    }

    public static boolean utf16IsSurrogateLead(char c) {
        return AnonymousClass002.A1M(c & '\u0400');
    }

    public static boolean utf16IsSurrogateTrail(char c) {
        return AnonymousClass002.A1L(c & '\u0400');
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0016, code lost:
    
        if (r2 != 95) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0006, code lost:
    
        if (r2 > 122) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void writeByte(byte r2) throws java.io.IOException {
        /*
            r1 = this;
            r0 = 97
            if (r2 < r0) goto Lc
            r0 = 122(0x7a, float:1.71E-43)
            if (r2 <= r0) goto L18
        L8:
            r1.writeHexByte(r2)
            return
        Lc:
            r0 = 65
            if (r2 < r0) goto L1e
            r0 = 90
        L12:
            if (r2 <= r0) goto L18
            r0 = 95
            if (r2 != r0) goto L8
        L18:
            java.io.Writer r0 = r1.out
            r0.write(r2)
            return
        L1e:
            r0 = 48
            if (r2 < r0) goto L25
            r0 = 57
            goto L12
        L25:
            r0 = 46
            if (r2 == r0) goto L18
            r0 = 45
            if (r2 == r0) goto L18
            r0 = 42
            if (r2 == r0) goto L18
            r0 = 32
            if (r2 != r0) goto L8
            java.io.Writer r1 = r1.out
            r0 = 43
            r1.write(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.acra.util.UrlEncodingWriter.writeByte(byte):void");
    }

    private void writeHexByte(byte b) throws IOException {
        ((FilterWriter) this).out.write(37);
        Writer writer = ((FilterWriter) this).out;
        byte[] bArr = UPPER_CASE_DIGITS;
        writer.write(bArr[(b >> 4) & 15]);
        ((FilterWriter) this).out.write(bArr[b & 15]);
    }

    public void enforceCodepointBoundary() throws IOException {
        if (this.mUtf16State != 0) {
            writeHexByte(UTF16_REPLACEMENT_BYTE);
            this.mUtf16State = (char) 0;
        }
    }

    public UrlEncodingWriter(Writer writer) {
        super(writer);
        this.mUtf16State = (char) 0;
    }

    public static boolean utf16IsSurrogate(char c) {
        return AnonymousClass002.A1Q(c & '\uf800', 55296);
    }

    @Override // java.io.FilterWriter, java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        flush();
    }

    @Override // java.io.FilterWriter, java.io.Writer, java.io.Flushable
    public void flush() throws IOException {
        enforceCodepointBoundary();
        super.flush();
    }

    @Override // java.io.FilterWriter, java.io.Writer
    public void write(String str, int i, int i2) {
        synchronized (((Writer) this).lock) {
            for (int i3 = i; i3 < i + i2; i3++) {
                write(str.charAt(i3));
            }
        }
    }

    @Override // java.io.FilterWriter, java.io.Writer
    public void write(char[] cArr, int i, int i2) {
        synchronized (((Writer) this).lock) {
            for (int i3 = i; i3 < i + i2; i3++) {
                write(cArr[i3]);
            }
        }
    }
}
