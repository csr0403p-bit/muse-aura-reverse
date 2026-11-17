package X;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Alignment;

/* renamed from: X.ANh, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0995ANh<S> implements ANi<S> {
    public C1BO<BL4> A00;
    public Alignment A01;
    public final AOP<S> A03;
    public final MutableState A04 = AbstractC1798ArH.A06(BL4.A00(0));
    public final C0918AHu<S, C1BO<BL4>> A02 = C0918AHu.A02();

    @Override // X.AOB
    public final S AGR() {
        return this.A03.A03().AGR();
    }

    @Override // X.AOB
    public final S ALW() {
        return this.A03.A03().ALW();
    }

    public C0995ANh(AOP aop, Alignment alignment) {
        this.A03 = aop;
        this.A01 = alignment;
    }

    @Override // X.AOB
    public final /* synthetic */ boolean APD(Object obj, Object obj2) {
        return C7384Etj.areEqual(obj, AGR()) && C7384Etj.areEqual(obj2, ALW());
    }
}
