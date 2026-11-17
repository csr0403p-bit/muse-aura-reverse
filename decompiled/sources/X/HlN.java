package X;

import android.util.Log;
import java.io.Writer;

/* loaded from: classes6.dex */
public final class HlN extends Writer {
    public StringBuilder A00 = BV4.A0p(128);
    public final String A01 = "FragmentManager";

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == '\n') {
                A00();
            } else {
                this.A00.append(c);
            }
        }
    }

    private void A00() {
        StringBuilder sb = this.A00;
        if (sb.length() > 0) {
            Log.d(this.A01, sb.toString());
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        A00();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        A00();
    }
}
