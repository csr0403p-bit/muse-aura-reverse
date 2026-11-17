package com.facebook.aura.navigation;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.BFM;
import X.C0Ig;
import X.C16n;
import X.C7384Etj;
import X.G0V;
import X.G0W;
import com.facebook.aura.ui.adaptive.AuraLayoutSizeKt;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class ModalFlowSceneStrategyKt$ModalFlowSurface$4$4$1 extends AbstractC7559F3s implements G0W<C0Ig, BFM, Integer, Unit> {
    public final /* synthetic */ G0V<BFM, Integer, Unit> $content;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ModalFlowSceneStrategyKt$ModalFlowSurface$4$4$1(G0V<? super BFM, ? super Integer, Unit> g0v) {
        super(3);
        this.$content = g0v;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(C0Ig c0Ig, BFM bfm, Integer num) {
        invoke(c0Ig, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(C0Ig c0Ig, BFM bfm, int i) {
        C7384Etj.A0Y(c0Ig, 0);
        if ((i & 6) == 0) {
            i |= AnonymousClass004.A0d(bfm, c0Ig);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(i), bfm, i)) {
            AuraLayoutSizeKt.m2363ProvideAuraLayoutSizeUBP6k7g(C16n.A00(c0Ig.AHT(), c0Ig.AHP()), this.$content, bfm, 0);
        } else {
            bfm.Afo();
        }
    }
}
