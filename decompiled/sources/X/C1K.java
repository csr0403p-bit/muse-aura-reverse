package X;

import android.net.Uri;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes5.dex */
public final class C1K implements C1J {
    public static final C1K A00 = new C1K();

    @Override // X.C1J
    public final void close() {
    }

    @Override // X.C1J
    public final /* synthetic */ Map getResponseHeaders() {
        return Collections.EMPTY_MAP;
    }

    @Override // X.C1J
    public final Uri getUri() {
        return null;
    }

    @Override // X.C1J
    public final long open(C1O c1o) throws IOException {
        throw BV4.A0K("PlaceholderDataSource cannot be opened");
    }

    @Override // X.C1J
    public final void addTransferListener(CXB cxb) {
    }

    @Override // X.C1L
    public final int read(byte[] bArr, int i, int i2) {
        throw C8j3.A17();
    }
}
