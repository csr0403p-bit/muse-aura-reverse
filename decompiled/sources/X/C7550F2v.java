package X;

import java.util.Collections;
import java.util.Set;

/* renamed from: X.F2v, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7550F2v {
    public final C5296Dfc A00;
    public final Set<String> A01;
    public final int[] A02;
    public final String[] A03;

    public C7550F2v(C5296Dfc c5296Dfc, int[] iArr, String[] strArr) {
        AnonymousClass003.A0x(iArr, strArr);
        this.A00 = c5296Dfc;
        this.A02 = iArr;
        this.A03 = strArr;
        int length = iArr.length;
        int length2 = strArr.length;
        if (length != length2) {
            throw BV4.A0S();
        }
        this.A01 = length2 == 0 ? A3q.A00 : Collections.singleton(strArr[0]);
    }
}
