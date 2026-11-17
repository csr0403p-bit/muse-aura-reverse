package X;

import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;

/* loaded from: classes5.dex */
public final class CFW extends Writer {
    public final OutputStream A00;
    public final String A01;
    public final boolean A02;

    public CFW(OutputStream outputStream, String str) {
        super(outputStream);
        this.A00 = outputStream;
        this.A02 = true;
        this.A01 = str;
    }

    @Override // java.io.Writer
    public final void write(char[] cArr) throws IOException {
        for (char c : cArr) {
            A00(c);
        }
    }

    private boolean A00(char c) throws IOException {
        if (c <= '\u007f') {
            this.A00.write((byte) c);
            return true;
        }
        if (this.A02) {
            throw C60O.A0i(FGI.A0E("Non-ASCII character detected: ", c));
        }
        this.A00.write(new String(new char[]{c}).getBytes(this.A01));
        return false;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.A00.close();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() throws IOException {
        this.A00.flush();
    }

    @Override // java.io.Writer
    public final void write(String str, int i, int i2) throws IOException {
        int i3 = i;
        if ((i | i2) >= 0 && i <= str.length() - i2) {
            int i4 = 0;
            while (i4 < i2) {
                int i5 = i3 + 1;
                if (!A00(str.charAt(i3)) && i2 - i4 > 0) {
                    this.A00.write(str.substring(i5).getBytes(this.A01));
                    return;
                } else {
                    i4++;
                    i3 = i5;
                }
            }
            return;
        }
        throw new StringIndexOutOfBoundsException(FGI.A0Z("length=", "; offset=", "; count=", str.length(), i3, i2));
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) throws IOException {
        int i3 = i;
        if ((i | i2) < 0 || i > cArr.length - i2) {
            throw new ArrayIndexOutOfBoundsException(FGI.A0Z("length=", "; offset=", "; count=", cArr.length, i3, i2));
        }
        int i4 = 0;
        while (i4 < i2) {
            int i5 = i3 + 1;
            if (!A00(cArr[i3]) && i2 - i4 > 0) {
                this.A00.write(new String(cArr, i5, i2).getBytes(this.A01));
                return;
            } else {
                i4++;
                i3 = i5;
            }
        }
    }

    @Override // java.io.Writer
    public final void write(String str) throws IOException {
        write(str, 0, str.length());
    }

    @Override // java.io.Writer
    public final void write(int i) throws IOException {
        A00((char) i);
    }
}
