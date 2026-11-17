package X;

import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.runtime.MutableState;

/* renamed from: X.AdB, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1165AdB implements InterfaceC1220Aey {
    public final LazyGridState A00;

    @Override // X.InterfaceC1220Aey
    public final int AFf() {
        return this.A00.A09.A03.AGd();
    }

    @Override // X.InterfaceC1220Aey
    public final boolean AG9() {
        return !C8j4.A0U(this.A00.A0I).A0D.isEmpty();
    }

    @Override // X.InterfaceC1220Aey
    public final int AGv() {
        return ((Ad0) ((Ae6) AbstractC0878AGe.A0H(C8j4.A0U(this.A00.A0I).A0D))).A08;
    }

    @Override // X.InterfaceC1220Aey
    public final int APN() {
        int i;
        MutableState<Ad2> mutableState = this.A00.A0I;
        if (C8j4.A0U(mutableState).A0D.isEmpty()) {
            return 0;
        }
        Ad2 ad2A0U = C8j4.A0U(mutableState);
        EnumC1108AYu enumC1108AYu = ad2A0U.A09;
        EnumC1108AYu enumC1108AYu2 = EnumC1108AYu.A03;
        InterfaceC1134Abi interfaceC1134Abi = ad2A0U.A0B;
        long height = (interfaceC1134Abi.getHeight() & 4294967295L) | (interfaceC1134Abi.getWidth() << 32);
        int i2 = (int) (enumC1108AYu == enumC1108AYu2 ? height & 4294967295L : height >> 32);
        int iA00 = AdK.A00(mutableState.getValue());
        if (iA00 != 0 && (i = i2 / iA00) >= 1) {
            return i;
        }
        return 1;
    }

    @Override // X.InterfaceC1220Aey
    public final int getItemCount() {
        return C8j4.A0U(this.A00.A0I).A06;
    }

    public C1165AdB(LazyGridState lazyGridState) {
        this.A00 = lazyGridState;
    }
}
