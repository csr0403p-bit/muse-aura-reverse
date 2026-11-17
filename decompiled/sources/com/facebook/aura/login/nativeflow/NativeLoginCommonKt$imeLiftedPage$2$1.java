package com.facebook.aura.login.nativeflow;

import X.ATD;
import X.AXN;
import X.AbstractC7559F3s;
import X.AnonymousClass005;
import X.C1Ny;
import X.C2ae;
import X.C7384Etj;
import X.G0U;

/* loaded from: classes.dex */
public final class NativeLoginCommonKt$imeLiftedPage$2$1 extends AbstractC7559F3s implements G0U<AXN, C2ae> {
    public final /* synthetic */ C1Ny $imeInsets;
    public final /* synthetic */ NativeLoginImeLift $lift;
    public final /* synthetic */ float $maxLift;
    public final /* synthetic */ int $windowHeight;

    /* renamed from: invoke-Bjo55l4, reason: not valid java name */
    public final long m1288invokeBjo55l4(AXN axn) {
        int iA04;
        C7384Etj.A0Y(axn, 0);
        int iACy = this.$imeInsets.ACy(axn);
        int iAGd = this.$lift.anchorBottomInContent$delegate.AGd();
        int iAGd2 = this.$lift.pageTopInWindow$delegate.AGd();
        int iAGd3 = this.$lift.pinnedAboveImeHeight$delegate.AGd();
        if (iAGd == Integer.MIN_VALUE || iAGd2 == Integer.MIN_VALUE || iACy <= 0) {
            iA04 = 0;
        } else {
            int iAbr = axn.Abr(NativeLoginCommonKt.IME_LIFT_CLEARANCE);
            int i = (((iAGd2 + iAGd) + iAbr) + iAGd3) - (this.$windowHeight - iACy);
            int iMax = Math.max(axn.Abr(this.$maxLift), (i - iAbr) - this.$lift.anchorHeight$delegate.AGd());
            if (i <= iMax) {
                iMax = i;
            }
            iA04 = ATD.A04(iMax, 0, iACy + iAGd3);
        }
        return AnonymousClass005.A0N(-iA04);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeLoginCommonKt$imeLiftedPage$2$1(C1Ny c1Ny, NativeLoginImeLift nativeLoginImeLift, int i, float f) {
        super(1);
        this.$imeInsets = c1Ny;
        this.$lift = nativeLoginImeLift;
        this.$windowHeight = i;
        this.$maxLift = f;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ C2ae invoke(AXN axn) {
        return new C2ae(m1288invokeBjo55l4(axn));
    }
}
