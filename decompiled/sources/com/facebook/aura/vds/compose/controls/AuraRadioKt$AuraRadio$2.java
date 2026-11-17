package com.facebook.aura.vds.compose.controls;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0U;
import X.G0V;
import X.InterfaceC1072AWd;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class AuraRadioKt$AuraRadio$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ boolean $checked;
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ InterfaceC1072AWd $interactionSource;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ G0U<Boolean, Unit> $onValueChange;
    public final /* synthetic */ long $tint;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AuraRadioKt$AuraRadio$2(BRg bRg, boolean z, boolean z2, G0U<? super Boolean, Unit> g0u, InterfaceC1072AWd interfaceC1072AWd, long j, int i, int i2) {
        super(2);
        this.$modifier = bRg;
        this.$enabled = z;
        this.$checked = z2;
        this.$onValueChange = g0u;
        this.$interactionSource = interfaceC1072AWd;
        this.$tint = j;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        AuraRadioKt.m2530AuraRadioV9fs2A(this.$modifier, this.$enabled, this.$checked, this.$onValueChange, this.$interactionSource, this.$tint, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}
