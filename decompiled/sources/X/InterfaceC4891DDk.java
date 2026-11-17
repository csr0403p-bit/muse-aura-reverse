package X;

import java.util.List;
import java.util.Map;

/* renamed from: X.DDk, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC4891DDk extends C1J {
    @Override // X.C1J
    void close();

    @Override // X.C1J
    Map<String, List<String>> getResponseHeaders();

    @Override // X.C1J
    long open(C1O c1o);

    @Override // X.C1L
    int read(byte[] bArr, int i, int i2);
}
