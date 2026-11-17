package X;

import java.io.BufferedReader;
import java.util.Iterator;

/* renamed from: X.79v, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C067379v implements C3b6<String> {
    public final BufferedReader A00;

    @Override // X.C3b6
    public final Iterator<String> iterator() {
        return new C067479w(this);
    }

    public C067379v(BufferedReader bufferedReader) {
        this.A00 = bufferedReader;
    }
}
