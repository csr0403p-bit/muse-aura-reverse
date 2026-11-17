package X;

import com.facebook.acra.util.UrlEncodingWriter;
import java.io.FilterWriter;
import java.io.IOException;
import java.io.Writer;

/* loaded from: classes5.dex */
public final class C83 extends FilterWriter {
    public static final byte[] A01 = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90};
    public char A00;

    /* JADX WARN: Code restructure failed: missing block: B:17:0x005a, code lost:
    
        if (r1 > 122) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006a, code lost:
    
        if (r1 != 95) goto L18;
     */
    @Override // java.io.FilterWriter, java.io.Writer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void write(int r7) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 200
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C83.write(int):void");
    }

    private void A00(byte b) throws IOException {
        ((FilterWriter) this).out.write(37);
        Writer writer = ((FilterWriter) this).out;
        byte[] bArr = A01;
        writer.write(bArr[(b >> 4) & 15]);
        ((FilterWriter) this).out.write(bArr[b & 15]);
    }

    @Override // java.io.FilterWriter, java.io.Writer, java.io.Flushable
    public final void flush() throws IOException {
        if (this.A00 != 0) {
            A00(UrlEncodingWriter.UTF16_REPLACEMENT_BYTE);
            this.A00 = (char) 0;
        }
        super.flush();
    }

    public C83(Writer writer) {
        super(writer);
        this.A00 = (char) 0;
    }

    @Override // java.io.FilterWriter, java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        flush();
    }

    @Override // java.io.FilterWriter, java.io.Writer
    public final void write(String str, int i, int i2) {
        synchronized (((Writer) this).lock) {
            for (int i3 = i; i3 < i + i2; i3++) {
                write(str.charAt(i3));
            }
        }
    }

    @Override // java.io.FilterWriter, java.io.Writer
    public final void write(char[] cArr, int i, int i2) {
        synchronized (((Writer) this).lock) {
            for (int i3 = i; i3 < i + i2; i3++) {
                write(cArr[i3]);
            }
        }
    }
}
