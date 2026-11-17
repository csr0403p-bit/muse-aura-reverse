package X;

import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class Ad8 implements InterfaceC2046AxI {
    public final /* synthetic */ LazyGridState A00;

    @Override // X.InterfaceC2046AxI
    public final AbP A6X() {
        return new AbP(-1, -1);
    }

    public Ad8(LazyGridState lazyGridState) {
        this.A00 = lazyGridState;
    }

    @Override // X.InterfaceC2046AxI
    public final int AE4() {
        MutableState<Ad2> mutableState = this.A00.A0I;
        return (-C8j4.A0U(mutableState).A08) + C8j4.A0U(mutableState).A02;
    }

    @Override // X.InterfaceC2046AxI
    public final float AHS() {
        LazyGridState lazyGridState = this.A00;
        C1176Adf c1176Adf = lazyGridState.A09;
        float fAGd = c1176Adf.A04.AGd() + (c1176Adf.A03.AGd() * 500);
        return MutableState.A0A(lazyGridState.A0H) ? fAGd + 100.0f : fAGd;
    }

    @Override // X.InterfaceC2046AxI
    public final float AK6() {
        C1176Adf c1176Adf = this.A00.A09;
        return c1176Adf.A04.AGd() + (c1176Adf.A03.AGd() * 500);
    }

    @Override // X.InterfaceC2046AxI
    public final int AMg() {
        MutableState<Ad2> mutableState = this.A00.A0I;
        EnumC1108AYu enumC1108AYu = C8j4.A0U(mutableState).A09;
        EnumC1108AYu enumC1108AYu2 = EnumC1108AYu.A03;
        InterfaceC1134Abi interfaceC1134Abi = C8j4.A0U(mutableState).A0B;
        long height = (interfaceC1134Abi.getHeight() & 4294967295L) | (interfaceC1134Abi.getWidth() << 32);
        return (int) (enumC1108AYu == enumC1108AYu2 ? height & 4294967295L : height >> 32);
    }

    @Override // X.InterfaceC2046AxI
    public final Object AcI(int i, HtJ<? super Unit> htJ) {
        Object objA00 = LazyGridState.A00(this.A00, htJ, i);
        return objA00 != EnumC10460Hji.A02 ? Unit.INSTANCE : objA00;
    }
}
