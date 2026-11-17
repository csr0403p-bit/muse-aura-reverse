package X;

import java.util.Enumeration;
import java.util.Map;

/* loaded from: classes5.dex */
public final class BqD implements Enumeration<Map<String, C2967BqK>> {
    public int A00 = 0;
    public final /* synthetic */ C2963BqE A01;

    public BqD(C2963BqE c2963BqE) {
        this.A01 = c2963BqE;
    }

    @Override // java.util.Enumeration
    public final boolean hasMoreElements() {
        return C8j3.A1T(this.A00, 4);
    }

    @Override // java.util.Enumeration
    public final /* bridge */ /* synthetic */ Map<String, C2967BqK> nextElement() {
        this.A00++;
        return BV4.A0u();
    }
}
