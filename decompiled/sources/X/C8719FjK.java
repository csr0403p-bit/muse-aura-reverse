package X;

import java.util.List;

/* renamed from: X.FjK, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8719FjK extends AbstractC10522Hop<C8746Fjl> {
    public final C8746Fjl A00;

    public C8719FjK(List<C8725FjQ<C8746Fjl>> list) {
        super(list);
        int iMax = 0;
        for (int i = 0; i < list.size(); i++) {
            C8746Fjl c8746Fjl = list.get(i).A0E;
            if (c8746Fjl != null) {
                iMax = Math.max(iMax, c8746Fjl.A01.length);
            }
        }
        this.A00 = new C8746Fjl(new float[iMax], new int[iMax]);
    }
}
