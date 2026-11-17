package com.facebook.aura.main;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BFM;
import X.C1Cd;
import X.G0W;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchSessionTransitionHostKt$HatchSessionTransitionHost$3$1 extends AbstractC7559F3s implements G0W<C1Cd, BFM, Integer, Unit> {
    public final /* synthetic */ boolean $isSignedOut;
    public final /* synthetic */ G0W<Boolean, BFM, Integer, Unit> $signedOutContent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchSessionTransitionHostKt$HatchSessionTransitionHost$3$1(G0W<? super Boolean, ? super BFM, ? super Integer, Unit> g0w, boolean z) {
        super(3);
        this.$signedOutContent = g0w;
        this.$isSignedOut = z;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(C1Cd c1Cd, BFM bfm, Integer num) {
        invoke(c1Cd, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(C1Cd c1Cd, BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
            AnonymousClass001.A1G(Boolean.valueOf(this.$isSignedOut), bfm, this.$signedOutContent, 0);
        } else {
            bfm.Afo();
        }
    }
}
