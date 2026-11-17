package X;

import androidx.compose.foundation.pager.PagerState;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;

/* renamed from: X.Abq, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1138Abq {
    public Object A00;
    public boolean A01;
    public final C1139Abr A02;
    public final PagerState A03;
    public final C00q A04;
    public final C00r A05;

    public C1138Abq(PagerState pagerState, float f, int i) {
        this.A03 = pagerState;
        this.A05 = new ParcelableSnapshotMutableIntState(i);
        this.A04 = new ParcelableSnapshotMutableFloatState(f);
        this.A02 = new C1139Abr(i, 30, 100);
    }
}
