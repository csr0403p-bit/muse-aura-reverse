package X;

import androidx.compose.foundation.pager.PagerState;

/* renamed from: X.Abn, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1136Abn implements InterfaceC1256Afs, C3Q0 {
    public final /* synthetic */ PagerState A00;
    public final /* synthetic */ C3Q0 A01;

    public C1136Abn(C3Q0 c3q0, PagerState pagerState) {
        this.A00 = pagerState;
        this.A01 = c3q0;
    }

    @Override // X.InterfaceC1256Afs
    public final int A5i(int i, int i2) {
        PagerState pagerState = this.A00;
        return (int) (ATD.A07(AbO.A00(pagerState) + Ab3.A01((((i - pagerState.A07()) * pagerState.A08()) - (pagerState.A0L.A04.AFn() * pagerState.A08())) + i2), pagerState.A08, pagerState.A07) - AbO.A00(pagerState));
    }

    @Override // X.InterfaceC1256Afs
    public final int AFi() {
        return this.A00.A02;
    }

    @Override // X.InterfaceC1256Afs
    public final int AFj() {
        return this.A00.A03;
    }

    @Override // X.InterfaceC1256Afs
    public final int AGw() {
        return ((AbZ) ((AbM) AbstractC0878AGe.A0H(C8j4.A0V(this.A00.A0A).A0H))).A03;
    }

    @Override // X.C3Q0
    public final float AcG(float f) {
        return this.A01.AcG(f);
    }

    @Override // X.InterfaceC1256Afs
    public final void Afq(int i, int i2) {
        PagerState pagerState = this.A00;
        float fA08 = pagerState.A08();
        pagerState.A0A(i, fA08 != 0.0f ? i2 / fA08 : 0.0f, true);
    }

    @Override // X.InterfaceC1256Afs
    public final int getItemCount() {
        return this.A00.A06();
    }
}
