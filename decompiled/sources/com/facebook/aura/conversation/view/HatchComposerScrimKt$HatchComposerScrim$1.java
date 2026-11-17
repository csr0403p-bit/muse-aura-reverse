package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.G0V;
import X.InterfaceC05151eP;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchComposerScrimKt$HatchComposerScrim$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $height;
    public final /* synthetic */ long $scrimColor;
    public final /* synthetic */ InterfaceC05151eP $this_HatchComposerScrim;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchComposerScrimKt$HatchComposerScrim$1(InterfaceC05151eP interfaceC05151eP, int i, long j, int i2) {
        super(2);
        this.$this_HatchComposerScrim = interfaceC05151eP;
        this.$height = i;
        this.$scrimColor = j;
        this.$$changed = i2;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        HatchComposerScrimKt.m542HatchComposerScrimXOJAsU(this.$this_HatchComposerScrim, this.$height, this.$scrimColor, bfm, AnonymousClass011.A00(this.$$changed));
    }
}
