package X;

import java.io.IOException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.79w, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C067479w implements Iterator<String>, BOA {
    public String A00;
    public boolean A01;
    public final /* synthetic */ C067379v A02;

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException(C8j2.A00(0));
    }

    public C067479w(C067379v c067379v) {
        this.A02 = c067379v;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() throws IOException {
        String line = this.A00;
        if (line == null && !this.A01) {
            line = this.A02.A00.readLine();
            this.A00 = line;
            if (line == null) {
                this.A01 = true;
            }
        }
        return line != null;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ String next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        String str = this.A00;
        this.A00 = null;
        C7384Etj.A0X(str);
        return str;
    }
}
