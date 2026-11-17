package X;

import com.fasterxml.jackson.core.exc.StreamConstraintsException;
import java.io.IOException;
import java.io.Writer;

/* renamed from: X.Gnd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10005Gnd extends Writer implements InterfaceC10184Gqu {
    public final Gn2 A00;

    @Override // X.InterfaceC10184Gqu
    public final HjR A5N() {
        return this.A00.A0A;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
    }

    @Override // java.io.Writer
    public final void write(int i) throws StreamConstraintsException {
        Gn2 gn2 = this.A00;
        char c = (char) i;
        if (gn2.A02 >= 0) {
            Gn2.A03(gn2, 16);
        }
        gn2.A04 = null;
        gn2.A09 = null;
        char[] cArr = gn2.A07;
        int i2 = gn2.A00;
        if (i2 >= cArr.length) {
            int i3 = gn2.A03 + i2 + 1;
            if (i3 < 0) {
                i3 = Integer.MAX_VALUE;
            }
            gn2.A09(i3);
            Gn2.A02(gn2);
            cArr = gn2.A07;
        }
        int i4 = gn2.A00;
        gn2.A00 = i4 + 1;
        cArr[i4] = c;
    }

    public C10005Gnd(HjR hjR) {
        this.A00 = new Gn2(hjR);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(CharSequence charSequence) throws StreamConstraintsException {
        String string = charSequence.toString();
        this.A00.A0A(string, 0, string.length());
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(CharSequence charSequence, int i, int i2) throws StreamConstraintsException {
        String string = charSequence.subSequence(i, i2).toString();
        this.A00.A0A(string, 0, string.length());
        return this;
    }

    @Override // java.io.Writer
    public final void write(String str, int i, int i2) throws StreamConstraintsException {
        this.A00.A0A(str, i, i2);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence, int i, int i2) throws IOException {
        append(charSequence, i, i2);
        return this;
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) throws StreamConstraintsException {
        this.A00.A0B(cArr, i, i2);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final /* bridge */ /* synthetic */ Appendable append(char c) throws IOException {
        write(c);
        return this;
    }

    @Override // java.io.Writer
    public final void write(String str) throws StreamConstraintsException {
        this.A00.A0A(str, 0, str.length());
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence) throws IOException {
        append(charSequence);
        return this;
    }

    @Override // java.io.Writer
    public final void write(char[] cArr) throws StreamConstraintsException {
        this.A00.A0B(cArr, 0, cArr.length);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(char c) throws IOException {
        write(c);
        return this;
    }
}
