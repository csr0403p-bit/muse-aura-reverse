package X;

import androidx.compose.foundation.pager.PagerState;
import androidx.compose.runtime.MutableState;

/* loaded from: classes4.dex */
public final class AbL implements InterfaceC1220Aey {
    public final PagerState A00;
    public final int A01;

    @Override // X.InterfaceC1220Aey
    public final int AFf() {
        return Math.max(0, this.A00.A02 - this.A01);
    }

    @Override // X.InterfaceC1220Aey
    public final boolean AG9() {
        return !C8j4.A0V(this.A00.A0A).A0H.isEmpty();
    }

    @Override // X.InterfaceC1220Aey
    public final int AGv() {
        return Math.min(r1.A06() - 1, ((AbZ) ((AbM) AbstractC0878AGe.A0H(C8j4.A0V(this.A00.A0A).A0H))).A03 + this.A01);
    }

    @Override // X.InterfaceC1220Aey
    public final int APN() {
        int i;
        MutableState<C1133Abh> mutableState = this.A00.A0A;
        if (C8j4.A0V(mutableState).A0H.size() == 0) {
            return 0;
        }
        C1133Abh value = mutableState.getValue();
        EnumC1108AYu enumC1108AYu = value.A09;
        EnumC1108AYu enumC1108AYu2 = EnumC1108AYu.A03;
        InterfaceC1134Abi interfaceC1134Abi = value.A0D;
        int iA0F = (int) C8j5.A0F(C8j3.A0T(interfaceC1134Abi.getWidth(), interfaceC1134Abi.getHeight()), enumC1108AYu, enumC1108AYu2);
        int i2 = C8j4.A0V(mutableState).A04 + C8j4.A0V(mutableState).A05;
        if (i2 != 0 && (i = iA0F / i2) >= 1) {
            return i;
        }
        return 1;
    }

    @Override // X.InterfaceC1220Aey
    public final int getItemCount() {
        return this.A00.A06();
    }

    public AbL(int i, PagerState pagerState) {
        this.A00 = pagerState;
        this.A01 = i;
    }
}
