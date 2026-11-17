package X;

import java.io.IOException;
import java.io.Writer;

/* loaded from: classes5.dex */
public final class CFU extends Writer {
    public int A00;
    public Writer A01;
    public char[] A02;

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        Writer writer = this.A01;
        if (writer != null) {
            try {
                int i = this.A00;
                if (i > 0) {
                    writer.write(this.A02, 0, i);
                }
                this.A00 = 0;
                th = null;
            } catch (Throwable th) {
                th = th;
            }
            this.A02 = null;
            try {
                writer.close();
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                }
            }
            this.A01 = null;
            if (th != null) {
                throw th;
            }
        }
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() throws IOException {
        Writer writer = this.A01;
        if (writer == null) {
            throw BV4.A0K("BufferedWriter is closed");
        }
        int i = this.A00;
        if (i > 0) {
            writer.write(this.A02, 0, i);
        }
        this.A00 = 0;
        writer.flush();
    }

    @Override // java.io.Writer
    public final void write(int i) throws IOException {
        Writer writer = this.A01;
        if (writer == null) {
            throw BV4.A0K("BufferedWriter is closed");
        }
        char[] cArr = this.A02;
        int i2 = this.A00;
        int length = cArr.length;
        if (i2 >= length) {
            writer.write(cArr, 0, length);
            this.A00 = 0;
            i2 = 0;
        }
        this.A00 = i2 + 1;
        cArr[i2] = (char) i;
    }

    public CFU(Writer writer, char[] cArr) {
        super(writer);
        this.A01 = writer;
        this.A02 = cArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    @Override // java.io.Writer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void write(java.lang.String r8, int r9, int r10) throws java.io.IOException {
        /*
            r7 = this;
            java.io.Writer r5 = r7.A01
            if (r5 == 0) goto L63
            if (r10 <= 0) goto L23
            if (r9 < 0) goto L5e
            int r0 = r8.length()
            int r0 = r0 - r10
            if (r9 > r0) goto L5e
            char[] r6 = r7.A02
            int r0 = r7.A00
            r4 = 0
            if (r0 != 0) goto L24
            int r1 = r6.length
            if (r10 < r1) goto L24
            char[] r1 = new char[r10]
            int r0 = r9 + r10
            r8.getChars(r9, r0, r1, r4)
            r5.write(r1, r4, r10)
        L23:
            return
        L24:
            int r3 = r6.length
            int r2 = r3 - r0
            if (r10 >= r2) goto L50
            r2 = r10
        L2a:
            int r1 = r9 + r2
            r8.getChars(r9, r1, r6, r0)
            int r0 = r7.A00
            int r0 = r0 + r2
            r7.A00 = r0
        L34:
            if (r0 != r3) goto L23
            char[] r1 = r7.A02
            int r0 = r1.length
            r5.write(r1, r4, r0)
            r7.A00 = r4
            if (r10 <= r2) goto L23
            int r9 = r9 + r2
            int r2 = r10 - r2
            if (r2 < r3) goto L53
            char[] r1 = new char[r10]
            int r0 = r9 + r2
            r8.getChars(r9, r0, r1, r4)
            r5.write(r1, r4, r2)
            return
        L50:
            if (r2 <= 0) goto L34
            goto L2a
        L53:
            int r0 = r9 + r2
            r8.getChars(r9, r0, r6, r4)
            int r0 = r7.A00
            int r0 = r0 + r2
            r7.A00 = r0
            return
        L5e:
            java.lang.StringIndexOutOfBoundsException r0 = X.CFV.A00(r8, r9, r10)
            throw r0
        L63:
            java.lang.String r0 = "BufferedWriter is closed"
            java.io.IOException r0 = X.BV4.A0K(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.CFU.write(java.lang.String, int, int):void");
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) throws IOException {
        Writer writer = this.A01;
        if (writer != null) {
            if (cArr != null) {
                CFV.A01(cArr.length, i, i2);
                char[] cArr2 = this.A02;
                int i3 = this.A00;
                if (i3 != 0 || i2 < cArr2.length) {
                    int length = cArr2.length - i3;
                    if (i2 < length) {
                        length = i2;
                    }
                    if (length > 0) {
                        System.arraycopy(cArr, i, cArr2, i3, length);
                        i3 = this.A00 + length;
                        this.A00 = i3;
                    }
                    char[] cArr3 = this.A02;
                    int length2 = cArr3.length;
                    if (i3 != length2) {
                        return;
                    }
                    writer.write(cArr3, 0, length2);
                    this.A00 = 0;
                    if (i2 <= length) {
                        return;
                    }
                    i += length;
                    i2 -= length;
                    char[] cArr4 = this.A02;
                    if (i2 < cArr4.length) {
                        System.arraycopy(cArr, i, cArr4, 0, i2);
                        this.A00 += i2;
                        return;
                    }
                }
                writer.write(cArr, i, i2);
                return;
            }
            throw BV4.A0a("buffer == null");
        }
        throw BV4.A0K("BufferedWriter is closed");
    }
}
