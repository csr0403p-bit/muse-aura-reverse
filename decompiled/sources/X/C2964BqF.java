package X;

import java.util.Enumeration;
import java.util.HashMap;

/* renamed from: X.BqF, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2964BqF implements Enumeration<HashMap<String, C2965BqG>> {
    public int A00 = 0;

    @Override // java.util.Enumeration
    public final boolean hasMoreElements() {
        return C8j3.A1T(this.A00, 4);
    }

    @Override // java.util.Enumeration
    public final /* bridge */ /* synthetic */ HashMap<String, C2965BqG> nextElement() {
        HashMap<String, C2965BqG> mapA0u = BV4.A0u();
        for (C2965BqG c2965BqG : BqH.A04[this.A00]) {
            mapA0u.put(c2965BqG.A03, c2965BqG);
        }
        this.A00++;
        return mapA0u;
    }
}
