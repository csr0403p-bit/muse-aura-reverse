package X;

import androidx.compose.foundation.lazy.LazyListState;

/* loaded from: classes4.dex */
public final class AdH implements InterfaceC1220Aey {
    public final int A00;
    public final LazyListState A01;

    @Override // X.InterfaceC1220Aey
    public final int AFf() {
        return Math.max(0, this.A01.A02() - this.A00);
    }

    @Override // X.InterfaceC1220Aey
    public final boolean AG9() {
        return !AnonymousClass003.A0j(this.A01).isEmpty();
    }

    @Override // X.InterfaceC1220Aey
    public final int APN() {
        int i;
        LazyListState lazyListState = this.A01;
        if (AnonymousClass003.A0j(lazyListState).isEmpty()) {
            return 0;
        }
        C2A9 c2a9A04 = lazyListState.A04();
        int iA0F = (int) C8j5.A0F(c2a9A04.AMh(), ((C1161Act) c2a9A04).A09, EnumC1108AYu.A03);
        int iA00 = AbstractC1175Ade.A00(lazyListState.A04());
        if (iA00 != 0 && (i = iA0F / iA00) >= 1) {
            return i;
        }
        return 1;
    }

    @Override // X.InterfaceC1220Aey
    public final int getItemCount() {
        return ((C1161Act) this.A01.A04()).A05;
    }

    public AdH(LazyListState lazyListState, int i) {
        this.A01 = lazyListState;
        this.A00 = i;
    }

    @Override // X.InterfaceC1220Aey
    public final int AGv() {
        return Math.min(getItemCount() - 1, ((C1160Acs) ((C16C) AbstractC0878AGe.A0H(AnonymousClass003.A0j(this.A01)))).A07 + this.A00);
    }
}
