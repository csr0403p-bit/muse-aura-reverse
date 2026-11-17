package X;

import androidx.compose.runtime.ParcelableSnapshotMutableIntState;

/* loaded from: classes4.dex */
public final class AdJ {
    public Object A00;
    public boolean A01;
    public final C1139Abr A02;
    public final C00r A03;
    public final C00r A04;

    public static final void A00(AdJ adJ, int i, int i2) {
        if (i < 0.0f) {
            AbstractC1061ATk.A00(C8j4.A0w("Index should be non-negative (", i));
            throw F60.createAndThrow();
        }
        adJ.A03.AdX(i);
        adJ.A02.A00(i);
        adJ.A04.AdX(i2);
    }

    public AdJ(int i, int i2) {
        this.A03 = new ParcelableSnapshotMutableIntState(i);
        this.A04 = new ParcelableSnapshotMutableIntState(i2);
        this.A02 = new C1139Abr(i, 30, 100);
    }

    public AdJ() {
        this(0, 0);
    }
}
