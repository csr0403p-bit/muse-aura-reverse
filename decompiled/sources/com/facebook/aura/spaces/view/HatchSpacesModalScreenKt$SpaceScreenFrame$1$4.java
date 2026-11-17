package com.facebook.aura.spaces.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.B6A;
import X.BFM;
import X.C1DG;
import X.C78N;
import X.G0U;
import X.G0V;
import X.G0W;
import X.G2k;
import X.HxE;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchSpacesModalScreenKt$SpaceScreenFrame$1$4 extends AbstractC7559F3s implements G0W<C1DG, BFM, Integer, Unit> {
    public final /* synthetic */ G2k<C1DG, G0V<? super Boolean, ? super Function0<Unit>, Unit>, G0U<? super B6A, Unit>, BFM, Integer, Unit> $content;
    public final /* synthetic */ MutableState<B6A> $headerColor$delegate;
    public final /* synthetic */ boolean $isModal;
    public final /* synthetic */ MutableState<HxE<Boolean, Function0<Unit>>> $webBackState$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchSpacesModalScreenKt$SpaceScreenFrame$1$4(G2k<? super C1DG, ? super G0V<? super Boolean, ? super Function0<Unit>, Unit>, ? super G0U<? super B6A, Unit>, ? super BFM, ? super Integer, Unit> g2k, boolean z, MutableState<B6A> mutableState, MutableState<HxE<Boolean, Function0<Unit>>> mutableState2) {
        super(3);
        this.$content = g2k;
        this.$isModal = z;
        this.$headerColor$delegate = mutableState;
        this.$webBackState$delegate = mutableState2;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(C1DG c1dg, BFM bfm, Integer num) {
        m2199invoke8Feqmps(c1dg.A00, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: invoke-8Feqmps, reason: not valid java name */
    public final void m2199invoke8Feqmps(float f, BFM bfm, int i) {
        Object objAaT;
        if ((i & 6) == 0) {
            i |= AnonymousClass004.A04(bfm, f);
        }
        if (!AnonymousClass001.A1b(AnonymousClass004.A1H(i), bfm, i)) {
            bfm.Afo();
            return;
        }
        G2k<C1DG, G0V<? super Boolean, ? super Function0<Unit>, Unit>, G0U<? super B6A, Unit>, BFM, Integer, Unit> g2k = this.$content;
        C1DG c1dg = new C1DG(f);
        if (this.$isModal) {
            bfm.AgE(-1130745885);
            MutableState<HxE<Boolean, Function0<Unit>>> mutableState = this.$webBackState$delegate;
            objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = new HatchSpacesModalScreenKt$SpaceScreenFrame$1$4$1$1(mutableState);
                bfm.Ai0(objAaT);
            }
            AnonymousClass002.A19(bfm);
        } else {
            AnonymousClass004.A1A(bfm, -1130657318);
            objAaT = null;
        }
        boolean zA65 = bfm.A65(this.$headerColor$delegate);
        MutableState<B6A> mutableState2 = this.$headerColor$delegate;
        Object objAaT2 = bfm.AaT();
        if (zA65 || objAaT2 == C78N.A00) {
            objAaT2 = new HatchSpacesModalScreenKt$SpaceScreenFrame$1$4$2$1(mutableState2);
            bfm.Ai0(objAaT2);
        }
        g2k.invoke(c1dg, objAaT, objAaT2, bfm, Integer.valueOf(i & 14));
    }
}
