package com.facebook.aura.header.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.C1110AYw;
import X.G0V;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class ScrimScrollConnectionKt$BindScrimToScrollTop$scrim$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ C1110AYw $scrollState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrimScrollConnectionKt$BindScrimToScrollTop$scrim$2(C1110AYw c1110AYw, int i) {
        super(2);
        this.$scrollState = c1110AYw;
        this.$$changed = i;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        ScrimScrollConnectionKt.BindScrimToScrollTop(this.$scrollState, bfm, AnonymousClass011.A00(this.$$changed));
    }
}
