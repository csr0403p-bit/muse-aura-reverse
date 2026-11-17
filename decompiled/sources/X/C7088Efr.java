package X;

import java.io.File;

/* renamed from: X.Efr, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7088Efr {
    public long A00;
    public long A01;
    public final C7093Efz A02;
    public final String A03;

    public final long A00() {
        long j = this.A01;
        if (j >= 0) {
            return j;
        }
        long jLastModified = this.A02.A00.lastModified();
        this.A01 = jLastModified;
        return jLastModified;
    }

    public C7088Efr(File file, String str) {
        if (str == null) {
            throw C3cG.A0Q("Required value was null.");
        }
        this.A03 = str;
        this.A02 = new C7093Efz(file);
        this.A00 = -1L;
        this.A01 = -1L;
    }
}
