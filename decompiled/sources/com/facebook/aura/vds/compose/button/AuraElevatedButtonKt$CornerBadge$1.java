package com.facebook.aura.vds.compose.button;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.G0V;
import X.InterfaceC05151eP;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class AuraElevatedButtonKt$CornerBadge$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ float $cornerRadius;
    public final /* synthetic */ InterfaceC05151eP $this_CornerBadge;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraElevatedButtonKt$CornerBadge$1(InterfaceC05151eP interfaceC05151eP, float f, int i) {
        super(2);
        this.$this_CornerBadge = interfaceC05151eP;
        this.$cornerRadius = f;
        this.$$changed = i;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        AuraElevatedButtonKt.m2422CornerBadgeziNgDLE(this.$this_CornerBadge, this.$cornerRadius, bfm, AnonymousClass011.A00(this.$$changed));
    }
}
