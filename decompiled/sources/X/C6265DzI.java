package X;

import android.util.SparseBooleanArray;

/* renamed from: X.DzI, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6265DzI {
    public boolean A00;
    public final SparseBooleanArray A01 = new SparseBooleanArray();

    public final DzH A00() {
        C1G.A08(!this.A00);
        this.A00 = true;
        return new DzH(this.A01);
    }

    public final void A01(int i) {
        C1G.A08(!this.A00);
        this.A01.append(i, true);
    }
}
