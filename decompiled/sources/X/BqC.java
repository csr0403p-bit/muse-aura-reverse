package X;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Map;

/* loaded from: classes5.dex */
public final class BqC implements Enumeration<Map<String, C2967BqK>> {
    public final Enumeration<Map<String, C2967BqK>> A00;
    public final /* synthetic */ C2963BqE A01;

    public BqC(C2963BqE c2963BqE) {
        this.A01 = c2963BqE;
        this.A00 = Collections.enumeration(c2963BqE.A01);
    }

    @Override // java.util.Enumeration
    public final boolean hasMoreElements() {
        return this.A00.hasMoreElements();
    }

    @Override // java.util.Enumeration
    public final /* bridge */ /* synthetic */ Map<String, C2967BqK> nextElement() {
        return BV4.A0w(this.A00.nextElement());
    }
}
