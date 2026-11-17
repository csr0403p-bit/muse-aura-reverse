package X;

import java.io.IOException;
import java.io.Writer;

/* loaded from: classes5.dex */
public final class EYX extends Writer {
    public final C6746EYg A00 = new C6746EYg();
    public final Appendable A01;

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(CharSequence charSequence) throws IOException {
        this.A01.append(charSequence);
        return this;
    }

    @Override // java.io.Writer
    public final void write(int i) throws IOException {
        this.A01.append((char) i);
    }

    public EYX(Appendable appendable) {
        this.A01 = appendable;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(CharSequence charSequence, int i, int i2) throws IOException {
        this.A01.append(charSequence, i, i2);
        return this;
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) throws IOException {
        C6746EYg c6746EYg = this.A00;
        c6746EYg.A01 = cArr;
        c6746EYg.A00 = null;
        this.A01.append(c6746EYg, i, i2 + i);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence, int i, int i2) throws IOException {
        append(charSequence, i, i2);
        return this;
    }

    @Override // java.io.Writer
    public final void write(String str, int i, int i2) throws IOException {
        str.getClass();
        this.A01.append(str, i, i2 + i);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence) throws IOException {
        append(charSequence);
        return this;
    }
}
