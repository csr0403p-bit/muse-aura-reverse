package X;

import androidx.compose.foundation.pager.PagerState;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class AbN implements InterfaceC2046AxI {
    public final /* synthetic */ PagerState A00;
    public final /* synthetic */ boolean A01;

    public AbN(PagerState pagerState, boolean z) {
        this.A00 = pagerState;
        this.A01 = z;
    }

    @Override // X.InterfaceC2046AxI
    public final AbP A6X() {
        boolean z = this.A01;
        int iA06 = this.A00.A06();
        return z ? new AbP(iA06, 1) : new AbP(1, iA06);
    }

    @Override // X.InterfaceC2046AxI
    public final int AE4() {
        MutableState<C1133Abh> mutableState = this.A00.A0A;
        return (-C8j4.A0V(mutableState).A07) + C8j4.A0V(mutableState).A01;
    }

    @Override // X.InterfaceC2046AxI
    public final float AHS() {
        PagerState pagerState = this.A00;
        return AZ1.A00(pagerState.A0A.getValue(), pagerState.A06());
    }

    @Override // X.InterfaceC2046AxI
    public final float AK6() {
        return AbO.A00(this.A00);
    }

    @Override // X.InterfaceC2046AxI
    public final int AMg() {
        MutableState<C1133Abh> mutableState = this.A00.A0A;
        EnumC1108AYu enumC1108AYu = C8j4.A0V(mutableState).A09;
        EnumC1108AYu enumC1108AYu2 = EnumC1108AYu.A03;
        InterfaceC1134Abi interfaceC1134Abi = mutableState.getValue().A0D;
        return (int) C8j5.A0F(C8j3.A0T(interfaceC1134Abi.getWidth(), interfaceC1134Abi.getHeight()), enumC1108AYu, enumC1108AYu2);
    }

    @Override // X.InterfaceC2046AxI
    public final Object AcI(int i, HtJ<? super Unit> htJ) {
        Object objA03 = PagerState.A03(this.A00, htJ, i);
        return objA03 != EnumC10460Hji.A02 ? Unit.INSTANCE : objA03;
    }
}
